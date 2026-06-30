package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.ipcall.model.j f142470d;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f142471a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f142472b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f142473c = false;

    public static com.tencent.mm.plugin.ipcall.model.j a() {
        if (f142470d == null) {
            f142470d = new com.tencent.mm.plugin.ipcall.model.j();
        }
        return f142470d;
    }

    public void b(boolean z17) {
        com.tencent.mm.vfs.z7 a17;
        com.tencent.mm.vfs.z2 m17;
        if (!this.f142473c || z17) {
            d();
            java.io.InputStream inputStream = null;
            try {
                try {
                    a17 = com.tencent.mm.vfs.z7.a(lp0.b.e() + "ipcallCountryCodeConfig.cfg");
                    java.lang.String str = a17.f213279f;
                    if (str != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                        if (!str.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallCountryCodeConfig", "initConfig error: %s", e17.getMessage());
                }
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    this.f142473c = true;
                    java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
                    return;
                }
                inputStream = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, m17));
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                java.lang.String str2 = "";
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str2 = str2 + readLine;
                }
                c(str2);
                this.f142473c = true;
            } finally {
                com.tencent.mm.vfs.e8.d(null);
            }
        }
    }

    public final void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("restriction");
            jSONArray.length();
            java.util.ArrayList arrayList = this.f142472b;
            arrayList.clear();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(java.lang.Integer.valueOf(jSONArray.getInt(i17)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallCountryCodeConfig", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallCountryCodeConfig", "initConfigFromContent error: %s", e17.getMessage());
        }
    }

    public final void d() {
        s83.k Ui = com.tencent.mm.plugin.ipcall.model.r.Ui();
        Ui.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = Ui.f404884d.f("SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry   ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC", null, 2);
        if (f17 != null && f17.moveToFirst()) {
            new java.util.ArrayList();
            do {
                s83.i iVar = new s83.i();
                iVar.convertFrom(f17);
                arrayList.add(java.lang.Integer.valueOf(iVar.field_countryCode));
            } while (f17.moveToNext());
        }
        if (f17 != null) {
            f17.close();
        }
        if (arrayList.size() > 0) {
            this.f142471a = arrayList;
            return;
        }
        this.f142471a.clear();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatOutTopCountryCode");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return;
        }
        java.lang.String[] split = d17.trim().split(",");
        int length = split.length;
        try {
            for (java.lang.String str : split) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str, 0));
                this.f142471a.add(valueOf);
                com.tencent.mm.plugin.ipcall.model.r.Ui().y0(valueOf.intValue(), length);
                length--;
            }
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallCountryCodeConfig", "initPopularCountryFromDynamicConfig error: %s", e17.getMessage());
        }
    }

    public boolean e(int i17) {
        if (!this.f142473c) {
            b(false);
        }
        java.util.ArrayList arrayList = this.f142472b;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return arrayList.contains(java.lang.Integer.valueOf(i17));
    }
}
