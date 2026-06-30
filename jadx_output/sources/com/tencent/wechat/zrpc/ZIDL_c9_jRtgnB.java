package com.tencent.wechat.zrpc;

/* loaded from: classes16.dex */
class ZIDL_c9_jRtgnB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.zrpc.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.zrpc.d f220032a;

    public ZIDL_c9_jRtgnB(java.lang.Object obj) {
        com.tencent.wechat.zrpc.d dVar = (com.tencent.wechat.zrpc.d) obj;
        this.f220032a = dVar;
        dVar.l(this);
    }

    private native void ZIDL_CX(long j17, long j18, boolean z17);

    private native void ZIDL_DI(long j17, byte[] bArr, int i17);

    @Override // com.tencent.wechat.zrpc.c
    public void Q(byte[] bArr, int i17) {
        ZIDL_DI(this.nativeHandler, bArr, i17);
    }

    @Override // com.tencent.wechat.zrpc.c
    public void R(long j17, boolean z17) {
        ZIDL_CX(this.nativeHandler, j17, z17);
    }

    public void ZIDL_A() {
        this.f220032a.e();
    }

    public void ZIDL_B() {
        this.f220032a.j();
    }

    public void ZIDL_CV(long j17, byte[] bArr, long j18) {
        this.f220032a.p(j17, bArr, j18);
    }

    public void ZIDL_E() {
        this.f220032a.close();
    }

    public boolean ZIDL_F() {
        return this.f220032a.isConnected();
    }

    public int ZIDL_G() {
        return this.f220032a.k();
    }

    public java.lang.String ZIDL_H() {
        return this.f220032a.getExtra();
    }
}
