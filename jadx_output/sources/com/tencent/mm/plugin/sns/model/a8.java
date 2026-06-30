package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class a8 {
    public a8(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sns.model.b8 a(java.lang.String str) {
        com.tencent.mm.plugin.sns.model.b8 b8Var;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("analyzeWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[analyzeWsFoldData] content = " + str);
        if (str != null) {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            try {
                b8Var = f07.size() == 6 ? new com.tencent.mm.plugin.sns.model.b8((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1)), java.lang.Long.parseLong((java.lang.String) f07.get(2)), java.lang.Integer.parseInt((java.lang.String) f07.get(3)), java.lang.Long.parseLong((java.lang.String) f07.get(4)), java.lang.Integer.parseInt((java.lang.String) f07.get(5))) : new com.tencent.mm.plugin.sns.model.b8((java.lang.String) f07.get(0), java.lang.Long.parseLong((java.lang.String) f07.get(1)), java.lang.Long.parseLong((java.lang.String) f07.get(2)), java.lang.Integer.parseInt((java.lang.String) f07.get(3)), -2L, -3);
            } catch (java.lang.Exception unused) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
                b8Var = new com.tencent.mm.plugin.sns.model.b8("", -1L, -1L, 0, -2L, -3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            b8Var = null;
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
            b8Var = new com.tencent.mm.plugin.sns.model.b8("", -1L, -1L, 0, -2L, -3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createDefaultWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        }
        kotlin.jvm.internal.o.e(b8Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.WsFoldData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("analyzeWsFoldData", "com.tencent.mm.plugin.sns.model.WsFoldData$Companion");
        return b8Var;
    }
}
