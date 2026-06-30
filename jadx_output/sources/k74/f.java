package k74;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k74.h f304787d;

    public f(k74.h hVar) {
        this.f304787d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mSubmitClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer$mSubmitClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        k74.h hVar = this.f304787d;
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnSubmitBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.k kVar = hVar.f304790b;
        java.util.Map i17 = kVar != null ? ((i74.a) kVar).i("unlike_tag") : null;
        java.lang.Object obj = i17 != null ? ((android.util.ArrayMap) i17).get("unlike_tag") : null;
        ca4.j jVar = obj instanceof ca4.j ? (ca4.j) obj : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        if (jVar != null) {
            view.setTag(jVar);
        }
        boolean c17 = hVar.c();
        i74.l lVar = hVar.f304791c;
        if (lVar != null) {
            lVar.b(view, 4, java.lang.Boolean.valueOf(c17));
        }
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "onSubmitBtnClick, isFeedbackConfirm=" + c17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnSubmitBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackNewStyleDisplayer$mSubmitClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mSubmitClickListener$1");
    }
}
