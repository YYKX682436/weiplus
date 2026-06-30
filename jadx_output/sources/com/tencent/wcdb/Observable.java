package com.tencent.wcdb;

/* loaded from: classes2.dex */
public abstract class Observable<T> {
    protected final java.util.ArrayList<T> mObservers = new java.util.ArrayList<>();

    public void registerObserver(T t17) {
        if (t17 == null) {
            throw new java.lang.IllegalArgumentException("The observer is null.");
        }
        synchronized (this.mObservers) {
            if (this.mObservers.contains(t17)) {
                throw new java.lang.IllegalStateException("Observer " + t17 + " is already registered.");
            }
            this.mObservers.add(t17);
        }
    }

    public void unregisterAll() {
        synchronized (this.mObservers) {
            this.mObservers.clear();
        }
    }

    public void unregisterObserver(T t17) {
        if (t17 == null) {
            throw new java.lang.IllegalArgumentException("The observer is null.");
        }
        synchronized (this.mObservers) {
            int indexOf = this.mObservers.indexOf(t17);
            if (indexOf == -1) {
                throw new java.lang.IllegalStateException("Observer " + t17 + " was not registered.");
            }
            this.mObservers.remove(indexOf);
        }
    }
}
