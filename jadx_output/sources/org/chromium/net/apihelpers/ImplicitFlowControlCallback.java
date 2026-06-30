package org.chromium.net.apihelpers;

/* loaded from: classes7.dex */
public abstract class ImplicitFlowControlCallback extends org.chromium.net.UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY = 32768;

    public abstract void onBodyChunkRead(org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        onCanceled(urlResponseInfo);
    }

    public abstract void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        onFailed(urlResponseInfo, cronetException);
    }

    public abstract void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
        onBodyChunkRead(urlResponseInfo, byteBuffer);
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        if (shouldFollowRedirect(urlResponseInfo, str)) {
            urlRequest.followRedirect();
        } else {
            urlRequest.cancel();
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        onResponseStarted(urlResponseInfo);
        urlRequest.read(java.nio.ByteBuffer.allocateDirect(32768));
    }

    public abstract void onResponseStarted(org.chromium.net.UrlResponseInfo urlResponseInfo);

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        onSucceeded(urlResponseInfo);
    }

    public abstract void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo);

    public abstract boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str);
}
