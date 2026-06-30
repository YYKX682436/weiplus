package su4;

/* loaded from: classes8.dex */
public class g3 {

    /* renamed from: d, reason: collision with root package name */
    public static final su4.g3 f412902d = new su4.g3();

    /* renamed from: a, reason: collision with root package name */
    public su4.f3 f412903a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f412904b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f412905c = null;

    public g3() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FTS_DISCOVERY_RED_XML_STRING, "");
        su4.f3 f3Var = new su4.f3();
        this.f412903a = f3Var;
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String[] split = str.split("&");
            f3Var.f412881a = com.tencent.mm.sdk.platformtools.t8.z1(split[0], new java.lang.Object[0]);
            f3Var.f412882b = com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0);
            f3Var.f412883c = com.tencent.mm.sdk.platformtools.t8.D1(split[2], 0);
            f3Var.f412884d = com.tencent.mm.sdk.platformtools.t8.E1(split[3]);
            f3Var.f412885e = com.tencent.mm.sdk.platformtools.t8.D1(split[4], 0);
            f3Var.f412886f = com.tencent.mm.sdk.platformtools.t8.D1(split[5], 0);
            f3Var.f412887g = split[6];
            f3Var.f412888h = split[7];
            f3Var.f412889i = com.tencent.mm.sdk.platformtools.t8.E1(split[8]);
            f3Var.f412890j = com.tencent.mm.sdk.platformtools.t8.D1(split[9], 0);
            f3Var.f412891k = com.tencent.mm.sdk.platformtools.t8.E1(split[10]);
            f3Var.f412892l = com.tencent.mm.sdk.platformtools.t8.D1(split[11], 0);
            f3Var.f412893m = com.tencent.mm.sdk.platformtools.t8.D1(split[12], 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "parse %s", str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchRedPointMgr", e17, "", new java.lang.Object[0]);
        }
    }

    public void a(int i17) {
        su4.f3 f3Var = this.f412903a;
        if (f3Var != null) {
            boolean a17 = f3Var.a();
            if (this.f412904b && i17 == 1 && !a17) {
                return;
            }
            java.lang.String str = this.f412903a.f412881a;
            if (str == null || str.equals("null")) {
                str = "";
            }
            if (i17 == 1 && !str.trim().isEmpty()) {
                if (str.equals(this.f412905c)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "reportRed, duplicated, redDotId: ".concat(str));
                    return;
                }
                this.f412905c = str;
            }
            java.lang.String format = java.lang.String.format("%d,%d,%s,%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17 ? 1 : 0), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "report websearch reddot 17513: " + format);
            jx3.f.INSTANCE.kvStat(17513, format);
            if (i17 != 1 || a17) {
                return;
            }
            this.f412904b = true;
        }
    }

    public void b() {
        java.lang.String str;
        su4.f3 f3Var = this.f412903a;
        if (f3Var == null) {
            str = "";
        } else {
            str = f3Var.f412881a + "&" + f3Var.f412882b + "&" + f3Var.f412883c + "&" + f3Var.f412884d + "&" + f3Var.f412885e + "&" + f3Var.f412886f + "&" + f3Var.f412887g + "&" + f3Var.f412888h + "&" + f3Var.f412889i + "&" + f3Var.f412890j + "&" + f3Var.f412891k + "&" + f3Var.f412892l + "&" + f3Var.f412893m;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FTS_DISCOVERY_RED_XML_STRING, str);
    }
}
