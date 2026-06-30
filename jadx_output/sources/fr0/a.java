package fr0;

/* loaded from: classes12.dex */
public final class a extends lh.i {

    /* renamed from: a, reason: collision with root package name */
    public static final fr0.a f265688a = new fr0.a();

    @Override // lh.i, lh.j
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", "#onFlushing: " + z17);
        cr0.u1 u1Var = cr0.u1.f221760a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BinderTracker", "#saveStats");
        cr0.u0 g17 = u1Var.g();
        if (g17.f221757a) {
            g17.c().lock(new cr0.s1(g17));
        }
        cr0.w3 w3Var = cr0.w3.f221800a;
        if (w3Var.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkTracker", "#saveStats");
            w3Var.a().lock(cr0.v3.f221783d);
        }
    }

    @Override // lh.i, lh.j
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", "#onBatteryReset");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearTaskStats, size=");
        kh.p2 p2Var = kh.p2.f307885a;
        jz5.g gVar = kh.p2.f307887c;
        sb6.append(((java.util.List) gVar.getValue()).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", sb6.toString());
        for (kh.e2 e2Var : (java.util.List) gVar.getValue()) {
            e2Var.d();
            e2Var.f();
        }
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long Ri = ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
            com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", "marking new lastBatteryResetTimeStampMs: last=" + Ri + ", new=" + currentTimeMillis + ", delta=" + ((Ri > 0 ? currentTimeMillis - Ri : -1L) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) + "min");
            com.tencent.mm.sdk.platformtools.o4.L().putLong("batt_last_charged_r2", currentTimeMillis);
            com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", "clear acc stats of mmkv");
            com.tencent.mm.sdk.platformtools.o4.M("full-charge-proc-life-stats.bin").clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.BatteryResetAccMonitor", "clear acc stats of sp");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.Set<java.lang.String> stringSet = context.getSharedPreferences("acc-proc-life-stats.sp", 4).getStringSet("processList", kz5.r0.f314002d);
            if (stringSet != null) {
                java.util.Iterator<T> it = stringSet.iterator();
                while (it.hasNext()) {
                    context.getSharedPreferences("full-charge-proc-life-cpu-stats.sp." + ri.i.g((java.lang.String) it.next()), 4).edit().clear().commit();
                }
            }
        }
    }
}
