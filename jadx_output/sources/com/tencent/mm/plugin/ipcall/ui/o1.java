package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142971d;

    public o1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        this.f142971d = iPCallCountryCodeSelectUI;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142971d;
        if (i17 >= iPCallCountryCodeSelectUI.f142578d.getHeaderViewsCount()) {
            com.tencent.mm.plugin.ipcall.ui.a aVar = (com.tencent.mm.plugin.ipcall.ui.a) iPCallCountryCodeSelectUI.f142579e.getItem(i17 - iPCallCountryCodeSelectUI.f142578d.getHeaderViewsCount());
            intent.putExtra("country_name", aVar.f142741a);
            intent.putExtra("couttry_code", aVar.f142742b);
            iPCallCountryCodeSelectUI.setResult(100, intent);
        }
        iPCallCountryCodeSelectUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallCountryCodeSelectUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
