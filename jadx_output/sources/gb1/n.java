package gb1;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f269996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f269997b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f269998c;

    public n(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f269996a = lVar;
        this.f269997b = i17;
    }

    public void a(java.lang.String str) {
        android.view.View view = this.f269998c;
        if (view != null && (view instanceof gb1.l)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                ((gb1.l) this.f269998c).d(jSONObject);
                str = jSONObject.toString();
            } catch (org.json.JSONException unused) {
            }
        }
        this.f269996a.a(this.f269997b, str);
    }
}
