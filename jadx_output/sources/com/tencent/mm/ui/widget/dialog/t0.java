package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes2.dex */
public class t0 implements db5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211975a;

    public t0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f211975a = k0Var;
    }

    @Override // db5.i
    public void a(android.widget.ScrollView scrollView, int i17, int i18, int i19, int i27) {
        int measuredHeight = scrollView.getChildAt(0).getMeasuredHeight() - (scrollView.getHeight() + scrollView.getScrollY());
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211975a;
        if (measuredHeight < 50) {
            android.view.View view = k0Var.Z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = k0Var.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$2", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
