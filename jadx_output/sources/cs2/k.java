package cs2;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent implements cw2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public cs2.j f222076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final java.lang.String O6() {
        if (isBelongFragment()) {
            androidx.fragment.app.Fragment fragment = getFragment();
            r45.qt2 V6 = fragment != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6() : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("comment:");
            sb6.append(V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            sb6.append(" tabType:");
            androidx.fragment.app.Fragment fragment2 = getFragment();
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment2 instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment2 : null;
            sb6.append(finderHomeTabFragment != null ? java.lang.Integer.valueOf(finderHomeTabFragment.f129265p) : null);
            sb6.append(" contextId:");
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            sb6.append(nyVar != null ? nyVar.V6().getString(1) : null);
            sb6.append(" fragment:");
            sb6.append(getFragment());
            return sb6.toString();
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comment:");
        sb7.append(V62.getInteger(5));
        sb7.append(" contextId:");
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        sb7.append(nyVar2 != null ? nyVar2.V6().getString(1) : null);
        sb7.append(" activity:");
        sb7.append(getActivity());
        sb7.append(" this:");
        sb7.append(this);
        return sb7.toString();
    }

    public final boolean P6() {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.o mo133getLifecycle2;
        androidx.lifecycle.n nVar = null;
        if (!isBelongFragment()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                activity = null;
            }
            if (activity != null && (mo133getLifecycle = activity.mo133getLifecycle()) != null) {
                nVar = mo133getLifecycle.b();
            }
            if (nVar == androidx.lifecycle.n.RESUMED) {
                return true;
            }
        } else if (getIsUserVisibleFocused()) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            if (!(activity2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                activity2 = null;
            }
            if (activity2 != null && (mo133getLifecycle2 = activity2.mo133getLifecycle()) != null) {
                nVar = mo133getLifecycle2.b();
            }
            if (nVar == androidx.lifecycle.n.RESUMED) {
                return true;
            }
        }
        return false;
    }

    public final void Q6() {
        cs2.j jVar;
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onGridFeedPreloadComplete " + P6() + ' ' + O6());
        if (!P6() || (jVar = this.f222076d) == null) {
            return;
        }
        jVar.P("#onGridFeedPreloadComplete");
    }

    public final void R6() {
        cs2.j jVar;
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onGridFeedPreloadStart " + P6() + ' ' + O6());
        if (!P6() || (jVar = this.f222076d) == null) {
            return;
        }
        jVar.p0("#onGridFeedPreloadStart");
    }

    public void S6(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataList, int i17, int i18, fc2.c cVar) {
        vr2.e eVar;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "setup commentScene:" + i17 + " tabType:" + i18);
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f1if).getValue()).r()).booleanValue()) {
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                eVar = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133579s;
                es2.g gVar = new es2.g(i17, this, eVar, getActivity());
                this.f222076d = gVar;
                gVar.P0(dataList, i17, i18, cVar);
            }
        }
        eVar = null;
        es2.g gVar2 = new es2.g(i17, this, eVar, getActivity());
        this.f222076d = gVar2;
        gVar2.P0(dataList, i17, i18, cVar);
    }

    @Override // cw2.w9
    public boolean V0() {
        cs2.k kVar;
        android.app.Activity context = getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity == null) {
            kVar = null;
        } else if (appCompatActivity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
            kotlin.jvm.internal.o.g(fragment, "fragment");
            kVar = (cs2.k) zVar.b(fragment).a(cs2.k.class);
        } else {
            kVar = (cs2.k) pf5.z.f353948a.a(appCompatActivity).a(cs2.k.class);
        }
        java.lang.Object obj = kVar != null ? kVar.f222076d : null;
        es2.g gVar = obj instanceof es2.g ? (es2.g) obj : null;
        return gVar != null && gVar.f256358v;
    }

    @Override // cw2.w9
    public cs2.j d1() {
        return this.f222076d;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onDestroy " + O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onStart " + O6());
        cs2.j jVar = this.f222076d;
        if (jVar != null) {
            jVar.P("#onStart");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onStop " + O6());
        cs2.j jVar = this.f222076d;
        if (jVar != null) {
            jVar.p0("#onStop");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onUserVisibleFocused " + O6());
        cs2.j jVar = this.f222076d;
        if (jVar != null) {
            jVar.P("#onUserVisibleFocused");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadCore", "onUserVisibleUnFocused " + O6());
        cs2.j jVar = this.f222076d;
        if (jVar != null) {
            jVar.p0("#onUserVisibleUnFocused");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
