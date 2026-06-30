package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.l1 f185599e;

    public k1(com.tencent.mm.plugin.webview.ui.tools.l1 l1Var, int i17) {
        this.f185599e = l1Var;
        this.f185598d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.e1 e1Var = this.f185599e.f185626g.f183663u;
        e1Var.f184122i = this.f185598d;
        com.tencent.mm.plugin.webview.ui.tools.d1 d1Var = e1Var.f184116c;
        if (d1Var != null) {
            d1Var.notifyDataSetChanged();
        }
        android.content.Context context = e1Var.f184115b;
        if (context != null && (view2 = e1Var.f184118e) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(e1Var.f184118e);
            }
            e1Var.f184114a = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 3);
            e1Var.a(context);
            e1Var.f184114a.t(e1Var.f184118e);
        }
        e1Var.f184114a.C();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
