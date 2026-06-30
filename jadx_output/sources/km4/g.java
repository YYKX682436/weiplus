package km4;

/* loaded from: classes11.dex */
public final class g implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f309277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f309280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309283i;

    public g(kotlin.jvm.internal.c0 c0Var, android.content.Context context, l81.b1 b1Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var2, long j17, kotlin.jvm.internal.h0 h0Var2, yz5.l lVar, java.lang.String str) {
        this.f309275a = c0Var;
        this.f309276b = context;
        this.f309277c = b1Var;
        this.f309278d = h0Var;
        this.f309279e = c0Var2;
        this.f309280f = j17;
        this.f309281g = h0Var2;
        this.f309282h = lVar;
        this.f309283i = str;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.optInt("action") == 1) {
                java.lang.Object obj = km4.l.f309297b;
                kotlin.jvm.internal.c0 c0Var = this.f309279e;
                kotlin.jvm.internal.c0 c0Var2 = this.f309275a;
                synchronized (obj) {
                    if (!c0Var.f310112d && !c0Var2.f310112d) {
                        c0Var2.f310112d = true;
                        if (jSONObject.optBoolean("ad_load_result", false)) {
                            km4.l lVar = km4.l.f309296a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f309280f;
                            if (currentTimeMillis < 0) {
                                currentTimeMillis = 0;
                            }
                            jSONObject2.put("PreRenderCost", currentTimeMillis);
                            lVar.a(2, jSONObject2.toString());
                            this.f309275a.f310112d = true;
                            km4.l.d(this.f309281g);
                            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f309276b, this.f309277c);
                        } else {
                            km4.l.f309296a.a(12, null);
                            km4.l.c(this.f309282h, this.f309279e, this.f309281g, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
                        }
                        ft.p4 p4Var = (ft.p4) this.f309278d.f310123d;
                        if (p4Var != null) {
                            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f309283i, p4Var);
                        }
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAdHelper", "openAD weAppDataCallback result = " + str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingAdHelper", e17, "parse back value failed", new java.lang.Object[0]);
            km4.l.c(this.f309282h, this.f309279e, this.f309281g, com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL);
        }
    }
}
