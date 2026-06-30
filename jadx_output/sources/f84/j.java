package f84;

/* loaded from: classes4.dex */
public final class j extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f260193d;

    public j(f84.u uVar) {
        this.f260193d = uVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        java.lang.Integer valueOf;
        int intValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        f84.u uVar = this.f260193d;
        java.lang.String j17 = uVar.j();
        try {
            valueOf = java.lang.Integer.valueOf(parent.u0(view));
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (valueOf.intValue() == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
            return;
        }
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean z17 = valueOf.intValue() == itemCount + (-1);
        com.tencent.mars.xlog.Log.i(uVar.j(), "itemPosition is " + valueOf + ", childCount is " + itemCount + ", isLastItem is " + z17);
        if (z17) {
            intValue = 0;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            intValue = ((java.lang.Number) ((jz5.n) uVar.K).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMItemSpace", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        }
        outRect.left = 0;
        outRect.top = 0;
        outRect.right = intValue;
        outRect.bottom = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$initRecycleView$1$1");
    }
}
