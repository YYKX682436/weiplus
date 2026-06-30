package uo4;

/* loaded from: classes10.dex */
public abstract class f extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f429684a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f429685b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f429686c = new java.util.ArrayList();

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", this.f429684a);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f429685b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((java.lang.Number) it.next()).intValue());
        }
        jSONObject.put("size", jSONArray);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        java.util.Iterator it6 = this.f429686c.iterator();
        while (it6.hasNext()) {
            jSONArray2.put(((java.lang.Number) it6.next()).longValue());
        }
        jSONObject.put("time", jSONArray2);
        return jSONObject;
    }
}
