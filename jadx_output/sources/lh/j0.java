package lh;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh.l0 f318605d;

    public j0(lh.l0 l0Var) {
        this.f318605d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh.l0 l0Var = this.f318605d;
        synchronized (l0Var.f318614a) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#saving, size=");
            sb6.append(((java.util.HashMap) l0Var.f318614a).size());
            sb6.append(l0Var.f318616c <= 0 ? "" : ", delayActual=" + (java.lang.System.currentTimeMillis() - l0Var.f318616c));
            com.tencent.mars.xlog.Log.i("MicroMsg.PowerAccMonitor", sb6.toString());
            for (java.util.Map.Entry entry : ((java.util.HashMap) l0Var.f318614a).entrySet()) {
                mh.k.f326271a.b((java.lang.String) entry.getKey(), (com.tencent.matrix.battery.accumulate.AccPowerStats) entry.getValue(), "acc-power-stats.bin");
            }
        }
        boolean z17 = mm.w.f328542a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "#save");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("notify-inspect.bin");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        mm.y yVar = mm.w.f328545d;
        sb7.append(yVar.f328568a);
        sb7.append("-count");
        M.putLong(sb7.toString(), yVar.f328570c);
        M.putLong(yVar.f328568a + "-during", yVar.f328573f);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        mm.y yVar2 = mm.w.f328547f;
        sb8.append(yVar2.f328568a);
        sb8.append("-count");
        M.putLong(sb8.toString(), yVar2.f328570c);
        M.putLong(yVar2.f328568a + "-during", yVar2.f328573f);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        mm.y yVar3 = mm.w.f328551j;
        sb9.append(yVar3.f328568a);
        sb9.append("-count");
        M.putLong(sb9.toString(), yVar3.f328570c);
        M.putLong(yVar3.f328568a + "-during", yVar3.f328573f);
        M.putLong("light-push-during", mm.w.f328544c);
    }
}
