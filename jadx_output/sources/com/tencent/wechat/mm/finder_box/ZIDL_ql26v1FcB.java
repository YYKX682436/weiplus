package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
class ZIDL_ql26v1FcB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.mm.finder_box.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.f f219261a;

    private native void ZIDL_AX(long j17, int i17);

    private native void ZIDL_BX(long j17, int i17);

    private native void ZIDL_CX(long j17, int i17);

    public void ZIDL_AV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.f fVar = this.f219261a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizDynamicCardMrgEventImpl", "onAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f466500a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(1, str);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new a50.b0(e0Var, i17));
    }

    public void ZIDL_BV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.f fVar = this.f219261a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizDynamicCardMrgEventImpl", "onRecFeedsAdServerInfoEvent adinfo=".concat(str));
        if (yw.x0.f466500a.c()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).qj(2, str);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new a50.d0(e0Var, i17));
    }

    public void ZIDL_CV(int i17, int i18, long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.mm.finder_box.f fVar = this.f219261a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        a50.e0 e0Var = (a50.e0) fVar;
        e0Var.getClass();
        if (i18 == 1 && yw.x0.f466500a.b()) {
            ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).hj(j17, str, str2);
        }
        if (i18 == 2 && yw.x0.f466500a.d()) {
            ((cx.t1) ((bx.v) i95.n0.c(bx.v.class))).hj(j17, str, str2);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new a50.c0(e0Var, i17));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.mm.finder_box.f fVar = (com.tencent.wechat.mm.finder_box.f) obj;
        this.f219261a = fVar;
        ((a50.e0) fVar).f1470a = this;
    }

    @Override // com.tencent.wechat.mm.finder_box.e
    public void f(int i17) {
        ZIDL_CX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.e
    public void h(int i17) {
        ZIDL_BX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.e
    public void q(int i17) {
        ZIDL_AX(this.nativeHandler, i17);
    }
}
