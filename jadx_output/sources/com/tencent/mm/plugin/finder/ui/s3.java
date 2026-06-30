package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class s3 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129791d;

    public s3(android.view.View view) {
        this.f129791d = view;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        android.view.View view2 = this.f129791d;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initEdt$3", "onFocusChange", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$initEdt$3", "onFocusChange", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
