package l74;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l74.k f316878d;

    public b(l74.k kVar) {
        this.f316878d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer$updateFeedbackView$1$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer$updateFeedbackView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l74.k kVar = this.f316878d;
        i74.l b17 = l74.k.b(kVar);
        if (b17 != null) {
            b17.b(l74.k.a(kVar), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer$updateFeedbackView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer$updateFeedbackView$1$2");
    }
}
