package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class q0 {
    public q0(kotlin.jvm.internal.i iVar) {
    }

    public final android.view.View a(android.content.Context context, int i17) {
        android.view.View h3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 10) {
            h3Var = new tc4.h3(context);
        } else if (i17 == 98) {
            h3Var = new n94.a(context);
        } else if (i17 == 100) {
            h3Var = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView(context);
        } else if (i17 == 12) {
            h3Var = new tc4.c(context);
        } else if (i17 != 13) {
            switch (i17) {
                case 0:
                    h3Var = new tc4.q3(context);
                    break;
                case 1:
                    h3Var = new tc4.s2(context);
                    break;
                case 2:
                    h3Var = new tc4.t3(context);
                    break;
                case 3:
                    h3Var = new tc4.k4(context);
                    break;
                case 4:
                    h3Var = new tc4.j3(context);
                    break;
                case 5:
                    h3Var = new tc4.n0(context);
                    break;
                case 6:
                    h3Var = new tc4.a0(context);
                    break;
                case 7:
                    h3Var = new tc4.r0(context);
                    break;
                case 8:
                    h3Var = new tc4.c3(context);
                    break;
                default:
                    h3Var = new com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView(context);
                    break;
            }
        } else {
            h3Var = new tc4.b4(context);
        }
        yc4.s sVar = yc4.s.f460864a;
        int hashCode = h3Var.hashCode();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sVar.a(hashCode);
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) yc4.s.f460865b.get(java.lang.Integer.valueOf(hashCode));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f60613f = (int) currentTimeMillis2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        return h3Var;
    }

    public final java.lang.String b(zc4.b item) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeYbRetouchReportStr", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList MediaObjList = item.n().h1().ContentObj.f369840h;
        kotlin.jvm.internal.o.f(MediaObjList, "MediaObjList");
        int i17 = 0;
        for (java.lang.Object obj : MediaObjList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String YuanBaoTemplateId = ((r45.jj4) obj).I1;
            kotlin.jvm.internal.o.f(YuanBaoTemplateId, "YuanBaoTemplateId");
            if (YuanBaoTemplateId.length() > 0) {
                if (sb6.length() > 0) {
                    sb6.append("_");
                }
                sb6.append(i17);
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeYbRetouchReportStr", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        return sb7;
    }
}
