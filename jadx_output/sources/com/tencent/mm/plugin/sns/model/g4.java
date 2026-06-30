package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class g4 implements t21.i0 {

    /* renamed from: e */
    public t21.h0 f164208e;

    /* renamed from: d */
    public java.lang.String f164207d = "";

    /* renamed from: f */
    public final dn.n f164209f = new com.tencent.mm.plugin.sns.model.f4(this);

    public static /* synthetic */ t21.h0 f(com.tencent.mm.plugin.sns.model.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        t21.h0 h0Var = g4Var.f164208e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return h0Var;
    }

    public static /* synthetic */ java.lang.String g(com.tencent.mm.plugin.sns.model.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        java.lang.String str = g4Var.f164207d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return str;
    }

    @Override // t21.i0
    public void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        if (this.f164207d.equals(str)) {
            t21.o2.Di().p(str, i17, i18, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f164207d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoProxy", "%s start http stream[%s, %s, %s]", java.lang.Integer.valueOf(hashCode()), str, str3, str2);
        boolean z17 = false;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z18 = sharedPreferences.getBoolean(str, false);
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoProxy", "is already download %s", java.lang.Boolean.valueOf(z18));
            if (z18) {
                ((com.tencent.mm.plugin.sns.model.f4) this.f164209f).g(str, 0, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
                return;
            }
        } else if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoProxy", "last download file was deleted");
            sharedPreferences.edit().putBoolean(str, false).commit();
        }
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (Cj.f164445h) {
            try {
                if (Cj.f164445h.containsKey(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z17 = true;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdVideoDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("%s is already in downloading", str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        } else {
            com.tencent.mm.plugin.sns.model.l4.Cj().i(str, str3, str2, 0, false, -1, true, this.f164209f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        }
    }

    @Override // t21.i0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoProxy", "%s, stop stream[%s]", java.lang.Integer.valueOf(hashCode()), str);
        if (this.f164207d.equals(str)) {
            com.tencent.mm.plugin.sns.model.l4.Cj().w(str, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        this.f164208e = h0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
    }

    @Override // t21.i0
    public boolean e(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        boolean o17 = this.f164207d.equals(str) ? t21.o2.Di().o(str, i17, i18) : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy");
        return o17;
    }
}
