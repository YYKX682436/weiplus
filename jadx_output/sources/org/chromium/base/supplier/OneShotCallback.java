package org.chromium.base.supplier;

/* loaded from: classes13.dex */
public class OneShotCallback<E> {
    private final org.chromium.base.Callback<E> mCallback;
    private final org.chromium.base.Callback<E> mCallbackWrapper;
    private final java.lang.ref.WeakReference<org.chromium.base.supplier.ObservableSupplier<E>> mWeakSupplier;

    /* loaded from: classes13.dex */
    public class CallbackWrapper implements org.chromium.base.Callback<E> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(E e17) {
            org.chromium.base.supplier.OneShotCallback.this.mCallback.lambda$bind$0(e17);
            ((org.chromium.base.supplier.ObservableSupplier) org.chromium.base.supplier.OneShotCallback.this.mWeakSupplier.get()).removeObserver(org.chromium.base.supplier.OneShotCallback.this.mCallbackWrapper);
        }

        private CallbackWrapper() {
        }
    }

    public OneShotCallback(org.chromium.base.supplier.ObservableSupplier<E> observableSupplier, org.chromium.base.Callback<E> callback) {
        org.chromium.base.supplier.OneShotCallback.CallbackWrapper callbackWrapper = new org.chromium.base.supplier.OneShotCallback.CallbackWrapper();
        this.mCallbackWrapper = callbackWrapper;
        this.mWeakSupplier = new java.lang.ref.WeakReference<>(observableSupplier);
        this.mCallback = callback;
        observableSupplier.addObserver(callbackWrapper);
    }
}
