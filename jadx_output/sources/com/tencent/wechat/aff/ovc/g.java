package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
public class g extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ovc.g f217477b = new com.tencent.wechat.aff.ovc.g();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ovc.ZIDL_AztvAuopK f217478a;

    public g() {
        com.tencent.wechat.aff.ovc.ZIDL_AztvAuopK zIDL_AztvAuopK = new com.tencent.wechat.aff.ovc.ZIDL_AztvAuopK();
        this.f217478a = zIDL_AztvAuopK;
        this.zidlCreateName = "ovc.OVCManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_ovc", "aff_biz");
        zIDL_AztvAuopK.ZIDL_AztvAuopC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.ovc.f fVar) {
        this.f217478a.ZIDL_AV(this.nativeHandler, fVar);
    }

    public void b() {
        this.f217478a.ZIDL_B(this.nativeHandler);
    }
}
