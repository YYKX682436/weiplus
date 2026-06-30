package l94;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.b0 f317401d;

    public w(l94.b0 b0Var) {
        this.f317401d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$autoScrollRunnable$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        l94.b0 b0Var = this.f317401d;
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (b0Var.f317323i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView = b0Var.f317322h;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
            if (scaleLayoutManager == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextSnapPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
                float f17 = scaleLayoutManager.f163984o;
                float f18 = scaleLayoutManager.f163985p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextSnapPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
                b0Var.o((((int) (f17 / f18)) + 1) * f18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$animateToNext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$autoScrollRunnable$1");
    }
}
