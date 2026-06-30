package org.chromium.net.impl;

/* loaded from: classes13.dex */
public class UrlRequestBuilderImpl extends org.chromium.net.ExperimentalUrlRequest.Builder {
    private static final java.lang.String ACCEPT_ENCODING = "Accept-Encoding";
    private static final java.lang.String TAG = "UrlRequestBuilderImpl";
    private boolean mAllowDirectExecutor;
    private final org.chromium.net.UrlRequest.Callback mCallback;
    private final org.chromium.net.impl.CronetEngineBase mCronetEngine;
    private boolean mDisableCache;
    private boolean mDisableConnectionMigration;
    private final java.util.concurrent.Executor mExecutor;
    private java.lang.String mMethod;
    private java.util.Collection<java.lang.Object> mRequestAnnotations;
    private org.chromium.net.RequestFinishedInfo.Listener mRequestFinishedListener;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private org.chromium.net.UploadDataProvider mUploadDataProvider;
    private java.util.concurrent.Executor mUploadDataProviderExecutor;
    private final java.lang.String mUrl;
    private final java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> mRequestHeaders = new java.util.ArrayList<>();
    private int mPriority = 3;
    private long mNetworkHandle = -1;
    private int mIdempotency = 0;

    public UrlRequestBuilderImpl(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, org.chromium.net.impl.CronetEngineBase cronetEngineBase) {
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

    @Override // org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl bindToNetwork(long j17) {
        this.mNetworkHandle = j17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl disableConnectionMigration() {
        this.mDisableConnectionMigration = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.ExperimentalUrlRequest.Builder setHttpMethod(java.lang.String str) {
        if (str != null) {
            this.mMethod = str;
            return this;
        }
        throw new java.lang.NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setIdempotency(int i17) {
        this.mIdempotency = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl addHeader(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Invalid header name.");
        }
        if (str2 != null) {
            if (ACCEPT_ENCODING.equalsIgnoreCase(str)) {
                new java.lang.Exception();
                return this;
            }
            this.mRequestHeaders.add(android.util.Pair.create(str, str2));
            return this;
        }
        throw new java.lang.NullPointerException("Invalid header value.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl addRequestAnnotation(java.lang.Object obj) {
        if (obj != null) {
            if (this.mRequestAnnotations == null) {
                this.mRequestAnnotations = new java.util.ArrayList();
            }
            this.mRequestAnnotations.add(obj);
            return this;
        }
        throw new java.lang.NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl allowDirectExecutor() {
        this.mAllowDirectExecutor = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBase build() {
        org.chromium.net.impl.UrlRequestBase createRequest = this.mCronetEngine.createRequest(this.mUrl, this.mCallback, this.mExecutor, this.mPriority, this.mRequestAnnotations, this.mDisableCache, this.mDisableConnectionMigration, this.mAllowDirectExecutor, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mRequestFinishedListener, this.mIdempotency, this.mNetworkHandle);
        java.lang.String str = this.mMethod;
        if (str != null) {
            createRequest.setHttpMethod(str);
        }
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = this.mRequestHeaders.iterator();
        while (it.hasNext()) {
            android.util.Pair<java.lang.String, java.lang.String> next = it.next();
            createRequest.addHeader((java.lang.String) next.first, (java.lang.String) next.second);
        }
        org.chromium.net.UploadDataProvider uploadDataProvider = this.mUploadDataProvider;
        if (uploadDataProvider != null) {
            createRequest.setUploadDataProvider(uploadDataProvider, this.mUploadDataProviderExecutor);
        }
        return createRequest;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl disableCache() {
        this.mDisableCache = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setPriority(int i17) {
        this.mPriority = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.mRequestFinishedListener = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setTrafficStatsTag(int i17) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setTrafficStatsUid(int i17) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = i17;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public org.chromium.net.impl.UrlRequestBuilderImpl setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor) {
        if (uploadDataProvider == null) {
            throw new java.lang.NullPointerException("Invalid UploadDataProvider.");
        }
        if (executor != null) {
            if (this.mMethod == null) {
                this.mMethod = "POST";
            }
            this.mUploadDataProvider = uploadDataProvider;
            this.mUploadDataProviderExecutor = executor;
            return this;
        }
        throw new java.lang.NullPointerException("Invalid UploadDataProvider Executor.");
    }
}
