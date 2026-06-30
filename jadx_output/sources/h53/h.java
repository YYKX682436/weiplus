package h53;

/* loaded from: classes8.dex */
public class h extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279048a;

    public h(h53.j jVar, java.lang.String str) {
        this.f279048a = str;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("networkType", this.f279048a);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onNetWorkChange";
    }
}
