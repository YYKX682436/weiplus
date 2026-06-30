package com.tencent.wechat.aff.local_connection;

/* loaded from: classes16.dex */
public class d extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.aff.local_connection.d f217358c = new com.tencent.wechat.aff.local_connection.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFK f217359a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFKE f217360b;

    public d() {
        com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFK zIDL_tTtjjalFK = new com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFK();
        this.f217359a = zIDL_tTtjjalFK;
        com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFKE zIDL_tTtjjalFKE = new com.tencent.wechat.aff.local_connection.ZIDL_tTtjjalFKE();
        this.f217360b = zIDL_tTtjjalFKE;
        this.zidlCreateName = "local_connection.NearConnectionManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_local_connection", "aff_biz");
        zIDL_tTtjjalFK.ZIDL_tTtjjalFC(this, zIDL_tTtjjalFKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public int a() {
        return this.f217359a.ZIDL_H(this.nativeHandler);
    }

    public java.lang.String b() {
        return new java.lang.String(this.f217359a.ZIDL_I(this.nativeHandler), java.nio.charset.StandardCharsets.UTF_8);
    }

    public long c() {
        return this.f217359a.ZIDL_P(this.nativeHandler);
    }

    public long d() {
        return this.f217359a.ZIDL_O(this.nativeHandler);
    }

    public bw5.yf0 e(java.lang.String str, bw5.ge0 ge0Var, bw5.wd0 wd0Var) {
        return (bw5.yf0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.yf0.f35467m, this.f217359a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), ge0Var.toByteArrayOrNull(), wd0Var.toByteArrayOrNull()));
    }

    public void f(bw5.hs0 hs0Var) {
        this.f217359a.ZIDL_Q(this.nativeHandler, hs0Var.toByteArrayOrNull());
    }

    public byte[] g() {
        return this.f217359a.ZIDL_E(this.nativeHandler);
    }

    public boolean h(byte[] bArr) {
        return this.f217359a.ZIDL_D(this.nativeHandler, bArr);
    }

    public void i(bw5.zf0 zf0Var) {
        this.f217359a.ZIDL_M(this.nativeHandler, zf0Var.toByteArrayOrNull());
    }

    public void j(java.lang.String str, com.tencent.wechat.aff.local_connection.a aVar) {
        this.f217360b.f217357c.put(str, aVar);
    }

    public void k(java.lang.String str, com.tencent.wechat.aff.local_connection.b bVar) {
        this.f217360b.f217355a.put(str, bVar);
    }

    public void l(java.lang.String str, com.tencent.wechat.aff.local_connection.c cVar) {
        this.f217360b.f217356b.put(str, cVar);
    }

    public void m(java.lang.String str) {
        this.f217359a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void n(java.lang.String str) {
        this.f217359a.ZIDL_N(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
