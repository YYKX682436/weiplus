package uj;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final uj.k f428161a = new uj.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f428162b = jz5.h.b(uj.j.f428160d);

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f428162b).getValue();
    }

    public final com.tencent.mm.plugin.appbrand.appcache.n9 b() {
        com.tencent.mars.xlog.Log.i("MagicPlayablePkgRecordMgr", "getPkgRecord");
        java.lang.String str = "";
        java.lang.String u17 = a().u("AppID", "");
        java.lang.String u18 = a().u("ModuleName", "");
        int o17 = a().o("VersionType", 0);
        com.tencent.mars.xlog.Log.i("MagicPlayablePkgRecordMgr", "getWxaPkg appId:" + u17 + " moduleName:" + u18 + " versionType:" + o17);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.a6.a(u18);
        com.tencent.mm.plugin.appbrand.appcache.da daVar = com.tencent.mm.plugin.appbrand.appcache.da.f75492a;
        java.lang.String str2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(u17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                str = "$" + a17;
            }
            sb6.append(str);
            str2 = sb6.toString();
        }
        return daVar.b(str2, o17, new java.lang.String[0]);
    }
}
