package com.tencent.mm.plugin.sns.abtest;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f162567a = new java.util.HashSet();

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinishBlockUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1
            {
                this.__eventId = -1604164515;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
                com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent2 = snsFinishBlockUserEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
                if (snsFinishBlockUserEvent2 instanceof com.tencent.mm.autogen.events.SnsFinishBlockUserEvent) {
                    am.rv rvVar = snsFinishBlockUserEvent2.f54809g;
                    boolean z17 = rvVar.f7847a;
                    long j17 = rvVar.f7848b;
                    if (j17 != 0) {
                        java.util.Set set = com.tencent.mm.plugin.sns.abtest.g.f162567a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        java.util.Set set2 = com.tencent.mm.plugin.sns.abtest.g.f162567a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        if (((java.util.HashSet) set2).contains(java.lang.Long.valueOf(j17))) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endABTestWhenFinishBlock", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endABTestWhenFinishBlock", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.SellerABTestManager$1");
                return false;
            }
        };
    }
}
