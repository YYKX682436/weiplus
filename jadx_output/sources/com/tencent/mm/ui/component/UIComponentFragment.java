package com.tencent.mm.ui.component;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/component/UIComponentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "weui-native-android-uic_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class UIComponentFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f206296m = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f206297d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.component.UIComponent f206299f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.l1 f206300g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f206301h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f206298e = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f206302i = new java.util.LinkedList();

    private final void m0(androidx.lifecycle.l1 l1Var, androidx.lifecycle.l1 l1Var2, yz5.l lVar) {
        if (l1Var == null) {
            return;
        }
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        java.lang.Object obj2 = declaredField.get(l1Var2);
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        java.util.HashMap hashMap = (java.util.HashMap) obj2;
        for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
            if (((java.lang.Boolean) lVar.invoke(entry.getValue())).booleanValue()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public int getLayoutId() {
        com.tencent.mm.ui.component.UIComponent uIComponent = this.f206299f;
        if (uIComponent != null) {
            return uIComponent.getLayoutId();
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        androidx.lifecycle.l1 l1Var = this.f206300g;
        if (l1Var != null) {
            return l1Var;
        }
        pf5.v0 v0Var = new pf5.v0(false, 1, null);
        this.f206300g = v0Var;
        return v0Var;
    }

    public androidx.lifecycle.c1 j0(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(this).a(modelClass);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    public abstract java.util.Set l0();

    public final void n0() {
        if (mo133getLifecycle().b().compareTo(androidx.lifecycle.n.INITIALIZED) > 0) {
            androidx.lifecycle.l1 l1Var = this.f206300g;
            androidx.lifecycle.l1 viewModel = super.getViewModel();
            kotlin.jvm.internal.o.f(viewModel, "getViewModelStore(...)");
            m0(l1Var, viewModel, pf5.n0.f353926d);
        }
    }

    public void o0() {
        if (!kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f206297d != 1) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: pf5.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.ui.component.UIComponentFragment.f206296m;
                    com.tencent.mm.ui.component.UIComponentFragment this$0 = com.tencent.mm.ui.component.UIComponentFragment.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    java.lang.String str = "[onViewFocused] " + this$0.getClass().getSimpleName() + '@' + this$0.hashCode() + " focusState=" + this$0.f206297d;
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (pf5.t.f353933a != null) {
                        java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, 0);
                        kotlin.jvm.internal.o.g(obj, "obj");
                        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
                    }
                    java.util.Iterator it = this$0.f206298e.iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleFocused();
                    }
                }
            };
            if (isResumed()) {
                runnable.run();
            } else {
                java.lang.Object[] objArr = new java.lang.Object[0];
                if (pf5.t.f353933a != null) {
                    java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, 0);
                    kotlin.jvm.internal.o.g(obj, "obj");
                    com.tencent.mars.xlog.Log.w("MicroMsg.UIComponentFragment", "[onUserVisibleFocused] wait to fragment resume.", obj);
                }
                this.f206302i.add(runnable);
            }
            this.f206297d = 1;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        java.lang.String str = "[onActivityCreated] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.HashSet hashSet = this.f206298e;
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
        java.lang.String str = "[onAttach] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        java.lang.String str = "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onConfigurationChanged(newConfig);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreate] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(hashCode());
        sb6.append(" uiComponents=");
        java.util.HashSet uiComponents = this.f206298e;
        sb6.append(uiComponents);
        java.lang.String sb7 = sb6.toString();
        boolean z17 = false;
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", sb7, obj);
        }
        m0(super.getViewModel(), getViewModel(), pf5.m0.f353925d);
        kotlin.jvm.internal.o.g(uiComponents, "uiComponents");
        java.util.HashSet hashSet = new java.util.HashSet();
        q0(hashSet);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.component.UIComponent uIComponent = (com.tencent.mm.ui.component.UIComponent) j0((java.lang.Class) it.next());
            uiComponents.add(uIComponent);
            if (uIComponent.getLayoutId() != 0) {
                this.f206299f = uIComponent;
                if (z17) {
                    throw new java.lang.RuntimeException("already layout uic[" + this.f206299f + "], no more than one layout uic.");
                }
                z17 = true;
            }
        }
        java.util.Iterator it6 = uiComponents.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it6.next()).setArguments(getArguments());
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(getLayoutId(), viewGroup, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreateView] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(hashCode());
        sb6.append(" uiComponents=");
        java.util.HashSet<com.tencent.mm.ui.component.UIComponent> hashSet = this.f206298e;
        sb6.append(hashSet);
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", sb7, obj);
        }
        for (com.tencent.mm.ui.component.UIComponent uIComponent : hashSet) {
            kotlin.jvm.internal.o.d(inflate);
            uIComponent.setRootView(inflate);
        }
        this.f206301h = inflate;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onCreateBefore(bundle);
        }
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        java.util.HashSet hashSet = this.f206298e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPreDestroyed();
        }
        super.onDestroyView();
        java.lang.String str = "[onDestroyView] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
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
    public void onPause() {
        super.onPause();
        java.lang.String str = "[onPause] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onPause();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.lang.String str = "[onResume] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onResume();
        }
        java.util.LinkedList linkedList = this.f206302i;
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
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onSaveInstanceState(outState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        java.lang.String str = "[onStart] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        java.lang.String str = "[onStop] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        java.lang.String str = "[onViewCreated] " + getClass().getSimpleName() + '@' + hashCode();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f353933a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.o.g(obj, "obj");
            com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onViewCreated(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle bundle) {
        super.onViewStateRestored(bundle);
        java.util.Iterator it = this.f206298e.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.component.UIComponent) it.next()).onRestoreInstanceState(bundle);
        }
    }

    public void p0() {
        if (!kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f206297d != 2) {
            java.lang.String str = "[onViewUnFocused] " + getClass().getSimpleName() + '@' + hashCode();
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (pf5.t.f353933a != null) {
                java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.o.g(obj, "obj");
                com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", str, obj);
            }
            java.util.Iterator it = this.f206298e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.component.UIComponent) it.next()).onUserVisibleUnFocused();
            }
            this.f206297d = 2;
        }
    }

    public void q0(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        java.util.Set l07 = l0();
        if (l07 != null) {
            set.addAll(kz5.n0.Q0(l07));
        }
    }
}
