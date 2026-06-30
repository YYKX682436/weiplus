package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class u1 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC f169002d;

    public u1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC improveObserverUIC) {
        this.f169002d = improveObserverUIC;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        xc4.p n17;
        java.lang.String userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        o75.c event = (o75.c) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(this.f169002d).O6().iterator();
        while (it.hasNext()) {
            tc4.s0 s0Var = (tc4.s0) it.next();
            if (s0Var instanceof tc4.e) {
                tc4.k2 k2Var = (tc4.k2) ((tc4.e) s0Var);
                k2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("contactChangeCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) event.f343590d;
                if (z3Var != null) {
                    zc4.b data = k2Var.getData();
                    if (((data == null || (n17 = data.n()) == null || (userName = n17.getUserName()) == null || z3Var.d1().hashCode() != userName.hashCode()) ? false : true) && z3Var.g2().hashCode() != k2Var.getNickNameText().getF131525i().hashCode()) {
                        k2Var.x("MicroMsg.Improve.Notify", "contactObserver: refresh nickname old:" + ((java.lang.Object) k2Var.getNickNameText().getF131525i()) + ", new:" + z3Var.g2());
                        k2Var.u();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("contactChangeCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
    }
}
