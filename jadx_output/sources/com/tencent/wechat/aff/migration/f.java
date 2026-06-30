package com.tencent.wechat.aff.migration;

/* loaded from: classes11.dex */
public class f extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.migration.f f217390b = new com.tencent.wechat.aff.migration.f();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZK f217391a;

    public f() {
        com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZK zIDL_t1VLdSnZK = new com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZK();
        this.f217391a = zIDL_t1VLdSnZK;
        com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZKE zIDL_t1VLdSnZKE = new com.tencent.wechat.aff.migration.ZIDL_t1VLdSnZKE();
        this.zidlCreateName = "affroam.MigrationManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_roam", "aff_biz");
        zIDL_t1VLdSnZK.ZIDL_t1VLdSnZC(this, zIDL_t1VLdSnZKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(boolean z17) {
        this.f217391a.ZIDL_IB(this.nativeHandler, z17);
    }

    public byte[] b(java.lang.String str, byte[] bArr) {
        return this.f217391a.ZIDL_F(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr);
    }

    public bw5.k0 c() {
        return (bw5.k0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.k0.f29188m, this.f217391a.ZIDL_H(this.nativeHandler));
    }

    public void d(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.f217391a.ZIDL_A(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17, z18);
    }

    public boolean e() {
        return this.f217391a.ZIDL_LB(this.nativeHandler);
    }

    public boolean f() {
        return this.f217391a.ZIDL_D(this.nativeHandler);
    }

    public void g(bw5.q0 q0Var) {
        this.f217391a.ZIDL_S(this.nativeHandler, q0Var.toByteArrayOrNull());
    }

    public void h(com.tencent.wechat.aff.migration.e eVar) {
        this.f217391a.ZIDL_PV(this.nativeHandler, eVar);
    }

    public void i(int i17, java.lang.String str, java.lang.String str2) {
        this.f217391a.ZIDL_C(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void j(int i17) {
        this.f217391a.ZIDL_JB(this.nativeHandler, i17);
    }

    public void k(boolean z17) {
        this.f217391a.ZIDL_MB(this.nativeHandler, z17);
    }

    public void l(boolean z17) {
        this.f217391a.ZIDL_TB(this.nativeHandler, z17);
    }

    public void m(bw5.m0 m0Var) {
        this.f217391a.ZIDL_CB(this.nativeHandler, m0Var.f30029d);
    }

    public void n(bw5.he0 he0Var) {
        this.f217391a.ZIDL_OB(this.nativeHandler, he0Var.f28185d);
    }

    public void o(int i17, int i18, int i19) {
        this.f217391a.ZIDL_KB(this.nativeHandler, i17, i18, i19);
    }

    public void p() {
        this.f217391a.ZIDL_R(this.nativeHandler);
    }

    public void q() {
        this.f217391a.ZIDL_B(this.nativeHandler);
    }
}
