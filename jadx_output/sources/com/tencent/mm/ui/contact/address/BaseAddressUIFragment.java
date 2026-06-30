package com.tencent.mm.ui.contact.address;

/* loaded from: classes11.dex */
public abstract class BaseAddressUIFragment extends com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f206600n = 0;

    public void B() {
    }

    public void V() {
    }

    public void e0() {
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void l0(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void m0() {
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void n0() {
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void o0() {
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x0();
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void p0() {
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void q0() {
    }

    public void r() {
    }

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment
    public void r0() {
    }

    public abstract java.lang.String s0();

    @Override // com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment, com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    public final int t0() {
        int i17;
        int a17 = com.tencent.mm.ui.bl.a(getContext());
        int i18 = com.tencent.mm.ui.bl.i(getContext(), -1);
        android.view.View findViewById = getView().getRootView().findViewById(com.tencent.mm.R.id.f482435ei);
        if (!com.tencent.mm.ui.bk.Y()) {
            int i19 = android.os.Build.VERSION.SDK_INT;
            boolean isInMultiWindowMode = com.tencent.mm.ui.LauncherUI.getInstance() != null ? com.tencent.mm.ui.LauncherUI.getInstance().isInMultiWindowMode() : false;
            if (!isInMultiWindowMode) {
                android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
                if (((d17 != null ? d17.getBoolean("Main_need_read_top_margin", false) : false) || i19 >= 31) && (i17 = d17.getInt("Main_top_marign", -1)) >= 0) {
                    return a17 + i17;
                }
            }
            if (isInMultiWindowMode) {
                i18 = findViewById != null ? findViewById.getTop() : 0;
            }
            com.tencent.mars.xlog.Log.i(s0(), "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(isInMultiWindowMode));
        } else {
            if (findViewById == null) {
                return a17 + i18;
            }
            i18 = findViewById.getTop();
        }
        return a17 + i18;
    }

    public abstract void u0();

    public abstract void w0(boolean z17);

    public void x0() {
        android.view.View findViewById = getView().getRootView().findViewById(com.tencent.mm.R.id.huj);
        int a17 = com.tencent.mm.ui.bl.a(getContext());
        int i17 = com.tencent.mm.ui.bl.i(getContext(), -1);
        tf5.h hVar = new tf5.h(this, findViewById);
        if (i17 <= 0) {
            getView().post(hVar);
            return;
        }
        int t07 = t0();
        if (com.tencent.mm.ui.a4.f197117a.h(thisActivity())) {
            getView().setPadding(0, t07, 0, 0);
        } else {
            getView().setPadding(0, t07, 0, findViewById.getHeight());
        }
        com.tencent.mars.xlog.Log.i(s0(), "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
        getView().postDelayed(hVar, 100L);
    }
}
