package jn4;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn4.m f300813d;

    public l(jn4.m mVar, jn4.a aVar) {
        this.f300813d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        long currentTimeMillis;
        jn4.m mVar = this.f300813d;
        synchronized (mVar) {
            mVar.f300816a = false;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute start time " + simpleDateFormat.format((java.util.Date) new java.sql.Date(currentTimeMillis2)));
        for (java.util.Map.Entry entry : ((java.util.HashMap) mVar.f300818c).entrySet()) {
            jn4.k kVar = new jn4.k(mVar, (java.lang.String) entry.getKey());
            jn4.p pVar = jn4.m.f300815j;
            if (pVar != null) {
                pVar.execute(kVar);
            }
            jn4.b bVar = new jn4.b(mVar, (java.lang.String) entry.getKey(), (java.util.Set) entry.getValue());
            jn4.p pVar2 = jn4.m.f300815j;
            if (pVar2 != null) {
                pVar2.execute(bVar);
            }
        }
        while (true) {
            synchronized (mVar) {
                z17 = mVar.f300816a;
            }
            if (z17 || jn4.m.f300815j.getActiveCount() <= 0) {
                break;
            }
            try {
                java.lang.String.valueOf(jn4.m.f300815j.getActiveCount());
                currentTimeMillis = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "wait for command end err: " + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
            }
            if (currentTimeMillis >= u04.d.f423477c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "traceroute timeout: " + (currentTimeMillis / 1000));
                synchronized (mVar) {
                    mVar.f300816a = true;
                    mVar.d();
                    jn4.f fVar = mVar.f300820e;
                    if (fVar != null) {
                        ((com.tencent.mm.plugin.traceroute.ui.w) fVar).f175340a.f175343a.f175317m.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
            }
            java.lang.Thread.sleep(500L);
        }
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute end time " + simpleDateFormat.format(new java.util.Date(currentTimeMillis3)));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", "mmtraceroute total time " + ((currentTimeMillis3 - currentTimeMillis2) / 1000));
        if (mVar.f300821f != null) {
            synchronized (mVar) {
                boolean z19 = mVar.f300816a;
                if (z19) {
                    return;
                }
                ((com.tencent.mm.plugin.traceroute.ui.v) mVar.f300821f).f175339a.f175343a.f175317m.sendEmptyMessageDelayed(2, 500L);
            }
        }
    }
}
