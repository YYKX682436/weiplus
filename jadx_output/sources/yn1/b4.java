package yn1;

/* loaded from: classes11.dex */
public final class b4 {
    public b4(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        pi0.l1 l1Var;
        com.tencent.mars.xlog.Log.i("MM.Mig.RoamMigrationService", "[detachFltInstanceIfNoTask] task status=" + yn1.z0.f463933a.i());
        i95.m c17 = i95.n0.c(mv.w.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.migration.MigrationService");
        yn1.h4 h4Var = (yn1.h4) c17;
        synchronized (h4Var) {
            l1Var = h4Var.f463692d;
            h4Var.f463692d = null;
        }
        if (l1Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new yn1.d4(l1Var, h4Var, null), 3, null);
        }
    }
}
