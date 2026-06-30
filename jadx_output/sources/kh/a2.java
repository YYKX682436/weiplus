package kh;

/* loaded from: classes12.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f307747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.t1 f307748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(kh.d2 d2Var, kh.t1 t1Var) {
        super(0);
        this.f307747d = d2Var;
        this.f307748e = t1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<jz5.l> list;
        kh.d2 d2Var = this.f307747d;
        d2Var.getClass();
        if (kh.d2.f307778c.a()) {
            d2Var.b().lock(new kh.z1(d2Var));
        }
        yz5.a aVar = d2Var.f307781b;
        if (aVar != null && (list = (java.util.List) aVar.invoke()) != null) {
            for (jz5.l lVar : list) {
                java.lang.String str = (java.lang.String) lVar.f302833d;
                long longValue = ((java.lang.Number) lVar.f302834e).longValue();
                if (kh.d2.f307778c.a()) {
                    d2Var.b().lock(new kh.c2(d2Var, str, longValue));
                }
            }
        }
        com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats accStats = d2Var.b();
        kh.t1 snapshot = this.f307748e;
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(accStats, "accStats");
        java.util.Map t17 = kz5.c1.t(accStats.getAccFinTaskStats());
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : accStats.getAccRunTaskStats().entrySet()) {
            java.lang.String key = entry.getKey();
            long longValue2 = entry.getValue().longValue();
            java.lang.Object obj = ((java.util.LinkedHashMap) t17).get(key);
            if (obj == null) {
                obj = new com.tencent.matrix.battery.TaskProfiler$Timer(0, 0L, 3, null);
                t17.put(key, obj);
            }
            com.tencent.matrix.battery.TaskProfiler$Timer taskProfiler$Timer = (com.tencent.matrix.battery.TaskProfiler$Timer) obj;
            taskProfiler$Timer.f52548d++;
            taskProfiler$Timer.f52549e = longValue2;
        }
        for (jz5.l lVar2 : kz5.n0.F0(kz5.e1.v(t17), new kh.n1())) {
            java.util.List c17 = snapshot.c();
            java.lang.String str2 = (java.lang.String) lVar2.f302833d;
            com.tencent.matrix.battery.TaskProfiler$Timer taskProfiler$Timer2 = (com.tencent.matrix.battery.TaskProfiler$Timer) lVar2.f302834e;
            c17.add(new kh.r1(str2, taskProfiler$Timer2.f52548d, taskProfiler$Timer2.f52549e));
        }
        snapshot.d();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f307918e = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
        snapshot.f307919f = rh.x2.b(java.lang.Integer.valueOf(accStats.getAccRunTaskStats().size() + accStats.getAccFinTaskStats().size()));
        if (kh.d2.f307778c.a()) {
            d2Var.b().lock(new kh.z1(d2Var));
        }
        return jz5.f0.f302826a;
    }
}
