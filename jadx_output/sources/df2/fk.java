package df2;

/* loaded from: classes3.dex */
public final class fk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230148d;

    public fk(df2.pk pkVar) {
        this.f230148d = pkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f230148d.f231074n;
        if (z2Var != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
