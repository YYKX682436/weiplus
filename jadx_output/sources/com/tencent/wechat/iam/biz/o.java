package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class o extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.o f217761b = new com.tencent.wechat.iam.biz.o();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_J5jZB14hyK f217762a;

    public o() {
        com.tencent.wechat.iam.biz.ZIDL_J5jZB14hyK zIDL_J5jZB14hyK = new com.tencent.wechat.iam.biz.ZIDL_J5jZB14hyK();
        this.f217762a = zIDL_J5jZB14hyK;
        com.tencent.wechat.iam.biz.ZIDL_J5jZB14hyKE zIDL_J5jZB14hyKE = new com.tencent.wechat.iam.biz.ZIDL_J5jZB14hyKE();
        this.zidlCreateName = "biz.IamBizAudioPlayListManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_J5jZB14hyK.ZIDL_J5jZB14hyC(this, zIDL_J5jZB14hyKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(bw5.lp0 lp0Var, int i17, com.tencent.wechat.iam.biz.l lVar) {
        this.f217762a.ZIDL_GV(this.nativeHandler, lVar, lp0Var.toByteArrayOrNull(), i17);
    }

    public void b(com.tencent.wechat.mm.biz.l4 l4Var, com.tencent.wechat.iam.biz.m mVar) {
        this.f217762a.ZIDL_AV(this.nativeHandler, mVar, l4Var.f218303d);
    }

    public void c(bw5.lp0 lp0Var, int i17, boolean z17) {
        this.f217762a.ZIDL_P(this.nativeHandler, lp0Var.toByteArrayOrNull(), i17, z17);
    }

    public void d(bw5.lp0 lp0Var, int i17) {
        this.f217762a.ZIDL_N(this.nativeHandler, lp0Var.toByteArrayOrNull(), i17);
    }

    public void e(java.util.ArrayList arrayList, int i17) {
        this.f217762a.ZIDL_O(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList), i17);
    }

    public void f(java.lang.String str, long j17, com.tencent.wechat.iam.biz.n nVar) {
        this.f217762a.ZIDL_HV(this.nativeHandler, nVar, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), j17);
    }

    public void g(boolean z17) {
        this.f217762a.ZIDL_K(this.nativeHandler, z17);
    }
}
