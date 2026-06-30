package rx4;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f401343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(rx4.e0 e0Var, org.json.JSONArray jSONArray, java.lang.String str) {
        super(0);
        this.f401342d = e0Var;
        this.f401343e = jSONArray;
        this.f401344f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        java.util.List list2;
        rx4.e0 e0Var = this.f401342d;
        ((java.util.ArrayList) e0Var.f401144n).clear();
        org.json.JSONArray jSONArray = this.f401343e;
        int length = jSONArray.length();
        int i17 = 0;
        while (true) {
            list = e0Var.f401144n;
            if (i17 >= length) {
                break;
            }
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            kotlin.jvm.internal.o.f(optJSONObject, "optJSONObject(...)");
            java.lang.String searchID = this.f401344f;
            kotlin.jvm.internal.o.f(searchID, "$searchID");
            ((java.util.ArrayList) list).add(new rx4.j(optJSONObject, searchID));
            i17++;
        }
        rx4.h hVar = e0Var.f401141h;
        if (hVar != null && (list2 = hVar.f401161d) != null && ((java.util.ArrayList) list2).size() > 0) {
            rx4.h hVar2 = e0Var.f401141h;
            kotlin.jvm.internal.o.d(hVar2);
            hVar2.a(list);
            pm0.v.X(new rx4.d0(e0Var, false));
        }
        return jz5.f0.f302826a;
    }
}
