package org.webrtc;

/* loaded from: classes16.dex */
class RefCountDelegate implements org.webrtc.RefCounted {
    private final java.util.concurrent.atomic.AtomicInteger refCount = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.Runnable releaseCallback;

    public RefCountDelegate(java.lang.Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        java.lang.Runnable runnable;
        int decrementAndGet = this.refCount.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new java.lang.IllegalStateException("release() called on an object with refcount < 1");
        }
        if (decrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            throw new java.lang.IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    public boolean safeRetain() {
        int i17 = this.refCount.get();
        while (i17 != 0) {
            if (this.refCount.weakCompareAndSet(i17, i17 + 1)) {
                return true;
            }
            i17 = this.refCount.get();
        }
        return false;
    }
}
