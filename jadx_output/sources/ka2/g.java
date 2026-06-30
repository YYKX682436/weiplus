package ka2;

/* loaded from: classes10.dex */
public final class g implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306032a;

    public g(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306032a = finderPoiNormalLbsListUI;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.LOCAION;
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306032a;
        if (booleanValue) {
            finderPoiNormalLbsListUI.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            finderPoiNormalLbsListUI.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
