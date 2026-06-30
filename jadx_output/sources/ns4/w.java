package ns4;

/* loaded from: classes3.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.c0 f339669d;

    public w(ns4.c0 c0Var) {
        this.f339669d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("WeCoinConsumePanel", "click close button");
        ns4.c0 c0Var = this.f339669d;
        c0Var.f339463b.f339498e.invoke(c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
