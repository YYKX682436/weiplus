package e50;

/* loaded from: classes11.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f249513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e50.z0 z0Var) {
        super(0);
        this.f249513d = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e50.z0 z0Var = this.f249513d;
            z0Var.getClass();
            if (z0Var.f249558e == null || (!r3.f354706j)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "initEngineGroup");
                b03.a0 a0Var = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_group_report_mem, false) ? new b03.a0() : null;
                if (a0Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).h(new b03.x(a0Var), "EngineGroupMemReporter_serial");
                }
                java.lang.String[] args = z0Var.wi();
                kotlin.jvm.internal.o.g(args, "args");
                kotlinx.coroutines.r2 b17 = b03.u.f16864a.b();
                e50.f0 f0Var = new e50.f0(z0Var);
                pi0.q qVar = new pi0.q(context, args, b17);
                qVar.f354714r = f0Var;
                z0Var.f249558e = qVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "initEngineGroup: create " + z0Var.f249558e);
                z0Var.f249560g = kotlinx.coroutines.l.d(z0Var.f249557d, null, null, new e50.i0(z0Var, a0Var, null), 3, null);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_engine_auto_release_interval, 30);
                pi0.q qVar2 = z0Var.f249558e;
                kotlin.jvm.internal.o.d(qVar2);
                z0Var.f249559f = new b03.l(qVar2, Ni * 1000, z0Var.f249564n, a0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
