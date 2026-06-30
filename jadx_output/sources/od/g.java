package od;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final od.f f344504a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f344505b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f344506c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f344507d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344508e;

    /* renamed from: f, reason: collision with root package name */
    public final long f344509f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f344510g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f344511h;

    public g(od.f fVar, od.i iVar, boolean z17) {
        this.f344504a = fVar;
        org.json.JSONObject jSONObject = iVar.f344497b;
        this.f344505b = jSONObject.getString(ya.b.METHOD);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        this.f344506c = optJSONObject;
        if (optJSONObject == null) {
            this.f344506c = new org.json.JSONObject("{}");
        }
        this.f344507d = z17;
        this.f344508e = jSONObject.optInt("callbackId", 0);
        this.f344509f = jSONObject.optLong("liteCallbackId", 0L);
        this.f344511h = new org.json.JSONObject();
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str == null) {
            str = "";
        }
        this.f344510g = str;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        this.f344511h = jSONObject2;
        int i17 = this.f344508e;
        if (i17 == 0 && this.f344509f == 0) {
            return;
        }
        this.f344504a.a(new od.c(this.f344509f, i17, this.f344510g, jSONObject2, false));
    }
}
