package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class NetworkExceptionImpl extends org.chromium.net.NetworkException {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final int mCronetInternalErrorCode;
    protected final int mErrorCode;

    public NetworkExceptionImpl(java.lang.String str, int i17, int i18) {
        super(str, null);
        this.mErrorCode = i17;
        this.mCronetInternalErrorCode = i18;
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return this.mCronetInternalErrorCode;
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(super.getMessage());
        sb6.append(", ErrorCode=");
        sb6.append(this.mErrorCode);
        if (this.mCronetInternalErrorCode != 0) {
            sb6.append(", InternalErrorCode=");
            sb6.append(this.mCronetInternalErrorCode);
        }
        sb6.append(", Retryable=");
        sb6.append(immediatelyRetryable());
        return sb6.toString();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        int i17 = this.mErrorCode;
        return i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 8;
    }
}
