package fj1;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f263142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fj1.y yVar) {
        super(0);
        this.f263142d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj1.y yVar = this.f263142d;
        java.lang.Object value = ((jz5.n) yVar.f263154n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        org.json.JSONObject jSONObject = ((k91.r) value).f305738e;
        org.json.JSONObject a17 = jSONObject != null ? cf.f.a(jSONObject) : new org.json.JSONObject();
        com.tencent.mm.plugin.appbrand.page.u5 u5Var = yVar.f263153m;
        if (u5Var == null) {
            kotlin.jvm.internal.o.o("scriptInjectConfig");
            throw null;
        }
        a17.put("isLazyLoad", u5Var.a());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String str = yVar.f263146f;
        if (str == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        jSONObject2.put("appId", str);
        jSONObject2.put("nickname", yVar.e().f305841d);
        jSONObject2.put("icon", yVar.e().f305843f);
        a17.put("accountInfo", jSONObject2);
        return a17;
    }
}
