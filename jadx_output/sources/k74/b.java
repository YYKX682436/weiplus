package k74;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer f304783d;

    public b(com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer feedbackItemContainer) {
        this.f304783d = feedbackItemContainer;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String mReason;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
            return;
        }
        view.setSelected(!view.isSelected());
        int i18 = com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer.f163190s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMItemSelectChangedListener$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        k74.a aVar = this.f304783d.f163197m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMItemSelectChangedListener$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            k74.h hVar = ((k74.e) aVar).f304786a;
            boolean c17 = hVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            hVar.d(c17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            i74.l lVar = hVar.f304791c;
            if (lVar != null) {
                java.lang.Object tag = view.getTag(com.tencent.mm.R.id.n2f);
                lVar.b(view, 5, tag);
                if (tag instanceof j74.c) {
                    j74.c cVar = (j74.c) tag;
                    mReason = cVar.f298065b;
                    kotlin.jvm.internal.o.f(mReason, "mReason");
                    i17 = cVar.f298064a;
                    java.lang.String str = "onSelectChange, reason=" + mReason + ", id=" + i17;
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", str, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
                }
            }
            mReason = "";
            i17 = -1;
            java.lang.String str2 = "onSelectChange, reason=" + mReason + ", id=" + i17;
            int i192 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", str2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
    }
}
