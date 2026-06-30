package ka2;

/* loaded from: classes10.dex */
public final class u implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306049a;

    public u(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306049a = finderPoiNormalLbsListUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306049a;
        r45.gd1 gd1Var = finderPoiNormalLbsListUI.G;
        lVarArr[0] = new jz5.l("poiid", gd1Var != null ? gd1Var.getString(4) : null);
        lVarArr[1] = new jz5.l("finder_post_sessionid", com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.c7(finderPoiNormalLbsListUI));
        lVarArr[2] = new jz5.l("poi_search_type", java.lang.Integer.valueOf(finderPoiNormalLbsListUI.f7() ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
