package mu4;

/* loaded from: classes7.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.appbrand.appcache.u3 b(mu4.n r9, mu4.j r10, yz5.q r11, yz5.q r12, boolean r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu4.n.b(mu4.n, mu4.j, yz5.q, yz5.q, boolean, int, java.lang.Object):com.tencent.mm.plugin.appbrand.appcache.u3");
    }

    public static final com.tencent.mm.plugin.appbrand.appcache.u3 c(mu4.j jVar, yz5.q qVar, yz5.q qVar2, int i17) {
        try {
            boolean j17 = com.tencent.mm.vfs.w6.j(jVar.f331427c);
            java.lang.String str = jVar.f331427c;
            java.lang.String str2 = jVar.f331429e;
            if (j17) {
                com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
                y8Var.a();
                int b17 = com.tencent.mm.plugin.webview.webcompt.a.b(y8Var);
                mu4.n nVar = mu4.w.f331452y;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebJsEngine", "#readPkg " + str2 + " resVersion = " + b17 + " assetsVersion=" + i17);
                if (((java.lang.Boolean) qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b17), y8Var)).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebJsEngine", "#readPkg " + str2 + " use res");
                    pm0.v.K(null, new mu4.l(jVar, b17));
                    if (qVar2 != null) {
                        qVar2.invoke(mu4.o.f331436f, java.lang.Integer.valueOf(b17), "");
                    }
                    return y8Var;
                }
                java.util.Map map = com.tencent.mm.plugin.appbrand.appcache.v3.f76005a;
                try {
                    y8Var.close();
                } catch (java.io.IOException unused) {
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20781, str2, 0, 0, 0, "", "", 1);
                jx3.f.INSTANCE.w(1454L, 122L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            mu4.n nVar2 = mu4.w.f331452y;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebJsEngine", th6, "readResPkg", new java.lang.Object[0]);
        }
        return null;
    }

    public final mu4.j a(java.lang.String file, boolean z17, java.lang.String str, java.lang.String appId) {
        kotlin.jvm.internal.o.g(file, "file");
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String str2 = mu4.w.A + '/' + file;
        java.lang.String concat = "jsapi/".concat(file);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return (z65.c.a() && com.tencent.mm.vfs.w6.j(str2)) ? new mu4.j(true, z17, str2, concat, appId) : new mu4.j(false, z17, str, concat, appId);
    }
}
