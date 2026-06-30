package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_cLTOG6nzbB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.p {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.q f217453a;

    private native void ZIDL_BX(long j17, long j18);

    @Override // com.tencent.wechat.aff.ovc.p
    public void Z(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    public void ZIDL_BV(long j17, java.lang.String str) {
        h41.a1 a1Var = (h41.a1) this.f217453a;
        a1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PlatformUI", "showOKToastAsync called: taskId=" + j17 + ", text=" + str);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h41.z0(a1Var, j17, str, null), 3, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.q qVar = (com.tencent.wechat.aff.ovc.q) obj;
        this.f217453a = qVar;
        ((h41.a1) qVar).f278758a = this;
    }
}
