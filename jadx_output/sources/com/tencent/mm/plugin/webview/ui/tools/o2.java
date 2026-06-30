package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class o2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f186724d;

    public o2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
        this.f186724d = sDKOAuthUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f186724d;
        com.tencent.mm.plugin.webview.ui.tools.s2 s2Var = sDKOAuthUI.f183724m;
        s2Var.f186834h = s2Var.getItem(i17).f380893d;
        sDKOAuthUI.f183724m.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
