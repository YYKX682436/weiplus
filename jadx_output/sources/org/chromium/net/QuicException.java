package org.chromium.net;

/* loaded from: classes16.dex */
public abstract class QuicException extends org.chromium.net.NetworkException {
    public QuicException(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
    }

    public abstract int getQuicDetailedErrorCode();
}
