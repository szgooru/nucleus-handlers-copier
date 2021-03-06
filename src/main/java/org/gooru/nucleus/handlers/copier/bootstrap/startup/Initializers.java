package org.gooru.nucleus.handlers.copier.bootstrap.startup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.gooru.nucleus.handlers.copier.app.components.DataSourceRegistry;

public class Initializers implements Iterable<Initializer> {

    private List<Initializer> initializers = null;
    private final Iterator<Initializer> internalIterator;

    @Override
    public Iterator<Initializer> iterator() {
        return new Iterator<Initializer>() {

            @Override
            public boolean hasNext() {
                return internalIterator.hasNext();
            }

            @Override
            public Initializer next() {
                return internalIterator.next();
            }

        };
    }

    public Initializers() {
        initializers = new ArrayList<>();
        initializers.add(DataSourceRegistry.getInstance());
        internalIterator = initializers.iterator();
    }

}
