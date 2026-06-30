package org.chromium.base;

/* loaded from: classes16.dex */
public class Promise<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private java.lang.Exception mRejectReason;
    private T mResult;
    private boolean mThrowingRejectionHandler;
    private int mState = 0;
    private final java.util.List<org.chromium.base.Callback<T>> mFulfillCallbacks = new java.util.LinkedList();
    private final java.util.List<org.chromium.base.Callback<java.lang.Exception>> mRejectCallbacks = new java.util.LinkedList();
    private final java.lang.Thread mThread = java.lang.Thread.currentThread();
    private final android.os.Handler mHandler = new android.os.Handler();

    /* loaded from: classes16.dex */
    public interface AsyncFunction<A, RT> extends java.util.function.Function<A, org.chromium.base.Promise<RT>> {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PromiseState {
        public static final int FULFILLED = 1;
        public static final int REJECTED = 2;
        public static final int UNFULFILLED = 0;
    }

    /* loaded from: classes16.dex */
    public static class UnhandledRejectionException extends java.lang.RuntimeException {
        public UnhandledRejectionException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    private void checkThread() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void exceptInner(org.chromium.base.Callback<java.lang.Exception> callback) {
        int i17 = this.mState;
        if (i17 == 2) {
            postCallbackToLooper(callback, this.mRejectReason);
        } else if (i17 == 0) {
            this.mRejectCallbacks.add(callback);
        }
    }

    public static <T> org.chromium.base.Promise<T> fulfilled(T t17) {
        org.chromium.base.Promise<T> promise = new org.chromium.base.Promise<>();
        promise.fulfill(t17);
        return promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$then$0(java.lang.Exception exc) {
        throw new org.chromium.base.Promise.UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$then$1(org.chromium.base.Promise promise, java.util.function.Function function, java.lang.Object obj) {
        try {
            promise.fulfill(function.apply(obj));
        } catch (java.lang.Exception e17) {
            promise.reject(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$then$2(org.chromium.base.Promise.AsyncFunction asyncFunction, final org.chromium.base.Promise promise, java.lang.Object obj) {
        try {
            org.chromium.base.Promise apply = asyncFunction.apply(obj);
            java.util.Objects.requireNonNull(promise);
            apply.then(new org.chromium.base.Callback() { // from class: org.chromium.base.Promise$$e
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(java.lang.Object obj2) {
                    org.chromium.base.Promise.this.fulfill(obj2);
                }
            }, new org.chromium.base.Promise$$c(promise));
        } catch (java.lang.Exception e17) {
            promise.reject(e17);
        }
    }

    private <S> void postCallbackToLooper(org.chromium.base.Callback<S> callback, S s17) {
        this.mHandler.post(callback.bind(s17));
    }

    public static <T> org.chromium.base.Promise<T> rejected() {
        org.chromium.base.Promise<T> promise = new org.chromium.base.Promise<>();
        promise.reject();
        return promise;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void thenInner(org.chromium.base.Callback<T> callback) {
        int i17 = this.mState;
        if (i17 == 1) {
            postCallbackToLooper(callback, this.mResult);
        } else if (i17 == 0) {
            this.mFulfillCallbacks.add(callback);
        }
    }

    public void except(org.chromium.base.Callback<java.lang.Exception> callback) {
        checkThread();
        exceptInner(callback);
    }

    public void fulfill(T t17) {
        checkThread();
        this.mState = 1;
        this.mResult = t17;
        java.util.Iterator<org.chromium.base.Callback<T>> it = this.mFulfillCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper(it.next(), t17);
        }
        this.mFulfillCallbacks.clear();
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean isFulfilled() {
        checkThread();
        return this.mState == 1;
    }

    public boolean isRejected() {
        checkThread();
        return this.mState == 2;
    }

    public void reject(java.lang.Exception exc) {
        checkThread();
        this.mState = 2;
        this.mRejectReason = exc;
        java.util.Iterator<org.chromium.base.Callback<java.lang.Exception>> it = this.mRejectCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper((org.chromium.base.Callback) it.next(), exc);
        }
        this.mRejectCallbacks.clear();
    }

    public void then(org.chromium.base.Callback<T> callback) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(callback);
        } else {
            then(callback, new org.chromium.base.Promise$$a());
            this.mThrowingRejectionHandler = true;
        }
    }

    public void reject() {
        reject(null);
    }

    public void then(org.chromium.base.Callback<T> callback, org.chromium.base.Callback<java.lang.Exception> callback2) {
        checkThread();
        thenInner(callback);
        exceptInner(callback2);
    }

    public <RT> org.chromium.base.Promise<RT> then(final java.util.function.Function<T, RT> function) {
        checkThread();
        final org.chromium.base.Promise<RT> promise = new org.chromium.base.Promise<>();
        thenInner(new org.chromium.base.Callback() { // from class: org.chromium.base.Promise$$b
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(java.lang.Object obj) {
                org.chromium.base.Promise.lambda$then$1(org.chromium.base.Promise.this, function, obj);
            }
        });
        exceptInner(new org.chromium.base.Promise$$c(promise));
        return promise;
    }

    public <RT> org.chromium.base.Promise<RT> then(final org.chromium.base.Promise.AsyncFunction<T, RT> asyncFunction) {
        checkThread();
        final org.chromium.base.Promise<RT> promise = new org.chromium.base.Promise<>();
        thenInner(new org.chromium.base.Callback() { // from class: org.chromium.base.Promise$$d
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(java.lang.Object obj) {
                org.chromium.base.Promise.lambda$then$2(org.chromium.base.Promise.AsyncFunction.this, promise, obj);
            }
        });
        exceptInner(new org.chromium.base.Promise$$c(promise));
        return promise;
    }
}
