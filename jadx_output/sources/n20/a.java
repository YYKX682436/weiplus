package n20;

/* loaded from: classes9.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView f334214a;

    public a(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView) {
        this.f334214a = ecsFinderFeedHeadView;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.LinkedList linkedList;
        bw5.kf kfVar;
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView = this.f334214a;
        bw5.Cif cif = ecsFinderFeedHeadView.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String();
        boolean z17 = false;
        if (cif != null && (linkedList = cif.f28566d) != null && (kfVar = (bw5.kf) linkedList.get(0)) != null && kfVar.f29362d == 2) {
            z17 = true;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", z17 ? "video" : "img"));
        java.lang.String g07 = e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null);
        l20.o0 callback = ecsFinderFeedHeadView.getCallback();
        java.util.Map params = callback != null ? callback.getParams() : null;
        if (params == null) {
            params = kz5.q0.f314001d;
        }
        return kz5.c1.m(params, kz5.b1.e(new jz5.l("element_info", g07)));
    }
}
