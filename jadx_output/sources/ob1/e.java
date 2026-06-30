package ob1;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f343999a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344000b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344001c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f344002d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f344004f;

    /* renamed from: g, reason: collision with root package name */
    public int f344005g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f344006h;

    public org.json.JSONObject a() {
        if (this.f344006h == null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            this.f344006h = jSONObject;
            jSONObject.put("uuid", this.f343999a);
            this.f344006h.put("handle", this.f344005g);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("read", this.f344000b);
            jSONObject2.put("write", this.f344001c || this.f344002d);
            jSONObject2.put("notify", this.f344003e);
            jSONObject2.put("indicate", this.f344004f);
            jSONObject2.put("writeNoResponse", this.f344002d);
            jSONObject2.put("writeDefault", this.f344001c);
            this.f344006h.put("properties", jSONObject2);
        }
        return this.f344006h;
    }
}
