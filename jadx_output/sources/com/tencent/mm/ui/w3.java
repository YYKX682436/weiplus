package com.tencent.mm.ui;

/* loaded from: classes2.dex */
public final class w3 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211207d;

    public w3(java.lang.String str) {
        this.f211207d = str;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/Edge2EdgeHelper$immersiveNativeNavigationBar$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        boolean z17 = false;
        if (view2 != null && view2.getId() == 16908336) {
            z17 = true;
        }
        if (z17) {
            view2.setScaleX(0.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.Edge2EdgeHelper", "change navigationBarBackground scaleX to 0 for [" + this.f211207d + ']');
        }
        yj0.a.h(this, "com/tencent/mm/ui/Edge2EdgeHelper$immersiveNativeNavigationBar$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/Edge2EdgeHelper$immersiveNativeNavigationBar$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/Edge2EdgeHelper$immersiveNativeNavigationBar$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
