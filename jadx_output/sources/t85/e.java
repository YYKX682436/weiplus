package t85;

/* loaded from: classes10.dex */
public final class e extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f416459a;

    /* renamed from: d, reason: collision with root package name */
    public int f416462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f416463e;

    /* renamed from: b, reason: collision with root package name */
    public int f416460b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f416461c = -1;

    /* renamed from: f, reason: collision with root package name */
    public double[] f416464f = new double[0];

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        this.f416459a = jsonObj.optInt("len");
        this.f416460b = jsonObj.optInt("active", this.f416460b);
        this.f416461c = jsonObj.optInt("segtype", this.f416461c);
        this.f416462d = jsonObj.optInt("pendant_type", this.f416462d);
        this.f416463e = jsonObj.optBoolean("adjust", this.f416463e);
        org.json.JSONArray optJSONArray = jsonObj.optJSONArray("pos");
        this.f416464f = optJSONArray != null ? t85.b.a(optJSONArray) : this.f416464f;
        return this;
    }

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("len", this.f416459a);
        jSONObject.put("active", this.f416460b);
        if (this.f416461c >= 0 || this.f416462d == 2) {
            jSONObject.put("segtype", 0);
        }
        double[] dArr = this.f416464f;
        if (!(dArr.length == 0)) {
            jSONObject.put("pos", t85.b.b(dArr));
        }
        int i17 = this.f416462d;
        if (i17 == 1 || i17 == 2) {
            jSONObject.put("adjust", true);
        }
        return jSONObject;
    }
}
