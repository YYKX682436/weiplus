package ka2;

/* loaded from: classes10.dex */
public final class y implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306052d;

    public y(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306052d = finderPoiNormalLbsListUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306052d;
        if (finderPoiNormalLbsListUI.C || finderPoiNormalLbsListUI.D) {
            return false;
        }
        if (!z17) {
            if (!finderPoiNormalLbsListUI.E && !com.tencent.mm.sdk.platformtools.n2.a()) {
                finderPoiNormalLbsListUI.E = true;
                db5.e1.C(finderPoiNormalLbsListUI, finderPoiNormalLbsListUI.getString(com.tencent.mm.R.string.fs_), finderPoiNormalLbsListUI.getString(com.tencent.mm.R.string.f490573yv), finderPoiNormalLbsListUI.getString(com.tencent.mm.R.string.g6z), finderPoiNormalLbsListUI.getString(com.tencent.mm.R.string.f490347sg), false, new ka2.x(finderPoiNormalLbsListUI), null);
            }
            return true;
        }
        int i18 = (int) d18;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2003, f17, f18, i18);
        finderPoiNormalLbsListUI.D = true;
        i11.e eVar = finderPoiNormalLbsListUI.A;
        if (eVar != null) {
            ((i11.h) eVar).m(this);
        }
        com.tencent.mars.xlog.Log.i("FinderPoiNormalLbsListUI", "on get location %f %f " + java.lang.System.currentTimeMillis(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        r45.gd1 gd1Var = new r45.gd1();
        gd1Var.set(0, java.lang.Float.valueOf(f17));
        gd1Var.set(1, java.lang.Float.valueOf(f18));
        gd1Var.set(2, java.lang.Integer.valueOf(i18));
        gd1Var.set(3, "");
        gd1Var.set(4, "");
        finderPoiNormalLbsListUI.G = gd1Var;
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.n7(finderPoiNormalLbsListUI, null, false, false, false, null, 0, 63, null);
        ((ey2.k0) ((jz5.n) finderPoiNormalLbsListUI.I).getValue()).T6(f17, f18);
        return false;
    }
}
