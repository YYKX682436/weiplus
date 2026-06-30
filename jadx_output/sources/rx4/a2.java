package rx4;

/* loaded from: classes8.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401093d;

    public a2(rx4.h2 h2Var) {
        this.f401093d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$updateTabUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.h2 h2Var = this.f401093d;
        h2Var.hideVKB();
        h2Var.y7(1, true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$updateTabUI$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
