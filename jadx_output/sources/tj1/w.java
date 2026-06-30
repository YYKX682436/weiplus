package tj1;

/* loaded from: classes7.dex */
public final class w extends tj1.u {

    /* renamed from: i, reason: collision with root package name */
    public tj1.i f419721i;

    @Override // tj1.u, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        super.A(e9Var, jSONObject, i17);
        if (this.f419721i != null || e9Var == null) {
            return;
        }
        tj1.i iVar = new tj1.i();
        this.f419721i = iVar;
        defpackage.u uVar = iVar.f419696a;
        if (uVar != null) {
            defpackage.ChangeTranslateLanguageEventListenerProxy.f33d.b(uVar);
        }
        tj1.h hVar = new tj1.h(e9Var);
        iVar.f419696a = hVar;
        defpackage.ChangeTranslateLanguageEventListenerProxy.f33d.a(hVar);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
        if (t37 != null) {
            t37.f74794J.add(new tj1.v(this));
        }
    }
}
