package org.chromium.net.impl;

/* loaded from: classes16.dex */
public abstract class CronetEngineBase extends org.chromium.net.ExperimentalCronetEngine {
    protected static final long DEFAULT_NETWORK_HANDLE = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Idempotency {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RequestPriority {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface StreamPriority {
    }

    public abstract org.chromium.net.ExperimentalBidirectionalStream createBidirectionalStream(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, int i17, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17);

    public abstract org.chromium.net.impl.UrlRequestBase createRequest(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i17, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.chromium.net.RequestFinishedInfo.Listener listener, int i27, long j17);

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return super.newBidirectionalStreamBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new org.chromium.net.impl.UrlRequestBuilderImpl(str, callback, executor, this);
    }
}
