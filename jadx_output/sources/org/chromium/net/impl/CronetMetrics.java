package org.chromium.net.impl;

/* loaded from: classes16.dex */
public final class CronetMetrics extends org.chromium.net.RequestFinishedInfo.Metrics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    private final long mPushEndMs;
    private final long mPushStartMs;
    private final java.lang.Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final long mRequestStartMs;
    private final long mResponseStartMs;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    private final java.lang.Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    private final java.lang.Long mTotalTimeMs;
    private final java.lang.Long mTtfbMs;

    public CronetMetrics(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27) {
        this.mTtfbMs = l17;
        this.mTotalTimeMs = l18;
        this.mSentByteCount = l19;
        this.mReceivedByteCount = l27;
        this.mRequestStartMs = -1L;
        this.mDnsStartMs = -1L;
        this.mDnsEndMs = -1L;
        this.mConnectStartMs = -1L;
        this.mConnectEndMs = -1L;
        this.mSslStartMs = -1L;
        this.mSslEndMs = -1L;
        this.mSendingStartMs = -1L;
        this.mSendingEndMs = -1L;
        this.mPushStartMs = -1L;
        this.mPushEndMs = -1L;
        this.mResponseStartMs = -1L;
        this.mRequestEndMs = -1L;
        this.mSocketReused = false;
    }

    private static boolean checkOrder(long j17, long j18) {
        return (j18 >= j17 && j17 != -1) || j18 == -1;
    }

    private static java.util.Date toDate(long j17) {
        if (j17 != -1) {
            return new java.util.Date(j17);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getConnectEnd() {
        return toDate(this.mConnectEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getConnectStart() {
        return toDate(this.mConnectStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getDnsEnd() {
        return toDate(this.mDnsEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getDnsStart() {
        return toDate(this.mDnsStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getPushEnd() {
        return toDate(this.mPushEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getPushStart() {
        return toDate(this.mPushStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.lang.Long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getRequestEnd() {
        return toDate(this.mRequestEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getRequestStart() {
        return toDate(this.mRequestStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getResponseStart() {
        return toDate(this.mResponseStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getSendingEnd() {
        return toDate(this.mSendingEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getSendingStart() {
        return toDate(this.mSendingStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.lang.Long getSentByteCount() {
        return this.mSentByteCount;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public boolean getSocketReused() {
        return this.mSocketReused;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getSslEnd() {
        return toDate(this.mSslEndMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.util.Date getSslStart() {
        return toDate(this.mSslStartMs);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.lang.Long getTotalTimeMs() {
        return this.mTotalTimeMs;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public java.lang.Long getTtfbMs() {
        return this.mTtfbMs;
    }

    public CronetMetrics(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59) {
        this.mRequestStartMs = j17;
        this.mDnsStartMs = j18;
        this.mDnsEndMs = j19;
        this.mConnectStartMs = j27;
        this.mConnectEndMs = j28;
        this.mSslStartMs = j29;
        this.mSslEndMs = j37;
        this.mSendingStartMs = j38;
        this.mSendingEndMs = j39;
        this.mPushStartMs = j47;
        this.mPushEndMs = j48;
        this.mResponseStartMs = j49;
        this.mRequestEndMs = j57;
        this.mSocketReused = z17;
        this.mSentByteCount = java.lang.Long.valueOf(j58);
        this.mReceivedByteCount = java.lang.Long.valueOf(j59);
        if (j17 != -1 && j49 != -1) {
            this.mTtfbMs = java.lang.Long.valueOf(j49 - j17);
        } else {
            this.mTtfbMs = null;
        }
        if (j17 != -1 && j57 != -1) {
            this.mTotalTimeMs = java.lang.Long.valueOf(j57 - j17);
        } else {
            this.mTotalTimeMs = null;
        }
    }
}
