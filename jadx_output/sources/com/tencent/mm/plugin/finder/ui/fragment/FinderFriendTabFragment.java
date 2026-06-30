package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFriendTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFriendTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public FinderFriendTabFragment() {
        super(com.tencent.mm.R.string.f6e, 1);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        java.util.HashSet d17 = kz5.p1.d(com.tencent.mm.plugin.finder.viewmodel.component.t80.class, com.tencent.mm.plugin.finder.viewmodel.component.d1.class, com.tencent.mm.plugin.finder.viewmodel.component.c70.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
        d17.add(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
        d17.add(com.tencent.mm.plugin.finder.viewmodel.component.qh.class);
        d17.add(qt2.u.class);
        d17.add(qt2.e.class);
        return d17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(18);
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFriendTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderFriendTabFragment");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ck(this, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, wu2.p.f449694a);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 18;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.t80) j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).X6(true);
    }
}
