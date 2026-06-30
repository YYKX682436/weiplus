package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169865d;

    public z(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169865d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.storage.SnsInfo) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) view.getTag();
            if (snsInfo.getTypeFlag() == 21 && c01.z1.r().equals(snsInfo.getUserName())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                java.lang.String str = snsInfo.getTimeLine().Id;
                java.lang.ThreadLocal threadLocal = ha4.k.f279998a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                ha4.k.e(snsInfo, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                ha4.k.d(snsInfo);
                java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                ha4.b.a(24);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_sendid", snsInfo.getSnsId());
            intent.putExtra("key_feedid", snsInfo.getLocalid());
            intent.setClassName(com.tencent.mm.plugin.sns.ui.listener.i.e(this.f169865d), "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
            android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(this.f169865d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            e17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            java.lang.String localid = snsInfo.getLocalid();
            snsInfo.getSnsId();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(com.tencent.mm.plugin.sns.model.l4.Fj().k1(localid).field_snsId);
            if (W0 != null) {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
                if (timeLine != null) {
                    java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
                    if (linkedList.size() > 0) {
                    }
                }
                com.tencent.mm.protocal.protobuf.SnsObject e18 = com.tencent.mm.plugin.sns.model.s5.e(W0);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.LinkedList linkedList2 = e18.SnsRedEnvelops.f372275e;
                if (linkedList2 != null) {
                    for (int i17 = 0; i17 < linkedList2.size(); i17++) {
                        r45.b96 b96Var = (r45.b96) linkedList2.get(i17);
                        cb3.a aVar = new cb3.a();
                        aVar.f40343a = b96Var.f370639d;
                        aVar.f40344b = b96Var.f370640e;
                        aVar.f40345c = b96Var.f370641f;
                        arrayList3.add(aVar);
                    }
                }
                synchronized (cb3.b.class) {
                    cb3.b.f40347b = localid;
                    cb3.b.f40346a = arrayList3;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
    }
}
