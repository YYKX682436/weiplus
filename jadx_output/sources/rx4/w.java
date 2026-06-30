package rx4;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f401313e;

    public w(rx4.e0 e0Var, android.view.ViewGroup viewGroup) {
        this.f401312d = e0Var;
        this.f401313e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.e0.X6(this.f401312d, vu4.a.f440255y, null, null, 6, null);
        rx4.e0 e0Var = this.f401312d;
        e0Var.f401139f = false;
        android.view.ViewGroup viewGroup = this.f401313e;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f485221rr0);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.rqw);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.rqx);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        rx4.e0.Y6(e0Var, false, 1, null);
        e0Var.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$bindHeaderActionListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
