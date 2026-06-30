package si1;

/* loaded from: classes7.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si1.l1 f408263d;

    public h1(si1.l1 l1Var) {
        this.f408263d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        si1.l1 l1Var = this.f408263d;
        ui1.y yVar = l1Var.D;
        l1Var.E.getClass();
        ui1.y.b(yVar, 2, kz5.c0.d("scope.bluetooth"), 0, false, 12, null);
        fl1.g2 g2Var = l1Var.f263832w;
        if (g2Var != null) {
            g2Var.a(l1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/ThreeStateAuthorizePromptPresenterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
