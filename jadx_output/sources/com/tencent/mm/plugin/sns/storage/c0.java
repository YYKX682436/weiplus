package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class c0 {
    public c0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.sns.storage.d0 a(java.util.Map map, java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.storage.s1 s1Var;
        com.tencent.mm.plugin.sns.storage.o1 o1Var;
        java.lang.Float f17;
        java.lang.Float f18;
        java.lang.Float f19;
        java.lang.Float f27;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
        com.tencent.mm.plugin.sns.storage.a1 a1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".mediaType"));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String concat = str.concat(".alphaVideoInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
        if (concat == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
            obj = "";
        } else {
            com.tencent.mm.plugin.sns.storage.k1 k1Var = com.tencent.mm.plugin.sns.storage.k1.f166036a;
            r45.jj4 a17 = k1Var.a(concat.concat(".media"), map);
            r45.jj4 a18 = k1Var.a(concat.concat(".oneToOneHighMedia"), map);
            r45.jj4 a19 = k1Var.a(concat.concat(".oneToOneLowMedia"), map);
            java.lang.String concat2 = concat.concat(".playModeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
            if (concat2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                o1Var = null;
                obj = "";
            } else {
                java.lang.String str3 = (java.lang.String) map.get(concat2.concat(".playMode"));
                int intValue = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
                java.lang.String str4 = (java.lang.String) map.get(concat2.concat(".startOffset"));
                float f28 = 0.0f;
                float floatValue = (str4 == null || (f27 = r26.g0.f(str4)) == null) ? 0.0f : f27.floatValue();
                java.lang.String str5 = (java.lang.String) map.get(concat2.concat(".loopStartTime"));
                float floatValue2 = (str5 == null || (f19 = r26.g0.f(str5)) == null) ? 0.0f : f19.floatValue();
                java.lang.String str6 = (java.lang.String) map.get(concat2.concat(".loopEndTime"));
                float floatValue3 = (str6 == null || (f18 = r26.g0.f(str6)) == null) ? 0.0f : f18.floatValue();
                if (intValue == 1) {
                    java.lang.String concat3 = concat2.concat(".playStateInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                    if (concat3 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                    } else {
                        java.lang.String str7 = (java.lang.String) map.get(concat3.concat(".breakHideDuration"));
                        if (str7 != null && (f17 = r26.g0.f(str7)) != null) {
                            f28 = f17.floatValue();
                        }
                        float f29 = f28;
                        com.tencent.mm.plugin.sns.storage.q1 q1Var = com.tencent.mm.plugin.sns.storage.r1.f166117d;
                        obj = "";
                        com.tencent.mm.plugin.sns.storage.r1 a27 = q1Var.a(map, concat3.concat(".breakState"));
                        if (a27 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                        } else {
                            com.tencent.mm.plugin.sns.storage.r1 a28 = q1Var.a(map, concat3.concat(".stopState"));
                            if (a28 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                            } else {
                                com.tencent.mm.plugin.sns.storage.r1 a29 = q1Var.a(map, concat3.concat(".likeState"));
                                if (a29 == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                } else {
                                    com.tencent.mm.plugin.sns.storage.r1 a37 = q1Var.a(map, concat3.concat(".commentState"));
                                    if (a37 == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                    } else {
                                        com.tencent.mm.plugin.sns.storage.s1 s1Var2 = new com.tencent.mm.plugin.sns.storage.s1(f29, a27, a28, a29, a37, q1Var.a(map, concat3.concat(".cancelLikeState")));
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                        s1Var = s1Var2;
                                        o1Var = new com.tencent.mm.plugin.sns.storage.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                                    }
                                }
                            }
                        }
                        s1Var = null;
                        o1Var = new com.tencent.mm.plugin.sns.storage.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                    }
                }
                obj = "";
                s1Var = null;
                o1Var = new com.tencent.mm.plugin.sns.storage.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
            }
            if (o1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
                a1Var = null;
            } else {
                java.lang.String str8 = (java.lang.String) map.get(concat.concat(".videoCompositeType"));
                a1Var = new com.tencent.mm.plugin.sns.storage.a1(a17, a18, a19, o1Var, (str8 == null || (h18 = r26.h0.h(str8)) == null) ? 0 : h18.intValue());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
            }
        }
        if (a1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.a0 a0Var = com.tencent.mm.plugin.sns.storage.b0.f165930i;
        com.tencent.mm.plugin.sns.storage.b0 a38 = a0Var.a(map, str.concat(".clickInfo"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String concat4 = str.concat(".clickInfoList");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(concat4);
            sb6.append(".clickInfoItem");
            sb6.append(i17 == 0 ? obj : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.tencent.mars.xlog.Log.i("AdBreakFrameClickInfo.adClickArea", "parseClickInfoList, size=" + arrayList.size());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
                com.tencent.mm.plugin.sns.storage.d0 d0Var = new com.tencent.mm.plugin.sns.storage.d0(str2, a1Var, a38, arrayList);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
                return d0Var;
            }
            com.tencent.mm.plugin.sns.storage.b0 a39 = a0Var.a(map, sb7);
            if (a39 != null) {
                arrayList.add(a39);
            } else {
                com.tencent.mars.xlog.Log.e("AdBreakFrameClickInfo.adClickArea", "parseClickInfoList, clickInfo==null, itemKey=" + sb7);
            }
            i17++;
        }
    }
}
