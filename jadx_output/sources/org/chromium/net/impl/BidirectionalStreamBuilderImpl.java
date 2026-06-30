package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class BidirectionalStreamBuilderImpl extends org.chromium.net.ExperimentalBidirectionalStream.Builder {
    private final org.chromium.net.BidirectionalStream.Callback mCallback;
    private final org.chromium.net.impl.CronetEngineBase mCronetEngine;
    private boolean mDelayRequestHeadersUntilFirstFlush;
    private final java.util.concurrent.Executor mExecutor;
    private java.util.Collection<java.lang.Object> mRequestAnnotations;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private final java.lang.String mUrl;
    private final java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> mRequestHeaders = new java.util.ArrayList<>();
    private java.lang.String mHttpMethod = "POST";
    private int mPriority = 3;
    private long mNetworkHandle = -1;

    public BidirectionalStreamBuilderImpl(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, org.chromium.net.impl.CronetEngineBase cronetEngineBase) {
        if (str == null) {
            throw new java.lang.NullPointerException("URL is required.");
        }
        if (callback == null) {
            throw new java.lang.NullPointerException("Callback is required.");
        }
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor is required.");
        }
        if (cronetEngineBase == null) {
            throw new java.lang.NullPointerException("CronetEngine is required.");
        }
        this.mUrl = str;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mCronetEngine = cronetEngineBase;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.ExperimentalBidirectionalStream.Builder addRequestAnnotation(java.lang.Object obj) {
        if (obj != null) {
            if (this.mRequestAnnotations == null) {
                this.mRequestAnnotations = new java.util.ArrayList();
            }
            this.mRequestAnnotations.add(obj);
            return this;
        }
        throw new java.lang.NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.ExperimentalBidirectionalStream.Builder bindToNetwork(long j17) {
        this.mNetworkHandle = j17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.ExperimentalBidirectionalStream build() {
        return this.mCronetEngine.createBidirectionalStream(this.mUrl, this.mCallback, this.mExecutor, this.mHttpMethod, this.mRequestHeaders, this.mPriority, this.mDelayRequestHeadersUntilFirstFlush, this.mRequestAnnotations, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i17) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i17) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.impl.BidirectionalStreamBuilderImpl addHeader(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Invalid header name.");
        }
        if (str2 != null) {
            this.mRequestHeaders.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        }
        throw new java.lang.NullPointerException("Invalid header value.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.impl.BidirectionalStreamBuilderImpl delayRequestHeadersUntilFirstFlush(boolean z17) {
        this.mDelayRequestHeadersUntilFirstFlush = z17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.impl.BidirectionalStreamBuilderImpl setHttpMethod(java.lang.String str) {
        if (str != null) {
            this.mHttpMethod = str;
            return this;
        }
        throw new java.lang.NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public org.chromium.net.impl.BidirectionalStreamBuilderImpl setPriority(int i17) {
        this.mPriority = i17;
        return this;
    }
}
