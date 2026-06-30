package org.chromium.net.impl;

/* loaded from: classes16.dex */
public final class RefCountDelegate {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.util.concurrent.atomic.AtomicInteger mCount = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.Runnable mDelegate;

    public RefCountDelegate(java.lang.Runnable runnable) {
        this.mDelegate = runnable;
    }

    public void decrement() {
        if (this.mCount.decrementAndGet() == 0) {
            this.mDelegate.run();
        }
    }

    public void increment() {
        this.mCount.incrementAndGet();
    }
}
