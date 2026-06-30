package com.tencent.wechat.aff.mm_foundation;

/* loaded from: classes5.dex */
class ZIDL_JhX8INZsB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.mm_foundation.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.mm_foundation.b f217394a;

    private native void ZIDL_AX(long j17, long j18, long j19, long j27, byte[] bArr);

    @Override // com.tencent.wechat.aff.mm_foundation.a
    public void A0(long j17, long j18, long j19, byte[] bArr) {
        ZIDL_AX(this.nativeHandler, j17, j18, j19, bArr);
    }

    public void ZIDL_AV(long j17, long j18, byte[] bArr, byte[] bArr2, boolean z17, long j19, long j27) {
        com.tencent.wechat.aff.mm_foundation.b bVar = this.f217394a;
        e50.v vVar = (e50.v) bVar;
        kotlinx.coroutines.l.d(vVar.f249545a, kotlinx.coroutines.q1.f310570c, null, new e50.u(j17, j18, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), bArr2, z17, j19, vVar, null), 2, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.mm_foundation.b bVar = (com.tencent.wechat.aff.mm_foundation.b) obj;
        this.f217394a = bVar;
        e50.v vVar = (e50.v) bVar;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "setCallback: " + this);
        vVar.f249546b = this;
    }
}
