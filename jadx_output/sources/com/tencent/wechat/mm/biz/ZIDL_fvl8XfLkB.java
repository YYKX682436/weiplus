package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
class ZIDL_fvl8XfLkB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.mm.biz.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.d f217849a;

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

    @Override // com.tencent.wechat.mm.biz.c
    public void B(int i17) {
        ZIDL_UX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void D(int i17) {
        ZIDL_YX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void F0(int i17, com.tencent.wechat.mm.biz.s5 s5Var) {
        ZIDL_PX(this.nativeHandler, i17, s5Var.toByteArrayOrNull());
    }

    public int ZIDL_A() {
        ((yw.y) this.f217849a).getClass();
        int i17 = 0;
        try {
            i17 = new cl0.g(((cx.j1) ((bx.v) i95.n0.c(bx.v.class))).Ui()).optInt("updateUnixTimeStamp", 0);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffBizCppToNativeManagerImpl", "parse pkg config fail, cause by: " + android.util.Log.getStackTraceString(e17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "get local canvas pkg version: " + i17);
        return i17;
    }

    public int ZIDL_B() {
        this.f217849a.getClass();
        return 0;
    }

    public boolean ZIDL_C() {
        ((yw.y) this.f217849a).getClass();
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
    }

    public long ZIDL_D() {
        ((yw.y) this.f217849a).getClass();
        return c01.id.c();
    }

    public boolean ZIDL_E() {
        ((yw.y) this.f217849a).getClass();
        return c01.id.f37261a;
    }

    public boolean ZIDL_F(int i17) {
        this.f217849a.getClass();
        return false;
    }

    public boolean ZIDL_G() {
        this.f217849a.getClass();
        return false;
    }

    public boolean ZIDL_H() {
        this.f217849a.getClass();
        return false;
    }

    public void ZIDL_IV(int i17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new yw.s(yVar, i17));
    }

    public void ZIDL_JV(int i17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new yw.t(yVar, i17));
    }

    public byte[] ZIDL_K() {
        ((yw.y) this.f217849a).getClass();
        java.lang.String a17 = ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, hy4.w.f286200f.a(), lu4.m.f321441d.a());
        kotlin.jvm.internal.o.d(a17);
        return a17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_LV(int i17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yw.q(yVar, i17, null), 2, null);
    }

    public void ZIDL_MV(int i17, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        com.tencent.wechat.mm.biz.a1 a1Var = (com.tencent.wechat.mm.biz.a1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.a1.f217852h, bArr);
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yw.x(a1Var, yVar, i17, null), 2, null);
    }

    public byte[] ZIDL_N(long j17) {
        ((yw.y) this.f217849a).getClass();
        com.tencent.wechat.mm.biz.j1 j1Var = new com.tencent.wechat.mm.biz.j1();
        com.tencent.wechat.mm.biz.o3 o3Var = new com.tencent.wechat.mm.biz.o3();
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        r01.k kVar = r01.k.f368128g;
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        o3Var.f218429d = kVar.o(a1Var.c(valueOf), 0);
        boolean[] zArr = o3Var.f218432g;
        zArr[1] = true;
        o3Var.f218430e = (int) kVar.q(a1Var.d(valueOf), 0L);
        zArr[2] = true;
        o3Var.f218431f = kVar.o(a1Var.b(valueOf), 0);
        zArr[3] = true;
        j1Var.f218216d = o3Var;
        j1Var.f218217e[1] = true;
        return j1Var.toByteArrayOrNull();
    }

    public byte[] ZIDL_O() {
        ((yw.y) this.f217849a).getClass();
        return yw.l0.f466389a.a().toByteArrayOrNull();
    }

    public void ZIDL_PV(int i17, boolean z17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yw.m(yVar, z17, i17, null), 2, null);
    }

    public void ZIDL_QV(int i17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yw.o(yVar, i17, null), 2, null);
    }

    public void ZIDL_RV(int i17, int i18) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new yw.a(i18), "BizFlutterDigestHelper");
        ((ku5.t0) ku5.t0.f312615d).q(new yw.b(yVar, i17));
    }

    public void ZIDL_SV(int i17, boolean z17) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "onInitDoneEvent dbInitDone=" + z17);
        yw.q3.f466442f = z17;
        if (z17) {
            yw.q3.f466441e = true;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yw.g(yVar, i17));
    }

    public void ZIDL_TV(int i17, int i18, int i19, int i27) {
        yw.y yVar = (yw.y) this.f217849a;
        yVar.getClass();
        jx3.f.INSTANCE.w(i18, i19, i27);
        ((ku5.t0) ku5.t0.f312615d).q(new yw.f(yVar, i17));
    }

    public void ZIDL_UV(int i17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i18, str);
        ((ku5.t0) ku5.t0.f312615d).q(new yw.h(yVar, i17));
    }

    public void ZIDL_VV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        com.tencent.wechat.mm.biz.n5 n5Var = (com.tencent.wechat.mm.biz.n5) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.n5.f218386n, bArr);
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstScreenPreResortEvent eventId=");
        sb6.append(j17);
        sb6.append(", scene=");
        sb6.append(i18);
        sb6.append(", sessionId=");
        sb6.append(n5Var != null ? java.lang.Long.valueOf(n5Var.f218387d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36230e, yVar.a(n5Var));
        ((ku5.t0) ku5.t0.f312615d).q(new yw.c(yVar, i17));
    }

    public void ZIDL_WV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        com.tencent.wechat.mm.biz.n5 n5Var = (com.tencent.wechat.mm.biz.n5) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.n5.f218386n, bArr);
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstScreenResortStartEvent eventId=");
        sb6.append(j17);
        sb6.append(", scene=");
        sb6.append(i18);
        sb6.append(", sessionId=");
        sb6.append(n5Var != null ? java.lang.Long.valueOf(n5Var.f218387d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        if (!yVar.f466510b.containsKey(java.lang.Long.valueOf(j17))) {
            yw.r2 r2Var = new yw.r2(j17);
            yVar.f466510b.put(java.lang.Long.valueOf(j17), r2Var);
            r2Var.f466449b = true;
            mm.d0.f328475a.b(r2Var);
            ku5.u0 u0Var = ku5.t0.f312615d;
            yw.r rVar = new yw.r(j17, yVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(rVar, 30000L, false);
        }
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36231f, yVar.a(n5Var));
        ((ku5.t0) ku5.t0.f312615d).q(new yw.e(yVar, i17));
    }

    public void ZIDL_XV(int i17, long j17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        com.tencent.wechat.mm.biz.m5 m5Var = (com.tencent.wechat.mm.biz.m5) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.m5.f218355f, bArr);
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "onFirstScreenResortEndEvent release ProcLife eventId=" + j17);
        ((cx.f0) ((bx.r) i95.n0.c(bx.r.class))).rj(j17, i18, bx.x.f36232g, new yw.s2(m5Var != null ? m5Var.f218356d : 0L, null, null, null, null, null, null, null, null, null, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null));
        ((ku5.t0) ku5.t0.f312615d).q(new yw.d(yVar, i17));
    }

    public void ZIDL_YV(int i17, int i18, byte[] bArr) {
        com.tencent.wechat.mm.biz.d dVar = this.f217849a;
        if (i18 != 1) {
        }
        yw.y yVar = (yw.y) dVar;
        yVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new yw.i(yVar, i17));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.mm.biz.d dVar = (com.tencent.wechat.mm.biz.d) obj;
        this.f217849a = dVar;
        ((yw.y) dVar).f466509a = this;
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void b1(int i17, dw5.i iVar) {
        ZIDL_QX(this.nativeHandler, i17, iVar.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void g(int i17) {
        ZIDL_IX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void j(int i17) {
        ZIDL_JX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void l(int i17) {
        ZIDL_WX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void n(int i17) {
        ZIDL_MX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void o(int i17) {
        ZIDL_TX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void s(int i17) {
        ZIDL_XX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void u(int i17) {
        ZIDL_RX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void u0(int i17, com.tencent.wechat.mm.biz.l1 l1Var) {
        ZIDL_LX(this.nativeHandler, i17, l1Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void y(int i17) {
        ZIDL_SX(this.nativeHandler, i17);
    }

    @Override // com.tencent.wechat.mm.biz.c
    public void z(int i17) {
        ZIDL_VX(this.nativeHandler, i17);
    }
}
