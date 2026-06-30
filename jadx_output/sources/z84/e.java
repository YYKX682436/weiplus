package z84;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseBooleanArray f470769a = new android.util.SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f470770b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f470771c;

    public e(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        this.f470771c = cardLayoutManager;
    }

    public void a(androidx.recyclerview.widget.z2 z2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
        android.util.SparseBooleanArray sparseBooleanArray = this.f470769a;
        java.util.List<java.lang.Integer> list = this.f470770b;
        if (sparseBooleanArray == null || sparseBooleanArray.size() == 0 || list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < sparseBooleanArray.size(); i17++) {
            int keyAt = sparseBooleanArray.keyAt(i17);
            boolean z17 = sparseBooleanArray.get(keyAt);
            if (keyAt >= 0) {
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f470771c;
                if (keyAt < cardLayoutManager.f163784h && !z17) {
                    android.view.View f17 = z2Var.f(keyAt);
                    java.util.Objects.toString(f17);
                    cardLayoutManager.removeAndRecycleView(f17, z2Var);
                    linkedList.add(java.lang.Integer.valueOf(keyAt));
                }
            }
        }
        for (java.lang.Integer num : list) {
            if (num != null) {
                sparseBooleanArray.delete(num.intValue());
            }
        }
        z2Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
    }
}
