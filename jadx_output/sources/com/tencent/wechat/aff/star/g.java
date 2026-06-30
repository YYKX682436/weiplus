package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
public class g extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.star.g f217510b = new com.tencent.wechat.aff.star.g();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.star.ZIDL_xmiCdvhZK f217511a;

    public g() {
        com.tencent.wechat.aff.star.ZIDL_xmiCdvhZK zIDL_xmiCdvhZK = new com.tencent.wechat.aff.star.ZIDL_xmiCdvhZK();
        this.f217511a = zIDL_xmiCdvhZK;
        this.zidlCreateName = "star.AffStarOptManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_star", "aff_biz");
        zIDL_xmiCdvhZK.ZIDL_xmiCdvhZC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(bw5.cl0 cl0Var, com.tencent.wechat.aff.star.f fVar) {
        this.f217511a.ZIDL_AV(this.nativeHandler, fVar, cl0Var.toByteArrayOrNull());
    }
}
