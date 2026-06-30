package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public final class r7 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.NewCountryCodeUI f210670d;

    public r7(com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI) {
        this.f210670d = newCountryCodeUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$initItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.tools.NewCountryCodeUI newCountryCodeUI = this.f210670d;
        android.widget.ListView listView = newCountryCodeUI.f210113d;
        if (i17 >= (listView != null ? listView.getHeaderViewsCount() : 0)) {
            com.tencent.mm.ui.tools.m7 m7Var = newCountryCodeUI.f210114e;
            if (m7Var != null) {
                android.widget.ListView listView2 = newCountryCodeUI.f210113d;
                obj = m7Var.getItem(i17 - (listView2 != null ? listView2.getHeaderViewsCount() : 0));
            } else {
                obj = null;
            }
            u11.a aVar = obj instanceof u11.a ? (u11.a) obj : null;
            if (aVar != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("country_name", aVar.f423729c);
                intent.putExtra("couttry_code", aVar.f423728b);
                intent.putExtra("iso_code", aVar.f423727a);
                newCountryCodeUI.setResult(100, intent);
            }
            newCountryCodeUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$initItemClickListener$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
