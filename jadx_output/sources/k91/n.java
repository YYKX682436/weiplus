package k91;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: h, reason: collision with root package name */
    public static final k91.n f305682h = new k91.n();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305683a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305684b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305685c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f305686d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f305687e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f305688f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f305689g;

    public n() {
        this.f305689g = new java.util.ArrayList();
        this.f305683a = "";
        this.f305684b = "";
        this.f305685c = "";
        this.f305686d = "";
        this.f305687e = "";
        this.f305688f = false;
    }

    public boolean a(java.lang.String str) {
        java.util.Iterator it = this.f305689g.iterator();
        while (it.hasNext()) {
            if (((k91.o) it.next()).f305697a.equals(nf.z.a(str))) {
                return true;
            }
        }
        return false;
    }

    public n(org.json.JSONObject jSONObject, k91.n nVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f305689g = arrayList;
        nVar = nVar == null ? f305682h : nVar;
        this.f305683a = jSONObject.optString("position", nVar.f305683a);
        this.f305684b = jSONObject.optString("color", nVar.f305684b);
        this.f305685c = jSONObject.optString("selectedColor", nVar.f305685c);
        this.f305686d = jSONObject.optString("backgroundColor", nVar.f305686d);
        this.f305687e = jSONObject.optString("borderStyle", nVar.f305687e);
        this.f305688f = jSONObject.optBoolean("custom", nVar.f305688f);
        arrayList.addAll(nVar.f305689g);
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("list");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                k91.o oVar = new k91.o(jSONArray.getJSONObject(i17));
                java.util.Iterator it = this.f305689g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (android.text.TextUtils.equals(((k91.o) it.next()).f305697a, oVar.f305697a)) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f305689g.add(oVar);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAppConfig", e17.getMessage());
        }
    }
}
