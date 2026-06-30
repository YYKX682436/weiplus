package sd;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public sd.d f406596a;

    /* renamed from: b, reason: collision with root package name */
    public od.g f406597b;

    public b(sd.c cVar) {
    }

    public void a() {
        c("", null);
    }

    public void b(java.lang.String str, java.util.Map map) {
        od.g gVar = this.f406597b;
        gVar.getClass();
        if (str == null) {
            str = "";
        }
        gVar.f344510g = str;
        org.json.JSONObject jSONObject = map != null ? new org.json.JSONObject(map) : null;
        gVar.f344511h = jSONObject;
        int i17 = gVar.f344508e;
        if (i17 == 0 && gVar.f344509f == 0) {
            return;
        }
        gVar.f344504a.a(new od.c(gVar.f344509f, i17, gVar.f344510g, jSONObject, false));
    }

    public void c(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f406597b.a(str, jSONObject);
    }

    public void d(java.util.Map map) {
        b("", map);
    }

    public void e(org.json.JSONObject jSONObject) {
        c("", jSONObject);
    }
}
