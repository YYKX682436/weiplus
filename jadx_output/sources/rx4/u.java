package rx4;

/* loaded from: classes8.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401279d;

    public u(rx4.e0 e0Var) {
        this.f401279d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0 e0Var = this.f401279d;
        rx4.e0.X6(e0Var, e0Var.f401138e ? vu4.a.f440251u : vu4.a.f440250t, null, null, 6, null);
        rx4.e0 e0Var2 = this.f401279d;
        e0Var2.f401138e = !e0Var2.f401138e;
        rx4.e0.Y6(e0Var2, false, 1, null);
        e0Var2.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
