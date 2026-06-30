package dk2;

/* loaded from: classes3.dex */
public final class xc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f234355d;

    public xc(long j17) {
        this.f234355d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.nw1 nw1Var;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z17 = false;
        long j17 = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0);
        gk2.e eVar = dk2.ef.I;
        long j18 = this.f234355d;
        if (eVar != null) {
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.U7()) {
                z17 = true;
            }
            if (!z17 && j17 == j18) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "heartBeat manual recovery liveId:" + j17);
                pm0.z.b(xy2.b.f458155b, "liveHeartBeatBreak_manualRecovery", false, null, null, false, false, new dk2.wc(j17), 60, null);
                efVar.v(0L, j17);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heartBeat manual recovery skipped. curLiveRoomData:");
        sb6.append(dk2.ef.I);
        sb6.append(" business(LiveCommonSlice::class.java)?.isLiveFinish():");
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var2 != null ? java.lang.Boolean.valueOf(c1Var2.U7()) : null);
        sb6.append(" liveId:");
        sb6.append(j17);
        sb6.append(" bindLiveId:");
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", sb6.toString());
    }
}
