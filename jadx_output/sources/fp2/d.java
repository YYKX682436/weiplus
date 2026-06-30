package fp2;

/* loaded from: classes2.dex */
public final class d extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.dd2 f265299d;

    /* renamed from: e, reason: collision with root package name */
    public fp2.a f265300e;

    /* renamed from: f, reason: collision with root package name */
    public fp2.b f265301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c77;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        fp2.b bVar = this.f265301f;
        if (bVar != null) {
            bVar.f220898w.onChanged();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.qt2 V6;
        r45.dd2 dd2Var = new r45.dd2();
        this.f265299d = dd2Var;
        dd2Var.set(1, "同城直播");
        r45.dd2 dd2Var2 = this.f265299d;
        if (dd2Var2 != null) {
            dd2Var2.set(0, 88889);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate(), tab:");
        r45.dd2 dd2Var3 = this.f265299d;
        sb6.append(dd2Var3 != null ? dd2Var3.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        tq2.a aVar = tq2.d.f421230a;
        tq2.d.f421230a.c("livePageOnCreate");
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment != null) {
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        } else {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        this.f265300e = new fp2.a((com.tencent.mm.ui.MMActivity) activity2, fragment2, V6, this.f265299d);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity3;
        androidx.fragment.app.Fragment fragment3 = getFragment();
        kotlin.jvm.internal.o.e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment3;
        fp2.a aVar2 = this.f265300e;
        if (aVar2 == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        fp2.b bVar = new fp2.b(mMActivity, absNearByFragment, aVar2, getRootView(), false, this.f265299d);
        this.f265301f = bVar;
        fp2.a aVar3 = this.f265300e;
        if (aVar3 != null) {
            aVar3.C(bVar, false, null);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy() tab:");
        r45.dd2 dd2Var = this.f265299d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        fp2.a aVar = this.f265300e;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        aVar.D();
        fp2.a aVar2 = this.f265300e;
        if (aVar2 != null) {
            aVar2.onDetach();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        fp2.a aVar = this.f265300e;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        aVar.G();
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        fp2.b bVar = this.f265301f;
        if (bVar != null) {
            j0Var.xj(bVar.g(), ml2.x1.f328202f, "80", ml2.y.f328241f, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        fp2.b bVar = this.f265301f;
        if (bVar != null) {
            j0Var.xj(bVar.g(), ml2.x1.f328202f, "80", ml2.y.f328240e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart() tab:");
        r45.dd2 dd2Var = this.f265299d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        fp2.a aVar = this.f265300e;
        if (aVar != null) {
            aVar.F();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop() tab:");
        r45.dd2 dd2Var = this.f265299d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        androidx.fragment.app.FragmentActivity activity;
        super.onUserVisibleFocused();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVisibleFocused() tab:");
        r45.dd2 dd2Var = this.f265299d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(fp2.c.f265298d);
        fp2.a aVar = this.f265300e;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        aVar.I();
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        fp2.b bVar = this.f265301f;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = bVar.g();
        if (!(g17 instanceof com.tencent.mm.view.recyclerview.WxRecyclerView)) {
            g17 = null;
        }
        fp2.b bVar2 = this.f265301f;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView g18 = bVar2.g();
        java.lang.Object adapter = g18 != null ? g18.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (g17 == null || wxRecyclerAdapter == null) {
            return;
        }
        ((sp2.x3) uVar.b(activity).a(sp2.x3.class)).R6(g17, wxRecyclerAdapter);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVisibleUnFocused() tab:");
        r45.dd2 dd2Var = this.f265299d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        fp2.a aVar = this.f265300e;
        if (aVar != null) {
            aVar.M();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
