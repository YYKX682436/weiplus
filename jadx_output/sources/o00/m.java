package o00;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f341868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f341869e;

    public m(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f341868d = c0Var;
        this.f341869e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showConfirmDialog$1$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f341868d.f310112d = true;
        this.f341869e.q();
        yj0.a.h(this, "com/tencent/mm/feature/ecs/gift/ui/EcsGiftSendThanksLogicUI$showConfirmDialog$1$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
