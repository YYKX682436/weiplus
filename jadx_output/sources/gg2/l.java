package gg2;

/* loaded from: classes2.dex */
public final class l extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271693a;

    public l(gg2.m mVar) {
        this.f271693a = mVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        gg2.m mVar = this.f271693a;
        uc2.g gVar = (uc2.g) mVar.f271664a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        if (z17) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = mVar.f271664a.f417148h;
            if (baseFinderFeed != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 5);
                jSONObject.put("value", 1);
                jSONObject.put("strValue", mVar.f271696d);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed, jSONObject2);
                return;
            }
            return;
        }
        long c17 = c01.id.c() - mVar.f271695c;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = mVar.f271664a.f417148h;
        if (baseFinderFeed2 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 5);
            jSONObject3.put("value", c17);
            jSONObject3.put("strValue", mVar.f271696d);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            v3Var.a(c76, baseFinderFeed2, jSONObject4);
        }
    }
}
