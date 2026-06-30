package org.chromium.net.apihelpers;

/* loaded from: classes16.dex */
public class UrlRequestCallbacks {

    /* loaded from: classes16.dex */
    public static class CallbackAndResponseFuturePair<ResponseBodyT, CallbackT extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<ResponseBodyT>> {
        private final CallbackT mCallback;
        private final java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> mFuture;

        public CallbackAndResponseFuturePair(java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> future, CallbackT callbackt) {
            this.mFuture = future;
            this.mCallback = callbackt;
        }

        public CallbackT getCallback() {
            return this.mCallback;
        }

        public java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<ResponseBodyT>> getFuture() {
            return this.mFuture;
        }
    }

    private UrlRequestCallbacks() {
    }

    private static <T> java.util.concurrent.Future<org.chromium.net.apihelpers.CronetResponse<T>> addResponseFutureListener(org.chromium.net.apihelpers.InMemoryTransformCronetCallback<T> inMemoryTransformCronetCallback) {
        final java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        inMemoryTransformCronetCallback.addCompletionListener(new org.chromium.net.apihelpers.CronetRequestCompletionListener<T>() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4
            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
                completableFuture.completeExceptionally(new org.chromium.net.CronetException("The request was canceled!", null) { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4.1
                });
            }

            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
                completableFuture.completeExceptionally(cronetException);
            }

            @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
            public void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo, T t17) {
                completableFuture.complete(new org.chromium.net.apihelpers.CronetResponse(urlResponseInfo, t17));
            }
        });
        return completableFuture;
    }

    public static org.chromium.net.apihelpers.ByteArrayCronetCallback forByteArrayBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<byte[]> cronetRequestCompletionListener) {
        return newByteArrayCallback(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super byte[]>) cronetRequestCompletionListener);
    }

    public static org.chromium.net.apihelpers.JsonCronetCallback forJsonBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<org.json.JSONObject> cronetRequestCompletionListener) {
        return newJsonCallback(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super org.json.JSONObject>) cronetRequestCompletionListener);
    }

    public static org.chromium.net.apihelpers.StringCronetCallback forStringBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler, org.chromium.net.apihelpers.CronetRequestCompletionListener<java.lang.String> cronetRequestCompletionListener) {
        return newStringCallback(redirectHandler).addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super java.lang.String>) cronetRequestCompletionListener);
    }

    private static org.chromium.net.apihelpers.ByteArrayCronetCallback newByteArrayCallback(final org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        return new org.chromium.net.apihelpers.ByteArrayCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.1
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
                return org.chromium.net.apihelpers.RedirectHandler.this.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    private static org.chromium.net.apihelpers.JsonCronetCallback newJsonCallback(final org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        return new org.chromium.net.apihelpers.JsonCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.3
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
                return org.chromium.net.apihelpers.RedirectHandler.this.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    private static org.chromium.net.apihelpers.StringCronetCallback newStringCallback(final org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        return new org.chromium.net.apihelpers.StringCronetCallback() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.2
            @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
            public boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
                return org.chromium.net.apihelpers.RedirectHandler.this.shouldFollowRedirect(urlResponseInfo, str);
            }
        };
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<byte[], org.chromium.net.apihelpers.ByteArrayCronetCallback> forByteArrayBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.ByteArrayCronetCallback newByteArrayCallback = newByteArrayCallback(redirectHandler);
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(addResponseFutureListener(newByteArrayCallback), newByteArrayCallback);
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<org.json.JSONObject, org.chromium.net.apihelpers.JsonCronetCallback> forJsonBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.JsonCronetCallback newJsonCallback = newJsonCallback(redirectHandler);
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(addResponseFutureListener(newJsonCallback), newJsonCallback);
    }

    public static org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<java.lang.String, org.chromium.net.apihelpers.StringCronetCallback> forStringBody(org.chromium.net.apihelpers.RedirectHandler redirectHandler) {
        org.chromium.net.apihelpers.StringCronetCallback newStringCallback = newStringCallback(redirectHandler);
        return new org.chromium.net.apihelpers.UrlRequestCallbacks.CallbackAndResponseFuturePair<>(addResponseFutureListener(newStringCallback), newStringCallback);
    }
}
