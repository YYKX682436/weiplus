package m31;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f323165d;

    public m(m31.n nVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f323165d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f323165d.B();
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
