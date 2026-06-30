package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class q1 {
    public q1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sns.storage.r1 a(java.util.Map map, java.lang.String str) {
        float f17;
        java.lang.Float f18;
        java.lang.Float f19;
        com.tencent.mm.plugin.sns.storage.y2 y2Var;
        java.lang.Float f27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
            return null;
        }
        if (!map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String concat = str.concat(".tagInfoList.tagInfo");
        int i17 = 0;
        while (true) {
            java.lang.String valueOf = i17 != 0 ? java.lang.String.valueOf(i17) : "";
            i17++;
            f17 = 0.0f;
            if (!map.containsKey(concat + valueOf)) {
                break;
            }
            java.lang.String str2 = concat + valueOf;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
            if (str2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
                y2Var = null;
            } else {
                java.lang.String str3 = (java.lang.String) map.get(str2.concat(".tagIcon"));
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = (java.lang.String) map.get(str2.concat(".tagText"));
                java.lang.String str5 = str4 != null ? str4 : "";
                java.lang.String str6 = (java.lang.String) map.get(str2.concat(".animationDuration"));
                y2Var = new com.tencent.mm.plugin.sns.storage.y2(str3, str5, (str6 == null || (f27 = r26.g0.f(str6)) == null) ? 0.0f : f27.floatValue());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
            }
            if (y2Var == null) {
                break;
            }
            arrayList.add(y2Var);
        }
        java.lang.String str7 = (java.lang.String) map.get(str.concat(".sectionBegin"));
        float floatValue = (str7 == null || (f19 = r26.g0.f(str7)) == null) ? 0.0f : f19.floatValue();
        java.lang.String str8 = (java.lang.String) map.get(str.concat(".sectionEnd"));
        if (str8 != null && (f18 = r26.g0.f(str8)) != null) {
            f17 = f18.floatValue();
        }
        com.tencent.mm.plugin.sns.storage.r1 r1Var = new com.tencent.mm.plugin.sns.storage.r1(arrayList, floatValue, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
        return r1Var;
    }

    public final void b(com.tencent.mm.plugin.sns.storage.r1 r1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
        kotlin.jvm.internal.o.g(r1Var, "<this>");
        for (com.tencent.mm.plugin.sns.storage.y2 y2Var : r1Var.a()) {
            if (y2Var != null) {
                java.lang.String a17 = y2Var.a();
                a84.m.d(a17 == null ? "" : a17, new com.tencent.mm.plugin.sns.storage.p1(a17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
    }
}
