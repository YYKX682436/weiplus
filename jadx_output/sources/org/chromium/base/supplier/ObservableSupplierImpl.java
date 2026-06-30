package org.chromium.base.supplier;

/* loaded from: classes13.dex */
public class ObservableSupplierImpl<E> implements org.chromium.base.supplier.ObservableSupplier<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sIgnoreThreadChecksForTesting;
    private E mObject;
    private final java.lang.Thread mThread = java.lang.Thread.currentThread();
    private final android.os.Handler mHandler = new android.os.Handler();
    private final org.chromium.base.ObserverList<org.chromium.base.Callback<E>> mObservers = new org.chromium.base.ObserverList<>();

    public ObservableSupplierImpl() {
    }

    private void checkThread() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(java.lang.Object obj, org.chromium.base.Callback callback) {
        if (this.mObject == obj && this.mObservers.hasObserver(callback)) {
            callback.lambda$bind$0(this.mObject);
        }
    }

    public static void setIgnoreThreadChecksForTesting(boolean z17) {
        sIgnoreThreadChecksForTesting = z17;
        org.chromium.base.ResettersForTesting.register(new org.chromium.base.supplier.ObservableSupplierImpl$$b());
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public E addObserver(final org.chromium.base.Callback<E> callback) {
        checkThread();
        this.mObservers.addObserver(callback);
        final E e17 = this.mObject;
        if (e17 != null) {
            this.mHandler.post(new java.lang.Runnable() { // from class: org.chromium.base.supplier.ObservableSupplierImpl$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.base.supplier.ObservableSupplierImpl.this.lambda$addObserver$0(e17, callback);
                }
            });
        }
        return this.mObject;
    }

    @Override // org.chromium.base.supplier.Supplier
    public E get() {
        checkThread();
        return this.mObject;
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(org.chromium.base.Callback<E> callback) {
        checkThread();
        this.mObservers.removeObserver(callback);
    }

    public void set(E e17) {
        checkThread();
        if (e17 == this.mObject) {
            return;
        }
        this.mObject = e17;
        java.util.Iterator<org.chromium.base.Callback<E>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().lambda$bind$0(this.mObject);
        }
    }

    public ObservableSupplierImpl(E e17) {
        this.mObject = e17;
    }
}
