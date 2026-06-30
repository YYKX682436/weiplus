package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class c0 extends android.widget.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.e0 f153275a;

    public c0(com.tencent.mm.plugin.product.ui.e0 e0Var) {
        this.f153275a = e0Var;
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence charSequence) {
        android.widget.Filter.FilterResults filterResults = new android.widget.Filter.FilterResults();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f153275a.f153281e).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str != null && charSequence != null && str.contains(charSequence)) {
                arrayList.add(str);
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public synchronized void publishResults(java.lang.CharSequence charSequence, android.widget.Filter.FilterResults filterResults) {
        com.tencent.mm.plugin.product.ui.e0 e0Var = this.f153275a;
        e0Var.f153282f = (java.util.List) filterResults.values;
        e0Var.notifyDataSetChanged();
    }
}
