package ns4;

/* loaded from: classes8.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.j4 f339542d;

    public h4(ns4.j4 j4Var) {
        this.f339542d = j4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.j4 j4Var = this.f339542d;
        j4Var.f339560b.f339580c.invoke(j4Var);
        j4Var.f339561c.q();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscriptionAgreementView$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
