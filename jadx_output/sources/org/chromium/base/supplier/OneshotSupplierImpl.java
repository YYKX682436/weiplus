package org.chromium.base.supplier;

/* loaded from: classes16.dex */
public class OneshotSupplierImpl<T> implements org.chromium.base.supplier.OneshotSupplier<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final org.chromium.base.Promise<T> mPromise = new org.chromium.base.Promise<>();
    private final org.chromium.base.ThreadUtils.ThreadChecker mThreadChecker = new org.chromium.base.ThreadUtils.ThreadChecker();

    @Override // org.chromium.base.supplier.Supplier
    public T get() {
        this.mThreadChecker.assertOnValidThread();
        if (this.mPromise.isFulfilled()) {
            return this.mPromise.getResult();
        }
        return null;
    }

    @Override // org.chromium.base.supplier.OneshotSupplier
    public T onAvailable(org.chromium.base.Callback<T> callback) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.then(callback);
        return get();
    }

    public void set(T t17) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.fulfill(t17);
    }
}
