package d95;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d95.l f227693e;

    public k(d95.l lVar, java.lang.String str) {
        this.f227693e = lVar;
        this.f227692d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long h17 = this.f227693e.f227694d.h();
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long g17 = this.f227693e.f227694d.g() - h17;
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes();
            long g18 = this.f227693e.f227694d.g();
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(25824, this.f227692d, this.f227693e.f227694d.k(), java.lang.Long.valueOf(g18), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(h17), "s-before", 0, java.lang.Long.valueOf(g17), 0, 0, 0, 0, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "start vacuum, dbPath = " + this.f227693e.f227694d.k());
            wu5.c k17 = ((ku5.t0) ku5.t0.f312615d).k(new d95.j(this, g18, availableBytes, availableBytes2, h17, g17), 2700000L);
            if (h17 <= 209715200) {
                fVar.d(25824, this.f227692d, this.f227693e.f227694d.k(), java.lang.Long.valueOf(g18), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(h17), "s-check-return", 0, java.lang.Long.valueOf(g17), 0, 0, 0, 0, 0);
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            d95.f.f227670p = true;
            boolean z17 = this.f227693e.f227694d.z();
            d95.f.f227670p = false;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            k17.cancel(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "vacuum finished, duration = " + currentTimeMillis2);
            long g19 = this.f227693e.f227694d.g();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vacuum finished, dbFileSizeAfterVacuum = ");
            sb6.append(g19);
            sb6.append(", trimmedSize = ");
            long j17 = g18 - g19;
            sb6.append(j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", sb6.toString());
            long j18 = currentTimeMillis2 != 0 ? g17 / currentTimeMillis2 : 0L;
            fVar.d(25824, this.f227692d, this.f227693e.f227694d.k(), java.lang.Long.valueOf(g18), java.lang.Long.valueOf(java.lang.Math.min(availableBytes, availableBytes2)), java.lang.Long.valueOf(h17), "s-" + z17, java.lang.Long.valueOf(g19), java.lang.Long.valueOf(g17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2), 0, 1, java.lang.Long.valueOf(j18));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "sf or sdsf is null : " + th6.getMessage());
        }
    }
}
