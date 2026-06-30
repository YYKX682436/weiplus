package com.tencent.mm.plugin.sns.abtest;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f162563a = 0;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFinishBlockUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1
            {
                this.__eventId = -1604164515;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                com.tencent.mm.autogen.events.SnsFinishBlockUserEvent snsFinishBlockUserEvent2 = snsFinishBlockUserEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                if (snsFinishBlockUserEvent2 instanceof com.tencent.mm.autogen.events.SnsFinishBlockUserEvent) {
                    am.rv rvVar = snsFinishBlockUserEvent2.f54809g;
                    boolean z17 = rvVar.f7847a;
                    if (rvVar.f7848b != 0) {
                        com.tencent.mm.plugin.sns.abtest.a.a();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$1");
                return false;
            }
        };
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2
            {
                this.__eventId = 1511451476;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent finishSendNotInterestSnsEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent finishSendNotInterestSnsEvent2 = finishSendNotInterestSnsEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                if (finishSendNotInterestSnsEvent2 instanceof com.tencent.mm.autogen.events.FinishSendNotInterestSnsEvent) {
                    am.ud udVar = finishSendNotInterestSnsEvent2.f54341g;
                    boolean z17 = udVar.f8076a;
                    if (udVar.f8077b != 0) {
                        com.tencent.mm.plugin.sns.abtest.a.a();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager$2");
                return false;
            }
        };
    }

    public static /* synthetic */ long a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        return 0L;
    }

    public static void b(android.view.ContextMenu contextMenu, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddNotInterestContextMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddNotInterestContextMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
    }

    public static void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNotInterestABTestSnsSvrId", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNotInterestABTestSnsSvrId", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
    }
}
