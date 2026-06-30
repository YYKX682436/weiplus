package op2;

/* loaded from: classes2.dex */
public final class e extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.dd2 f347240d;

    /* renamed from: e, reason: collision with root package name */
    public op2.c f347241e;

    /* renamed from: f, reason: collision with root package name */
    public op2.f f347242f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f347243g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.Fragment fragment) {
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
        op2.f fVar = this.f347242f;
        if (fVar != null) {
            fVar.f220898w.onChanged();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        r45.dd2 dd2Var;
        r45.qt2 V6;
        byte[] byteArray;
        android.os.Bundle arguments = getArguments();
        this.f347243g = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("key_by_pass")) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        android.content.Intent intent = getContext().getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("nearby_live_target_square_page_params_buffer_key") : null;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (byteArray = arguments3.getByteArray("nearby_live_square_tab_info_key")) == null) {
            dd2Var = null;
        } else {
            com.tencent.mm.protobuf.f parseFrom = new r45.dd2().parseFrom(byteArray);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            dd2Var = (r45.dd2) parseFrom;
        }
        this.f347240d = dd2Var;
        android.os.Bundle arguments4 = getArguments();
        boolean z17 = arguments4 != null ? arguments4.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments5 = getArguments();
        byte[] byteArray2 = arguments5 != null ? arguments5.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate(), tab:");
        r45.dd2 dd2Var2 = this.f347240d;
        sb6.append(dd2Var2 != null ? dd2Var2.getString(1) : null);
        sb6.append(" targetPageForceRefreshFlag:");
        sb6.append(z17);
        sb6.append(" targetTabPageLastBuffer:");
        sb6.append(byteArray2);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", "onCreate(), jump_navlive_buffer_encode:" + stringExtra);
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
        this.f347241e = new op2.c((com.tencent.mm.ui.MMActivity) activity2, fragment2, V6, this.f347240d, str2, stringExtra);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity3;
        androidx.fragment.app.Fragment fragment3 = getFragment();
        kotlin.jvm.internal.o.e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = (com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment) fragment3;
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        op2.f fVar = new op2.f(mMActivity, absNearByFragment, cVar, getRootView(), this.f347243g, this.f347240d);
        this.f347242f = fVar;
        op2.c cVar2 = this.f347241e;
        if (cVar2 != null) {
            cVar2.C(fVar, z17, byteArray2 != null ? new com.tencent.mm.protobuf.g(byteArray2, 0, byteArray2.length) : null);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.D();
        op2.c cVar2 = this.f347241e;
        if (cVar2 != null) {
            cVar2.onDetach();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.G();
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        op2.f fVar = this.f347242f;
        if (fVar != null) {
            j0Var.xj(fVar.g(), ml2.x1.f328202f, "80", ml2.y.f328241f, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0]);
        if (i17 == 79 || i17 == 153) {
            if (grantResults[0] == 0) {
                cVar.i();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "onRequestPermissionsResult return for grant.");
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.F();
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        op2.f fVar = this.f347242f;
        if (fVar != null) {
            j0Var.xj(fVar.g(), ml2.x1.f328202f, "80", ml2.y.f328240e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f327588e);
        } else {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        androidx.fragment.app.FragmentActivity activity;
        super.onUserVisibleFocused();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVisibleFocused() tab:");
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).a7(op2.d.f347239d);
        op2.c cVar = this.f347241e;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.I();
        androidx.fragment.app.Fragment fragment = getFragment();
        if (fragment == null || (activity = fragment.getActivity()) == null) {
            return;
        }
        op2.f fVar = this.f347242f;
        if (fVar == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = fVar.g();
        if (!(g17 instanceof com.tencent.mm.view.recyclerview.WxRecyclerView)) {
            g17 = null;
        }
        op2.f fVar2 = this.f347242f;
        if (fVar2 == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView g18 = fVar2.g();
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
        r45.dd2 dd2Var = this.f347240d;
        sb6.append(dd2Var != null ? dd2Var.getString(1) : null);
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f347241e;
        if (cVar != null) {
            cVar.M();
        } else {
            kotlin.jvm.internal.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
