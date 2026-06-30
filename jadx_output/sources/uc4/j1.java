package uc4;

/* loaded from: classes4.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.l1 f426423d;

    public j1(uc4.l1 l1Var) {
        this.f426423d = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        uc4.l1 l1Var = this.f426423d;
        com.tencent.mm.plugin.sns.ui.m7 n17 = l1Var.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        n17.c();
        if (view.getTag() != null && (view.getTag() instanceof ca4.n)) {
            xc4.p c17 = l1Var.c();
            if (c17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
                return;
            }
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            java.lang.String userName = c17.getUserName();
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct wechatWorkSnsStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct();
            wechatWorkSnsStruct.f62978f = wechatWorkSnsStruct.b("OpenimUsername", userName, true);
            wechatWorkSnsStruct.f62976d = 1L;
            wechatWorkSnsStruct.f62977e = 1L;
            wechatWorkSnsStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(c17.y0(), 9));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveWeTagClick$openimTagUnlikeClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openimTagUnlikeClickListener$2$1");
    }
}
