package si1;

/* loaded from: classes7.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si1.l1 f408273d;

    public j1(si1.l1 l1Var) {
        this.f408273d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        si1.l1 l1Var = this.f408273d;
        if (!l1Var.k()) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ui1.y yVar = l1Var.D;
        java.lang.String str = ((ui1.u) l1Var.E).f428086a;
        kotlin.jvm.internal.o.d(str);
        yVar.a(1, kz5.c0.d(str), 0, l1Var.f263830u.d());
        fl1.g2 g2Var = l1Var.f263832w;
        if (g2Var != null) {
            g2Var.a(l1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
