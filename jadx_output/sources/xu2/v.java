package xu2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f457239a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.i33 f457240b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f457241c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f457242d;

    /* renamed from: e, reason: collision with root package name */
    public long f457243e;

    /* renamed from: f, reason: collision with root package name */
    public long f457244f;

    /* renamed from: g, reason: collision with root package name */
    public long f457245g;

    /* renamed from: h, reason: collision with root package name */
    public long f457246h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f457247i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f457248j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONArray f457249k;

    public v(com.tencent.mm.ui.MMActivity context, r45.i33 wxaAdInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wxaAdInfo, "wxaAdInfo");
        this.f457239a = context;
        this.f457240b = wxaAdInfo;
        this.f457241c = "Finder.FinderLiveAdReporter";
        this.f457247i = kz5.c0.i("dismatch", "duplicate", "quality");
        this.f457248j = "good";
        this.f457249k = new org.json.JSONArray();
    }

    public final void a() {
        this.f457242d = true;
        this.f457243e = c01.id.c();
    }

    public final void b() {
        a();
        c(2020);
    }

    public final void c(int i17) {
        java.lang.String str = this.f457241c;
        r45.i33 i33Var = this.f457240b;
        try {
            java.lang.String string = i33Var.getString(5);
            if (string == null) {
                string = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            jSONObject.put("report_type", 2);
            jSONObject.put("report_link", i33Var.getString(4));
            jSONObject.put("press_interval", 0);
            jSONObject.put("click_pos", i17);
            jSONObject.put("pos_x", 0);
            jSONObject.put("pos_y", 0);
            optJSONObject.put("exp_time", this.f457244f);
            optJSONObject.put("clk_time", c01.id.c());
            jSONObject.put("weapp_extra_data", optJSONObject.toString());
            com.tencent.mars.xlog.Log.i(str, "reportNormalAction " + i17);
            long j17 = this.f457246h;
            long j18 = this.f457245g;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            new ek2.h0(j17, j18, 1, jSONObject2).l().f(this.f457239a);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "reportNormalAction " + i17, new java.lang.Object[0]);
        }
    }
}
