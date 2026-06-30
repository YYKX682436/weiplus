package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class s extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vp2.c f121927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121928c;

    public s(in5.s0 s0Var, vp2.c cVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar) {
        this.f121926a = s0Var;
        this.f121927b = cVar;
        this.f121928c = tVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            in5.s0 s0Var = this.f121926a;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            vp2.c cVar = this.f121927b;
            java.util.LinkedList product_group = cVar.f438910d.f379363w;
            kotlin.jvm.internal.o.f(product_group, "product_group");
            java.lang.String g07 = kz5.n0.g0(product_group, "#", null, null, 0, null, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r.f121907d, 30, null);
            com.tencent.mars.xlog.Log.i(this.f121928c.f121942h, "on report product aggregation card , productIdList = ".concat(g07));
            java.lang.String string = V6.getString(1);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("topic_id", cVar.f438910d.f379355o);
            jSONObject.putOpt("product_id_list", g07);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            ((rq2.w) a17).P6("", string, "main_page_topic_card", r26.i0.t(jSONObject2, ",", ";", false));
        }
    }
}
