package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkAuthKeeper extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.wechat.aff.IlinkAuthKeeper instance = new com.tencent.wechat.aff.IlinkAuthKeeper();
    com.tencent.wechat.aff.ZIDL_SoYkO8DQK jniCaller = new com.tencent.wechat.aff.ZIDL_SoYkO8DQK();
    com.tencent.wechat.aff.ZIDL_SoYkO8DQKE jniEventObj = new com.tencent.wechat.aff.ZIDL_SoYkO8DQKE();

    /* loaded from: classes15.dex */
    public interface C2CDownloadCallback {
        void complete(long j17, com.tencent.wechat.aff.IlinkC2CDownloadResult ilinkC2CDownloadResult);
    }

    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginCallback {
        void complete(long j17, com.tencent.wechat.aff.IlinkC2CDownloadOriginResult ilinkC2CDownloadOriginResult);
    }

    /* loaded from: classes15.dex */
    public interface C2CDownloadOriginProgressCallback {
        void onProgress(long j17, long j18, long j19);
    }

    /* loaded from: classes15.dex */
    public interface C2CDownloadProgressCallback {
        void onProgress(long j17, long j18, long j19);
    }

    /* loaded from: classes15.dex */
    public interface C2CUploadCallback {
        void complete(long j17, com.tencent.wechat.aff.IlinkC2CUploadResult ilinkC2CUploadResult);
    }

    /* loaded from: classes15.dex */
    public interface C2CUploadProgressCallback {
        void onProgress(long j17, long j18, long j19);
    }

    /* loaded from: classes15.dex */
    public interface CheckLoginQrCodeCallback {
        void complete(int i17, int i18);
    }

    /* loaded from: classes15.dex */
    public interface EnsureAuthCallback {
        void complete(int i17);
    }

    /* loaded from: classes15.dex */
    public interface LoginCallback {
        void complete(int i17, long j17);
    }

    /* loaded from: classes15.dex */
    public interface LogoutCallback {
        void complete(int i17);
    }

    /* loaded from: classes15.dex */
    public interface RequestLoginQrcodeCallback {
        void complete(int i17, java.lang.String str);
    }

    /* loaded from: classes15.dex */
    public interface RequireAuthCodeEvent {
        void event();
    }

    /* loaded from: classes15.dex */
    public interface TryAutoLoginCallback {
        void complete(int i17, long j17);
    }

    /* loaded from: classes15.dex */
    public interface UploadLogCompleteEvent {
        void event(int i17);
    }

    private IlinkAuthKeeper() {
        this.zidlCreateName = "aff.IlinkAuthKeeper@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_common", "aff_biz");
        this.jniCaller.ZIDL_SoYkO8DQC(this, this.jniEventObj, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.IlinkAuthKeeper buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.wechat.aff.IlinkAuthKeeper getInstance() {
        return instance;
    }

    public void c2CDownloadAsync(long j17, com.tencent.wechat.aff.IlinkC2CDownload ilinkC2CDownload, com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadProgressCallback c2CDownloadProgressCallback, com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadCallback c2CDownloadCallback) {
        this.jniCaller.ZIDL_OV(this.nativeHandler, c2CDownloadProgressCallback, c2CDownloadCallback, j17, ilinkC2CDownload.toByteArrayOrNull());
    }

    public void c2CDownloadOriginAsync(long j17, com.tencent.wechat.aff.IlinkC2CDownloadOrigin ilinkC2CDownloadOrigin, int i17, com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadOriginProgressCallback c2CDownloadOriginProgressCallback, com.tencent.wechat.aff.IlinkAuthKeeper.C2CDownloadOriginCallback c2CDownloadOriginCallback) {
        this.jniCaller.ZIDL_QV(this.nativeHandler, c2CDownloadOriginProgressCallback, c2CDownloadOriginCallback, j17, ilinkC2CDownloadOrigin.toByteArrayOrNull(), i17);
    }

    public void c2CUploadAsync(long j17, com.tencent.wechat.aff.IlinkC2CUpload ilinkC2CUpload, com.tencent.wechat.aff.IlinkAuthKeeper.C2CUploadProgressCallback c2CUploadProgressCallback, com.tencent.wechat.aff.IlinkAuthKeeper.C2CUploadCallback c2CUploadCallback) {
        this.jniCaller.ZIDL_MV(this.nativeHandler, c2CUploadProgressCallback, c2CUploadCallback, j17, ilinkC2CUpload.toByteArrayOrNull());
    }

    public void cancelC2CDownload(long j17) {
        this.jniCaller.ZIDL_P(this.nativeHandler, j17);
    }

    public void cancelC2CDownloadOrigin(long j17) {
        this.jniCaller.ZIDL_R(this.nativeHandler, j17);
    }

    public void cancelC2CUpload(long j17) {
        this.jniCaller.ZIDL_N(this.nativeHandler, j17);
    }

    public void checkLoginQrCodeAsync(com.tencent.wechat.aff.IlinkAuthKeeper.CheckLoginQrCodeCallback checkLoginQrCodeCallback) {
        this.jniCaller.ZIDL_GV(this.nativeHandler, checkLoginQrCodeCallback);
    }

    public void ensureAuthAsync(com.tencent.wechat.aff.IlinkAuthKeeper.EnsureAuthCallback ensureAuthCallback) {
        this.jniCaller.ZIDL_SV(this.nativeHandler, ensureAuthCallback);
    }

    public long genTaskId() {
        return this.jniCaller.ZIDL_L(this.nativeHandler);
    }

    public void initialize(java.lang.String str, int i17, int i18) {
        this.jniCaller.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, i18);
    }

    public void loginAsync(com.tencent.wechat.aff.IlinkAuthKeeper.LoginCallback loginCallback) {
        this.jniCaller.ZIDL_HV(this.nativeHandler, loginCallback);
    }

    public void logoutAsync(com.tencent.wechat.aff.IlinkAuthKeeper.LogoutCallback logoutCallback) {
        this.jniCaller.ZIDL_IV(this.nativeHandler, logoutCallback);
    }

    public void notifyGetAuthCodeComplete(int i17, java.lang.String str) {
        this.jniCaller.ZIDL_D(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void requestLoginQrcodeAsync(com.tencent.wechat.aff.IlinkAuthKeeper.RequestLoginQrcodeCallback requestLoginQrcodeCallback) {
        this.jniCaller.ZIDL_FV(this.nativeHandler, requestLoginQrcodeCallback);
    }

    public void requestUploadLog(int i17, int i18) {
        this.jniCaller.ZIDL_J(this.nativeHandler, i17, i18);
    }

    public void subscribeRequireAuthCodeEvent(java.lang.String str, com.tencent.wechat.aff.IlinkAuthKeeper.RequireAuthCodeEvent requireAuthCodeEvent) {
        this.jniEventObj.subscribeRequireAuthCodeEvent(str, requireAuthCodeEvent);
    }

    public void subscribeUploadLogCompleteEvent(java.lang.String str, com.tencent.wechat.aff.IlinkAuthKeeper.UploadLogCompleteEvent uploadLogCompleteEvent) {
        this.jniEventObj.subscribeUploadLogCompleteEvent(str, uploadLogCompleteEvent);
    }

    public void tryAutoLoginAsync(com.tencent.wechat.aff.IlinkAuthKeeper.TryAutoLoginCallback tryAutoLoginCallback) {
        this.jniCaller.ZIDL_EV(this.nativeHandler, tryAutoLoginCallback);
    }

    public void unInitialize() {
        this.jniCaller.ZIDL_B(this.nativeHandler);
    }

    public void unsubscribeRequireAuthCodeEvent(java.lang.String str) {
        this.jniEventObj.unsubscribeRequireAuthCodeEvent(str);
    }

    public void unsubscribeUploadLogCompleteEvent(java.lang.String str) {
        this.jniEventObj.unsubscribeUploadLogCompleteEvent(str);
    }
}
