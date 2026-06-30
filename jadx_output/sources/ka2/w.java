package ka2;

/* loaded from: classes10.dex */
public final class w implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306050a;

    public w(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306050a = finderPoiNormalLbsListUI;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306050a;
        ka2.f streamType = finderPoiNormalLbsListUI.getK();
        boolean z17 = finderPoiNormalLbsListUI.f101793t;
        ka2.d dVar = finderPoiNormalLbsListUI.L;
        dVar.getClass();
        kotlin.jvm.internal.o.g(streamType, "streamType");
        boolean a17 = z17 ? dVar.f306019d.a(streamType) : dVar.f306018c.a(streamType);
        com.tencent.mars.xlog.Log.i("FinderPoiNormalLbsListUI", "checkLoadMore isSearchIng:" + finderPoiNormalLbsListUI.f101793t + " hasMore:" + a17 + " isRequest=" + finderPoiNormalLbsListUI.B);
        if (!a17 || finderPoiNormalLbsListUI.B) {
            return false;
        }
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.n7(finderPoiNormalLbsListUI, finderPoiNormalLbsListUI.f101799z, finderPoiNormalLbsListUI.f101793t, true, false, finderPoiNormalLbsListUI.g7(), 0, 40, null);
        finderPoiNormalLbsListUI.F = true;
        return true;
    }
}
