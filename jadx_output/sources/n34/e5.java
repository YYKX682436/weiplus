package n34;

/* loaded from: classes4.dex */
public class e5 extends com.tencent.mm.sdk.event.n {
    public e5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        com.tencent.mm.autogen.events.UpdateSnsTagListEvent updateSnsTagListEvent = (com.tencent.mm.autogen.events.UpdateSnsTagListEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        r4 = false;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UpdateSnsTagListListener", "UpdateSnsTagListEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        } else if (updateSnsTagListEvent instanceof com.tencent.mm.autogen.events.UpdateSnsTagListEvent) {
            com.tencent.mm.modelbase.m1 m1Var = updateSnsTagListEvent.f54925g.f6515a;
            if (m1Var instanceof com.tencent.mm.plugin.sns.model.d3) {
                com.tencent.mm.plugin.sns.model.d3 d3Var = (com.tencent.mm.plugin.sns.model.d3) m1Var;
                d3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                int i17 = d3Var.f164141i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                java.util.LinkedList linkedList = d3Var.f164140h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagList", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList");
                am.f00 f00Var = updateSnsTagListEvent.f54926h;
                f00Var.f6623a = i17;
                if (i17 == 2) {
                    if (linkedList != null && linkedList.size() > 0) {
                        com.tencent.mm.plugin.sns.model.l4.Lj().y0(7L);
                    }
                    if (linkedList != null) {
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            r45.ma6 ma6Var = (r45.ma6) it.next();
                            if (ma6Var.f380311d == 7) {
                                com.tencent.mm.plugin.sns.storage.q2 q2Var = new com.tencent.mm.plugin.sns.storage.q2();
                                d3Var.I(q2Var, ma6Var);
                                com.tencent.mm.plugin.sns.model.l4.Lj().d1(q2Var);
                            }
                        }
                    }
                }
                if (i17 != 1) {
                    com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(7L);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tagInfoToList", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.lang.String str = D0.field_memberList;
                    if (str != null) {
                        for (java.lang.String str2 : str.split(",")) {
                            linkedList2.add(str2);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tagInfoToList", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
                    f00Var.f6624b = linkedList2;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.UpdateSnsTagListListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.UpdateSnsTagListListener");
        return z17;
    }
}
