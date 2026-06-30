package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f164699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164703h;

    public u1(com.tencent.mm.plugin.sns.model.i1 i1Var, java.util.List list, int i17, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        this.f164703h = i1Var;
        this.f164699d = list;
        this.f164700e = i17;
        this.f164701f = s7Var;
        this.f164702g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderUi %d", java.lang.Integer.valueOf(this.f164699d.size()));
        ca4.s0 s0Var = new ca4.s0(this.f164699d);
        s0Var.e(ca4.z0.O(this.f164699d));
        s0Var.d(this.f164700e);
        boolean z19 = true;
        for (int i17 = 0; i17 < this.f164699d.size() && i17 < 9; i17++) {
            r45.jj4 jj4Var = (r45.jj4) this.f164699d.get(i17);
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            java.lang.String str = jj4Var.f377855d;
            Cj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
            synchronized (Cj.f164444g) {
                try {
                    if (((java.util.concurrent.ConcurrentHashMap) Cj.f164451n).containsKey(ca4.z0.G(1, str))) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    } else if (((java.util.concurrent.ConcurrentHashMap) Cj.f164451n).containsKey(ca4.z0.G(5, str))) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        z17 = false;
                    }
                    z17 = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th6;
                }
            }
            if (!z17) {
                if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var))) {
                    if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.J(jj4Var))) {
                        if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.d0(jj4Var))) {
                            if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.W(jj4Var))) {
                                com.tencent.mm.plugin.sns.model.l4.Cj().e(jj4Var, jj4Var.f377856e == 6 ? 5 : 1, s0Var, this.f164701f, this.f164702g);
                            }
                        }
                    }
                }
            }
            z19 = false;
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 > 100) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileexist check2  endtime ");
            sb6.append(elapsedRealtime2);
            sb6.append(" ");
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(" ");
            sb6.append(lp0.b.e0());
            sb6.append("  ");
            com.tencent.mm.plugin.sns.model.l4.fj();
            sb6.append(s0Var.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
        }
        com.tencent.mm.plugin.sns.model.i1 i1Var = this.f164703h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        long j17 = i1Var.f164252a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (android.os.SystemClock.elapsedRealtime() - j17 > 60000) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Long valueOf = java.lang.Long.valueOf(elapsedRealtime2);
            java.lang.String name = java.lang.Thread.currentThread().getName();
            com.tencent.mm.plugin.sns.model.l4.fj();
            g0Var.d(11696, 1, valueOf, 0, name, "", lp0.b.e0());
            com.tencent.mm.plugin.sns.model.i1 i1Var2 = this.f164703h;
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            i1Var2.f164252a = elapsedRealtime3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        java.lang.String O = ca4.z0.O(this.f164699d);
        if (z19) {
            com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.t1(this, O));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$5");
    }
}
