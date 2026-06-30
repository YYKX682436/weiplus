package com.tencent.mm.plugin.finder.nearby.live.square.page;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/page/NearbyLiveSquareTabFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyLiveSquareTabFragment extends com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment {

    /* renamed from: s, reason: collision with root package name */
    public final r45.dd2 f121519s;

    /* renamed from: t, reason: collision with root package name */
    public r45.dd2 f121520t;

    /* renamed from: u, reason: collision with root package name */
    public int f121521u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareTabFragment(r45.dd2 tabInfo, r45.dd2 dd2Var, int i17, kotlin.jvm.internal.i iVar) {
        super(com.tencent.mm.R.string.h7d, 1005);
        dd2Var = (i17 & 2) != 0 ? null : dd2Var;
        kotlin.jvm.internal.o.g(tabInfo, "tabInfo");
        this.f121519s = tabInfo;
        this.f121520t = dd2Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, op2.e.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        rq2.x.f398914a.c(this);
        ip2.a.f293612a.b(this);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar = (rq2.w) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(rq2.w.class);
            wVar.f398907i = "";
            wVar.f398908m = 0L;
            wVar.f398909n = true;
        }
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(getF121515s());
        ((m30.m) qVar).getClass();
        com.tencent.mm.pointers.PBool pBool = a52.a.f1573a;
        a52.a.f1585m = valueOf != null ? valueOf : "";
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveSquareTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.FinderLive);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "NearbyLiveSquareTabFragment");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new op2.b(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        android.os.Bundle arguments = getArguments();
        boolean z17 = true;
        if (arguments != null) {
            arguments.getInt("key_use_dark_style", 1);
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            int i17 = arguments2.getInt("key_from_comment_scene");
            if (i17 != 9500001 && i17 != 9500002 && i17 != 9500004 && i17 != 9500003) {
                z17 = false;
            }
            r45.dd2 dd2Var = this.f121519s;
            if (!z17) {
                i17 = (i17 * 100000) + dd2Var.getInteger(0);
            }
            this.f121521u = i17;
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) j0(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n = this.f121521u;
            nq2.d dVar = nq2.d.f338980a;
            nq2.d.f338985f.put(dd2Var.getInteger(0), java.lang.Integer.valueOf(this.f121521u));
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("key_click_tab_context_id")) != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) j0(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135386r = string;
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("key_click_tab_id")) == null) {
            str = "";
        }
        this.f121461q = str;
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        ((op2.e) j0(op2.e.class)).onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
        rq2.x.f398914a.d(this);
        ip2.a.f293612a.c(this);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return getActivity() != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) j0(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n : this.f121521u;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String t0() {
        return java.lang.String.valueOf(this.f121519s.getInteger(0));
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public java.lang.String w0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getF121515s());
        sb6.append('-');
        r45.dd2 dd2Var = this.f121519s;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.getInteger(0)) : "");
        return sb6.toString();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void y0() {
        op2.c cVar = ((op2.e) j0(op2.e.class)).f347241e;
        if (cVar != null) {
            cVar.B(false);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public void z0() {
        op2.c cVar = ((op2.e) j0(op2.e.class)).f347241e;
        if (cVar != null) {
            cVar.B(true);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
