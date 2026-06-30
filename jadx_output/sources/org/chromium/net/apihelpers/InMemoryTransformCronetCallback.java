package org.chromium.net.apihelpers;

/* loaded from: classes7.dex */
public abstract class InMemoryTransformCronetCallback<T> extends org.chromium.net.apihelpers.ImplicitFlowControlCallback {
    private static final java.lang.String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private final java.util.Set<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> mListeners = new java.util.LinkedHashSet();
    private java.nio.channels.WritableByteChannel mResponseBodyChannel;
    private java.io.ByteArrayOutputStream mResponseBodyStream;

    private static long getBodyLength(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.List<java.lang.String> list = urlResponseInfo.getAllHeaders().get(CONTENT_LENGTH_HEADER_NAME);
        if (list == null || list.size() != 1) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(list.get(0));
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public org.chromium.net.apihelpers.ImplicitFlowControlCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T> cronetRequestCompletionListener) {
        this.mListeners.add(cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onBodyChunkRead(org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
        this.mResponseBodyChannel.write(byteBuffer);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCanceled(urlResponseInfo);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onFailed(urlResponseInfo, cronetException);
        }
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onResponseStarted(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        long bodyLength = getBodyLength(urlResponseInfo);
        if (bodyLength > 2147483639) {
            throw new java.lang.IllegalArgumentException("The body is too large and wouldn't fit in a byte array!");
        }
        if (bodyLength >= 0) {
            this.mResponseBodyStream = new java.io.ByteArrayOutputStream((int) bodyLength);
        } else {
            this.mResponseBodyStream = new java.io.ByteArrayOutputStream();
        }
        this.mResponseBodyChannel = java.nio.channels.Channels.newChannel(this.mResponseBodyStream);
    }

    @Override // org.chromium.net.apihelpers.ImplicitFlowControlCallback
    public final void onSucceeded(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        T transformBodyBytes = transformBodyBytes(urlResponseInfo, this.mResponseBodyStream.toByteArray());
        java.util.Iterator<org.chromium.net.apihelpers.CronetRequestCompletionListener<? super T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onSucceeded(urlResponseInfo, transformBodyBytes);
        }
    }

    public abstract T transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr);
}
