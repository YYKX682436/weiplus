package rg0;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f395192b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f395193c = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f395195e = false;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f395196f = "";

    /* renamed from: a, reason: collision with root package name */
    public static final rg0.t f395191a = new rg0.t();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f395194d = new java.lang.Object();

    public final int a(java.lang.String str, java.lang.String str2) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        try {
            if (!(str.length() == 0)) {
                if (!(str2.length() == 0)) {
                    java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"."}, false, 0, 6, null);
                    java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{"."}, false, 0, 6, null);
                    int max = java.lang.Math.max(f07.size(), f08.size());
                    for (int i17 = 0; i17 < max; i17++) {
                        java.lang.String str3 = (java.lang.String) kz5.n0.a0(f07, i17);
                        int intValue = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
                        java.lang.String str4 = (java.lang.String) kz5.n0.a0(f08, i17);
                        int intValue2 = (str4 == null || (h17 = r26.h0.h(str4)) == null) ? 0 : h17.intValue();
                        if (intValue != intValue2) {
                            return intValue - intValue2;
                        }
                    }
                    return 0;
                }
            }
            if (str.length() == 0) {
                if (str2.length() == 0) {
                    return 0;
                }
            }
            return str.length() == 0 ? -1 : 1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "compareVersion failed: %s", e17.getLocalizedMessage());
            return -1;
        }
    }

    public final void b(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        synchronized (f395194d) {
            if (f395195e) {
                return;
            }
            f395195e = true;
            try {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str, r6Var.getName());
                com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(r6Var);
                try {
                    com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(r6Var2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = u6Var.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                y6Var.write(bArr, 0, read);
                            }
                        }
                        vz5.b.a(y6Var, null);
                        vz5.b.a(u6Var, null);
                        java.lang.String name = r6Var.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        if (r26.i0.n(name, "comm.img", false)) {
                            f395193c = true;
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "copy failed %s", e17.getLocalizedMessage());
            }
            f395195e = false;
        }
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        synchronized (f395194d) {
            if (f395195e) {
                return "";
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "enc file not exist");
                return "";
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(r6Var);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = u6Var.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    vz5.b.a(u6Var, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray == null) {
                        byteArray = "".getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(byteArray, "getBytes(...)");
                    }
                    if (byteArray.length < 16) {
                        return "";
                    }
                    byte[] q17 = kz5.v.q(byteArray, 0, 16);
                    byte[] q18 = kz5.v.q(byteArray, 16, byteArray.length);
                    rg0.t tVar = f395191a;
                    byte[] q19 = kz5.v.q(q17, 0, 16);
                    byte[] bArr2 = new byte[16];
                    if (tVar.a(f395196f, "2.0.0") >= 0) {
                        for (int i17 = 0; i17 < 16; i17++) {
                            bArr2[i17] = (byte) (q19[i17] ^ 18);
                        }
                        q19 = bArr2;
                    }
                    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, new javax.crypto.spec.SecretKeySpec(q17, "AES"), new javax.crypto.spec.IvParameterSpec(q19));
                    byte[] doFinal = cipher.doFinal(q18);
                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
                    com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(r6Var2);
                    try {
                        y6Var.write(doFinal);
                        vz5.b.a(y6Var, null);
                        com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "dec suc");
                        java.lang.String o17 = r6Var2.o();
                        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                        return o17;
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(y6Var, th6);
                            throw th7;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    try {
                        throw th8;
                    } catch (java.lang.Throwable th9) {
                        vz5.b.a(u6Var, th8);
                        throw th9;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "dec failed: %s", e17.getLocalizedMessage());
                return "";
            }
        }
    }

    public final void d(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.d(m17.f213267b);
        }
    }

    public final void e(int i17, java.lang.String str, org.json.JSONObject jsonSecreport) {
        int i18;
        kotlin.jvm.internal.o.g(jsonSecreport, "jsonSecreport");
        java.lang.String str2 = str == null ? "" : str;
        int i19 = 0;
        if (f395196f.length() == 0) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            f395196f = java.lang.String.valueOf(L != null ? L.getString("WXANOPSLAVR", "NotExist") : null);
        }
        jsonSecreport.put("Ver", f395196f);
        if (!f395192b) {
            java.lang.String str3 = com.tencent.mm.vfs.q7.c("PublicResource") + "/anops";
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str3);
                sb6.append('/');
                java.util.ArrayList arrayList = new java.util.ArrayList(15);
                for (int i27 = 0; i27 < 15; i27++) {
                    arrayList.add(java.lang.Character.valueOf((char) ("OJAWS@P\u000eOJWF\rPL".charAt(i27) ^ '#')));
                }
                sb6.append(kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null));
                java.lang.String sb7 = sb6.toString();
                java.lang.String concat = str3.concat("/anopro.dat");
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(concat);
                if (r6Var.m()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "probe file exist, something wrong!");
                    i18 = -10;
                } else {
                    r6Var.k();
                    java.lang.String c17 = c(f(str3), sb7);
                    if (c17.length() == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "so dec failed");
                        d(concat);
                        i18 = -9;
                    } else {
                        try {
                            com.tencent.cso.CsoLoader.h(c17);
                            com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative.INSTANCE.init(0, str2);
                            f395192b = true;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "load failed: %s", e17.getLocalizedMessage());
                            i19 = -4;
                        }
                        d(concat);
                        i18 = i19;
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "DIR not exist!");
                i18 = -7;
            }
            if (i18 != 0) {
                jsonSecreport.put("Error", i18);
                return;
            }
        }
        try {
            java.lang.String result = com.tencent.mm.feature.wallet_core.extension.SecLiteAppNative.INSTANCE.getResult(i17, str2);
            if (result == null) {
                result = "{}";
            }
            jsonSecreport.put("Result", new org.json.JSONObject(result));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TLModuleManager", "json error: %s", e18.getLocalizedMessage());
        }
    }

    public final java.lang.String f(java.lang.String str) {
        return str + '/' + (wo.w0.q() ? "anops.en64.img" : "anops.en32.img");
    }

    public final boolean g() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f(com.tencent.mm.vfs.q7.c("PublicResource") + "/anops"));
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public final boolean h() {
        if (f395196f.length() == 0) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            f395196f = java.lang.String.valueOf(L != null ? L.getString("WXANOPSLAVR", "") : null);
        }
        return a(f395196f, "0.0.7") >= 0;
    }

    public final void i(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('/');
        java.lang.String name = r6Var.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        sb6.append(r26.i0.t(name, "up.img", ".so", false));
        java.lang.String c17 = c(r6Var.o(), sb6.toString());
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        d(o17);
        if (c17.length() == 0) {
            j(str2 + " load fail");
            return;
        }
        com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
        com.tencent.cso.CsoLoader.h(c17);
        d(c17);
        java.lang.String error = str2 + " load success";
        kotlin.jvm.internal.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("TPInfo", error);
        new vs4.a("MicroMsg.TLModuleManager", jSONObject.toString()).l().K(rg0.s.f395190a);
    }

    public final void j(java.lang.String error) {
        kotlin.jvm.internal.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("TPError", error);
        new vs4.a("MicroMsg.TLModuleManager", jSONObject.toString()).l().K(rg0.r.f395189a);
    }
}
