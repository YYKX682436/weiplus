package r91;

/* loaded from: classes7.dex */
public class b implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        if (str == null || str.isEmpty()) {
            return r91.g.a("username or appId is required");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClearContactCmd", th6, "clearContact failed", new java.lang.Object[0]);
            bundle2.putBoolean(ya.b.SUCCESS, false);
            bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
        }
        if (str.startsWith("wx")) {
            str2 = k91.k4.f(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                bundle2.putString("resolved_username", str2);
                k91.k4.d(str2);
                bundle2.putBoolean(ya.b.SUCCESS, true);
                bundle2.putString(dm.i4.COL_USERNAME, str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.ClearContactCmd", "clearContact(%s) done, username=%s", str, str2);
                return bundle2;
            }
            bundle2.putString("warning", "could not resolve appId to username, using arg as-is");
        }
        str2 = str;
        k91.k4.d(str2);
        bundle2.putBoolean(ya.b.SUCCESS, true);
        bundle2.putString(dm.i4.COL_USERNAME, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearContactCmd", "clearContact(%s) done, username=%s", str, str2);
        return bundle2;
    }
}
