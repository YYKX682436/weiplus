package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class c2 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.g2 f211757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f211758f;

    public c2(com.tencent.mm.ui.widget.dialog.y1 y1Var, android.view.View view, com.tencent.mm.ui.widget.dialog.g2 g2Var) {
        this.f211758f = y1Var;
        this.f211756d = view;
        this.f211757e = g2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f211756d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$4", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$4", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.dialog.g2 g2Var = this.f211757e;
        g2Var.f();
        g2Var.f211798d = null;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f211758f;
        y1Var.D.remove(g2Var);
        y1Var.C.removeView(this.f211756d);
        return jz5.f0.f302826a;
    }
}
