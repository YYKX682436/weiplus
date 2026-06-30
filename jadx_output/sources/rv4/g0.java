package rv4;

/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f400465a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400466b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400467c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400469e;

    /* renamed from: f, reason: collision with root package name */
    public final int f400470f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f400471g = jz5.h.b(rv4.f0.f400464d);

    public g0() {
        this.f400466b = "";
        this.f400467c = "{\"chatbot\":1}";
        this.f400468d = "";
        this.f400469e = 197;
        this.f400470f = 53;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o4b);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("educationTab");
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachWebConfig", "get educationTabConfig: " + d17);
        this.f400465a = d17;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d18 = su4.o2.d("aiSearch");
        jz5.f0 f0Var = null;
        d18 = d18.has("hotword") ? d18 : null;
        if (d18 != null) {
            com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachWebConfig", "get aiSearchConfig: " + d18);
            java.lang.String optString = d18.optString("hotword", string);
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f400466b = optString;
            java.lang.String optString2 = d18.optString("extParams", "{\"chatbot\":1}");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            this.f400467c = optString2;
            java.lang.String optString3 = d18.optString("navBarParams");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            this.f400468d = optString3;
            this.f400469e = d18.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 197);
            this.f400470f = d18.optInt("businessType", 0);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f400466b = string;
        }
    }
}
