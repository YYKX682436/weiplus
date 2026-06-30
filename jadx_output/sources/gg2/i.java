package gg2;

/* loaded from: classes2.dex */
public final class i extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271686b;

    public i(gg2.m mVar, int i17) {
        this.f271685a = mVar;
        this.f271686b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(view, "view");
        gg2.m mVar = this.f271685a;
        uc2.g gVar = (uc2.g) mVar.f271664a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        if (z17) {
            mVar.f271695c = c01.id.c();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = mVar.f271664a.f417148h;
            if (baseFinderFeed != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 1);
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
        ml2.u1 u1Var = ml2.u1.f328092v2;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = mVar.f271664a.f417148h;
        if (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str2 = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "toString(...)";
            str2 = "";
        } else {
            str = "toString(...)";
        }
        lVarArr[0] = new jz5.l("liveid", str2);
        lVarArr[1] = new jz5.l("exp_time", java.lang.String.valueOf(c17));
        java.lang.String str3 = mVar.f271696d;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[2] = new jz5.l("productid", str3);
        lVarArr[3] = new jz5.l("com_label_type", java.lang.String.valueOf(this.f271686b));
        v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = mVar.f271664a.f417148h;
        if (baseFinderFeed3 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("feedActionType", 89);
            jSONObject3.put("feedActionSubType", 1);
            jSONObject3.put("value", c17);
            jSONObject3.put("strValue", mVar.f271696d);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, str);
            v3Var.a(c76, baseFinderFeed3, jSONObject4);
        }
    }
}
