package m31;

/* loaded from: classes9.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323168d;

    public m1(m31.p1 p1Var) {
        this.f323168d = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$showSample$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m31.p1 p1Var = this.f323168d;
        if (p1Var.F) {
            p1Var.o(false, new m31.l1(p1Var));
            p1Var.F = false;
        }
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$showSample$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
