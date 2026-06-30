package ee5;

/* loaded from: classes9.dex */
public final class q2 implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f252004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.t2 f252005e;

    public q2(com.tencent.mm.storage.f9 f9Var, ee5.t2 t2Var) {
        this.f252004d = f9Var;
        this.f252005e = t2Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 job) {
        kotlin.jvm.internal.o.g(job, "job");
    }

    @Override // ot0.f3
    public void f2(ot0.e3 job) {
        zd5.n P6;
        kotlin.jvm.internal.o.g(job, "job");
        ee5.t2 t2Var = this.f252005e;
        com.tencent.mars.xlog.Log.i(t2Var.f252048d, "[requestExitSelectedMode] %s del ", java.lang.Thread.currentThread(), job);
        if (job != ot0.e3.del || (P6 = t2Var.P6()) == null) {
            return;
        }
        P6.notifyDataSetChanged();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 job) {
        kotlin.jvm.internal.o.g(job, "job");
        if (job == ot0.e3.del) {
            ee5.p2 p2Var = new ee5.p2();
            com.tencent.mm.storage.f9 f9Var = this.f252004d;
            p2Var.f4400d = f9Var.getMsgId();
            p2Var.f4405i = f9Var.Q0();
            ee5.t2 t2Var = this.f252005e;
            t2Var.f252054m.remove(p2Var);
            androidx.appcompat.app.AppCompatActivity activity = t2Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((ee5.h0) pf5.z.f353948a.a(activity).a(ee5.h0.class)).P6(new ae5.j(null, null, null, null, null, null, null, null, f9Var.getMsgId(), null, null, 0L, 3839, null));
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
    }
}
