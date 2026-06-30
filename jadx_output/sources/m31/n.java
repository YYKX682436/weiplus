package m31;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI f323169d;

    public n(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI) {
        this.f323169d = subscribeMsgDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI = this.f323169d;
        android.view.View inflate = android.view.LayoutInflater.from(subscribeMsgDetailUI).inflate(com.tencent.mm.R.layout.cng, (android.view.ViewGroup) null);
        ((android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cg7)).addView(o31.i.f342675a.a(subscribeMsgDetailUI, subscribeMsgDetailUI.f71859e.f71806i, 0));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m9l);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bzv);
        textView.setText(subscribeMsgDetailUI.f71859e.f71802e);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(subscribeMsgDetailUI);
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        findViewById.setOnClickListener(new m31.m(this, z2Var));
        findViewById.setContentDescription(subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.f490356so));
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
