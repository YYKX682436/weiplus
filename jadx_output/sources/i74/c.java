package i74;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.d f289460d;

    public c(i74.d dVar) {
        this.f289460d = dVar;
    }

    public void a(android.view.View view) {
        boolean z17;
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            return;
        }
        view.setSelected(!view.isSelected());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        i74.d dVar = this.f289460d;
        android.widget.TextView textView = dVar.f289477w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        if (textView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowConfirmBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            android.view.ViewGroup viewGroup = dVar.f289476v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    if (viewGroup.getChildAt(i17).isSelected()) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowConfirmBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCloseWithFeedbackBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.G = true;
                android.widget.TextView textView2 = dVar.f289477w;
                if (textView2 != null && (context = dVar.f289461d) != null) {
                    textView2.setVisibility(0);
                    dVar.f289477w.setText(context.getText(com.tencent.mm.R.string.f493182j80));
                    dVar.f289477w.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479512a56));
                    dVar.f289477w.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.b0t));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCloseWithFeedbackBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.a(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.a(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        i74.l lVar = dVar.f289480z;
        if (lVar != null) {
            lVar.b(view, 5, view.getTag(com.tencent.mm.R.id.n2f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            a(view);
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
    }
}
