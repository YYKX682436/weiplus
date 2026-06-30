package rn2;

/* loaded from: classes3.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397799d;

    public m2(rn2.t2 t2Var) {
        this.f397799d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showPrizeSourceOptionsDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f397799d.M;
        if (z2Var != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$showPrizeSourceOptionsDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
