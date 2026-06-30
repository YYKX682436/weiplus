package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.d1 f183920e;

    public b1(com.tencent.mm.plugin.webview.ui.tools.d1 d1Var, int i17) {
        this.f183920e = d1Var;
        this.f183919d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.d1 d1Var = this.f183920e;
        d1Var.f184090d.f184121h.setValue(java.lang.Integer.valueOf(this.f183919d));
        d1Var.notifyDataSetChanged();
        d1Var.f184090d.f184114a.B();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
