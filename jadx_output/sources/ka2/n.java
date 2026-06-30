package ka2;

/* loaded from: classes10.dex */
public final class n implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306040a;

    public n(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306040a = finderPoiNormalLbsListUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.P;
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306040a;
        return kz5.c1.k(new jz5.l("poi_search_type", java.lang.Integer.valueOf(finderPoiNormalLbsListUI.f7() ? 1 : 0)), new jz5.l("finder_post_sessionid", com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.c7(finderPoiNormalLbsListUI)), new jz5.l("has_trigger_next_page", java.lang.Integer.valueOf(finderPoiNormalLbsListUI.F ? 1 : 0)));
    }
}
