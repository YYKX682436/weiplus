package nu4;

/* loaded from: classes7.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final int a(java.lang.String str) {
        try {
            return nu4.b0.L.o(str + "-MinBizPkgVersion", 0);
        } catch (java.lang.Exception e17) {
            nu4.k kVar = nu4.b0.f340241J;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsEngine", e17, "getMinPkgVersion:" + str, new java.lang.Object[0]);
            return 0;
        }
    }

    public final com.tencent.mm.plugin.appbrand.appcache.u3 b(java.lang.String str, yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var;
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var2 = null;
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = nu4.b0.V;
        synchronized (hashMap) {
            u3Var = (com.tencent.mm.plugin.appbrand.appcache.u3) hashMap.get(str);
            if (u3Var == null) {
                com.tencent.mm.plugin.appbrand.appcache.u3 u3Var3 = (com.tencent.mm.plugin.appbrand.appcache.u3) aVar.invoke();
                if (u3Var3 != null) {
                    hashMap.put(str, u3Var3);
                    nu4.k kVar = nu4.b0.f340241J;
                    wu5.c cVar = nu4.b0.U;
                    if (cVar != null) {
                        cVar.cancel(false);
                    }
                    nu4.b0.U = null;
                    nu4.b0.U = ((ku5.t0) ku5.t0.f312615d).k(nu4.h.f340252d, 5000L);
                    u3Var2 = u3Var3;
                }
                u3Var = u3Var2;
            }
        }
        return u3Var;
    }

    public final nu4.a c(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a()) {
            return null;
        }
        mu4.n nVar = mu4.w.f331452y;
        mu4.j a17 = nVar.a("prefetcher/" + str + ".wspkg", true, "", "matchDebugManifest");
        java.lang.String str3 = a17.f331427c;
        if (com.tencent.mm.vfs.w6.j(str3)) {
            nu4.k kVar = nu4.b0.f340241J;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsEngine", "matchDebugManifest " + str + " path=" + str3);
            try {
                cl0.g gVar = new cl0.g(com.tencent.mm.plugin.appbrand.appcache.v3.a(mu4.n.b(nVar, a17, nu4.e.f340249d, null, false, 4, null), "/config.json"));
                r45.l83 l83Var = new r45.l83();
                l83Var.f379226d = gVar.optString("domain");
                r45.m83 m83Var = new r45.m83();
                m83Var.f380230d = gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                m83Var.f380235i = str;
                m83Var.f380231e = gVar.optString("manifest");
                return new nu4.a(l83Var, m83Var, null, 0, 0, true, null, 92, null);
            } catch (java.lang.Exception e17) {
                nu4.k kVar2 = nu4.b0.f340241J;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsEngine", e17, "matchDebugManifest", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
