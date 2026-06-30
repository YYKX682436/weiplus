package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class w1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CountryCodeUI f210864d;

    public w1(com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI) {
        this.f210864d = countryCodeUI;
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
        yj0.a.b("com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI = this.f210864d;
        if (i17 >= countryCodeUI.f209985d.getHeaderViewsCount()) {
            u11.a aVar = (u11.a) countryCodeUI.f209986e.getItem(i17 - countryCodeUI.f209985d.getHeaderViewsCount());
            intent.putExtra("country_name", aVar.f423729c);
            intent.putExtra("couttry_code", aVar.f423728b);
            intent.putExtra("iso_code", aVar.f423727a);
            countryCodeUI.setResult(100, intent);
        }
        countryCodeUI.finish();
        yj0.a.h(this, "com/tencent/mm/ui/tools/CountryCodeUI$7", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
