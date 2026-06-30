package com.tencent.wechat.aff;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class ZIDL_SoYkO8DQK {
    private static final java.lang.String TAG = "IlinkAuthKeeperK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_EX(java.lang.Object obj, int i17, long j17) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.TryAutoLoginCallback) obj).complete(i17, j17);
    }

    private void ZIDL_FX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.RequestLoginQrcodeCallback) obj).complete(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    private void ZIDL_GX(java.lang.Object obj, int i17, int i18) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.CheckLoginQrCodeCallback) obj).complete(i17, i18);
    }

    private void ZIDL_HX(java.lang.Object obj, int i17, long j17) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.LoginCallback) obj).complete(i17, j17);
    }

    private void ZIDL_IX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.LogoutCallback) obj).complete(i17);
    }

    private void ZIDL_MU(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CUploadProgressCallback) obj).onProgress(j17, j18, j19);
    }

    private void ZIDL_MX(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CUploadCallback) obj).complete(j17, (com.tencent.wechat.aff.IlinkC2CUploadResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.IlinkC2CUploadResult.getDefaultInstance(), bArr));
    }

    private void ZIDL_OU(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadProgressCallback) obj).onProgress(j17, j18, j19);
    }

    private void ZIDL_OX(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadCallback) obj).complete(j17, (com.tencent.wechat.aff.IlinkC2CDownloadResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.IlinkC2CDownloadResult.getDefaultInstance(), bArr));
    }

    private void ZIDL_QU(java.lang.Object obj, long j17, long j18, long j19) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadOriginProgressCallback) obj).onProgress(j17, j18, j19);
    }

    private void ZIDL_QX(java.lang.Object obj, long j17, byte[] bArr) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadOriginCallback) obj).complete(j17, (com.tencent.wechat.aff.IlinkC2CDownloadOriginResult) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.IlinkC2CDownloadOriginResult.getDefaultInstance(), bArr));
    }

    private void ZIDL_SX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.aff.IlinkAuthKeeper.EnsureAuthCallback) obj).complete(i17);
    }

    public native void ZIDL_A(long j17, byte[] bArr, int i17, int i18);

    public native void ZIDL_B(long j17);

    public native void ZIDL_D(long j17, int i17, byte[] bArr);

    public native void ZIDL_EV(long j17, java.lang.Object obj);

    public native void ZIDL_FV(long j17, java.lang.Object obj);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native void ZIDL_HV(long j17, java.lang.Object obj);

    public native void ZIDL_IV(long j17, java.lang.Object obj);

    public native void ZIDL_J(long j17, int i17, int i18);

    public native long ZIDL_L(long j17);

    public native void ZIDL_MV(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr);

    public native void ZIDL_N(long j17, long j18);

    public native void ZIDL_OV(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr);

    public native void ZIDL_P(long j17, long j18);

    public native void ZIDL_QV(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, byte[] bArr, int i17);

    public native void ZIDL_R(long j17, long j18);

    public native void ZIDL_SV(long j17, java.lang.Object obj);

    public native void ZIDL_SoYkO8DQC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
