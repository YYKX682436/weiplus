package com.tencent.mm.ui.vas.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class VASBaseFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: e, reason: collision with root package name */
    public int f211133e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.component.UIComponent f211135g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.l1 f211136h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f211137i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f211138m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211132d = "MicroMsg.VAS.VASBaseFragment@" + hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f211134f = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f211139n = new java.util.LinkedList();

    public void c(int i17, int i18) {
        getF211132d();
    }

    public int getLayoutId() {
        com.tencent.mm.ui.component.UIComponent uIComponent = this.f211135g;
        if (uIComponent != null) {
            return uIComponent.getLayoutId();
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        androidx.lifecycle.l1 l1Var = this.f211136h;
        if (l1Var != null) {
            return l1Var;
        }
        pf5.v0 v0Var = new pf5.v0(false, 1, null);
        this.f211136h = v0Var;
        return v0Var;
    }

    public androidx.lifecycle.c1 j0(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(this).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    /* renamed from: l0, reason: from getter */
    public java.lang.String getF211132d() {
        return this.f211132d;
    }

    public abstract java.util.Set m0();

    public void n0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        java.util.Set m07 = m0();
        if (m07 != null) {
            set.addAll(kz5.n0.Q0(m07));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onActivityCreated] " + getClass().getSimpleName() + '@' + hashCode());
        if (this.f211138m) {
            return;
        }
        this.f211138m = true;
        java.util.HashSet hashSet = this.f211134f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onCreate(bundle);
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it6.next()).onCreateAfter(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAttach(context);
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onAttach] " + getClass().getSimpleName() + '@' + hashCode());
        androidx.lifecycle.l1 viewModel = super.getViewModel();
        androidx.lifecycle.l1 viewModel2 = getViewModel();
        if (viewModel != null) {
            java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(viewModel);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            java.lang.Object obj2 = declaredField.get(viewModel2);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            java.util.HashMap hashMap = (java.util.HashMap) obj2;
            for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
                java.lang.Object it = entry.getValue();
                kotlin.jvm.internal.o.g(it, "it");
                if (java.lang.Boolean.TRUE.booleanValue()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        java.util.HashSet uiComponents = this.f211134f;
        kotlin.jvm.internal.o.g(uiComponents, "uiComponents");
        java.util.HashSet hashSet = new java.util.HashSet();
        n0(hashSet);
        java.util.Iterator it6 = hashSet.iterator();
        boolean z17 = false;
        while (it6.hasNext()) {
            com.tencent.mm.ui.component.UIComponent uIComponent = (com.tencent.mm.ui.component.UIComponent) j0((java.lang.Class) it6.next());
            uiComponents.add(uIComponent);
            if (uIComponent.getLayoutId() != 0) {
                this.f211135g = uIComponent;
                if (z17) {
                    throw new java.lang.RuntimeException("already layout uic[" + this.f211135g + "], no more than one layout uic.");
                }
                z17 = true;
            }
        }
        java.util.Iterator it7 = uiComponents.iterator();
        while (it7.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it7.next()).setArguments(getArguments());
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(getLayoutId(), viewGroup, false);
        java.lang.String f211132d = getF211132d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreateView] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(hashCode());
        sb6.append(" uiComponents=");
        java.util.HashSet<com.tencent.mm.ui.component.UIComponent> hashSet = this.f211134f;
        sb6.append(hashSet);
        com.tencent.mars.xlog.Log.i(f211132d, sb6.toString());
        for (com.tencent.mm.ui.component.UIComponent uIComponent : hashSet) {
            kotlin.jvm.internal.o.d(inflate);
            uIComponent.setRootView(inflate);
        }
        this.f211137i = inflate;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onCreateBefore(bundle);
        }
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.f211137i == null) {
            getF211132d();
            hashCode();
            super.onDestroy();
            return;
        }
        java.util.HashSet hashSet = this.f211134f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPreDestroyed();
        }
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onDestroy] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it6.next()).onDestroy();
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it7.next()).onPostDestroyed();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onPause] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPause();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onResume] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onResume();
        }
        java.util.LinkedList linkedList = this.f211139n;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((java.lang.Runnable) it6.next()).run();
        }
        linkedList.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onSaveInstanceState(outState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onStart] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onStop] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mars.xlog.Log.i(getF211132d(), "[onViewCreated] " + getClass().getSimpleName() + '@' + hashCode());
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onViewCreated(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle bundle) {
        super.onViewStateRestored(bundle);
        java.util.Iterator it = this.f211134f.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onRestoreInstanceState(bundle);
        }
    }
}
