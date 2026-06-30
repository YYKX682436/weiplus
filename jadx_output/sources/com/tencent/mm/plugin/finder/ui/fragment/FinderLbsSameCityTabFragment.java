package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLbsSameCityTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/view/ka;", "<init>", "()V", "wu2/q", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsSameCityTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.view.ka {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f129269t;

    /* renamed from: u, reason: collision with root package name */
    public wu2.q f129270u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.k0 f129271v;

    public FinderLbsSameCityTabFragment() {
        super(com.tencent.mm.R.string.o2k, 35);
        this.f129269t = "FinderLbsSameCityTabFragment";
        this.f129270u = wu2.q.f449695e;
        this.f129271v = new wu2.r(this);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.t80.class, com.tencent.mm.plugin.finder.viewmodel.component.d1.class, com.tencent.mm.plugin.finder.viewmodel.component.nn.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.nfc.t.CTRL_INDEX);
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
        com.tencent.mm.plugin.finder.viewmodel.component.nn y07 = y0();
        if (y07 != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128028xg).getValue()).r()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "didn't open refresh switch, return");
                return;
            }
            if (y07.f135338d.getValue() != null) {
                com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "had refresh before! return");
                return;
            }
            bs2.a0 O6 = y07.O6();
            if ((O6 == null || O6.E) ? false : true) {
                com.tencent.mars.xlog.Log.i("FinderLbsSameCityTabUIC", "preload had not finished, return");
                return;
            }
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((ey2.k0) a17).R6(false, y07);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        androidx.lifecycle.j0 j0Var;
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(this, iy1.c.FinderLbsSameCityFragment);
        aVar.Rj(this, iy1.a.Finder);
        aVar.dk(this, "FinderLbsSameCityTabFragment");
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
        aVar.Tj(this, 12, 1, false);
        aVar.Ai(this, new wu2.s(this));
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.add(this);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.nn y07 = y0();
        if (y07 == null || (j0Var = y07.f135338d) == null) {
            return;
        }
        j0Var.observe(this, this.f129271v);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        androidx.lifecycle.j0 j0Var;
        super.onDestroy();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.remove(this);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.nn y07 = y0();
        if (y07 == null || (j0Var = y07.f135338d) == null) {
            return;
        }
        j0Var.removeObserver(this.f129271v);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
        if (this.f129270u != wu2.q.f449696f) {
            this.f129270u = wu2.q.f449697g;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f129270u = wu2.q.f449695e;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        this.f129270u = wu2.q.f449695e;
        com.tencent.mars.xlog.Log.i(this.f129269t, "onUserVisibleUnFocused");
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return com.tencent.mm.plugin.appbrand.jsapi.nfc.t.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        ((com.tencent.mm.plugin.finder.viewmodel.component.t80) j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).X6(true);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void t0() {
        this.f129270u = wu2.q.f449696f;
        com.tencent.mars.xlog.Log.i(this.f129269t, "onActionbarTouch");
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.nn y0() {
        if (getActivity() == null) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.nn) j0(com.tencent.mm.plugin.finder.viewmodel.component.nn.class);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
