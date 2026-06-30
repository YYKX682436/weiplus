package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class t6 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.w6 f164692d;

    public t6(com.tencent.mm.plugin.sns.model.w6 w6Var) {
        this.f164692d = w6Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
        if (m1Var.getType() == 5987) {
            gm0.j1.n().f273288b.q(5987, this);
            if (((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Zi()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd: use improveUI, skip");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            r45.xf xfVar = ((com.tencent.mm.plugin.sns.model.l2) m1Var).f164380f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            com.tencent.mm.plugin.sns.model.w6 w6Var = this.f164692d;
            w6Var.f164743e = linkedList;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            if (xfVar != null) {
                java.util.LinkedList linkedList2 = xfVar.f390044d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) it.next();
                        sb6.append(snsObject.Username);
                        sb6.append(",");
                        if (!com.tencent.mm.plugin.sns.model.w6.a(w6Var).contains(snsObject.Username)) {
                            sb6.append("**,");
                            com.tencent.mm.plugin.sns.model.w6.a(w6Var).add(snsObject.Username);
                            linkedList3.add(java.lang.Long.valueOf(snsObject.Id));
                            if (com.tencent.mm.plugin.sns.model.w6.a(w6Var).size() >= 3) {
                                break;
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    wa4.w wVar = w6Var.f164742d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    if (wVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wa4.w wVar2 = w6Var.f164742d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wVar2.f444298o = linkedList3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wa4.w wVar3 = w6Var.f164742d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                        wVar3.f444297n = com.tencent.mm.plugin.sns.model.w6.a(w6Var);
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.plugin.sns.model.w6.a(w6Var))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUnreadTipManager", "onBatchObjectDetailSceneEnd getAvatar, avatar:%s, size:%s", sb6.toString(), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.w6.a(w6Var).size()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager$1");
    }
}
