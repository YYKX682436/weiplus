package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class p implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.OnItemClickListener f153324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.q f153325e;

    public p(android.widget.AdapterView.OnItemClickListener onItemClickListener, com.tencent.mm.plugin.product.ui.q qVar) {
        this.f153324d = onItemClickListener;
        this.f153325e = qVar;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f153324d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i17, j17);
        }
        com.tencent.mm.plugin.product.ui.q qVar = this.f153325e;
        qVar.f153333g = i17;
        qVar.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallListDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
