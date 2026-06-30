package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169860d;

    public w0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169860d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.storage.SnsInfo k17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f169860d.D(view);
        if (view.getTag() != null && (view.getTag() instanceof ca4.n) && (k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(((ca4.n) view.getTag()).f40001b)) != null) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            java.lang.String userName = k17.getUserName();
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct wechatWorkSnsStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct();
            wechatWorkSnsStruct.f62978f = wechatWorkSnsStruct.b("OpenimUsername", userName, true);
            wechatWorkSnsStruct.f62976d = 1L;
            wechatWorkSnsStruct.f62977e = 1L;
            wechatWorkSnsStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWechatWorkUnlike", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.plugin.sns.model.q2 q2Var = new com.tencent.mm.plugin.sns.model.q2(k17.field_snsId, 9);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(q2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$40");
    }
}
