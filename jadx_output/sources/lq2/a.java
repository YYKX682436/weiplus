package lq2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f320454d;

    /* renamed from: e, reason: collision with root package name */
    public iq2.d0 f320455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f320454d = "LiveStreamTabFragmentUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.azv;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        d0Var.H.dead();
        d0Var.I.dead();
        d0Var.f293716J.dead();
        java.util.ArrayList arrayList = (java.util.ArrayList) d0Var.f293733q;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = d0Var.f293726j;
            if (finderChildRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderChildRecyclerView.removeCallbacks(runnable);
        }
        arrayList.clear();
        kotlinx.coroutines.z0.e(d0Var.f293724h, null, 1, null);
        kotlinx.coroutines.z0.e(d0Var.f293725i, null, 1, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy isManaualDestroy: ");
        sb6.append(d0Var.A);
        sb6.append(" pos: ");
        jq2.a aVar = d0Var.f293719c;
        sb6.append(aVar.f301095a);
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, sb6.toString());
        if (!(d0Var.A && aVar.f301095a == 0)) {
            d0Var.l();
        }
        gp2.l0 l0Var = d0Var.E;
        if (l0Var != null) {
            l0Var.o();
        }
        d0Var.f293742z = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        boolean isPaused = d0Var.f293717a.isPaused();
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "onPause: activityIsPause=" + isPaused);
        d0Var.k("onPause", isPaused);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "onResume: ");
        d0Var.d("onResume");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (this.f320455e != null) {
            return;
        }
        kotlin.jvm.internal.o.o("liveThemeCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        com.tencent.mars.xlog.Log.i(d0Var.f293721e, "onStop");
        d0Var.k("onStop", true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        boolean g17;
        super.onUserVisibleFocused();
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        java.lang.String str = "onUserVisibleFocused: isFirstUserVisibleFocus=" + d0Var.f293742z;
        java.lang.String str2 = d0Var.f293721e;
        com.tencent.mars.xlog.Log.i(str2, str);
        d0Var.f293741y = true;
        java.lang.System.currentTimeMillis();
        jq2.a aVar = d0Var.f293719c;
        hq2.c cVar = aVar.f301103i;
        int hashCode = cVar != null ? cVar.hashCode() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] ADD caller=");
        iq2.b0 b0Var = d0Var.L;
        sb6.append(b0Var);
        sb6.append(", tabPage.hashCode=");
        sb6.append(hashCode);
        sb6.append(", size before=");
        fq2.a aVar2 = aVar.f301101g;
        sb6.append(((java.util.ArrayList) ((gq2.j) aVar2).f274563f.f410997a).size());
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        ((java.util.ArrayList) ((gq2.j) aVar2).f274563f.f410997a).add(b0Var);
        if (d0Var.f293742z) {
            ((gp2.v0) pf5.u.f353936a.e(wo2.k.class).a(gp2.v0.class)).N6(d0Var.f293717a);
            java.util.ArrayList arrayList = d0Var.f293732p;
            if (arrayList == null || arrayList.isEmpty()) {
                int f17 = d0Var.f();
                eq2.b bVar = d0Var.C;
                int i17 = d0Var.f293720d;
                if (!(java.lang.System.currentTimeMillis() - bVar.N6(i17, f17).f255881e > ((long) bVar.f255885g)) || i17 == 88890) {
                    java.lang.Integer num = (java.lang.Integer) bVar.f255884f.get(java.lang.Integer.valueOf(i17));
                    int intValue = num == null ? 0 : num.intValue();
                    kq2.c cVar2 = d0Var.f293731o;
                    if (cVar2 != null) {
                        cVar2.f311265e = intValue;
                    }
                    g17 = d0Var.g(d0Var.f());
                    com.tencent.mars.xlog.Log.i(str2, "#onCreate loadCacheData=" + g17 + " pullType: 0");
                } else {
                    com.tencent.mars.xlog.Log.i(str2, "#onCreate cache timeout =false pullType: 0");
                    g17 = false;
                }
                if (g17) {
                    d0Var.i();
                } else {
                    com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = d0Var.f293738v;
                    if (mMProcessBar == null) {
                        kotlin.jvm.internal.o.o("loadingView");
                        throw null;
                    }
                    mMProcessBar.setVisibility(0);
                    d0Var.c(0);
                }
            }
            d0Var.f293742z = false;
        }
        d0Var.f293716J.alive();
        d0Var.H.alive();
        d0Var.I.alive();
        d0Var.d("onUserVisibleFocused");
        kotlinx.coroutines.l.d(d0Var.f293724h, null, null, new iq2.a0(d0Var, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        iq2.d0 d0Var = this.f320455e;
        if (d0Var == null) {
            kotlin.jvm.internal.o.o("liveThemeCallback");
            throw null;
        }
        d0Var.H.dead();
        d0Var.I.dead();
        d0Var.f293716J.dead();
        d0Var.f293741y = false;
        java.lang.String str = d0Var.f293721e;
        com.tencent.mars.xlog.Log.i(str, "onUserVisibleUnFocused");
        d0Var.k("onUserVisibleUnFocused", false);
        jq2.a aVar = d0Var.f293719c;
        hq2.c cVar = aVar.f301103i;
        int hashCode = cVar != null ? cVar.hashCode() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
        iq2.b0 b0Var = d0Var.L;
        sb6.append(b0Var);
        sb6.append(", tabPage.hashCode=");
        sb6.append(hashCode);
        sb6.append(", size before=");
        gq2.j jVar = (gq2.j) aVar.f301101g;
        sb6.append(((java.util.ArrayList) jVar.f274563f.f410997a).size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ((java.util.ArrayList) jVar.f274563f.f410997a).remove(b0Var);
    }
}
