package hw;

@j95.b
/* loaded from: classes7.dex */
public final class v0 extends hw.o0 implements gw.i {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f285441q = "MagicEcsTimeline";

    @Override // hw.o0
    public synchronized hw.c0 Di(int i17) {
        hw.s0 s0Var;
        fw.h Ai = ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai();
        s0Var = new hw.s0(Ai);
        s0Var.B = new hw.u0(this);
        s0Var.f283002q = Ai;
        s0Var.X0();
        ((ku5.t0) ku5.t0.f312615d).q(hw.m0.f285403d);
        return s0Var;
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
        return this.f285441q;
    }

    @Override // hw.o0
    public dq0.a0 Ui() {
        return ((hw.j1) ((gw.j) i95.n0.c(gw.j.class))).Ai();
    }

    @Override // hw.o0
    public boolean Zi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_magic_brandservice, 1) == 1;
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "openBrandServiceCard " + z17);
        return z17;
    }

    @Override // hw.o0
    public boolean aj() {
        zv.e0 e0Var = zv.e0.f475937a;
        return zv.e0.f475939c;
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

    @Override // hw.o0, i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MagicEcsTLFeatureService", "onAccountReleased");
        super.onAccountReleased(context);
    }
}
