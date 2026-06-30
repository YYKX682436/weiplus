package x44;

/* loaded from: classes4.dex */
public final class i0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        long optLong = data.optLong(dm.i4.COL_ID);
        java.lang.String optString = data.optString("appId");
        boolean z17 = true;
        if (optLong <= 0) {
            if (optString == null || optString.length() == 0) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.InstallDownload", "the download id and app id are all empty!");
                b(g("the download id and app id are all empty!"));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
                return;
            }
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
        gVar.requireAccountInitialized();
        h02.b bVar = gVar.f380d;
        if (optString != null && optString.length() != 0) {
            z17 = false;
        }
        h02.a z07 = !z17 ? bVar.z0(optString) : bVar.D0(optLong);
        if (z07 != null) {
            yb0.a aVar = yb0.a.f460612a;
            java.lang.String str = z07.field_downloadUrl;
            if (str == null) {
                str = "";
            }
            java.lang.String m17 = env.b().m();
            aVar.a(str, m17 != null ? m17 : "");
            if (z07.field_status == 3 && com.tencent.mm.vfs.w6.j(z07.field_filePath)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                yb0.b.a(z07.field_filePath, z07.field_downloadUrl);
                long j17 = z07.field_downloadId;
                x44.h0 h0Var = new x44.h0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j17, false, h0Var);
            } else {
                com.tencent.mars.xlog.Log.w("SnsAdJs.InstallDownload", "the download task isn't completed!!!");
                b(g("the download task isn't completed!!!"));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.InstallDownload", "it can't find download info with the download id " + optLong + " or app id " + optString + '!');
            b(g("it can't find download info with the download id " + optLong + " or app id " + optString + '!'));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.InstallDownloadTask");
    }
}
