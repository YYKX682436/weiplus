package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class BidirectionalStreamNetworkException extends org.chromium.net.impl.NetworkExceptionImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public BidirectionalStreamNetworkException(java.lang.String str, int i17, int i18) {
        super(str, i17, i18);
    }

    @Override // org.chromium.net.impl.NetworkExceptionImpl, org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        int i17 = this.mCronetInternalErrorCode;
        if (i17 == -358 || i17 == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
