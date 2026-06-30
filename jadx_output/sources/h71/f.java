package h71;

/* loaded from: classes15.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279387a;

    public f(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279387a = mySafeDeviceDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        boolean b17 = fVar.b();
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f279387a;
        if (b17) {
            r45.gf3 gf3Var = (r45.gf3) fVar.f70618d;
            java.lang.String str = gf3Var.f375185d;
            if (str != null) {
                mySafeDeviceDetailUI.f73196d = str;
            }
            java.lang.String str2 = gf3Var.f375186e;
            if (str2 != null) {
                mySafeDeviceDetailUI.f73198f = str2;
            }
            java.lang.String str3 = gf3Var.f375193o;
            if (str3 != null) {
                mySafeDeviceDetailUI.f73203n = str3;
            }
            mySafeDeviceDetailUI.f73199g = gf3Var.f375189h;
            mySafeDeviceDetailUI.f73200h = gf3Var.f375187f;
            mySafeDeviceDetailUI.f73201i = gf3Var.f375188g;
            mySafeDeviceDetailUI.f73202m = gf3Var.f375191m;
            mySafeDeviceDetailUI.f73204o = gf3Var.f375190i;
            e71.k.wi().update(mySafeDeviceDetailUI.V6(), new java.lang.String[0]);
            mySafeDeviceDetailUI.X6();
            mySafeDeviceDetailUI.f73208s = false;
            ul5.k bounceView = mySafeDeviceDetailUI.getBounceView();
            if (bounceView != null) {
                bounceView.setBounceEnabled(true);
            }
            mySafeDeviceDetailUI.getListView().setVisibility(0);
            android.view.View view = mySafeDeviceDetailUI.f73207r;
            if (view == null) {
                return fVar;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "stopLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "stopLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return fVar;
        }
        mySafeDeviceDetailUI.f73208s = true;
        ul5.k bounceView2 = mySafeDeviceDetailUI.getBounceView();
        if (bounceView2 != null) {
            bounceView2.setBounceEnabled(false);
        }
        mySafeDeviceDetailUI.getListView().setVisibility(4);
        android.view.View view2 = mySafeDeviceDetailUI.f73207r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = mySafeDeviceDetailUI.f73207r;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.v_x) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = mySafeDeviceDetailUI.f73207r;
        android.view.View findViewById2 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.nht) : null;
        if (findViewById2 == null) {
            return fVar;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        android.view.View view6 = findViewById2;
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return fVar;
    }
}
