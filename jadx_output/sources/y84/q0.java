package y84;

/* loaded from: classes4.dex */
public final class q0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460194d;

    public q0(y84.h3 h3Var) {
        this.f460194d = h3Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        int u07;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$initRecycleView$1$1");
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        y84.h3 h3Var = this.f460194d;
        java.lang.String j17 = h3Var.j();
        try {
            u07 = parent.u0(view);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (u07 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$initRecycleView$1$1");
            return;
        }
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean z17 = u07 == 0;
        boolean z18 = u07 == itemCount + (-1);
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            i17 = h3Var.a0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardInnerMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int Z = h3Var.Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardInnerMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            i17 = Z;
        }
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            i18 = h3Var.a0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else {
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i(h3Var.j(), "itemPosition is " + u07 + ", childCount is " + itemCount + ", isFirstItem is " + z17 + ", isLastItem is " + z18 + ", cardLeftMargin is " + i17 + ", cardRightMargin is " + i18);
        outRect.left = i17;
        outRect.top = 0;
        outRect.right = i18;
        outRect.bottom = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemOffsets", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$initRecycleView$1$1");
    }
}
