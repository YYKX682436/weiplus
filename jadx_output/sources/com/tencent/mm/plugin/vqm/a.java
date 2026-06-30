package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public class a extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.a f177293b = new com.tencent.mm.plugin.vqm.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vqm.ZIDL_OwbsHO2QK f177294a;

    public a() {
        com.tencent.mm.plugin.vqm.ZIDL_OwbsHO2QK zIDL_OwbsHO2QK = new com.tencent.mm.plugin.vqm.ZIDL_OwbsHO2QK();
        this.f177294a = zIDL_OwbsHO2QK;
        this.zidlCreateName = "vqm.VQMAPI@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_vqm", "aff_biz");
        zIDL_OwbsHO2QK.ZIDL_OwbsHO2QC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.mm.plugin.vqm.f fVar) {
        this.f177294a.ZIDL_B(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(fVar));
    }

    public void b(com.tencent.mm.plugin.vqm.f fVar) {
        this.f177294a.ZIDL_C(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(fVar));
    }

    public void c() {
        this.f177294a.ZIDL_F(this.nativeHandler);
    }

    public long d() {
        return this.f177294a.ZIDL_D(this.nativeHandler);
    }

    public void e(com.tencent.mm.plugin.vqm.d dVar, byte[] bArr) {
        this.f177294a.ZIDL_N(this.nativeHandler, dVar.f177330d, bArr);
    }

    public void f(com.tencent.mm.plugin.vqm.b0 b0Var, byte[] bArr) {
        this.f177294a.ZIDL_H(this.nativeHandler, b0Var.f177327d, bArr);
    }

    public void launch() {
        this.f177294a.ZIDL_A(this.nativeHandler);
    }
}
