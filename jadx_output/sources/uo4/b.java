package uo4;

/* loaded from: classes10.dex */
public class b extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f429678a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f429679b = new java.util.ArrayList();

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", this.f429678a);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f429679b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((java.lang.Number) it.next()).longValue());
        }
        jSONObject.put("time", jSONArray);
        return jSONObject;
    }
}
