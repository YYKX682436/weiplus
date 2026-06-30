package nd4;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView f336475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView timelineCommentView) {
        super(0);
        this.f336475d = timelineCommentView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView timelineCommentView = this.f336475d;
        com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView = new com.tencent.mm.plugin.sns.ui.SnsLikesTextView(timelineCommentView.getContext(), null);
        snsLikesTextView.setGravity(16);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        int f17 = i65.a.f(timelineCommentView.getContext(), com.tencent.mm.R.dimen.aaj);
        int f18 = i65.a.f(timelineCommentView.getContext(), com.tencent.mm.R.dimen.f479924j3);
        int f19 = i65.a.f(timelineCommentView.getContext(), com.tencent.mm.R.dimen.f479563f);
        snsLikesTextView.setPadding(f17, f19, f18, f19);
        timelineCommentView.addView(snsLikesTextView, 0, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
        return snsLikesTextView;
    }
}
