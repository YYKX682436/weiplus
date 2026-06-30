package r91;

/* loaded from: classes7.dex */
public class h implements r91.f {
    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.util.Map d17;
        boolean z17;
        if (str == null || str.isEmpty()) {
            return r91.g.a("base64 encoded XML is required");
        }
        try {
            java.lang.String str2 = new java.lang.String(android.util.Base64.decode(str, 0), com.tencent.mapsdk.internal.rv.f51270c);
            android.os.Bundle bundle2 = new android.os.Bundle();
            try {
                d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "sysmsg", null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LaunchCmd", th6, "launch failed", new java.lang.Object[0]);
                bundle2.putBoolean(ya.b.SUCCESS, false);
                bundle2.putString("error", java.lang.String.valueOf(th6.getMessage()));
            }
            if (d17 != null && !d17.isEmpty()) {
                java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.$type");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    return r91.g.a("XML type not found");
                }
                com.tencent.mm.plugin.appbrand.appcache.y9 y9Var = (com.tencent.mm.plugin.appbrand.appcache.y9) com.tencent.mm.plugin.appbrand.appcache.aa.f75437d.get(str3);
                if (y9Var == null) {
                    return r91.g.a("No handler for type: " + str3);
                }
                boolean b17 = y9Var.b(str2, d17);
                bundle2.putBoolean(ya.b.SUCCESS, b17);
                bundle2.putString("xml_type", str3);
                if (b17 && "ForceOpenAppNotify".equals(str3)) {
                    java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
                    int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), 0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        for (int i17 = 0; i17 < 18; i17++) {
                            try {
                                java.lang.Thread.sleep(5000L);
                                try {
                                } catch (java.lang.Throwable th7) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.LaunchCmd", "check running app failed: %s", th7.getMessage());
                                }
                                if (com.tencent.mm.plugin.appbrand.task.u0.C().A(str4, P)) {
                                    z17 = true;
                                    break;
                                }
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                        z17 = false;
                        bundle2.putBoolean("app_started", z17);
                        bundle2.putString("appId", str4);
                        if (!z17) {
                            bundle2.putBoolean(ya.b.SUCCESS, false);
                            bundle2.putString("error", "app not started within 90s, appId may be invalid");
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchCmd", "launch xml_type=%s", str3);
                return bundle2;
            }
            return r91.g.a("XML parse failed");
        } catch (java.lang.Exception e17) {
            return r91.g.a("base64 decode failed: " + e17.getMessage());
        }
    }
}
