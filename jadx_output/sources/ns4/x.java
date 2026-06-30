package ns4;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.c0 f339674d;

    public x(ns4.c0 c0Var) {
        this.f339674d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("WeCoinConsumePanel", "click balance button");
        ns4.c0 c0Var = this.f339674d;
        c0Var.f339463b.f339497d.invoke(c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
