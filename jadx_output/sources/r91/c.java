package r91;

/* loaded from: classes7.dex */
public class c implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        if (str == null || str.isEmpty()) {
            return r91.g.a("appId is required");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            boolean d17 = com.tencent.mm.plugin.appbrand.app.r9.Zi().d(str);
            bundle2.putBoolean(ya.b.SUCCESS, true);
            bundle2.putBoolean("deleted", d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ClearLaunchPermCmd", "clearLaunchPermission(%s) deleted=%b", str, java.lang.Boolean.valueOf(d17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClearLaunchPermCmd", th6, "clearLaunchPermission failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.SUCCESS, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        return bundle2;
    }
}
