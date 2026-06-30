package h53;

/* loaded from: classes8.dex */
public class g extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279047c;

    public g(h53.j jVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f279045a = str;
        this.f279046b = str2;
        this.f279047c = str3;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f279045a);
            java.lang.String str = this.f279046b;
            if (str != null) {
                jSONObject.put("url", str);
            }
            jSONObject.put("pageId", this.f279047c);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onPageLifeChange";
    }
}
