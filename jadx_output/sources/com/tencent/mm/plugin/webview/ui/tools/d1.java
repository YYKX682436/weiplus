package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class d1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.e1 f184090d;

    public d1(com.tencent.mm.plugin.webview.ui.tools.e1 e1Var) {
        this.f184090d = e1Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.webview.ui.tools.e1 e1Var = this.f184090d;
        return ((r45.h04) e1Var.f184119f.get(e1Var.f184122i)).f375713h.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.c1 c1Var = (com.tencent.mm.plugin.webview.ui.tools.c1) k3Var;
        if (i17 == getItemCount() - 1) {
            c1Var.f184025g.setVisibility(0);
        } else {
            c1Var.f184025g.setVisibility(8);
        }
        android.widget.TextView textView = c1Var.f184023e;
        com.tencent.mm.plugin.webview.ui.tools.e1 e1Var = this.f184090d;
        textView.setText(((r45.f14) ((r45.h04) e1Var.f184119f.get(e1Var.f184122i)).f375713h.get(i17)).f373927e);
        android.view.View view = c1Var.f184024f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == ((r45.yv6) e1Var.f184120g.get(e1Var.f184122i)).f391429e - 1) {
            android.view.View view2 = c1Var.f184024f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = c1Var.f184024f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataBottomSheetUI$RecycleViewAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c1Var.f184022d.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.b1(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.webview.ui.tools.c1(this, android.view.LayoutInflater.from(this.f184090d.f184115b).inflate(com.tencent.mm.R.layout.cii, viewGroup, false));
    }
}
