package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class VersionSafeCallbacks {

    /* loaded from: classes16.dex */
    public static final class BidirectionalStreamCallback extends org.chromium.net.BidirectionalStream.Callback {
        private final org.chromium.net.BidirectionalStream.Callback mWrappedCallback;

        public BidirectionalStreamCallback(org.chromium.net.BidirectionalStream.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onCanceled(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onFailed(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            this.mWrappedCallback.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onReadCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.mWrappedCallback.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z17);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onResponseHeadersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onResponseTrailersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.UrlResponseInfo.HeaderBlock headerBlock) {
            this.mWrappedCallback.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onStreamReady(org.chromium.net.BidirectionalStream bidirectionalStream) {
            this.mWrappedCallback.onStreamReady(bidirectionalStream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onSucceeded(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public void onWriteCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.mWrappedCallback.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z17);
        }
    }

    /* loaded from: classes13.dex */
    public static final class LibraryLoader extends org.chromium.net.CronetEngine.Builder.LibraryLoader {
        private final org.chromium.net.CronetEngine.Builder.LibraryLoader mWrappedLoader;

        public LibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mWrappedLoader = libraryLoader;
        }

        @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
        public void loadLibrary(java.lang.String str) {
            this.mWrappedLoader.loadLibrary(str);
        }
    }

    /* loaded from: classes16.dex */
    public static final class NetworkQualityRttListenerWrapper extends org.chromium.net.NetworkQualityRttListener {
        private final org.chromium.net.NetworkQualityRttListener mWrappedListener;

        public NetworkQualityRttListenerWrapper(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
            super(networkQualityRttListener.getExecutor());
            this.mWrappedListener = networkQualityRttListener;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper) obj).mWrappedListener);
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public java.util.concurrent.Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public void onRttObservation(int i17, long j17, int i18) {
            this.mWrappedListener.onRttObservation(i17, j17, i18);
        }
    }

    /* loaded from: classes16.dex */
    public static final class NetworkQualityThroughputListenerWrapper extends org.chromium.net.NetworkQualityThroughputListener {
        private final org.chromium.net.NetworkQualityThroughputListener mWrappedListener;

        public NetworkQualityThroughputListenerWrapper(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
            super(networkQualityThroughputListener.getExecutor());
            this.mWrappedListener = networkQualityThroughputListener;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper) obj).mWrappedListener);
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public java.util.concurrent.Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public void onThroughputObservation(int i17, long j17, int i18) {
            this.mWrappedListener.onThroughputObservation(i17, j17, i18);
        }
    }

    /* loaded from: classes16.dex */
    public static final class RequestFinishedInfoListener extends org.chromium.net.RequestFinishedInfo.Listener {
        private final org.chromium.net.RequestFinishedInfo.Listener mWrappedListener;

        public RequestFinishedInfoListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public java.util.concurrent.Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public void onRequestFinished(org.chromium.net.RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedListener.onRequestFinished(requestFinishedInfo);
        }
    }

    /* loaded from: classes13.dex */
    public static final class UploadDataProviderWrapper extends org.chromium.net.UploadDataProvider {
        private final org.chromium.net.UploadDataProvider mWrappedProvider;

        public UploadDataProviderWrapper(org.chromium.net.UploadDataProvider uploadDataProvider) {
            this.mWrappedProvider = uploadDataProvider;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mWrappedProvider.close();
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.mWrappedProvider.getLength();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) {
            this.mWrappedProvider.read(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(org.chromium.net.UploadDataSink uploadDataSink) {
            this.mWrappedProvider.rewind(uploadDataSink);
        }
    }

    /* loaded from: classes16.dex */
    public static final class UrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
        private final org.chromium.net.UrlRequest.Callback mWrappedCallback;

        public UrlRequestCallback(org.chromium.net.UrlRequest.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            this.mWrappedCallback.onFailed(urlRequest, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) {
            this.mWrappedCallback.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
            this.mWrappedCallback.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onResponseStarted(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(urlRequest, urlResponseInfo);
        }
    }

    /* loaded from: classes16.dex */
    public static final class UrlRequestStatusListener extends org.chromium.net.UrlRequest.StatusListener {
        private final org.chromium.net.UrlRequest.StatusListener mWrappedListener;

        public UrlRequestStatusListener(org.chromium.net.UrlRequest.StatusListener statusListener) {
            this.mWrappedListener = statusListener;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int i17) {
            this.mWrappedListener.onStatus(i17);
        }
    }
}
