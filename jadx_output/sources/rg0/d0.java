package rg0;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f395170c;

    /* renamed from: a, reason: collision with root package name */
    public static final rg0.d0 f395168a = new rg0.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f395169b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f395171d = new java.lang.Object();

    public final void a() {
        java.io.InputStream E;
        java.io.InputStreamReader inputStreamReader;
        java.lang.String str = com.tencent.mm.vfs.q7.c("PublicResource") + "/anops";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str3 = a18.f213279f;
            if (str3 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, null);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        java.lang.String concat = str.concat("/comm.img");
        com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(concat);
        java.lang.String str4 = a19.f213279f;
        if (str4 != null) {
            java.lang.String l19 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l19)) {
                a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m19 = b3Var.m(a19, null);
        boolean z17 = true;
        java.lang.String str5 = "";
        if (!m19.a() ? false : m19.f213266a.F(m19.f213267b)) {
            java.lang.String concat2 = str.concat("/comm.json");
            rg0.t tVar = rg0.t.f395191a;
            if (tVar.c(concat, concat2).length() == 0) {
                tVar.j("TL config dec failed!");
            } else {
                str5 = concat2;
            }
        } else {
            rg0.t.f395191a.j("TL config not found!");
        }
        if (str5 != null && str5.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        try {
            E = com.tencent.mm.vfs.w6.E(str5);
            try {
                inputStreamReader = new java.io.InputStreamReader(E);
            } finally {
            }
        } catch (java.lang.Exception e17) {
            rg0.t.f395191a.j("TL config read error!");
            com.tencent.mars.xlog.Log.e("MicroMsg.TLCManager", "read failed: %s", e17.getLocalizedMessage());
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            try {
                java.lang.String c17 = vz5.v.c(bufferedReader);
                vz5.b.a(bufferedReader, null);
                vz5.b.a(inputStreamReader, null);
                vz5.b.a(E, null);
                c(c17);
                com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(str5);
                java.lang.String str6 = a27.f213279f;
                if (str6 != null) {
                    java.lang.String l27 = com.tencent.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l27)) {
                        a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l27, a27.f213280g, a27.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(a27, null);
                if (m27.a()) {
                    m27.f213266a.d(m27.f213267b);
                }
            } finally {
            }
        } finally {
        }
    }

    public final boolean b(java.lang.String str) {
        boolean z17 = true;
        if (!f395170c) {
            synchronized (f395171d) {
                f395168a.a();
            }
            f395170c = true;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return false;
        }
        return ((java.util.ArrayList) f395169b).contains(str);
    }

    public final void c(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        kotlin.jvm.internal.o.f(jSONObject.optString("config_ver", ""), "optString(...)");
        java.lang.String optString = jSONObject.optString("scene_list", "");
        if (optString == null || optString.length() == 0) {
            return;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(optString, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.List list = f395169b;
        ((java.util.ArrayList) list).clear();
        for (java.lang.String str2 : f07) {
            if (!r26.n0.N(str2)) {
                ((java.util.ArrayList) list).add(r26.n0.u0(str2).toString());
            }
        }
    }
}
