package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class RequestFinishedInfoImpl extends org.chromium.net.RequestFinishedInfo {
    private final java.util.Collection<java.lang.Object> mAnnotations;
    private final org.chromium.net.CronetException mException;
    private final int mFinishedReason;
    private final org.chromium.net.RequestFinishedInfo.Metrics mMetrics;
    private final org.chromium.net.UrlResponseInfo mResponseInfo;
    private final java.lang.String mUrl;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FinishedReason {
    }

    public RequestFinishedInfoImpl(java.lang.String str, java.util.Collection<java.lang.Object> collection, org.chromium.net.RequestFinishedInfo.Metrics metrics, int i17, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        this.mUrl = str;
        this.mAnnotations = collection;
        this.mMetrics = metrics;
        this.mFinishedReason = i17;
        this.mResponseInfo = urlResponseInfo;
        this.mException = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public java.util.Collection<java.lang.Object> getAnnotations() {
        java.util.Collection<java.lang.Object> collection = this.mAnnotations;
        return collection == null ? java.util.Collections.emptyList() : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public org.chromium.net.CronetException getException() {
        return this.mException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public int getFinishedReason() {
        return this.mFinishedReason;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public org.chromium.net.RequestFinishedInfo.Metrics getMetrics() {
        return this.mMetrics;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public org.chromium.net.UrlResponseInfo getResponseInfo() {
        return this.mResponseInfo;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public java.lang.String getUrl() {
        return this.mUrl;
    }
}
