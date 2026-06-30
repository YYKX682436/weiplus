package com.tencent.wechat.aff.local_connection;

/* loaded from: classes13.dex */
class ZIDL_sqnlB1hUqB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.local_connection.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.local_connection.f f217354a;

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18, int i17, byte[] bArr, byte[] bArr2);

    private native void ZIDL_GX(long j17, long j18, int i17);

    private native void ZIDL_IX(long j17, long j18);

    private native void ZIDL_JX(long j17, long j18);

    private native void ZIDL_OX(long j17, long j18, byte[] bArr);

    @Override // com.tencent.wechat.aff.local_connection.e
    public void H0(long j17, bw5.xf0 xf0Var, java.lang.String str, java.lang.String str2) {
        ZIDL_FX(this.nativeHandler, j17, xf0Var.f35099d, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.local_connection.e
    public void P0(long j17, bw5.xf0 xf0Var) {
        ZIDL_GX(this.nativeHandler, j17, xf0Var.f35099d);
    }

    public void Q1(long j17, byte[] bArr) {
        ZIDL_OX(this.nativeHandler, j17, bArr);
    }

    public void ZIDL_AV(long j17) {
        ((kp.n) this.f217354a).getClass();
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "activateAWDLAsync: " + j17);
    }

    public void ZIDL_BV(long j17) {
        ((kp.n) this.f217354a).getClass();
        throw new java.lang.UnsupportedOperationException("Not yet implemented");
    }

    public void ZIDL_C() {
        ((kp.i1) ((kp.n) this.f217354a).a()).hj();
    }

    public void ZIDL_D() {
        ((kp.i1) ((kp.n) this.f217354a).a()).pj();
    }

    public void ZIDL_EV(long j17) {
        this.f217354a.getClass();
    }

    public void ZIDL_FV(long j17) {
        kp.n nVar = (kp.n) this.f217354a;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "createGroupAsync: " + j17);
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) nVar.f310799b).getValue(), null, null, new kp.j(nVar, j17, null), 3, null);
    }

    public void ZIDL_GV(long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.local_connection.f fVar = this.f217354a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        kp.n nVar = (kp.n) fVar;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "connectToGroupAsync: " + j17 + ", networkName: " + str);
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) nVar.f310799b).getValue(), null, null, new kp.i(nVar, str, str2, j17, null), 3, null);
    }

    public void ZIDL_H() {
        kp.n nVar = (kp.n) this.f217354a;
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "removeGroup");
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) nVar.f310799b).getValue(), null, null, new kp.k(nVar, null), 3, null);
    }

    public void ZIDL_IV(long j17) {
        this.f217354a.getClass();
    }

    public void ZIDL_JV(long j17) {
        this.f217354a.getClass();
    }

    public void ZIDL_K(byte[] bArr) {
        com.tencent.wechat.aff.local_connection.f fVar = this.f217354a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((kp.n) fVar).getClass();
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "disconnectFromGroup: ".concat(str));
    }

    public int ZIDL_L() {
        this.f217354a.getClass();
        return 0;
    }

    public int ZIDL_M() {
        return ((kp.i1) ((kp.n) this.f217354a).a()).cj() ? 1 : 0;
    }

    public byte[] ZIDL_N(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.local_connection.f fVar = this.f217354a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((kp.n) fVar).getClass();
        return new byte[0];
    }

    public void ZIDL_OV(long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.local_connection.f fVar = this.f217354a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        com.tencent.wechat.aff.local_connection.e eVar = ((kp.n) fVar).f310798a;
        if (eVar != null) {
            ((com.tencent.wechat.aff.local_connection.ZIDL_sqnlB1hUqB) eVar).Q1(j17, new byte[0]);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.local_connection.f fVar = (com.tencent.wechat.aff.local_connection.f) obj;
        this.f217354a = fVar;
        ((kp.n) fVar).f310798a = this;
        com.tencent.mars.xlog.Log.i("NearConnectionProviderImpl", "setCallback");
    }
}
