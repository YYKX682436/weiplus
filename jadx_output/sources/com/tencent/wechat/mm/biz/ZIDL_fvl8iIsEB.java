package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
class ZIDL_fvl8iIsEB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.mm.biz.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.f f217850a;

    private native void ZIDL_AX(long j17, int i17);

    private native void ZIDL_BX(long j17, int i17);

    private native void ZIDL_CX(long j17, int i17);

    public void ZIDL_AV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.biz.f fVar = this.f217850a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yw.c0 c0Var = (yw.c0) fVar;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizDynamicCardMrgEventImpl", "onAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f466500a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(1, str);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yw.z(c0Var, i17));
    }

    public void ZIDL_BV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.biz.f fVar = this.f217850a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yw.c0 c0Var = (yw.c0) fVar;
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizDynamicCardMrgEventImpl", "onRecFeedsAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f466500a.c()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(2, str);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yw.b0(c0Var, i17));
    }

    public void ZIDL_CV(int i17, int i18, long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.mm.biz.f fVar = this.f217850a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        yw.c0 c0Var = (yw.c0) fVar;
        c0Var.getClass();
        if (i18 == 1 && yw.x0.f466500a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).hj(j17, str, str2);
        }
        if (i18 == 2 && yw.x0.f466500a.d()) {
            ((cx.t1) ((bx.v) i95.n0.c(bx.v.class))).hj(j17, str, str2);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yw.a0(c0Var, i17));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.mm.biz.f fVar = (com.tencent.wechat.mm.biz.f) obj;
        this.f217850a = fVar;
        ((yw.c0) fVar).f466284a = this;
    }

    @Override // com.tencent.wechat.mm.biz.e
    public void f(int i17) {
        ZIDL_CX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.e
    public void h(int i17) {
        ZIDL_BX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.e
    public void q(int i17) {
        ZIDL_AX(this.nativeHandler, i17);
    }
}
