package ma1;

/* loaded from: classes7.dex */
public abstract class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public ma1.c C(com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String str, boolean z17) {
        java.lang.String D = D(c0Var, str);
        if (D == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: can not generate!");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: creating file: %s", D);
        if (com.tencent.mm.vfs.w6.j(D)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                return null;
            }
            com.tencent.mm.vfs.w6.h(D);
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(D));
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(D));
        try {
            if (!r6Var.k()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: create file failed!");
                return null;
            }
            return new ma1.c(this, r6Var.o(), "wxfile://clientdata/" + str, null);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderBase", e17, "hy: create file failed!", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String D(com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String str) {
        if (c0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(c0Var == null);
            objArr[1] = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: param error %b, %s", objArr);
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.l2 l2Var = (com.tencent.mm.plugin.appbrand.jsapi.file.l2) c0Var.getFileSystem();
        if (l2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: fs is null");
            return null;
        }
        java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.appstorage.j3) l2Var.a("wxfile://clientdata")).f76225d;
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2 + ".nomedia");
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: no nomedia file. trigger new");
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WAGameJsApiScreenRecorderBase", e17, "hy: create no media file failed!", new java.lang.Object[0]);
            }
        }
        return str2 + str;
    }

    public ma1.c E(com.tencent.mm.plugin.appbrand.service.c0 c0Var, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: request saveFileToClientData: %s, %b, %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: src file not exists!");
            return null;
        }
        java.lang.String D = D(c0Var, str2);
        if (D == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: can not generate dest file!");
            return null;
        }
        if (com.tencent.mm.vfs.w6.j(D)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: file already exists, auto delete: %b", java.lang.Boolean.valueOf(z17));
            if (!z17) {
                return null;
            }
            com.tencent.mm.vfs.w6.h(D);
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(D);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        if (z18) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str4 = a18.f213279f;
            if (str4 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            if (!com.tencent.mm.vfs.w6.x(a18.toString(), a17.toString(), true)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: rename failed!");
                return null;
            }
        } else if (com.tencent.mm.vfs.w6.d(str, D, false) <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderBase", "hy: copy failed!");
            return null;
        }
        return new ma1.c(this, D, "wxfile://clientdata/" + str2, null);
    }
}
