package nd4;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView f336474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView timelineCommentView) {
        super(0);
        this.f336474d = timelineCommentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
        com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView timelineCommentView = this.f336474d;
        android.view.View view = new android.view.View(timelineCommentView.getContext());
        view.setBackgroundColor(i65.a.d(timelineCommentView.getContext(), com.tencent.mm.R.color.a4m));
        timelineCommentView.addView(view, 1, new android.view.ViewGroup.LayoutParams(-1, 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
        return view;
    }
}
