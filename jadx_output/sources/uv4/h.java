package uv4;

/* loaded from: classes8.dex */
public class h extends uv4.b {

    /* renamed from: h, reason: collision with root package name */
    public int f431432h;

    /* renamed from: i, reason: collision with root package name */
    public long f431433i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f431434j;

    public h(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        super(i17, str, str2, str3, j17);
        this.f431432h = 1;
        this.f431434j = new java.util.HashMap();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplate", "Init WebSearchTemplate templatePath:%s zipFileName:%s assetDir:%s", this.f431418b, this.f431419c, this.f431420d);
    }

    @Override // uv4.g
    public int b() {
        if (this.f431432h <= 1 || p().B() > this.f431433i) {
            k();
        }
        return this.f431432h;
    }

    @Override // uv4.g
    public java.lang.String c() {
        return l() + "/app.html";
    }

    @Override // uv4.g
    public java.lang.String e() {
        java.lang.String str = this.f431420d;
        if (android.text.TextUtils.isEmpty(str)) {
            return "config.conf";
        }
        return str + "/config.conf";
    }

    @Override // uv4.g
    public java.util.HashMap f() {
        int b17 = b();
        java.util.HashMap hashMap = this.f431434j;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(b17))) {
            hashMap.put(java.lang.Integer.valueOf(b17), new java.util.HashMap());
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Integer.valueOf(b17));
        if (hashMap2.isEmpty()) {
            try {
                com.tencent.mm.vfs.r6 p17 = p();
                java.util.Properties properties = new java.util.Properties();
                if (p17.A()) {
                    try {
                        java.io.InputStream C = com.tencent.mm.vfs.w6.C(p17);
                        try {
                            properties.load(C);
                            vz5.b.a(C, null);
                        } finally {
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
                    }
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(properties.getProperty("md5map"));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next != null && next.endsWith(".js")) {
                        java.lang.String str = l() + "/" + next;
                        if (com.tencent.mm.vfs.w6.j(str)) {
                            java.lang.String optString = jSONObject.optString(next, "");
                            hashMap2.put(str, optString);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplate", "getJsFileMap %s %s %s", java.lang.Integer.valueOf(b17), str, optString);
                        }
                    }
                }
                hashMap.put(java.lang.Integer.valueOf(b17), hashMap2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplate", e18, "", new java.lang.Object[0]);
            }
        }
        return hashMap2;
    }

    @Override // uv4.g
    public java.lang.String h() {
        return new com.tencent.mm.vfs.r6(l(), this.f431419c).o();
    }

    @Override // uv4.g
    public java.lang.String j() {
        java.lang.String str = this.f431420d;
        if (android.text.TextUtils.isEmpty(str)) {
            return "config.conf";
        }
        return str + "/" + this.f431419c;
    }

    @Override // uv4.g
    public void k() {
        com.tencent.mm.vfs.r6 p17 = p();
        java.util.Properties properties = new java.util.Properties();
        if (p17.A()) {
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(p17);
                try {
                    properties.load(C);
                    vz5.b.a(C, null);
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
            }
        }
        try {
            this.f431432h = java.lang.Integer.parseInt(properties.getProperty("version", java.lang.String.valueOf(1)));
        } catch (java.lang.Exception unused) {
            this.f431432h = 1;
        }
        this.f431433i = java.lang.System.currentTimeMillis();
    }

    @Override // uv4.g
    public java.lang.String l() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n(), this.f431418b);
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }
}
