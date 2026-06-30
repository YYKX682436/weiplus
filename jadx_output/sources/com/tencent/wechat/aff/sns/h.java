package com.tencent.wechat.aff.sns;

/* loaded from: classes4.dex */
public class h extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.sns.h f217503b = new com.tencent.wechat.aff.sns.h();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.sns.ZIDL_vWtfeknlK f217504a;

    public h() {
        com.tencent.wechat.aff.sns.ZIDL_vWtfeknlK zIDL_vWtfeknlK = new com.tencent.wechat.aff.sns.ZIDL_vWtfeknlK();
        this.f217504a = zIDL_vWtfeknlK;
        com.tencent.wechat.aff.sns.ZIDL_vWtfeknlKE zIDL_vWtfeknlKE = new com.tencent.wechat.aff.sns.ZIDL_vWtfeknlKE();
        this.zidlCreateName = "sns.SnsDBManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_sns", "aff_biz");
        zIDL_vWtfeknlK.ZIDL_vWtfeknlC(this, zIDL_vWtfeknlKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(long j17, com.tencent.wechat.aff.sns.d dVar) {
        this.f217504a.ZIDL_EV(this.nativeHandler, dVar, j17);
    }

    public void b(long j17, long j18, com.tencent.wechat.aff.sns.c cVar) {
        this.f217504a.ZIDL_XV(this.nativeHandler, cVar, j17, j18);
    }

    public void c(bw5.ak0 ak0Var, bw5.fk0 fk0Var, com.tencent.wechat.aff.sns.e eVar) {
        this.f217504a.ZIDL_CBV(this.nativeHandler, eVar, ak0Var.toByteArrayOrNull(), fk0Var.toByteArrayOrNull());
    }

    public bw5.jk0 d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return (bw5.jk0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.jk0.f29002h, this.f217504a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), str3.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public void e(long j17, bw5.fk0 fk0Var, com.tencent.wechat.aff.sns.f fVar) {
        this.f217504a.ZIDL_EBV(this.nativeHandler, fVar, j17, fk0Var.toByteArrayOrNull());
    }

    public void f(long j17, bw5.gk0 gk0Var, com.tencent.wechat.aff.sns.g gVar) {
        this.f217504a.ZIDL_DBV(this.nativeHandler, gVar, j17, gk0Var.toByteArrayOrNull());
    }
}
