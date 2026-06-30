package o00;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f341879d;

    public q(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f341879d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showHasThanksTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341879d.q();
        yj0.a.h(this, "com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showHasThanksTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
