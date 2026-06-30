package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ia0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ma0 f112952a;

    public ia0(com.tencent.mm.plugin.finder.live.plugin.ma0 ma0Var) {
        this.f112952a = ma0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        dk2.ef efVar = dk2.ef.f233372a;
        if (!dk2.ef.f233384g) {
            te2.a9.g(te2.a9.f417883a, 1, null, null, null, 1, ((mm2.m6) this.f112952a.P0(mm2.m6.class)).f329248p, 14, null);
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328370p1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.e1[] e1VarArr = ml2.e1.f327373d;
        jSONObject.put("type", "1");
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }
}
