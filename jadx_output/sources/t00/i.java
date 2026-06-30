package t00;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f414286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414287e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String[] strArr, c00.n3 n3Var) {
        super(1);
        this.f414286d = strArr;
        this.f414287e = n3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String[] strings = (java.lang.String[]) obj;
        kotlin.jvm.internal.o.g(strings, "strings");
        int length = strings.length;
        int length2 = this.f414286d.length;
        c00.n3 n3Var = this.f414287e;
        if (length != length2) {
            n3Var.a();
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strings) {
                jSONArray.put(str);
            }
            jSONObject.put("resultStrings", jSONArray);
            n3Var.b(jSONObject);
        }
        return jz5.f0.f302826a;
    }
}
