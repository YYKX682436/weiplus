package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGlobalMixFavFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f129143x = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f129144t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f129145u;

    /* renamed from: v, reason: collision with root package name */
    public long f129146v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f129147w = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fav.b0(this));

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ecm;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.ui.fav.m0.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onUserVisibleFocused inFragment=" + this.f129145u);
        this.f129144t = true;
        this.f129146v = android.os.SystemClock.elapsedRealtime();
        this.f129145u = true;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                r45.qt2 V6 = nyVar.V6();
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                iy1.c cVar = iy1.c.MainUI;
                ((cy1.a) rVar).Aj(50196, "page_in", kz5.c1.k(new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_username", xy2.c.e(activity)), new jz5.l("sub_tab_type", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.ui.fav.m0) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.ui.fav.m0.class)).f129189w != 0 ? 2 : 1)), new jz5.l("comment_scene", 349)), 1, false);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onCreate inFragment=" + this.f129145u);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onDestroy");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onPause inFragment=" + this.f129145u);
        y0("onPause");
        this.f129145u = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onResume inFragment=" + this.f129145u);
        ((com.tencent.mm.plugin.finder.ui.fav.m0) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.ui.fav.m0.class)).f129190x = (yz5.l) ((jz5.n) this.f129147w).getValue();
        if (!this.f129145u && this.f129144t) {
            this.f129146v = android.os.SystemClock.elapsedRealtime();
        }
        this.f129145u = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", hashCode() + " onUserVisibleUnFocused inFragment=" + this.f129145u);
        y0("onUserVisibleUnFocused");
        this.f129145u = false;
    }

    public final void y0(java.lang.String str) {
        androidx.fragment.app.FragmentActivity activity;
        if (!this.f129145u || (activity = getActivity()) == null) {
            return;
        }
        long elapsedRealtime = this.f129146v > 0 ? android.os.SystemClock.elapsedRealtime() - this.f129146v : 0L;
        this.f129146v = 0L;
        com.tencent.mars.xlog.Log.i("Finder.GlobalMixFavFragment", str + " reportPageOut timeCost=" + elapsedRealtime);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).Aj(50196, "page_out", kz5.c1.k(new jz5.l("stay_time", java.lang.Long.valueOf(elapsedRealtime)), new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_username", xy2.c.e(activity)), new jz5.l("sub_tab_type", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.ui.fav.m0) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.ui.fav.m0.class)).f129189w == 0 ? 1 : 2)), new jz5.l("comment_scene", 349)), 1, false);
        }
    }
}
