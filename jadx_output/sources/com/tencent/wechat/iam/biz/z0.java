package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class z0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3K f217805a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3KE f217806b;

    public z0(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3K zIDL_XqmGB1Os3K = new com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3K();
        this.f217805a = zIDL_XqmGB1Os3K;
        com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3KE zIDL_XqmGB1Os3KE = new com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3KE();
        this.f217806b = zIDL_XqmGB1Os3KE;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_XqmGB1Os3K.ZIDL_XqmGB1Os3C(this, zIDL_XqmGB1Os3KE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(boolean z17, com.tencent.wechat.iam.biz.u0 u0Var) {
        this.f217805a.ZIDL_CV(this.nativeHandler, u0Var, z17);
    }

    public void b(com.tencent.wechat.iam.biz.v0 v0Var) {
        this.f217805a.ZIDL_KV(this.nativeHandler, v0Var);
    }

    public java.lang.String c() {
        return new java.lang.String(this.f217805a.ZIDL_E(this.nativeHandler), java.nio.charset.StandardCharsets.UTF_8);
    }

    public void d(com.tencent.wechat.iam.biz.w0 w0Var) {
        this.f217805a.ZIDL_FV(this.nativeHandler, w0Var);
    }

    public void e(com.tencent.wechat.iam.biz.x0 x0Var) {
        this.f217805a.ZIDL_GV(this.nativeHandler, x0Var);
    }

    public void f(byte[] bArr) {
        this.f217805a.ZIDL_L(this.nativeHandler, bArr);
    }

    public void g(java.lang.String str, com.tencent.wechat.iam.biz.r0 r0Var) {
        this.f217806b.f217722c.put(str, r0Var);
    }

    public void h(java.lang.String str, com.tencent.wechat.iam.biz.t0 t0Var) {
        this.f217806b.f217723d.put(str, t0Var);
    }

    public void i(java.lang.String str, com.tencent.wechat.iam.biz.y0 y0Var) {
        this.f217806b.f217720a.put(str, y0Var);
    }

    public void j(java.lang.String str) {
        this.f217806b.f217723d.remove(str);
    }

    public void k(java.lang.String str) {
        this.f217806b.f217720a.remove(str);
    }

    public void l() {
        this.f217805a.ZIDL_J(this.nativeHandler);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.biz.s0 s0Var = new com.tencent.wechat.iam.biz.s0(this, this.nativeHandler);
        s0Var.f217782c = this.nativeHandler;
        s0Var.f217780a = this.zidlIdentity;
        s0Var.f217781b = this.zidlSvrIdentity;
    }
}
