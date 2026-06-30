package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
public class i extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.star.i f217512b = new com.tencent.wechat.aff.star.i();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.star.ZIDL_xmiC_E9_K f217513a;

    public i() {
        com.tencent.wechat.aff.star.ZIDL_xmiC_E9_K zIDL_xmiC_E9_K = new com.tencent.wechat.aff.star.ZIDL_xmiC_E9_K();
        this.f217513a = zIDL_xmiC_E9_K;
        this.zidlCreateName = "star.AffStarSyncManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_star", "aff_biz");
        zIDL_xmiC_E9_K.ZIDL_xmiC_E9_C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f217513a.ZIDL_A(this.nativeHandler);
    }
}
