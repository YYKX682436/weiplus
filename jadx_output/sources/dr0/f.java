package dr0;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.m f242421d;

    public f(dr0.m mVar) {
        this.f242421d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.m mVar = this.f242421d;
        mVar.getClass();
        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong("battery-accstats-lastreportms", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccStats", "#checkReport, deltaMs=" + j18);
        mVar.Ni(new dr0.i(mVar));
        if (j18 >= dr0.m.f242465f * 3600000) {
            if (j17 != 0) {
                mVar.Ni(new dr0.k(mVar, j18));
            }
            com.tencent.mm.sdk.platformtools.o4.L().putLong("battery-accstats-lastreportms", currentTimeMillis);
        }
        mVar.Ni(new dr0.j(mVar));
    }
}
