package zs1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final zs1.c f475233a = new zs1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f475234b = jz5.h.b(zs1.b.f475232d);

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f475235c;

    public static final boolean a() {
        if (f475235c == null) {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_prefetcher_enable_download_pkg_by_http, 1);
            if (Ni != 1) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            f475235c = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherPkgManager", "initWebPrefetcherPkgConfig enableDownloadPkgByHttp config: " + Ni + ", enable: " + f475235c);
        }
        java.lang.Boolean bool = f475235c;
        kotlin.jvm.internal.o.d(bool);
        return bool.booleanValue();
    }

    public static final r45.q97 b(java.lang.String appId, java.lang.String pkgVersion) {
        byte[] j17;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgVersion, "pkgVersion");
        java.lang.Object obj = null;
        if (!(appId.length() > 0)) {
            return null;
        }
        zs1.c cVar = f475233a;
        java.lang.String c17 = cVar.c(appId, pkgVersion);
        com.tencent.mm.sdk.platformtools.o4 d17 = cVar.d();
        kotlin.jvm.internal.o.f(d17, "<get-pkgVersionManager>(...)");
        if (d17.f(c17) && (j17 = d17.j(c17)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.q97.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    obj = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.q97) obj;
    }

    public static final void e(r45.q97 q97Var) {
        if (q97Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherPkgManager", "saveCurrentPkgInfo appId: " + q97Var.f383785d + ", pkgVersion: " + q97Var.f383787f);
        ku4.z zVar = ku4.z.f312539a;
        java.lang.String appId = q97Var.f383785d;
        kotlin.jvm.internal.o.f(appId, "appId");
        r45.mt mtVar = new r45.mt();
        java.lang.String str = q97Var.f383785d;
        if (str == null) {
            str = "";
        }
        mtVar.f380816d = str;
        java.lang.String str2 = q97Var.f383786e;
        if (str2 == null) {
            str2 = "";
        }
        mtVar.f380817e = str2;
        java.lang.String str3 = q97Var.f383787f;
        mtVar.f380821i = str3 != null ? str3 : "";
        zVar.n(appId, mtVar);
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str2.length() == 0) {
            return str;
        }
        return str + '_' + str2.hashCode();
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f475234b).getValue();
    }
}
