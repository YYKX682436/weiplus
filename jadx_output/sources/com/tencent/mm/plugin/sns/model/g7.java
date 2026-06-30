package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164213d;

    public g7(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        this.f164213d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
        if (com.tencent.mm.plugin.sns.model.i7.c(this.f164213d).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "download queue is null, do nothing");
            com.tencent.mm.plugin.sns.model.i7.d(this.f164213d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
            return;
        }
        com.tencent.mm.plugin.sns.model.z7 z7Var = (com.tencent.mm.plugin.sns.model.z7) com.tencent.mm.plugin.sns.model.i7.c(this.f164213d).poll();
        if (z7Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoService", "try start download video task is null. queue size %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.i7.c(this.f164213d).size()));
            com.tencent.mm.plugin.sns.model.i7.d(this.f164213d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
            return;
        }
        boolean z17 = this.f164213d.f164308a != null && z7Var.f164813b.equals(this.f164213d.f164308a.f164813b);
        com.tencent.mm.plugin.sns.model.i7 i7Var = this.f164213d;
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (i7Var.f164312e) {
            try {
                java.util.Iterator it = i7Var.f164312e.iterator();
                while (it.hasNext()) {
                    t21.v0 v0Var = (t21.v0) it.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_PAUSE pause preload sns:[%s]", v0Var.f414980d);
                    v0Var.e();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        ((c50.b1) i95.n0.c(c50.b1.class)).getClass();
        com.tencent.mm.plugin.sns.model.i7 i7Var2 = this.f164213d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(z7Var.f164817f, z7Var.f164815d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            boolean u17 = com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.sns.model.y6.n(z7Var.f164815d.f377855d));
            java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(z7Var.f164815d);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "downloadVideo snsLocalId:%s media id:%s file:%s", z7Var.f164817f, z7Var.f164815d.f377855d, p17);
            java.lang.String str3 = z7Var.f164817f;
            r45.jj4 jj4Var = z7Var.f164815d;
            t21.v2 h17 = com.tencent.mm.plugin.sns.model.y6.h(str3, jj4Var.f377855d, jj4Var.U, jj4Var.Y);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_video_db_error_repair, true);
            if (h17 != null && fj6 && !android.text.TextUtils.isEmpty(h17.O) && !h17.O.equals(z7Var.f164815d.f377855d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoService", "NOTICE2 bad media id,delete video info. current:%s db:%s", h17.O, z7Var.f164815d.f377855d);
                t21.d3.e(h17.d());
                h17 = null;
            }
            if (h17 == null) {
                t21.d3.e(com.tencent.mm.plugin.sns.model.y6.g(z7Var.f164817f, z7Var.f164815d));
                java.lang.String str4 = z7Var.f164817f;
                r45.jj4 jj4Var2 = z7Var.f164815d;
                com.tencent.mm.plugin.sns.model.y6.v(str4, jj4Var2.f377855d, z7Var.f164818g, jj4Var2, p17);
            } else {
                com.tencent.mm.plugin.sns.model.y6.y(h17, z7Var.f164815d.f377855d, z7Var.f164818g);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", p17, java.lang.Boolean.valueOf(u17));
            java.lang.String str5 = z7Var.f164815d.f377855d;
            com.tencent.mm.storage.s7 c17 = com.tencent.mm.storage.s7.c();
            c17.f195313b = z7Var.f164816e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            java.lang.String str6 = z7Var.f164815d.f377858g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
            t21.i2.wi();
            com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
            java.lang.String g17 = com.tencent.mm.plugin.sns.model.y6.g(z7Var.f164817f, z7Var.f164815d);
            int i18 = z7Var.f164814c;
            r45.jj4 jj4Var3 = z7Var.f164815d;
            str = "access$1300";
            boolean z18 = z17;
            dn.o k17 = Di.k(c17, str6, p17, g17, i18, jj4Var3.N, jj4Var3.f377855d, jj4Var3.D, jj4Var3.E, jj4Var3.U, jj4Var3);
            if (k17 == null) {
                str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", str2);
            } else {
                str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                java.lang.String str7 = z7Var.f164812a;
                k17.I1 = str7;
                k17.J1 = str7;
                try {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(ca4.m0.k(z7Var.f164817f, z7Var.f164815d.f377855d + "_"));
                    if (k18 == null || !k18.isAd()) {
                        k17.field_fileType = 20202;
                    } else {
                        k17.field_fileType = 20210;
                    }
                    com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(k18);
                    k17.Q1 = ca4.z0.t0(f17.Id);
                    k17.V1 = f17.PreDownloadInfo.f378575d;
                } catch (java.lang.Exception unused) {
                }
                r45.jj4 jj4Var4 = z7Var.f164815d;
                k17.f241814b2 = jj4Var4.f377855d;
                k17.f241800s = com.tencent.mm.plugin.sns.model.i7.r(jj4Var4);
                r45.jj4 jj4Var5 = z7Var.f164815d;
                k17.X1 = jj4Var5.U;
                k17.P = com.tencent.mm.plugin.sns.model.i7.q(jj4Var5);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "download video flag:%s", k17.X1);
                i7Var2.f164308a = z7Var;
                i7Var2.f164308a.f164813b = k17.field_mediaId;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", i7Var2.f164308a.f164813b, java.lang.Boolean.valueOf(z18));
                t21.o2.Di().e(k17, z18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", str2);
            }
        } else {
            java.lang.String str8 = z7Var.f164817f;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "this sns:[%s] video[%s] already download finish, do nothing. [%s, %s]", str8, z7Var.f164813b, str8, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            str = "access$1300";
            str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
    }
}
