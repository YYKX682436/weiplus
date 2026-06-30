package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class QuicExceptionImpl extends org.chromium.net.QuicException {
    private final org.chromium.net.impl.NetworkExceptionImpl mNetworkException;
    private final int mQuicDetailedErrorCode;

    public QuicExceptionImpl(java.lang.String str, int i17, int i18, int i19) {
        super(str, null);
        this.mNetworkException = new org.chromium.net.impl.NetworkExceptionImpl(str, i17, i18);
        this.mQuicDetailedErrorCode = i19;
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mNetworkException.getCronetInternalErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mNetworkException.getErrorCode();
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.mNetworkException.getMessage() + ", QuicDetailedErrorCode=" + this.mQuicDetailedErrorCode;
    }

    @Override // org.chromium.net.QuicException
    public int getQuicDetailedErrorCode() {
        return this.mQuicDetailedErrorCode;
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        return this.mNetworkException.immediatelyRetryable();
    }
}
