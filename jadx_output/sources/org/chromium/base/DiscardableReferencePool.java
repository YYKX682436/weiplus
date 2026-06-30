package org.chromium.base;

/* loaded from: classes13.dex */
public class DiscardableReferencePool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.util.Set<org.chromium.base.DiscardableReferencePool.DiscardableReference<?>> mPool = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* loaded from: classes13.dex */
    public static class DiscardableReference<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private T mPayload;

        /* JADX INFO: Access modifiers changed from: private */
        public void discard() {
            this.mPayload = null;
        }

        public T get() {
            return this.mPayload;
        }

        private DiscardableReference(T t17) {
            this.mPayload = t17;
        }
    }

    public void drain() {
        java.util.Iterator<org.chromium.base.DiscardableReferencePool.DiscardableReference<?>> it = this.mPool.iterator();
        while (it.hasNext()) {
            it.next().discard();
        }
        this.mPool.clear();
    }

    public <T> org.chromium.base.DiscardableReferencePool.DiscardableReference<T> put(T t17) {
        org.chromium.base.DiscardableReferencePool.DiscardableReference<T> discardableReference = new org.chromium.base.DiscardableReferencePool.DiscardableReference<>(t17);
        this.mPool.add(discardableReference);
        return discardableReference;
    }

    public void remove(org.chromium.base.DiscardableReferencePool.DiscardableReference<?> discardableReference) {
        if (this.mPool.contains(discardableReference)) {
            discardableReference.discard();
            this.mPool.remove(discardableReference);
        }
    }
}
