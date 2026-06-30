package tc4;

/* loaded from: classes4.dex */
public final class r0 extends tc4.k2 {

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f417446x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // tc4.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.r0.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return 22;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext(), null);
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn);
        int m17 = m(18);
        appCompatTextView.setPadding(h17, m17, h17, m17);
        appCompatTextView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_9));
        appCompatTextView.setTextSize(0, i65.a.p(getContext(), com.tencent.mm.R.dimen.f479925j4));
        appCompatTextView.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.f482127b26));
        appCompatTextView.setMaxLines(1);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
        this.f417446x1 = appCompatTextView;
        jz5.l lVar = new jz5.l(appCompatTextView, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        return "FoldImproveTimelineItem";
    }

    @Override // tc4.i2
    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        getCommentContainer().setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
    }

    @Override // tc4.i2
    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
        getContentText().setVisibility(8);
        android.view.View addressStub = getAddressStub();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(addressStub, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "loadContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addressStub.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(addressStub, "com/tencent/mm/plugin/sns/ui/improve/item/FoldImproveTimelineItem", "loadContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getCommentImage().setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem");
    }
}
