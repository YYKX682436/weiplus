package r91;

/* loaded from: classes7.dex */
public class d implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return r91.g.a("must run in main process");
        }
        if (str == null || str.isEmpty()) {
            return r91.g.a("pluginAppId is required");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            int c17 = com.tencent.mm.plugin.appbrand.app.r9.Di().c(str);
            bundle2.putBoolean(ya.b.SUCCESS, true);
            bundle2.putBoolean("pkg_deleted", c17 > 0);
            bundle2.putString("pluginAppId", str);
            bundle2.putInt("deleted_count", c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ClearPluginPkgCmd", "clearPluginPkg(%s) deleted=%d", str, java.lang.Integer.valueOf(c17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClearPluginPkgCmd", th6, "clearPluginPkg failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.SUCCESS, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        return bundle2;
    }
}
