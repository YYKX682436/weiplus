package org.webrtc;

/* loaded from: classes14.dex */
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long j17) {
        this.nativeDtmfSender = j17;
    }

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender == 0) {
            throw new java.lang.IllegalStateException("DtmfSender has been disposed.");
        }
    }

    private static native boolean nativeCanInsertDtmf(long j17);

    private static native int nativeDuration(long j17);

    private static native boolean nativeInsertDtmf(long j17, java.lang.String str, int i17, int i18);

    private static native int nativeInterToneGap(long j17);

    private static native java.lang.String nativeTones(long j17);

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(java.lang.String str, int i17, int i18) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i17, i18);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public java.lang.String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}
