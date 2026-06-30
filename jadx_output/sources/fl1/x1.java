package fl1;

/* loaded from: classes7.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.z1 f263891d;

    public x1(fl1.z1 z1Var) {
        this.f263891d = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/DialogExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.z1 z1Var = this.f263891d;
        fl1.g2 g2Var = z1Var.f263902g;
        if (g2Var != null) {
            g2Var.a(z1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/DialogExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
