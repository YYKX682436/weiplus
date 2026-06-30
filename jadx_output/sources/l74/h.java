package l74;

/* loaded from: classes4.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l74.k f316884d;

    public h(l74.k kVar) {
        this.f316884d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer$updatePersonalizedSwitchView$1$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer$updatePersonalizedSwitchView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l74.k kVar = this.f316884d;
        kVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        int i17 = kVar.f316890d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentMode", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer");
        if (i17 == 1) {
            i74.l b17 = l74.k.b(kVar);
            if (b17 != null) {
                b17.b(l74.k.a(kVar), 7, null);
            }
            kVar.c(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/ver2/FeedbackVer2Displayer$updatePersonalizedSwitchView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2Displayer$updatePersonalizedSwitchView$1$3");
    }
}
