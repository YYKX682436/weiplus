package n74;

/* loaded from: classes4.dex */
public class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n74.c2 f335308d;

    public b2(n74.c2 c2Var) {
        this.f335308d = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/helper/TimelineTagBtnHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
        n74.c2 c2Var = this.f335308d;
        s34.b1 b1Var = c2Var.f335320f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
        if (b1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
            s34.b1 b1Var2 = c2Var.f335320f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
            if (b1Var2.f402585m) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = c2Var.f335322h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
                    com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = c2Var.f335322h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                    snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(snsInfo2);
                    snsAdLivingStreamJumpEvent.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper");
                c2Var.f335321g.k(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/helper/TimelineTagBtnHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineTagBtnHelper$1");
    }
}
