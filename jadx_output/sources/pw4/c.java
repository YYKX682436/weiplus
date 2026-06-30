package pw4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f358712a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f358713b;

    /* renamed from: c, reason: collision with root package name */
    public float f358714c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f358715d;

    /* renamed from: f, reason: collision with root package name */
    public float f358717f;

    /* renamed from: i, reason: collision with root package name */
    public float f358720i;

    /* renamed from: j, reason: collision with root package name */
    public float f358721j;

    /* renamed from: k, reason: collision with root package name */
    public float f358722k;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f358724m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Float f358725n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Float f358726o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f358727p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f358728q;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Map f358730s;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f358716e = "";

    /* renamed from: g, reason: collision with root package name */
    public int f358718g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f358719h = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f358723l = "";

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f358729r = pw4.b.f358711d;

    @android.webkit.JavascriptInterface
    public final java.lang.String getEnv() {
        jz5.f0 f0Var;
        java.util.Set<java.util.Map.Entry> entrySet;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("immersiveMode", this.f358712a);
        jSONObject.put("normalTopInset", java.lang.Float.valueOf(this.f358714c));
        jSONObject.put("childView", this.f358713b);
        int i17 = this.f358718g;
        if (i17 >= 0 && this.f358719h >= 0) {
            jSONObject.put("fontLevel", i17);
            jSONObject.put("fontScale", this.f358719h);
        }
        java.lang.String str = this.f358716e;
        if (!(str == null || r26.n0.N(str))) {
            jSONObject.put("extData", this.f358716e);
        }
        float f17 = this.f358717f;
        if (f17 > 0.0f) {
            jSONObject.put("heightPercent", java.lang.Float.valueOf(f17));
        }
        jSONObject.put("isPreload", this.f358728q);
        jSONObject.put("maxHeight", java.lang.Float.valueOf(this.f358721j));
        jSONObject.put("peekHeight", java.lang.Float.valueOf(this.f358720i));
        jSONObject.put("currHeight", java.lang.Float.valueOf(this.f358722k));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f358723l)) {
            jSONObject.put("jumperExtInfo", this.f358723l);
        }
        java.lang.Integer num = this.f358724m;
        if (num != null) {
            jSONObject.put("bizSessionId", num);
        }
        if (this.f358725n != null && this.f358726o != null && this.f358727p != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("latitude", this.f358725n);
            jSONObject2.put("longitude", this.f358726o);
            jSONObject2.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, this.f358727p);
            jSONObject.put("position", jSONObject2);
        }
        jSONObject.put("enableAndroidEdge2Edge", ((java.lang.Boolean) this.f358729r.invoke()).booleanValue());
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.util.Map map = this.f358730s;
            if (map == null || (entrySet = map.entrySet()) == null) {
                f0Var = null;
            } else {
                for (java.util.Map.Entry entry : entrySet) {
                    if (((java.lang.CharSequence) entry.getKey()).length() > 0) {
                        jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                    }
                }
                f0Var = jz5.f0.f302826a;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewEnv", "getEnv ".concat(jSONObject3));
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    public final float getLayoutScale() {
        return j65.f.g() / 400;
    }
}
