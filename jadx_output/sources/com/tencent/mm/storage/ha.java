package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class ha {

    /* renamed from: c, reason: collision with root package name */
    public static final bm5.p1 f195013c = new com.tencent.mm.storage.ga();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f195014d = lp0.b.X() + "MicroMsg/regioncode/";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f195015a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f195016b = "";

    public static com.tencent.mm.storage.ha k() {
        bm5.p1 p1Var = f195013c;
        com.tencent.mm.storage.ha haVar = (com.tencent.mm.storage.ha) p1Var.b();
        haVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.m2.d().equals(haVar.f195015a)) {
            haVar.a();
        }
        return (com.tencent.mm.storage.ha) p1Var.b();
    }

    public static java.lang.String q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(16);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            sb6.append(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                sb6.append('_');
                sb6.append(str2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    sb6.append('_');
                    sb6.append(str3);
                }
            }
        }
        return sb6.toString();
    }

    public static boolean r(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return str.equalsIgnoreCase("cn");
    }

    public static void s() {
        bm5.p1 p1Var = f195013c;
        if (p1Var.c()) {
            com.tencent.mm.storage.RegionCodeDecoder$DecoderJni.release();
            p1Var.reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01da, code lost:
    
        if ((com.tencent.mm.vfs.w6.d("assets:///regioncode/mmregioncode_en.txt", r5.o(), false) > 0) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.ha.a():void");
    }

    public final synchronized void b(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String[] D = r6Var.m() ? r6Var.D() : null;
        if (!r6Var.m() || D == null || D.length == 0) {
            try {
                for (java.lang.String str : com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().list("regioncode")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RegionCodeDecoder", "from:%s,  to:%s", "regioncode/" + str, r6Var.u() + "/" + str);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(r6Var.u());
                    sb6.append("/");
                    sb6.append(str);
                    java.lang.String sb7 = sb6.toString();
                    com.tencent.mm.vfs.w6.c("assets:///regioncode/" + str, sb7);
                    d(new com.tencent.mm.vfs.r6(sb7), r6Var);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RegionCodeDecoder", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return f195014d + "mmregioncode_" + str + ".txt";
    }

    public void d(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.r6 r6Var2) {
        com.tencent.mm.vfs.a7 a7Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.RegionCodeDecoder", "Generating hash file for: %s", r6Var.getName());
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var2, r6Var.getName() + ".hash");
        java.lang.String o17 = o(r6Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
            return;
        }
        if (!r6Var3.m()) {
            r6Var3.s().J();
        }
        com.tencent.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                a7Var = new com.tencent.mm.vfs.a7(r6Var3);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                a7Var.write(o17);
                a7Var.close();
            } catch (java.lang.Throwable th7) {
                th = th7;
                a7Var2 = a7Var;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RegionCodeDecoder", th, "Failed to save hash file of %s", r6Var.getName());
                    if (a7Var2 != null) {
                        a7Var2.close();
                    }
                } catch (java.lang.Throwable th8) {
                    if (a7Var2 != null) {
                        try {
                            a7Var2.close();
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    throw th8;
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    public com.tencent.mm.storage.RegionCodeDecoder$Region[] e(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f195016b) || com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        return com.tencent.mm.storage.RegionCodeDecoder$DecoderJni.getCities(this.f195016b, str, str2);
    }

    public java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return null;
        }
        return l(q(str, str2, str3));
    }

    public com.tencent.mm.storage.RegionCodeDecoder$Region[] g() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f195016b)) {
            return null;
        }
        return com.tencent.mm.storage.RegionCodeDecoder$DecoderJni.getCountries(this.f195016b);
    }

    public java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String f17 = f(str, str2, str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            return f17;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str3;
    }

    public java.lang.String i(java.lang.String str) {
        java.lang.String l17 = l(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            return l17;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public java.lang.String j(java.lang.String str, java.lang.String str2) {
        java.lang.String m17 = m(str, str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m17)) {
            return m17;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }

    public final java.lang.String l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return com.tencent.mm.storage.RegionCodeDecoder$DecoderJni.getLocName(str);
    }

    public java.lang.String m(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        return l(q(str, str2, null));
    }

    public com.tencent.mm.storage.RegionCodeDecoder$Region[] n(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f195016b) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return com.tencent.mm.storage.RegionCodeDecoder$DecoderJni.getProvinces(this.f195016b, str);
    }

    public final java.lang.String o(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(r6Var.u());
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", r6Var.getName());
            return null;
        }
        return com.tencent.mm.sdk.platformtools.w2.a(p17 + "#" + r6Var.B() + "#" + wo.w0.g(true));
    }

    public final java.lang.String p() {
        java.lang.String str = "mmregioncode_" + this.f195015a + ".txt";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmregioncode_");
        sb6.append(this.f195015a.equalsIgnoreCase("zh_HK") ? "zh_TW" : this.f195015a);
        sb6.append(".txt");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = f195014d;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
            return null;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str2 + str);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (!m19.a() ? false : m19.f213266a.F(m19.f213267b)) {
            return str;
        }
        if (this.f195015a.equalsIgnoreCase("zh_HK")) {
            com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(str2 + sb7);
            java.lang.String str5 = a19.f213279f;
            if (str5 != null) {
                java.lang.String l19 = com.tencent.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l19)) {
                    a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
            if (!m27.a() ? false : m27.f213266a.F(m27.f213267b)) {
                return sb7;
            }
        }
        com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(str2 + "mmregioncode_en.txt");
        java.lang.String str6 = a27.f213279f;
        if (str6 != null) {
            java.lang.String l27 = com.tencent.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l27)) {
                a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l27, a27.f213280g, a27.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m28 = com.tencent.mm.vfs.a3.f212781a.m(a27, null);
        if (m28.a() ? m28.f213266a.F(m28.f213267b) : false) {
            return "mmregioncode_en.txt";
        }
        return null;
    }
}
