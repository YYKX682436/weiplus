package db5;

/* loaded from: classes8.dex */
public class w2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaperGridView f228560d;

    public w2(com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView) {
        this.f228560d = mMGridPaperGridView;
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
        yj0.a.b("com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228560d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMGridPaperGridView", "on item click, but main adapter is null");
            yj0.a.h(this, "com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            int i18 = mMGridPaperGridView.f197421g;
            v2Var.getClass();
            yj0.a.h(this, "com/tencent/mm/ui/base/MMGridPaperGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
