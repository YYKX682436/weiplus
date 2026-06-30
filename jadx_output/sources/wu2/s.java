package wu2;

/* loaded from: classes2.dex */
public final class s implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment f449701a;

    public s(com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment finderLbsSameCityTabFragment) {
        this.f449701a = finderLbsSameCityTabFragment;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17);
        com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment finderLbsSameCityTabFragment = this.f449701a;
        finderLbsSameCityTabFragment.getClass();
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.nfc.t.CTRL_INDEX));
        lVarArr[4] = new jz5.l("extra_info", "");
        lVarArr[5] = new jz5.l("enter_source_info", "");
        lVarArr[6] = new jz5.l("tab_enter_type", java.lang.Integer.valueOf(finderLbsSameCityTabFragment.f129270u.f449699d));
        return kz5.c1.k(lVarArr);
    }
}
