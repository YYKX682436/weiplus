package vz4;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.w f441750d;

    public v(vz4.w wVar) {
        this.f441750d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz4.w wVar = this.f441750d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
            vz4.x xVar = wVar.f441751d;
            vz4.x xVar2 = wVar.f441751d;
            if (!xVar.f441756d) {
                xVar.f441769q = null;
            }
            boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(xVar.f441769q);
            xVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "reloadPage");
            if (xVar2.f441756d) {
                xVar2.f441756d = false;
                ((java.util.HashMap) vz4.s.f441744a).remove(xVar2.f441755c);
            }
            com.tencent.mm.plugin.wepkg.event.d dVar = xVar2.f441764l;
            if (dVar != null) {
                dVar.c();
            }
            xVar2.getClass();
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
            int i17 = sharedPreferences != null ? sharedPreferences.getInt("white_screen_times", 0) : 0;
            if (i17 <= 1) {
                int i18 = i17 + 1;
                xVar2.getClass();
                android.content.SharedPreferences sharedPreferences2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putInt("white_screen_times", i18).commit();
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = xVar2.f441758f;
            if (wepkgVersion != null) {
                if (z17) {
                    com.tencent.mm.plugin.wepkg.utils.a.c("whiteScreen", xVar2.f441753a, wepkgVersion.f188374d, wepkgVersion.f188376f, 1L, 0L, null);
                } else {
                    com.tencent.mm.plugin.wepkg.utils.a.c("whiteScreen", xVar2.f441753a, wepkgVersion.f188374d, wepkgVersion.f188376f, -1L, 0L, null);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 13L, 1L, false);
            java.lang.String str = xVar2.f441753a;
            java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
            java.lang.String a17 = kh0.i.a(str);
            ((java.util.HashMap) vz4.s.f441744a).remove(a17);
            com.tencent.mm.plugin.wepkg.model.i.c().e(a17, 1, 2);
            xVar2.getClass();
            android.content.SharedPreferences sharedPreferences3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgPlugin", "disableWePkg");
                sharedPreferences3.edit().putBoolean("disable_we_pkg", true).commit();
            }
            xVar2.a();
        } catch (java.lang.Exception unused) {
        }
    }
}
