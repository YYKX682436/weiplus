package y84;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f460054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(y84.h3 h3Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        super(0);
        this.f460053d = h3Var;
        this.f460054e = snsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$bindComponentModel$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$bindComponentModel$1$2");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f460054e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        y84.h3 h3Var = this.f460053d;
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int i17 = h3Var.Q0;
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.i(h3Var.j(), "mScrollCount <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            str = "invoke";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$bindComponentModel$1$2";
            str5 = "access$doReport";
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportStr", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.lang.String j17 = h3Var.j();
            try {
                int b17 = h3Var.f460089p.b();
                java.lang.String str6 = snsInfo.getAdInfo(b17).aid;
                java.lang.String str7 = snsInfo.getAdInfo(b17).uxInfo;
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$bindComponentModel$1$2";
                try {
                    java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
                    cl0.g gVar = new cl0.g();
                    str3 = "access$doReport";
                    try {
                        gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, b17 == 0 ? 1 : 2);
                        gVar.o("scrollCount", i17);
                        str4 = "TimelineRandomSelectCard," + str6 + "," + str7 + "," + t07 + "," + java.net.URLEncoder.encode(gVar.toString(), com.tencent.mapsdk.internal.rv.f51270c);
                        kotlin.jvm.internal.o.f(str4, "toString(...)");
                        com.tencent.mars.xlog.Log.i(h3Var.j(), "getReportStr, reportContent is " + str4 + ", source is " + b17 + ", content is " + gVar);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportStr", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        ca4.q.c(j17, th);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportStr", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        str4 = "";
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(37055, str4);
                        h3Var.Q0 = 0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        str5 = str3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        h3Var.X0();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        java.lang.String str8 = str;
                        java.lang.String str9 = str2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str8, str9);
                        jz5.f0 f0Var = jz5.f0.f302826a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str8, str9);
                        return f0Var;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str3 = "access$doReport";
                    ca4.q.c(j17, th);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportStr", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    str4 = "";
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(37055, str4);
                    h3Var.Q0 = 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    str5 = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    h3Var.X0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    java.lang.String str82 = str;
                    java.lang.String str92 = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str82, str92);
                    jz5.f0 f0Var2 = jz5.f0.f302826a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str82, str92);
                    return f0Var2;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$bindComponentModel$1$2";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(37055, str4);
            h3Var.Q0 = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            str5 = str3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.X0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String str822 = str;
        java.lang.String str922 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str822, str922);
        jz5.f0 f0Var22 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str822, str922);
        return f0Var22;
    }
}
