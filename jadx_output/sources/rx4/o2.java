package rx4;

/* loaded from: classes.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.p2 f401245d;

    public o2(rx4.p2 p2Var) {
        this.f401245d = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUIC$onCreateAfter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f401245d.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/HalfScreenFTSActionBarUIC$onCreateAfter$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
