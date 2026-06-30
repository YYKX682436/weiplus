package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210729e;

    public s7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI, android.view.View view) {
        this.f210728d = newCountryCodeUI;
        this.f210729e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.ListView listView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$initListView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210728d;
        android.widget.ListView listView2 = newCountryCodeUI.f210113d;
        if (listView2 != null) {
            listView2.removeHeaderView(this.f210729e);
        }
        if (!newCountryCodeUI.A) {
            android.view.View view2 = newCountryCodeUI.B;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            newCountryCodeUI.A = true;
            android.view.ViewGroup viewGroup = newCountryCodeUI.f210127u;
            android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f482442ep) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.ViewGroup viewGroup2 = newCountryCodeUI.f210127u;
            android.view.View findViewById = viewGroup2 != null ? viewGroup2.findViewById(com.tencent.mm.R.id.f483758bz2) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.tools.k7 k7Var = newCountryCodeUI.f210132z;
            if (k7Var != null) {
                k7Var.setVisibility(0);
            }
            com.tencent.mm.ui.tools.k7 k7Var2 = newCountryCodeUI.f210132z;
            if (k7Var2 != null) {
                k7Var2.c(java.lang.Boolean.TRUE);
            }
            android.view.View view4 = newCountryCodeUI.f210128v;
            if (view4 != null && (listView = newCountryCodeUI.f210113d) != null) {
                listView.removeHeaderView(view4);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$initListView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
