package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes.dex */
public class b2 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211749d;

    public b2(com.tencent.mm.ui.widget.dialog.y1 y1Var, android.view.View view) {
        this.f211749d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f211749d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$3", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$3", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
