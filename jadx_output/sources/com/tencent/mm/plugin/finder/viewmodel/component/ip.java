package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ip extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f134762b;

    public ip(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.util.List list) {
        this.f134761a = baseFinderFeed;
        this.f134762b = list;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", "image_comment_carousel exposed report");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134761a;
            hc2.v0.d(view, "image_comment_carousel", "view_exp", false, kz5.c1.k(new jz5.l("feedid", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("comment_list", kz5.n0.g0(this.f134762b, "#", null, null, 0, null, com.tencent.mm.plugin.finder.viewmodel.component.hp.f134644d, 30, null)), new jz5.l("comment_cnt", java.lang.Integer.valueOf(baseFinderFeed.getFeedObject().getCommentCount()))), null, 20, null);
        }
    }
}
