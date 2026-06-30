package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class y {
    public static com.tencent.mm.modelbase.m1 a(java.lang.String str, com.tencent.mm.modelbase.u0 u0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        gm0.j1.d().a(30, u0Var);
        gm0.j1.d().a(ma1.a.CTRL_INDEX, u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        if (com.tencent.mm.storage.z3.m4(str)) {
            ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).getClass();
            l41.o oVar = new l41.o(str, "", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
            return oVar;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(79);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(str);
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        ((ms.a) kVar).getClass();
        com.tencent.mm.pluginsdk.model.m3 m3Var = new com.tencent.mm.pluginsdk.model.m3(1, linkedList2, linkedList, linkedList3, "", "", null, "", null);
        r45.hy6 hy6Var = new r45.hy6();
        if (i17 == 182) {
            hy6Var.f376557d = 2;
        } else {
            hy6Var.f376557d = 1;
        }
        m3Var.P(hy6Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAddBrandScene", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        return m3Var;
    }

    public static void b(com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
        gm0.j1.d().q(30, u0Var);
        gm0.j1.d().q(ma1.a.CTRL_INDEX, u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.model.AddBrandLogic");
    }
}
