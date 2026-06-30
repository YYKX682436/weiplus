package org.chromium.base.supplier;

/* loaded from: classes16.dex */
public abstract class UnownedUserDataSupplier<E> extends org.chromium.base.supplier.ObservableSupplierImpl<E> implements org.chromium.base.lifetime.Destroyable, org.chromium.base.UnownedUserData {
    private final org.chromium.base.lifetime.DestroyChecker mDestroyChecker = new org.chromium.base.lifetime.DestroyChecker();
    private final org.chromium.base.UnownedUserDataKey<org.chromium.base.supplier.UnownedUserDataSupplier<E>> mUudKey;

    /* JADX WARN: Multi-variable type inference failed */
    public UnownedUserDataSupplier(org.chromium.base.UnownedUserDataKey<? extends org.chromium.base.supplier.UnownedUserDataSupplier<E>> unownedUserDataKey) {
        this.mUudKey = unownedUserDataKey;
    }

    public void attach(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
        this.mDestroyChecker.checkNotDestroyed();
        this.mUudKey.attachToHost(unownedUserDataHost, this);
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        this.mDestroyChecker.destroy();
        this.mUudKey.detachFromAllHosts(this);
    }
}
