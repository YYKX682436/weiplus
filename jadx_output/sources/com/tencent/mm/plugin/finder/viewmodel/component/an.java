package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class an implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f133787d;

    public an(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f133787d = mnVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        java.util.List dataListJustForAdapter;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f133787d;
            if (a07 < mnVar.S6().getSize()) {
                so2.u1 u1Var = (so2.u1) holder.f293125i;
                com.tencent.mm.plugin.finder.feed.bc bcVar = mnVar.f135183h;
                if (bcVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = bcVar.f106570t;
                so2.j5 j5Var = (baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null) ? null : (so2.j5) kz5.n0.Z(dataListJustForAdapter);
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed != null && baseFinderFeed.getItemId() == u1Var.getItemId()) {
                    com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "onGridItemClick: click same item, position = " + a07 + ", id = " + pm0.v.u(u1Var.getItemId()));
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "onGridItemClick: position = " + a07 + ", id = " + pm0.v.u(u1Var.getItemId()));
                android.app.Activity context = mnVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class)).Q6(), false, null, false, null, 14, null);
                mnVar.P6(u1Var);
                mnVar.S6().f107433d = u1Var.getFeedObject().getId();
                mnVar.S6().d(u1Var.getFeedObject().getObjectNonceId());
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                android.app.Activity context2 = mnVar.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(mnVar.f135179d));
                jSONObject.put("recommend_feedid", pm0.v.u(mnVar.f135179d));
                jSONObject.put("recommend_feed_location_id", a07);
                r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                if (flow_card_recommand_reason == null || (str = flow_card_recommand_reason.getString(0)) == null) {
                    str = "";
                }
                jSONObject.put("recommend_reason", str);
                jSONObject.put("expose_type", mnVar.f135180e);
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "more_recommend_feed", 1, jSONObject, false, null, 48, null);
                com.tencent.mm.plugin.finder.report.l0.f125109a.a(mnVar.getContext(), u1Var, 54);
            }
        }
    }
}
