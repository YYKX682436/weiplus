package ud4;

/* loaded from: classes4.dex */
public abstract class a extends android.widget.BaseAdapter implements ud4.i {

    /* renamed from: d, reason: collision with root package name */
    public int f426678d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f426679e = new java.util.HashMap();

    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        java.util.HashMap hashMap = this.f426679e;
        int i17 = this.f426678d;
        this.f426678d = i17 + 1;
        hashMap.put(obj, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        if (i17 >= 0) {
            java.util.HashMap hashMap = this.f426679e;
            if (i17 < hashMap.size()) {
                long intValue = ((java.lang.Integer) hashMap.get(((ud4.b) this).getItem(i17))).intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
                return intValue;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return true;
    }
}
