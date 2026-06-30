package k91;

/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: r, reason: collision with root package name */
    public static final k91.q f305710r = new k91.p();

    /* renamed from: s, reason: collision with root package name */
    public static final org.json.JSONObject f305711s = new org.json.JSONObject();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305712a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305713b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305714c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f305715d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f305716e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f305717f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f305718g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f305719h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f305720i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f305721j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f305722k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f305723l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f305724m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f305725n;

    /* renamed from: o, reason: collision with root package name */
    public final k91.k f305726o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f305727p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f305728q;

    public q(k91.b bVar) {
        this.f305712a = null;
        this.f305713b = null;
        this.f305714c = "default";
        this.f305715d = "#000000";
        this.f305716e = null;
        this.f305717f = false;
        this.f305718g = null;
        this.f305719h = null;
        this.f305720i = false;
        this.f305721j = false;
        this.f305722k = false;
        this.f305723l = null;
        this.f305724m = null;
        this.f305726o = new k91.k();
        this.f305727p = null;
        this.f305728q = false;
        this.f305725n = "";
    }

    public boolean a() {
        return "custom".equalsIgnoreCase(this.f305714c) || u46.l.c("skyline", this.f305725n);
    }

    public q(org.json.JSONObject jSONObject, k91.q qVar, boolean z17) {
        qVar = qVar == null ? f305710r : qVar;
        org.json.JSONObject jSONObject2 = f305711s;
        jSONObject = jSONObject == null ? jSONObject2 : jSONObject;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("window");
        optJSONObject = optJSONObject == null ? jSONObject2 : optJSONObject;
        this.f305712a = optJSONObject.optString("navigationBarTitleText", qVar.f305712a);
        this.f305713b = optJSONObject.optString("navigationBarTextStyle", qVar.f305713b);
        this.f305714c = z17 ? "custom" : optJSONObject.optString("navigationStyle", qVar.f305714c);
        this.f305715d = optJSONObject.optString("navigationBarBackgroundColor", qVar.f305715d);
        this.f305718g = optJSONObject.optString("backgroundColor", qVar.f305718g);
        this.f305719h = optJSONObject.optString("backgroundColorContent", qVar.f305719h);
        this.f305721j = optJSONObject.optBoolean("enablePullDownRefresh", qVar.f305721j);
        this.f305723l = optJSONObject.optString("backgroundTextStyle", qVar.f305723l);
        this.f305720i = optJSONObject.optBoolean("enableFullScreen", qVar.f305720i);
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("navigationBarRightButton");
        jSONObject2 = optJSONObject2 != null ? optJSONObject2 : jSONObject2;
        this.f305722k = optJSONObject.optBoolean("disableSwipeBack", qVar.f305722k);
        this.f305717f = jSONObject2.optBoolean("hide", qVar.f305717f);
        this.f305716e = jSONObject2.optString("customButtonIconData", qVar.f305716e);
        this.f305724m = optJSONObject.optString("pageOrientation", qVar.f305724m);
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("singlePage");
        optJSONObject3 = optJSONObject3 == null ? jSONObject.optJSONObject("singlePage") : optJSONObject3;
        k91.k kVar = new k91.k();
        if (optJSONObject3 != null) {
            kVar.f305652a = optJSONObject3.optString("navigationBarFit", null);
            kVar.f305653b = optJSONObject3.optString("navigationBarBackgroundColor", "");
            kVar.f305654c = optJSONObject3.optDouble("navigationBarBackgroundAlpha", -1.0d);
            kVar.f305655d = optJSONObject3.optString("navigationBarTextStyle", "");
            kVar.f305656e = optJSONObject3.optString("navigationBarTitleText", "");
        }
        this.f305726o = kVar;
        optJSONObject.optBoolean("resizable", false);
        this.f305727p = optJSONObject.optString("visualEffectInBackground", qVar.f305727p);
        this.f305725n = optJSONObject.optString("renderer", "");
        this.f305728q = optJSONObject.optBoolean("homeButton", qVar.f305728q);
    }
}
