package cr2;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public cr2.x f221921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.azy;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        com.tencent.mars.xlog.Log.i(xVar.f221901g, "onConfigurationChanged orientation: " + newConfig.orientation);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = xVar.f221907m;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new cr2.t(xVar, newConfig));
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        xVar.C.dead();
        kotlinx.coroutines.z0.e(xVar.f221905k, null, 1, null);
        kotlinx.coroutines.z0.e(xVar.f221906l, null, 1, null);
        java.util.ArrayList arrayList = xVar.f221911q;
        if (!arrayList.isEmpty()) {
            zo2.e eVar = xVar.f221920z;
            int i17 = eVar != null ? eVar.f474850b : 0;
            int i18 = eVar != null ? eVar.f474851c : 0;
            com.tencent.mars.xlog.Log.i(xVar.f221901g, "onDestroy position: " + i17 + " offset: " + i18);
            xq2.b bVar = xVar.f221919y;
            java.lang.String str = xVar.f221899e;
            java.lang.String str2 = xVar.f221900f;
            r45.yz2 yz2Var = xVar.f221914t;
            bVar.Q6(str, str2, i17, i18, arrayList, yz2Var != null ? yz2Var.f391522i : null, yz2Var);
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.o();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.g();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (this.f221921d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("liveThemeCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        com.tencent.mars.xlog.Log.i(xVar.f221901g, "onStop");
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUserVisibleFocused() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr2.y.onUserVisibleFocused():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        cr2.x xVar = this.f221921d;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        xVar.C.dead();
        com.tencent.mars.xlog.Log.i(xVar.f221901g, "onUserVisibleUnFocused");
        gp2.l0 l0Var = xVar.A;
        if (l0Var != null) {
            l0Var.J(false);
        }
        gp2.l0 l0Var2 = xVar.A;
        if (l0Var2 != null) {
            l0Var2.m();
        }
        gp2.l0 l0Var3 = xVar.A;
        if (l0Var3 != null) {
            c50.m0.c(l0Var3, null, 1, null);
        }
    }
}
