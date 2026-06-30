package com.tencent.wechat.aff.status;

/* loaded from: classes16.dex */
public class StatusModuleCgiManager extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    private static com.tencent.wechat.aff.status.StatusModuleCgiManager instance = new com.tencent.wechat.aff.status.StatusModuleCgiManager();
    com.tencent.wechat.aff.status.ZIDL_KpaYccspK jniCaller = new com.tencent.wechat.aff.status.ZIDL_KpaYccspK();

    /* loaded from: classes16.dex */
    public interface UploadMediaToStatusCDNCallback {
        void complete(bw5.rr0 rr0Var);
    }

    /* loaded from: classes16.dex */
    public interface getRecommendIconsByImageCallback {
        void complete(bw5.qo0 qo0Var);
    }

    /* loaded from: classes16.dex */
    public interface getTextStatusReadListUsersCallback {
        void complete(bw5.lo0 lo0Var);
    }

    /* loaded from: classes16.dex */
    public interface requestTextStatusDetailReadCallback {
        void complete(bw5.no0 no0Var);
    }

    /* loaded from: classes16.dex */
    public interface uploadAndGetRecommendIconsCallback {
        void complete(bw5.pr0 pr0Var);
    }

    private StatusModuleCgiManager() {
        this.zidlCreateName = "status.StatusModuleCgiManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_status", "aff_biz");
        this.jniCaller.ZIDL_KpaYccspC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.status.StatusModuleCgiManager buildZidlObjForHolder(java.lang.String str, java.lang.String str2, long j17) {
        return getInstance();
    }

    public static com.tencent.wechat.aff.status.StatusModuleCgiManager getInstance() {
        return instance;
    }

    public void getRecommendIconsByImageAsync(bw5.oo0 oo0Var, com.tencent.wechat.aff.status.StatusModuleCgiManager.getRecommendIconsByImageCallback getrecommendiconsbyimagecallback) {
        this.jniCaller.ZIDL_AV(this.nativeHandler, getrecommendiconsbyimagecallback, oo0Var.toByteArrayOrNull());
    }

    public void getTextStatusReadListUsersAsync(bw5.jo0 jo0Var, com.tencent.wechat.aff.status.StatusModuleCgiManager.getTextStatusReadListUsersCallback gettextstatusreadlistuserscallback) {
        this.jniCaller.ZIDL_EV(this.nativeHandler, gettextstatusreadlistuserscallback, jo0Var.toByteArrayOrNull());
    }

    public void requestTextStatusDetailReadAsync(bw5.mo0 mo0Var, com.tencent.wechat.aff.status.StatusModuleCgiManager.requestTextStatusDetailReadCallback requesttextstatusdetailreadcallback) {
        this.jniCaller.ZIDL_DV(this.nativeHandler, requesttextstatusdetailreadcallback, mo0Var.toByteArrayOrNull());
    }

    public void uploadAndGetRecommendIconsAsync(bw5.or0 or0Var, com.tencent.wechat.aff.status.StatusModuleCgiManager.uploadAndGetRecommendIconsCallback uploadandgetrecommendiconscallback) {
        this.jniCaller.ZIDL_BV(this.nativeHandler, uploadandgetrecommendiconscallback, or0Var.toByteArrayOrNull());
    }

    public void uploadMediaToStatusCDNAsync(bw5.qr0 qr0Var, com.tencent.wechat.aff.status.StatusModuleCgiManager.UploadMediaToStatusCDNCallback uploadMediaToStatusCDNCallback) {
        this.jniCaller.ZIDL_CV(this.nativeHandler, uploadMediaToStatusCDNCallback, qr0Var.toByteArrayOrNull());
    }
}
