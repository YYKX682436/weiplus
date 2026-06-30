package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class j3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.FilterImageView f210508d;

    public j3(com.tencent.mm.ui.tools.FilterImageView filterImageView) {
        this.f210508d = filterImageView;
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
        yj0.a.b("com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.tools.FilterImageView filterImageView = this.f210508d;
        com.tencent.mm.ui.tools.l3 l3Var = filterImageView.f210049n;
        l3Var.f210544d = i17;
        l3Var.notifyDataSetChanged();
        try {
            com.tencent.mm.ui.tools.n3 n3Var = com.tencent.mm.ui.tools.FilterImageView.f210041r[i17];
            filterImageView.f210050o = n3Var.f210599f;
            com.tencent.mm.ui.tools.FilterImageView.a(filterImageView, n3Var.f210595b, n3Var.f210596c, n3Var.f210597d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FilterView", e17, "", new java.lang.Object[0]);
        } catch (java.lang.OutOfMemoryError e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilterView", e18.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FilterView", e18, "", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
