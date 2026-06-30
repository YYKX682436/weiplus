package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
class ZIDL_ql26JX2PB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.mm.finder_box.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.d f219260a;

    private native void ZIDL_IX(long j17, int i17);

    private native void ZIDL_JX(long j17, int i17);

    private native void ZIDL_LX(long j17, int i17, byte[] bArr);

    private native void ZIDL_MX(long j17, int i17);

    private native void ZIDL_PX(long j17, int i17, byte[] bArr);

    private native void ZIDL_QX(long j17, int i17, byte[] bArr);

    private native void ZIDL_RX(long j17, int i17);

    private native void ZIDL_SX(long j17, int i17);

    private native void ZIDL_TX(long j17, int i17);

    private native void ZIDL_UX(long j17, int i17);

    private native void ZIDL_VX(long j17, int i17);

    private native void ZIDL_WX(long j17, int i17);

    private native void ZIDL_XX(long j17, int i17);

    private native void ZIDL_YX(long j17, int i17);

    @Override // com.tencent.wechat.mm.finder_box.c
    public void B(int i17) {
        ZIDL_UX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void D(int i17) {
        ZIDL_YX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void G1(int i17, com.tencent.wechat.mm.finder_box.d1 d1Var) {
        ZIDL_LX(this.nativeHandler, i17, d1Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void L1(int i17, cw5.f fVar) {
        ZIDL_QX(this.nativeHandler, i17, fVar.toByteArrayOrNull());
    }

    public int ZIDL_A() {
        ((a50.a0) this.f219260a).getClass();
        int i17 = 0;
        try {
            i17 = new cl0.g(((cx.j1) ((bx.v) i95.n0.c(bx.v.class))).Ui()).optInt("updateUnixTimeStamp", 0);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("Finder.BoxAffBizCppToNativeManagerImpl", "parse pkg config fail, cause by: " + android.util.Log.getStackTraceString(e17));
        }
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", "get local canvas pkg version: " + i17);
        return i17;
    }

    public int ZIDL_B() {
        this.f219260a.getClass();
        return 0;
    }

    public boolean ZIDL_C() {
        ((a50.a0) this.f219260a).getClass();
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
    }

    public long ZIDL_D() {
        ((a50.a0) this.f219260a).getClass();
        return c01.id.c();
    }

    public boolean ZIDL_E() {
        ((a50.a0) this.f219260a).getClass();
        return c01.id.f37261a;
    }

    public boolean ZIDL_F(int i17) {
        this.f219260a.getClass();
        return false;
    }

    public boolean ZIDL_G() {
        this.f219260a.getClass();
        return false;
    }

    public boolean ZIDL_H() {
        this.f219260a.getClass();
        return false;
    }

    public void ZIDL_IV(int i17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new a50.u(a0Var, i17));
    }

    public void ZIDL_JV(int i17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new a50.v(a0Var, i17));
    }

    public byte[] ZIDL_K() {
        ((a50.a0) this.f219260a).getClass();
        java.lang.String a17 = ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, hy4.w.f286200f.a(), lu4.m.f321441d.a());
        kotlin.jvm.internal.o.d(a17);
        return a17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_LV(int i17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new a50.s(a0Var, i17, null), 2, null);
    }

    public void ZIDL_MV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        com.tencent.wechat.mm.finder_box.t0 t0Var = (com.tencent.wechat.mm.finder_box.t0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.t0.f219822h, bArr);
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new a50.z(t0Var, a0Var, i17, null), 2, null);
    }

    public byte[] ZIDL_N(long j17) {
        ((a50.a0) this.f219260a).getClass();
        com.tencent.wechat.mm.finder_box.b1 b1Var = new com.tencent.wechat.mm.finder_box.b1();
        com.tencent.wechat.mm.finder_box.q2 q2Var = new com.tencent.wechat.mm.finder_box.q2();
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        r01.k kVar = r01.k.f368128g;
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        q2Var.f219755d = kVar.o(a1Var.c(valueOf), 0);
        boolean[] zArr = q2Var.f219758g;
        zArr[1] = true;
        q2Var.f219756e = (int) kVar.q(a1Var.d(valueOf), 0L);
        zArr[2] = true;
        q2Var.f219757f = kVar.o(a1Var.b(valueOf), 0);
        zArr[3] = true;
        b1Var.f219325d = q2Var;
        b1Var.f219326e[1] = true;
        return b1Var.toByteArrayOrNull();
    }

    public byte[] ZIDL_O() {
        ((a50.a0) this.f219260a).getClass();
        return ((com.tencent.wechat.mm.finder_box.y0) y40.o0.a(yw.l0.f466389a.a(), new com.tencent.wechat.mm.finder_box.y0())).toByteArrayOrNull();
    }

    public void ZIDL_PV(int i17, boolean z17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new a50.o(a0Var, z17, i17, null), 2, null);
    }

    public void ZIDL_QV(int i17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new a50.q(a0Var, i17, null), 2, null);
    }

    public void ZIDL_RV(int i17, int i18) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new a50.c(i18), "BoxBizFlutterDigestHelper");
        ((ku5.t0) ku5.t0.f312615d).q(new a50.d(a0Var, i17));
    }

    public void ZIDL_SV(int i17, boolean z17) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", "onInitDoneEvent dbInitDone=" + z17);
        a50.e1.f1476f = z17;
        if (z17) {
            a50.e1.f1475e = true;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new a50.i(a0Var, i17));
    }

    public void ZIDL_TV(int i17, int i18, int i19, int i27) {
        a50.a0 a0Var = (a50.a0) this.f219260a;
        a0Var.getClass();
        jx3.f.INSTANCE.w(i18, i19, i27);
        ((ku5.t0) ku5.t0.f312615d).q(new a50.h(a0Var, i17));
    }

    public void ZIDL_UV(int i17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i18, str);
        ((ku5.t0) ku5.t0.f312615d).q(new a50.j(a0Var, i17));
    }

    public void ZIDL_VV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        com.tencent.wechat.mm.finder_box.c4 c4Var = (com.tencent.wechat.mm.finder_box.c4) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.c4.f219347n, bArr);
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstScreenPreResortEvent eventId=");
        sb6.append(j17);
        sb6.append(", scene=");
        sb6.append(i18);
        sb6.append(", sessionId=");
        sb6.append(c4Var != null ? java.lang.Long.valueOf(c4Var.f219348d) : null);
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", sb6.toString());
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36230e, a0Var.a(c4Var));
        ((ku5.t0) ku5.t0.f312615d).q(new a50.e(a0Var, i17));
    }

    public void ZIDL_WV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        com.tencent.wechat.mm.finder_box.c4 c4Var = (com.tencent.wechat.mm.finder_box.c4) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.c4.f219347n, bArr);
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstScreenResortStartEvent eventId=");
        sb6.append(j17);
        sb6.append(", scene=");
        sb6.append(i18);
        sb6.append(", sessionId=");
        sb6.append(c4Var != null ? java.lang.Long.valueOf(c4Var.f219348d) : null);
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", sb6.toString());
        if (!a0Var.f1452b.containsKey(java.lang.Long.valueOf(j17))) {
            a50.b bVar = new a50.b(j17);
            a0Var.f1452b.put(java.lang.Long.valueOf(j17), bVar);
            bVar.f1455b = true;
            mm.d0.f328475a.b(bVar);
            ku5.u0 u0Var = ku5.t0.f312615d;
            a50.t tVar = new a50.t(j17, a0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(tVar, 30000L, false);
        }
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36231f, a0Var.a(c4Var));
        ((ku5.t0) ku5.t0.f312615d).q(new a50.g(a0Var, i17));
    }

    public void ZIDL_XV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        com.tencent.wechat.mm.finder_box.b4 b4Var = (com.tencent.wechat.mm.finder_box.b4) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.finder_box.b4.f219332f, bArr);
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", "onFirstScreenResortEndEvent release ProcLife eventId=" + j17);
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36232g, new yw.s2(b4Var != null ? b4Var.f219333d : 0L, null, null, null, null, null, null, null, null, null, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null));
        ((ku5.t0) ku5.t0.f312615d).q(new a50.f(a0Var, i17));
    }

    public void ZIDL_YV(int i17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.finder_box.d dVar = this.f219260a;
        if (i18 != 1) {
        }
        a50.a0 a0Var = (a50.a0) dVar;
        a0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new a50.k(a0Var, i17));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.mm.finder_box.d dVar = (com.tencent.wechat.mm.finder_box.d) obj;
        this.f219260a = dVar;
        ((a50.a0) dVar).f1451a = this;
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void g(int i17) {
        ZIDL_IX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void j(int i17) {
        ZIDL_JX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void l(int i17) {
        ZIDL_WX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void n(int i17) {
        ZIDL_MX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void o(int i17) {
        ZIDL_TX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void s(int i17) {
        ZIDL_XX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void u(int i17) {
        ZIDL_RX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void w0(int i17, com.tencent.wechat.mm.finder_box.h4 h4Var) {
        ZIDL_PX(this.nativeHandler, i17, h4Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void y(int i17) {
        ZIDL_SX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.finder_box.c
    public void z(int i17) {
        ZIDL_VX(this.nativeHandler, i17);
    }
}
