package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class v {
    public static boolean a(java.lang.String str, java.util.Map map) {
        if (map.get(str) != null) {
            return false;
        }
        if (map.get(str + ".resType") != null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".subType");
        return map.get(sb6.toString()) == null;
    }

    public static boolean b(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z17) {
        java.lang.String format = java.lang.String.format("%s.%s.%s", str, str2, "Resource");
        int a17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.b0.a(str2);
        if (a(format, map)) {
            return true;
        }
        int i17 = 0;
        boolean d17 = d(a17, format, map, z17) | false;
        while (true) {
            i17++;
            java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "%s.%s.%s%d", str, str2, "Resource", java.lang.Integer.valueOf(i17));
            if (a(format2, map)) {
                return d17;
            }
            d17 |= d(a17, format2, map, z17);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z17) {
        if (a(java.lang.String.format("%s.%s", str, str2), map)) {
            return;
        }
        boolean b17 = b(str, str2, map, z17) | false;
        int i17 = 0;
        while (true) {
            i17++;
            if (a(java.lang.String.format(java.util.Locale.US, "%s.%s%d", str, str2, java.lang.Integer.valueOf(i17)), map)) {
                break;
            } else {
                b17 |= b(str, str2, map, z17);
            }
        }
        int a17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.b0.a(str2);
        if ((a17 & 1) > 0) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 32L);
            if (b17) {
                return;
            }
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 33L);
            return;
        }
        if ((a17 & 2) > 0) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 35L);
            if (b17) {
                return;
            }
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 36L);
            return;
        }
        if ((a17 & 4) > 0) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 38L);
            if (b17) {
                return;
            }
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(0L, 39L);
        }
    }

    public static boolean d(int i17, java.lang.String str, java.util.Map map, boolean z17) {
        if (map.get(str + ".resType") == null) {
            if (map.get(str + ".subType") == null) {
                return true;
            }
        }
        if ((i17 & 4) > 0) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resType"), -1);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".subType"), -1);
            if (-1 == P || -1 == P2) {
                return false;
            }
            r45.vr5 vr5Var = new r45.vr5();
            vr5Var.f388468d = P2;
            r45.bs5 bs5Var = new r45.bs5();
            vr5Var.f388469e = bs5Var;
            bs5Var.f371026e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resVer"), 0);
            vr5Var.f388473i = (java.lang.String) map.get(str + ".sampleID");
            vr5Var.f388472h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
            vr5Var.f388471g = 4;
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().g(P, vr5Var, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a((long) vr5Var.f388472h, 40L);
            return true;
        }
        if (!((i17 & 1) > 0)) {
            if (!((i17 & 2) > 0)) {
                return false;
            }
            int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resType"), -1);
            int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".subType"), -1);
            if (-1 == P3 || -1 == P4) {
                return false;
            }
            r45.vr5 vr5Var2 = new r45.vr5();
            r45.as5 as5Var = new r45.as5();
            vr5Var2.f388470f = as5Var;
            vr5Var2.f388468d = P4;
            as5Var.f370244e = (java.lang.String) map.get(str + ".resKey");
            vr5Var2.f388470f.f370243d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resKeyVersion"), 0);
            vr5Var2.f388473i = (java.lang.String) map.get(str + ".sampleID");
            vr5Var2.f388472h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
            vr5Var2.f388471g = 2;
            r45.bs5 bs5Var2 = new r45.bs5();
            vr5Var2.f388469e = bs5Var2;
            bs5Var2.f371031m = (java.lang.String) map.get(str + ".originalmd5");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().f(P3, vr5Var2, true, z17 ^ true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a((long) vr5Var2.f388472h, 37L);
            return true;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".CDNUrl");
        int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".subType"), -1);
        int P6 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resType"), -1);
        java.lang.String str3 = (java.lang.String) map.get(str + ".md5");
        int P7 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".priority"), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3) || -1 == P5 || -1 == P6 || P7 < 0) {
            return false;
        }
        r45.vr5 vr5Var3 = new r45.vr5();
        vr5Var3.f388469e = new r45.bs5();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".fileEncrypt");
        int i18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb6.toString()), 0) > 0 ? 1 : 0;
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".fileCompress"), 0) > 0) {
            i18 |= 2;
        }
        vr5Var3.f388468d = P5;
        vr5Var3.f388477p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".networkType"), 2);
        vr5Var3.f388474m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".expireTime"), 1);
        r45.bs5 bs5Var3 = vr5Var3.f388469e;
        bs5Var3.f371027f = str2;
        bs5Var3.f371026e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".resVer"), 0);
        r45.bs5 bs5Var4 = vr5Var3.f388469e;
        bs5Var4.f371025d = str3;
        bs5Var4.f371031m = (java.lang.String) map.get(str + ".originalmd5");
        r45.bs5 bs5Var5 = vr5Var3.f388469e;
        bs5Var5.f371028g = i18;
        bs5Var5.f371029h = null;
        bs5Var5.f371030i = null;
        vr5Var3.f388479r = P7;
        vr5Var3.f388471g = 1;
        vr5Var3.f388472h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
        vr5Var3.f388473i = (java.lang.String) map.get(str + ".sampleID");
        vr5Var3.f388475n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".retryTime"), 3);
        vr5Var3.f388478q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".retryInterval"), 0);
        vr5Var3.f388476o = 0;
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().e(P6, vr5Var3, true);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a((long) vr5Var3.f388472h, 34L);
        return true;
    }
}
