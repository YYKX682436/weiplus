package su4;

/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.hq4 f413102a;

    public static void a(java.lang.String str) {
        r45.gq4 gq4Var = null;
        if (!u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null)) && c01.e2.G(str)) {
            if (f413102a == null) {
                c();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 0;
            while (i17 < f413102a.f376386d.size()) {
                r45.gq4 gq4Var2 = (r45.gq4) f413102a.f376386d.get(i17);
                long j17 = (currentTimeMillis - gq4Var2.f375485f) / 86400000;
                int i18 = i17;
                gq4Var2.f375484e *= java.lang.Math.pow(0.98d, j17);
                gq4Var2.f375485f += j17 * 86400000;
                if (gq4Var2.f375483d.equals(str)) {
                    gq4Var = gq4Var2;
                }
                i17 = i18 + 1;
            }
            if (gq4Var == null) {
                r45.gq4 gq4Var3 = new r45.gq4();
                gq4Var3.f375484e = 1.0d;
                gq4Var3.f375485f = currentTimeMillis;
                gq4Var3.f375483d = str;
                f413102a.f376386d.add(gq4Var3);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "add new use %s", str);
            } else {
                double d17 = gq4Var.f375484e + 1.0d;
                gq4Var.f375484e = d17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "update use %s %.2f", str, java.lang.Double.valueOf(d17));
            }
            java.util.Collections.sort(f413102a.f376386d, new su4.s2());
            for (int size = f413102a.f376386d.size() - 1; size < f413102a.f376386d.size() && f413102a.f376386d.size() > 8; size++) {
                if (((r45.gq4) f413102a.f376386d.get(size)).f375484e < 0.5d) {
                    f413102a.f376386d.remove(size);
                }
            }
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("fts_recent_biz_sp", 0);
            try {
                java.lang.String b17 = b();
                java.lang.String encodeToString = android.util.Base64.encodeToString(f413102a.toByteArray(), 0);
                sharedPreferences.edit().putString(b17, encodeToString).commit();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "useBiz pbListString %s", encodeToString);
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.lang.String b() {
        return "key_pb_most_search_biz_list" + c01.z1.r();
    }

    public static r45.hq4 c() {
        if (f413102a == null) {
            java.lang.String b17 = b();
            f413102a = new r45.hq4();
            try {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("fts_recent_biz_sp", 0).getString(b17, "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    f413102a.parseFrom(android.util.Base64.decode(string.getBytes(), 0));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            f413102a.f376386d.clear();
        }
        return f413102a;
    }
}
