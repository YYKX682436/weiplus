package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public class a extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.udr.a f217529b = new com.tencent.wechat.aff.udr.a();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.udr.ZIDL_QMTbM5sNK f217530a;

    public a() {
        com.tencent.wechat.aff.udr.ZIDL_QMTbM5sNK zIDL_QMTbM5sNK = new com.tencent.wechat.aff.udr.ZIDL_QMTbM5sNK();
        this.f217530a = zIDL_QMTbM5sNK;
        this.zidlCreateName = "udr.AffUdrNativeToCppManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("aff_feat_udr", "aff_feat_udr");
        zIDL_QMTbM5sNK.ZIDL_QMTbM5sNC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public static com.tencent.wechat.aff.udr.a h() {
        return f217529b;
    }

    public void a(com.tencent.wechat.aff.udr.p pVar, java.util.Optional optional) {
        this.f217530a.ZIDL_G(this.nativeHandler, pVar.toByteArrayOrNull(), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2Optional(optional));
    }

    public void b(com.tencent.wechat.aff.udr.q qVar, java.util.Optional optional) {
        this.f217530a.ZIDL_E(this.nativeHandler, qVar.toByteArrayOrNull(), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2Optional(optional));
    }

    public void c(com.tencent.wechat.aff.udr.q qVar, java.util.Optional optional) {
        this.f217530a.ZIDL_F(this.nativeHandler, qVar.toByteArrayOrNull(), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2Optional(optional));
    }

    public void d() {
        this.f217530a.ZIDL_L(this.nativeHandler);
    }

    public void e(long j17, com.tencent.wechat.aff.udr.t tVar) {
        this.f217530a.ZIDL_P(this.nativeHandler, j17, tVar.toByteArrayOrNull());
    }

    public java.util.Optional f(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.stringJniToJavaOptional(this.f217530a.ZIDL_R(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public java.util.Optional g() {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.aff.udr.w.f217585f, this.f217530a.ZIDL_D(this.nativeHandler));
    }

    public java.util.Optional i(java.lang.String str, java.lang.String str2) {
        return com.tencent.wechat.zidl2.ZidlUtil.bytesJniToJavaOptional(this.f217530a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public java.util.Optional j(java.lang.String str) {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.aff.udr.w.f217585f, this.f217530a.ZIDL_C(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public java.util.Optional k(java.lang.String str, java.lang.String str2) {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.aff.udr.x.L, this.f217530a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public void l(com.tencent.wechat.aff.udr.s sVar) {
        this.f217530a.ZIDL_J(this.nativeHandler, sVar.toByteArrayOrNull());
    }

    public void m() {
        this.f217530a.ZIDL_I(this.nativeHandler);
    }

    public void n() {
        this.f217530a.ZIDL_N(this.nativeHandler);
    }

    public void o(java.lang.String str, boolean z17, java.util.ArrayList arrayList, com.tencent.wechat.aff.udr.g gVar) {
        this.f217530a.ZIDL_S(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(gVar));
    }

    public void p(com.tencent.wechat.aff.udr.k kVar) {
        this.f217530a.ZIDL_T(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(kVar));
    }

    public void q() {
        this.f217530a.ZIDL_O(this.nativeHandler);
    }

    public void r(java.lang.String str, java.lang.String str2, int i17, java.util.Optional optional, java.util.Optional optional2) {
        this.f217530a.ZIDL_H(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17, com.tencent.wechat.zidl2.ZidlUtil.stringJavaToJniOptionalBytes(optional), com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2Optional(optional2));
    }
}
