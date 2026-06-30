package com.tencent.wechat.aff.ovc;

/* loaded from: classes14.dex */
class ZIDL_cLTOF8jHB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.b f217445a;

    private native void ZIDL_BX(long j17, long j18, boolean z17);

    private native void ZIDL_CI(long j17, long j18);

    private native void ZIDL_DI(long j17, java.lang.String str);

    private native void ZIDL_EI(long j17, long j18);

    private native void ZIDL_FI(long j17, long j18);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18, boolean z17);

    private native void ZIDL_JX(long j17, long j18, boolean z17);

    private native void ZIDL_KI(long j17, java.lang.String str, boolean z17, boolean z18);

    private native void ZIDL_LI(long j17, java.lang.String str, int i17);

    private native void ZIDL_MI(long j17, int i17);

    @Override // com.tencent.wechat.aff.ovc.a
    public void C1(java.lang.String str) {
        ZIDL_DI(this.nativeHandler, str);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void H1(long j17, boolean z17) {
        ZIDL_BX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void I1(long j17, boolean z17) {
        ZIDL_IX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void J1(java.lang.String str, int i17) {
        ZIDL_LI(this.nativeHandler, str, i17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void L0(long j17) {
        ZIDL_GX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void N(com.tencent.wechat.aff.ovc.c cVar) {
        ZIDL_MI(this.nativeHandler, cVar.f217476d);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void S0(java.lang.String str, boolean z17, boolean z18) {
        ZIDL_KI(this.nativeHandler, str, z17, z18);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void U(long j17) {
        ZIDL_FI(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void W0(long j17, boolean z17) {
        ZIDL_JX(this.nativeHandler, j17, z17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void Y(long j17) {
        ZIDL_HX(this.nativeHandler, j17);
    }

    public void ZIDL_BV(long j17) {
        h41.x xVar = (h41.x) this.f217445a;
        kotlinx.coroutines.l.d(xVar.a(), null, null, new h41.t(xVar, j17, null), 3, null);
    }

    public void ZIDL_GV(long j17) {
        h41.x xVar = (h41.x) this.f217445a;
        kotlinx.coroutines.l.d(xVar.a(), null, null, new h41.l(xVar, j17, null), 3, null);
    }

    public void ZIDL_HV(long j17, boolean z17) {
        h41.x xVar = (h41.x) this.f217445a;
        kotlinx.coroutines.l.d(xVar.a(), null, null, new h41.k(xVar, z17, j17, null), 3, null);
    }

    public void ZIDL_IV(long j17, byte[] data) {
        h41.x xVar = (h41.x) this.f217445a;
        xVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.l.d(xVar.a(), null, null, new h41.w(xVar, data, j17, null), 3, null);
    }

    public void ZIDL_JV(long j17, byte[] data) {
        h41.x xVar = (h41.x) this.f217445a;
        xVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        kotlinx.coroutines.l.d(xVar.a(), null, null, new h41.v(xVar, data, j17, null), 3, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.b bVar = (com.tencent.wechat.aff.ovc.b) obj;
        this.f217445a = bVar;
        ((h41.x) bVar).f278884a = this;
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void i0(long j17) {
        ZIDL_CI(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.a
    public void x0(long j17) {
        ZIDL_EI(this.nativeHandler, j17);
    }
}
