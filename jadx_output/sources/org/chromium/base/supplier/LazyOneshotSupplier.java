package org.chromium.base.supplier;

/* loaded from: classes16.dex */
public abstract class LazyOneshotSupplier<T> implements org.chromium.base.supplier.OneshotSupplier<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final org.chromium.base.Promise<T> mPromise = new org.chromium.base.Promise<>();
    private final org.chromium.base.ThreadUtils.ThreadChecker mThreadChecker = new org.chromium.base.ThreadUtils.ThreadChecker();

    public abstract void doSet();

    @Override // org.chromium.base.supplier.Supplier
    public T get() {
        this.mThreadChecker.assertOnValidThread();
        if (!hasValue()) {
            doSet();
        }
        if (hasValue()) {
            return this.mPromise.getResult();
        }
        return null;
    }

    @Override // org.chromium.base.supplier.Supplier
    public boolean hasValue() {
        return this.mPromise.isFulfilled();
    }

    @Override // org.chromium.base.supplier.OneshotSupplier
    public T onAvailable(org.chromium.base.Callback<T> callback) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.then(callback);
        if (hasValue()) {
            return get();
        }
        return null;
    }

    public void set(T t17) {
        this.mThreadChecker.assertOnValidThread();
        this.mPromise.fulfill(t17);
    }
}
