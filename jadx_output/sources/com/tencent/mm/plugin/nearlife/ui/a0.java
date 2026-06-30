package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes.dex */
public class a0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI f152313d;

    public a0(com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI) {
        this.f152313d = selectPoiCategoryUI;
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
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI selectPoiCategoryUI = this.f152313d;
        ((java.util.ArrayList) selectPoiCategoryUI.f152295g).size();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("poi_category", (java.lang.String) ((java.util.ArrayList) selectPoiCategoryUI.f152295g).get(i17));
        selectPoiCategoryUI.setResult(-1, intent);
        selectPoiCategoryUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
