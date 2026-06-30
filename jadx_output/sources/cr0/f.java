package cr0;

/* loaded from: classes12.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final cr0.j a() {
        cr0.j jVar = new cr0.j();
        com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion.getClass();
        java.util.ArrayList<com.tencent.mm.matrix.battery.AccBinderCallsStats> arrayList = new java.util.ArrayList();
        java.lang.String[] b17 = com.tencent.mm.sdk.platformtools.o4.M("full-charge-proc-life-stats.bin").b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.y(str, "key_proc_binder_calls_prefix_", false)) {
                    arrayList2.add(str);
                }
            }
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                mh.k kVar = mh.k.f326271a;
                kotlin.jvm.internal.o.d(str2);
                com.tencent.matrix.battery.accumulate.persist.FlattParcelable a17 = kVar.a(str2, com.tencent.mm.matrix.battery.AccBinderCallsStats.class, "full-charge-proc-life-stats.bin");
                if (a17 instanceof com.tencent.mm.matrix.battery.AccBinderCallsStats) {
                    if (((com.tencent.mm.matrix.battery.AccBinderCallsStats) a17).isInvalid()) {
                        kVar.d(str2, "full-charge-proc-life-stats.bin");
                    } else {
                        arrayList.add(a17);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats = new com.tencent.mm.matrix.battery.AccBinderCallsStats();
            for (com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats2 : arrayList) {
                try {
                    accBinderCallsStats.lock(new cr0.e(jVar, accBinderCallsStats2, accBinderCallsStats));
                } catch (java.lang.Exception e17) {
                    ap.a.a(1, "errAccStats", e17, null, com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, e17.getMessage(), "AggregateBinderProxyCallsStatsSnapshot");
                    com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", "errAccStats, dump accBinderCallsStats:");
                    java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accBinderCallsStats3 = accBinderCallsStats2.getAccBinderCallsStats();
                    if (accBinderCallsStats3 != null) {
                        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> entry : accBinderCallsStats3.entrySet()) {
                            java.lang.String key = entry.getKey();
                            java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer> value = entry.getValue();
                            com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", " - " + key + '=');
                            if (value != null) {
                                for (java.util.Map.Entry<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer> entry2 : value.entrySet()) {
                                    java.lang.String key2 = entry2.getKey();
                                    com.tencent.mm.matrix.battery.BinderTracker$Timer value2 = entry2.getValue();
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("   - ");
                                    sb6.append(key2);
                                    sb6.append("=(");
                                    sb6.append(value2 != null ? java.lang.Integer.valueOf(value2.f68689d) : null);
                                    sb6.append(':');
                                    sb6.append(value2 != null ? java.lang.Long.valueOf(value2.f68690e) : null);
                                    sb6.append(')');
                                    com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", sb6.toString());
                                }
                            }
                        }
                    }
                }
            }
            cr0.w.f221786h.a(jVar, accBinderCallsStats);
            jVar.e();
        }
        return jVar;
    }
}
