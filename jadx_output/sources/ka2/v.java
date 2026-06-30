package ka2;

/* loaded from: classes10.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.m implements yz5.l {
    public v(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.class, "initAdapter", "initAdapter(Ljava/util/ArrayList;)Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList p07 = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = (com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI) this.receiver;
        int i17 = com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.P;
        finderPoiNormalLbsListUI.getClass();
        ka2.m mVar = new ka2.m(p07, finderPoiNormalLbsListUI, new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                switch (type) {
                    case 4:
                        return new ga2.c();
                    case 5:
                        return new ga2.d();
                    case 6:
                        return new ga2.a();
                    case 7:
                        return new ga2.h();
                    case 8:
                        return new ga2.e();
                    default:
                        return new ga2.b();
                }
            }
        });
        mVar.f293106p = new ka2.k(finderPoiNormalLbsListUI);
        mVar.f293105o = new ka2.l(finderPoiNormalLbsListUI, p07);
        return mVar;
    }
}
