package cr0;

/* loaded from: classes12.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.d3 f221595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(cr0.d3 d3Var) {
        super(0);
        this.f221595d = d3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean a17 = cr0.k3.f221666a.a();
        cr0.e3 e3Var = cr0.e3.f221620d;
        if (a17) {
            cr0.k3.f221668c.lock(e3Var);
        }
        for (q01.s0 req : ((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Bi()) {
            cr0.k3 k3Var = cr0.k3.f221666a;
            kotlin.jvm.internal.o.g(req, "req");
            if (k3Var.a()) {
                cr0.k3.f221668c.lock(new cr0.j3(req, android.os.SystemClock.uptimeMillis() - req.f359331c));
            }
        }
        com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats accStats = cr0.k3.f221668c;
        cr0.d3 snapshot = this.f221595d;
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(accStats, "accStats");
        java.util.Map t17 = kz5.c1.t(accStats.getAccFinCgiStats());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> entry : accStats.getAccRunCgiStats().entrySet()) {
            java.lang.String key = entry.getKey();
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry2 : entry.getValue().entrySet()) {
                java.lang.String key2 = entry2.getKey();
                long longValue = entry2.getValue().longValue();
                java.lang.Object obj = ((java.util.LinkedHashMap) t17).get(key);
                if (obj == null) {
                    obj = new java.util.LinkedHashMap();
                    t17.put(key, obj);
                }
                com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion.getClass();
                java.util.Map c17 = kotlin.jvm.internal.m0.c((java.util.Map) obj);
                java.lang.Object obj2 = c17.get(key2);
                if (obj2 == null) {
                    obj2 = new com.tencent.mm.matrix.battery.BinderTracker$Timer(0, 0L, 3, null);
                    c17.put(key2, obj2);
                }
                com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer = (com.tencent.mm.matrix.battery.BinderTracker$Timer) obj2;
                binderTracker$Timer.f68689d++;
                binderTracker$Timer.f68690e = longValue;
            }
        }
        java.util.Set<java.util.Map.Entry> entrySet = ((java.util.LinkedHashMap) t17).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry3 : entrySet) {
            java.lang.String str = (java.lang.String) entry3.getKey();
            java.util.Map map = (java.util.Map) entry3.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry4 : map.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry4.getKey();
                com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer2 = (com.tencent.mm.matrix.battery.BinderTracker$Timer) entry4.getValue();
                if ((str2 == null || str2.length() == 0) || !r26.n0.D(str2, "/", false, 2, null)) {
                    z17 = false;
                } else {
                    z17 = false;
                    str2 = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
                    kotlin.jvm.internal.o.f(str2, "substring(...)");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append('-');
                if ((str2 == null || str2.length() == 0) ? true : z17) {
                    str2 = "";
                }
                sb6.append(str2);
                arrayList2.add(new jz5.l(sb6.toString(), binderTracker$Timer2));
            }
            kz5.h0.u(arrayList, arrayList2);
        }
        for (java.util.Map.Entry entry5 : kz5.c1.q(kz5.n0.F0(kz5.n0.S0(arrayList), new cr0.x2())).entrySet()) {
            snapshot.b().add(new cr0.w2((java.lang.String) entry5.getKey(), ((com.tencent.mm.matrix.battery.BinderTracker$Timer) entry5.getValue()).f68689d, ((com.tencent.mm.matrix.battery.BinderTracker$Timer) entry5.getValue()).f68690e));
        }
        snapshot.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f221582d = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
        if (cr0.k3.f221666a.a()) {
            cr0.k3.f221668c.lock(e3Var);
        }
        return jz5.f0.f302826a;
    }
}
