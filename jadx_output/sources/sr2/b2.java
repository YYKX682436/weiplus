package sr2;

/* loaded from: classes8.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sr2.y2 y2Var) {
        super(0);
        this.f411518d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sr2.y2 y2Var = this.f411518d;
        androidx.appcompat.app.AppCompatActivity activity = y2Var.getActivity();
        d85.f0 business = d85.f0.f227163n;
        sr2.a2 a2Var = new sr2.a2(y2Var);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(business, "business");
        java.lang.String e17 = xy2.c.e(activity);
        if (hc2.s.c(ya2.h.f460484a.b(e17))) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", get material is enable");
            a2Var.invoke(java.lang.Boolean.TRUE);
        } else {
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L8).getValue()).r()).intValue();
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, 0);
            if (r17 >= intValue) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", reach max time, closeMax:" + intValue);
                a2Var.invoke(java.lang.Boolean.FALSE);
            } else {
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.mga);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                i95.m c17 = i95.n0.c(ud0.e.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (!((java.lang.Boolean) k85.t.f305439a.h(activity, d85.g0.IMAGE_LOCATION_DATA, business, null, new la2.b(business, f0Var, a2Var, r17, e17), string).f302833d).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "[checkMaterialPoiSwitch] business:" + business + ", show dialog false");
                    a2Var.invoke(java.lang.Boolean.FALSE);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
