package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f1 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.s1 f151122d;

    public f1(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var) {
        this.f151122d = s1Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = this.f151122d;
        com.tencent.mars.xlog.Log.i(s1Var.f151413d, "onChildViewAdded");
        com.tencent.mm.plugin.mv.ui.uic.s1.O6(s1Var, view2);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = this.f151122d;
        com.tencent.mars.xlog.Log.i(s1Var.f151413d, "onChildViewRemoved");
        com.tencent.mm.plugin.mv.ui.uic.s1.P6(s1Var, view2);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
