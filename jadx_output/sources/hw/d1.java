package hw;

@j95.b
/* loaded from: classes7.dex */
public final class d1 extends hw.o0 implements d10.n {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f285368q = "MagicEcsTimelineSubscribe";

    @Override // hw.o0
    public synchronized hw.c0 Di(int i17) {
        hw.a1 a1Var;
        fw.w Bi = ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Bi();
        a1Var = new hw.a1(Bi);
        a1Var.B = new hw.c1(this);
        a1Var.f283002q = Bi;
        a1Var.X0();
        ((ku5.t0) ku5.t0.f312615d).q(hw.m0.f285403d);
        return a1Var;
    }

    @Override // hw.o0
    public synchronized void K6(int i17) {
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "destroyBrandServiceBiz");
        super.K6(i17);
    }

    @Override // hw.o0
    public java.lang.String Ni() {
        return "MagicEcsTLFeatureService";
    }

    @Override // hw.o0
    public java.lang.String Ri() {
        return this.f285368q;
    }

    @Override // hw.o0
    public dq0.a0 Ui() {
        return ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Bi();
    }

    @Override // hw.o0
    public boolean Zi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_magic_brandservice, 1) == 1;
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "openBrandServiceCard " + z17);
        return z17;
    }

    @Override // hw.o0
    public boolean aj() {
        yw.w1 w1Var = yw.w1.f466487a;
        return yw.w1.f466489c;
    }

    @Override // hw.o0
    public void bj(java.lang.String eventName) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "notifyStateChange eventName:".concat(eventName));
        super.bj(eventName);
    }

    @Override // hw.o0
    public void cj() {
        synchronized (this) {
        }
        ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai().n("notifyBizRecreate", null, dq0.u.f242338d);
    }

    @Override // hw.o0
    public boolean hj() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_brandservice_preinit_num, 1) == 1;
    }

    public boolean mj() {
        jz5.g gVar = ew.e.f256965a;
        return ((java.lang.Boolean) ((jz5.n) ew.e.f256966b).getValue()).booleanValue();
    }

    @Override // hw.o0, i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "onAccountReleased");
        super.onAccountReleased(context);
    }
}
