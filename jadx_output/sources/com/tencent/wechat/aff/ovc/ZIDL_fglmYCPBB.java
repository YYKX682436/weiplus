package com.tencent.wechat.aff.ovc;

/* loaded from: classes16.dex */
class ZIDL_fglmYCPBB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.r {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.s f217465b;

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DI(long j17);

    @Override // com.tencent.wechat.aff.ovc.r
    public void H() {
        ZIDL_DI(this.nativeHandler);
    }

    public void ZIDL_BV(long j17) {
        s.i iVar = (s.i) this.f217465b;
        if (iVar.f401838h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "show: already released");
            com.tencent.wechat.aff.ovc.r rVar = iVar.f401832b;
            if (rVar != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmYCPBB) rVar).c(j17);
                return;
            }
            return;
        }
        if (iVar.f401833c != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "show: already shown");
            com.tencent.wechat.aff.ovc.r rVar2 = iVar.f401832b;
            if (rVar2 != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmYCPBB) rVar2).c(j17);
                return;
            }
            return;
        }
        iVar.f401835e = j17;
        kotlinx.coroutines.r2 r2Var = iVar.f401837g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        iVar.f401837g = kotlinx.coroutines.l.d(iVar.f401831a, null, null, new s.h(iVar, null), 3, null);
    }

    public void ZIDL_CV(long j17) {
        s.i iVar = (s.i) this.f217465b;
        kotlinx.coroutines.l.d(iVar.f401831a, null, null, new s.g(iVar, j17, null), 3, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.s sVar = (com.tencent.wechat.aff.ovc.s) obj;
        this.f217465b = sVar;
        ((s.i) sVar).f401832b = this;
    }

    @Override // com.tencent.wechat.aff.ovc.r
    public void b(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.r
    public void c(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }
}
