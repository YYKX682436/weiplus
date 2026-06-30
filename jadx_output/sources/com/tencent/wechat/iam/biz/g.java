package com.tencent.wechat.iam.biz;

/* loaded from: classes8.dex */
public class g extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.g f217742b = new com.tencent.wechat.iam.biz.g();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_XqmGdLdzK f217743a;

    public g() {
        com.tencent.wechat.iam.biz.ZIDL_XqmGdLdzK zIDL_XqmGdLdzK = new com.tencent.wechat.iam.biz.ZIDL_XqmGdLdzK();
        this.f217743a = zIDL_XqmGdLdzK;
        com.tencent.wechat.iam.biz.ZIDL_XqmGdLdzKE zIDL_XqmGdLdzKE = new com.tencent.wechat.iam.biz.ZIDL_XqmGdLdzKE();
        this.zidlCreateName = "biz.BizInteractiveIdentityManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_XqmGdLdzK.ZIDL_XqmGdLdzC(this, zIDL_XqmGdLdzKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.iam.biz.b bVar) {
        this.f217743a.ZIDL_CV(this.nativeHandler, bVar);
    }

    public void b(com.tencent.wechat.iam.biz.c cVar) {
        this.f217743a.ZIDL_EV(this.nativeHandler, cVar);
    }

    public void c(com.tencent.wechat.iam.biz.v1 v1Var, com.tencent.wechat.iam.biz.d dVar) {
        this.f217743a.ZIDL_BV(this.nativeHandler, dVar, v1Var.f217800d);
    }

    public void d(com.tencent.wechat.iam.biz.v1 v1Var, com.tencent.wechat.iam.biz.e eVar) {
        this.f217743a.ZIDL_AV(this.nativeHandler, eVar, v1Var.f217800d);
    }

    public void e(int i17, com.tencent.wechat.iam.biz.f fVar) {
        this.f217743a.ZIDL_GV(this.nativeHandler, fVar, i17);
    }
}
