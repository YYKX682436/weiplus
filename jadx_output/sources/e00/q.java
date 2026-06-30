package e00;

/* loaded from: classes9.dex */
public final class q implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.qe0 f245807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.u8 f245808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f245812f;

    public q(bw5.qe0 qe0Var, bw5.u8 u8Var, java.lang.String str, java.lang.String str2, java.lang.String str3, jz5.l lVar) {
        this.f245807a = qe0Var;
        this.f245808b = u8Var;
        this.f245809c = str;
        this.f245810d = str2;
        this.f245811e = str3;
        this.f245812f = lVar;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            bw5.qe0 qe0Var = this.f245807a;
            if (qe0Var.f32062g) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                bw5.u8 u8Var = this.f245808b;
                java.lang.String str = u8Var.f33784p1[3] ? u8Var.f33774f : "";
                if (str == null) {
                    str = "";
                }
                jSONObject.putOpt("feedId", str);
                boolean[] zArr = u8Var.f33784p1;
                java.lang.String str2 = zArr[4] ? u8Var.f33775g : "";
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.putOpt("nonceId", str2);
                jSONObject.putOpt("lastGMsgId", this.f245809c);
                jSONObject.putOpt("reqType", java.lang.Integer.valueOf(e00.j.f245783a.a(this.f245810d, this.f245811e, true)));
                jSONObject.putOpt("productId", java.lang.Long.valueOf(u8Var.f33780n));
                java.lang.String str3 = zArr[18] ? u8Var.f33792x : "";
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.putOpt("ecSource", str3);
                java.lang.String c17 = u8Var.c();
                if (c17 == null) {
                    c17 = "";
                }
                jSONObject.putOpt("finderLiveId", c17);
                java.lang.String finderUsername = u8Var.getFinderUsername();
                jSONObject.putOpt("finderUsername", finderUsername != null ? finderUsername : "");
                if (!((java.lang.Boolean) this.f245812f.f302833d).booleanValue()) {
                    jSONObject.putOpt("showLiving", java.lang.Boolean.valueOf(qe0Var.b().f31595f == 1 && qe0Var.b().f31594e == 1));
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                l81.b1 b1Var = (l81.b1) appBundle;
                b1Var.V = f00.o.class;
                b1Var.W = jSONObject2;
            }
        }
    }
}
