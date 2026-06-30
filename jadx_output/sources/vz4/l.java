package vz4;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.m f441736d;

    public l(vz4.m mVar) {
        this.f441736d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz4.m mVar = this.f441736d;
        if (mVar.f441738e == null) {
            mVar.f441738e = new com.tencent.mm.plugin.wepkg.utils.g();
        }
        com.tencent.mm.plugin.wepkg.utils.g gVar = mVar.f441738e;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
        gVar.f188494c.alive();
        gVar.f188493b.alive();
        if (xz4.q.f458295a == null) {
            xz4.q.f458295a = new xz4.p(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(xz4.q.f458295a, intentFilter);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader startListen");
        gVar.f188492a.alive();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgListener", "sp is null");
                return;
            }
            if (sharedPreferences.getBoolean("disable_we_pkg", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
                sharedPreferences.edit().putBoolean("disable_we_pkg", false).commit();
            }
            sharedPreferences.edit().putInt("white_screen_times", 0).commit();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgListener", e17.getMessage());
        }
    }
}
