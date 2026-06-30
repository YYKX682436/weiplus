package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes5.dex */
public class o extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFwFn1K f217293a;

    public o(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFwFn1K zIDL_NyGFwFn1K = new com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFwFn1K();
        this.f217293a = zIDL_NyGFwFn1K;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("ilink_stream", "ilink_stream");
        zIDL_NyGFwFn1K.ZIDL_NyGFwFn1C(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public java.lang.String a(int i17, byte[] bArr, java.lang.String str, com.tencent.wechat.aff.ilink_stream.h hVar) {
        return new java.lang.String(this.f217293a.ZIDL_E(this.nativeHandler, i17, bArr, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), hVar.toByteArrayOrNull()), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String b(int i17, byte[] bArr) {
        return new java.lang.String(this.f217293a.ZIDL_C(this.nativeHandler, i17, bArr), java.nio.charset.StandardCharsets.UTF_8);
    }

    public void c(java.lang.String str) {
        this.f217293a.ZIDL_F(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void d(com.tencent.wechat.aff.ilink_stream.a0 a0Var) {
        this.f217293a.ZIDL_G(this.nativeHandler, a0Var.toByteArrayOrNull());
    }

    public void e(java.lang.String str, com.tencent.wechat.aff.ilink_stream.j jVar) {
        this.f217293a.f217211e.put(str, jVar);
    }

    public void f(java.lang.String str, com.tencent.wechat.aff.ilink_stream.k kVar) {
        this.f217293a.f217208b.put(str, kVar);
    }

    public void g(java.lang.String str, com.tencent.wechat.aff.ilink_stream.l lVar) {
        this.f217293a.f217209c.put(str, lVar);
    }

    public void h(java.lang.String str, com.tencent.wechat.aff.ilink_stream.m mVar) {
        this.f217293a.f217207a.put(str, mVar);
    }

    public void i(java.lang.String str, com.tencent.wechat.aff.ilink_stream.n nVar) {
        this.f217293a.f217210d.put(str, nVar);
    }

    public void j(java.lang.String str) {
        this.f217293a.f217211e.remove(str);
    }

    public void k(java.lang.String str) {
        this.f217293a.f217208b.remove(str);
    }

    public void l(java.lang.String str) {
        this.f217293a.f217209c.remove(str);
    }

    public void m(java.lang.String str) {
        this.f217293a.f217207a.remove(str);
    }

    public void n(java.lang.String str) {
        this.f217293a.f217210d.remove(str);
    }

    public void o(int i17) {
        this.f217293a.ZIDL_A(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.ilink_stream.i iVar = new com.tencent.wechat.aff.ilink_stream.i(this, this.nativeHandler);
        iVar.f217292c = this.nativeHandler;
        iVar.f217290a = this.zidlIdentity;
        iVar.f217291b = this.zidlSvrIdentity;
    }
}
