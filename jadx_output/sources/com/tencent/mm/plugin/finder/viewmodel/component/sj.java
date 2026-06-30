package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sj implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135906b;

    public sj(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135905a = view;
        this.f135906b = blVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Context context = this.f135905a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135906b;
        in5.c Lj = ((c61.l7) b6Var).Lj(blVar.getActivity());
        long itemId = Lj != null ? Lj.getItemId() : 0L;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = java.lang.Long.valueOf(itemId) instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) java.lang.Long.valueOf(itemId) : null;
        java.lang.String w17 = baseFinderFeed != null ? baseFinderFeed.w() : null;
        android.app.Activity context2 = blVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(itemId, w17, integer);
        com.tencent.mars.xlog.Log.i("Finder.HomeActionBarUIC", "[personalCenter] refFeedId:" + pm0.v.u(itemId) + " refCommentScene:" + integer);
        return kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("behaviour_session_id", V6.getString(0)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("extra_info", V6.getString(11)), new jz5.l("enter_source_info", V6.getString(12)), new jz5.l("source_feedid", pm0.v.u(itemId)), new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(integer)), new jz5.l("source_feed_sessionbuffer", ek6));
    }
}
