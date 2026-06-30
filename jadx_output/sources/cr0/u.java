package cr0;

/* loaded from: classes12.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final void a(cr0.w snapshot, com.tencent.mm.matrix.battery.AccBinderCallsStats accStats) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(accStats, "accStats");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accBinderCallsStats = accStats.getAccBinderCallsStats();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> entry : accBinderCallsStats.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer> value = entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(value.size());
            for (java.util.Map.Entry<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer> entry2 : value.entrySet()) {
                java.lang.String key2 = entry2.getKey();
                arrayList2.add(new jz5.l(key + '-' + key2, entry2.getValue()));
            }
            kz5.h0.u(arrayList, arrayList2);
        }
        for (java.util.Map.Entry entry3 : kz5.c1.q(kz5.n0.F0(kz5.n0.S0(arrayList), new cr0.s())).entrySet()) {
            java.lang.String str = (java.lang.String) entry3.getKey();
            com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer = (com.tencent.mm.matrix.battery.BinderTracker$Timer) entry3.getValue();
            snapshot.b().add(new cr0.r(str, binderTracker$Timer.f68689d, binderTracker$Timer.f68690e));
        }
        snapshot.c();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - accStats.getAccBeginTime();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        snapshot.f221787d = rh.x2.b(java.lang.Long.valueOf(currentTimeMillis));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(cr0.w r13, cr0.w r14, cr0.w r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.u.b(cr0.w, cr0.w, cr0.w):void");
    }
}
