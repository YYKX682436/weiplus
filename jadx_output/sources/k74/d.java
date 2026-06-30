package k74;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k74.h f304785d;

    public d(k74.h hVar) {
        this.f304785d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mComplaintLayoutClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer$mComplaintLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        k74.h hVar = this.f304785d;
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnComplaintClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.l lVar = hVar.f304791c;
        if (lVar != null) {
            lVar.b(view, 3, null);
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "onComplaintClick", null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnComplaintClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer$mComplaintLayoutClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mComplaintLayoutClickListener$1");
    }
}
