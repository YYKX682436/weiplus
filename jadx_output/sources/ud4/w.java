package ud4;

/* loaded from: classes13.dex */
public class w implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426752d;

    public w(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView) {
        this.f426752d = dynamicGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426752d;
        dynamicGridView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z17 = dynamicGridView.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (!z17 && dynamicGridView.isEnabled()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            android.widget.AdapterView.OnItemClickListener onItemClickListener = dynamicGridView.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (onItemClickListener != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                android.widget.AdapterView.OnItemClickListener onItemClickListener2 = dynamicGridView.K;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                onItemClickListener2.onItemClick(adapterView, view, i17, j17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$1");
    }
}
