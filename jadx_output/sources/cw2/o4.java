package cw2;

/* loaded from: classes10.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f223897d;

    public o4(long j17) {
        this.f223897d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Class cls;
        java.lang.String str;
        java.lang.Runnable runnable = cw2.p4.f223920j;
        if (runnable != null) {
            long j17 = this.f223897d;
            if (com.tencent.mm.app.w.INSTANCE.f53889n) {
                cw2.p4 p4Var = cw2.p4.f223911a;
                com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "recordFinderNetWorkStatus");
                com.tencent.mars.cdn.CdnManager.DownloadInfo recentDownloadInfo = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentDownloadInfo(251, 20302, 5);
                if (recentDownloadInfo.recvedBytes <= 0) {
                    str = " size:";
                    cls = c61.yb.class;
                } else {
                    r45.sf0 sf0Var = new r45.sf0();
                    cls = c61.yb.class;
                    sf0Var.set(0, java.lang.Long.valueOf(recentDownloadInfo.recvedBytes));
                    sf0Var.set(1, java.lang.Long.valueOf(recentDownloadInfo.transforMS));
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    sf0Var.set(2, java.lang.Long.valueOf(currentTimeMillis - (recentDownloadInfo.endTickcount - recentDownloadInfo.beginTickcount)));
                    sf0Var.set(3, java.lang.Long.valueOf(currentTimeMillis));
                    sf0Var.set(4, java.lang.Integer.valueOf(((c61.p2) ((c61.yb) i95.n0.c(cls))).ij()));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addFinderNetworkInfo info:");
                    sb6.append(sf0Var);
                    str = " size:";
                    sb6.append(str);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f223916f;
                    sb6.append(copyOnWriteArrayList.size());
                    com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", sb6.toString());
                    if (copyOnWriteArrayList.size() > 24) {
                        copyOnWriteArrayList.remove(0);
                    }
                    copyOnWriteArrayList.add(sf0Var);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "recordWechatNetWorkStatus");
                com.tencent.mars.cdn.CdnManager.DownloadInfo recentDownloadInfo2 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentDownloadInfo(0, 0, 5);
                if (recentDownloadInfo2.recvedBytes > 0) {
                    r45.sf0 sf0Var2 = new r45.sf0();
                    sf0Var2.set(0, java.lang.Long.valueOf(recentDownloadInfo2.recvedBytes));
                    sf0Var2.set(1, java.lang.Long.valueOf(recentDownloadInfo2.transforMS));
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    sf0Var2.set(2, java.lang.Long.valueOf(currentTimeMillis2 - (recentDownloadInfo2.endTickcount - recentDownloadInfo2.beginTickcount)));
                    sf0Var2.set(3, java.lang.Long.valueOf(currentTimeMillis2));
                    sf0Var2.set(4, java.lang.Integer.valueOf(((c61.p2) ((c61.yb) i95.n0.c(cls))).ij()));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("addWechatNetworkInfo info:");
                    sb7.append(sf0Var2);
                    sb7.append(str);
                    java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = cw2.p4.f223917g;
                    sb7.append(copyOnWriteArrayList2.size());
                    com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", sb7.toString());
                    if (copyOnWriteArrayList2.size() > 24) {
                        copyOnWriteArrayList2.remove(0);
                    }
                    copyOnWriteArrayList2.add(sf0Var2);
                }
                if (cw2.p4.f223924n % 3 == 0) {
                    pm0.v.K(null, cw2.n4.f223882d);
                }
                cw2.p4.f223924n++;
                ((ku5.t0) ku5.t0.f312615d).l(runnable, j17, "Finder.FinderNetworkStatusStatistic");
            }
        }
    }
}
