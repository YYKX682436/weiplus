package su4;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f412824a;

    /* renamed from: b, reason: collision with root package name */
    public int f412825b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f412826c;

    /* renamed from: d, reason: collision with root package name */
    public long f412827d;

    /* renamed from: e, reason: collision with root package name */
    public long f412828e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412829f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f412830g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412831h = null;

    public static java.lang.String a(java.lang.String str, int i17, int i18, boolean z17) {
        com.tencent.mm.vfs.z7 z7Var;
        java.lang.String str2 = "FTS_BizCacheObj" + i17 + "-" + i18;
        java.lang.String str3 = str2 + "-" + com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (z17) {
            return str3;
        }
        com.tencent.mm.vfs.z7 a17 = str == null ? null : com.tencent.mm.vfs.z7.a(str);
        if (a17 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(str3, false, false), null, null);
        } else {
            boolean isEmpty = str3.isEmpty();
            java.lang.String str4 = a17.f213279f;
            if (!isEmpty) {
                str4 = com.tencent.mm.vfs.e8.l(str4 + '/' + str3, false, false);
            }
            z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, str4, a17.f213280g, a17.f213281h);
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        return m17.a() ? m17.f213266a.F(m17.f213267b) : false ? str3 : str2;
    }

    public java.lang.String b() {
        if (this.f412831h == null) {
            this.f412831h = "";
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(this.f412826c).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA).optJSONObject("hotwords").optJSONArray("items");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    arrayList.add(android.net.Uri.encode(optJSONArray.optJSONObject(i17).optString("hotword")));
                }
                this.f412831h = android.text.TextUtils.join("|", arrayList);
            } catch (java.lang.Exception unused) {
            }
        }
        return this.f412831h;
    }

    public boolean c() {
        return (this.f412830g || com.tencent.mm.sdk.platformtools.t8.K0(this.f412826c) || (java.lang.System.currentTimeMillis() / 1000) - this.f412828e > this.f412827d) ? false : true;
    }

    public void d(java.lang.String str, int i17, int i18) {
        r45.qh4 qh4Var = new r45.qh4();
        java.lang.String a17 = a(str, i17, i18, false);
        if (!a17.equals(a(str, i17, i18, true))) {
            this.f412830g = true;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str, a17);
        byte[] N = com.tencent.mm.vfs.w6.N(r6Var.o(), 0, (int) r6Var.C());
        if (N != null) {
            try {
                qh4Var.parseFrom(N);
                this.f412824a = qh4Var.f383995d;
                this.f412826c = qh4Var.f383996e;
                this.f412827d = qh4Var.f383997f;
                this.f412828e = qh4Var.f383998g;
                this.f412829f = qh4Var.f383999h;
                this.f412825b = qh4Var.f384000i;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BizCacheObj", "load bizCacheFile %s %d", r6Var.o(), java.lang.Integer.valueOf(N.length));
            } catch (java.io.IOException unused) {
            }
        }
    }
}
