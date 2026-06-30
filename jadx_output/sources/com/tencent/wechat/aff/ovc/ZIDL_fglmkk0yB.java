package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_fglmkk0yB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.k f217470a;

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_EI(long j17);

    private native void ZIDL_FI(long j17);

    public boolean ZIDL_B() {
        ((h41.t0) this.f217470a).getClass();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        boolean z17 = intValue == 1;
        com.tencent.mars.xlog.Log.i("MicrMsg.OVCXLabEnable", "voiceAssistantPermissionGranted: switchValue=" + intValue + ", granted=" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPermissionGranted: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", sb6.toString());
        return z17;
    }

    public void ZIDL_CV(long j17) {
        h41.t0 t0Var = (h41.t0) this.f217470a;
        if (t0Var.f278868j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "show: already released");
            com.tencent.wechat.aff.ovc.j jVar = t0Var.f278861a;
            if (jVar != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmkk0yB) jVar).c(j17);
                return;
            }
            return;
        }
        if (t0Var.f278862b != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "show: already shown");
            com.tencent.wechat.aff.ovc.j jVar2 = t0Var.f278861a;
            if (jVar2 != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmkk0yB) jVar2).c(j17);
                return;
            }
            return;
        }
        t0Var.f278863c = j17;
        kotlinx.coroutines.r2 r2Var = t0Var.f278867i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        t0Var.f278867i = kotlinx.coroutines.l.d(t0Var.f278865g, null, null, new h41.s0(t0Var, null), 3, null);
    }

    public void ZIDL_DV(long j17) {
        h41.t0 t0Var = (h41.t0) this.f217470a;
        kotlinx.coroutines.l.d(t0Var.f278865g, null, null, new h41.r0(t0Var, j17, null), 3, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.k kVar = (com.tencent.wechat.aff.ovc.k) obj;
        this.f217470a = kVar;
        ((h41.t0) kVar).f278861a = this;
    }

    @Override // com.tencent.wechat.aff.ovc.j
    public void b(long j17) {
        ZIDL_DX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.j
    public void c(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.j
    public void o0() {
        ZIDL_EI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.ovc.j
    public void v1() {
        ZIDL_FI(this.nativeHandler);
    }
}
