package n20;

/* loaded from: classes9.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductInfoView f334226a;

    public l(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductInfoView ecsFinderFeedProductInfoView) {
        this.f334226a = ecsFinderFeedProductInfoView;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", "buy_btn"));
        java.lang.String g07 = e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null);
        l20.o0 callback = this.f334226a.getCallback();
        java.util.Map params = callback != null ? callback.getParams() : null;
        if (params == null) {
            params = kz5.q0.f314001d;
        }
        return kz5.c1.m(params, kz5.b1.e(new jz5.l("element_info", g07)));
    }
}
