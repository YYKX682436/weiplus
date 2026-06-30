package i94;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i94.g f289764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289765e;

    public d(i94.g gVar, android.view.View view) {
        this.f289764d = gVar;
        this.f289765e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer$updateView$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i94.g gVar = this.f289764d;
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedbackController", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedbackController", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        gVar.f289772c.b(this.f289765e, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/feedback/WsFoldAdFeedbackDisplayer$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer$updateView$1$1");
    }
}
