package he0;

/* loaded from: classes4.dex */
public class g5 extends com.tencent.mm.sdk.event.n {
    public g5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        com.tencent.mm.autogen.events.ReportSnsEvent reportSnsEvent = (com.tencent.mm.autogen.events.ReportSnsEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        if (gm0.j1.a()) {
            am.fr frVar = reportSnsEvent.f54690g;
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = frVar.f6701a;
            try {
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "MicroMsg.ReportSnsListener";
            }
            if (frVar.f6702b == 1) {
                if (snsAdClick.f71472m == 1) {
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(snsAdClick.f71468f);
                    if (y07 == null || !y07.isRecExpAd()) {
                        com.tencent.mm.plugin.sns.model.l4.Gj().h(13155, java.lang.Long.valueOf(snsAdClick.f71468f), y07.getAdInfo().uxInfo, java.lang.Integer.valueOf(snsAdClick.f71467e), java.lang.Long.valueOf(snsAdClick.f71471i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(y07.getRecSrc()), "");
                    } else {
                        com.tencent.mm.plugin.sns.model.l4.Gj().h(14647, java.lang.Long.valueOf(snsAdClick.f71468f), y07.getAdInfo().uxInfo, java.lang.Integer.valueOf(snsAdClick.f71467e), java.lang.Long.valueOf(snsAdClick.f71471i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(y07.getRecSrc()), "");
                    }
                    m21.w.c(750);
                    java.lang.String str3 = y07.getAdInfo().uxInfo;
                    java.lang.System.currentTimeMillis();
                } else {
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y08 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(snsAdClick.f71468f);
                    if (y08 != null) {
                        str2 = y08.getAdInfo().uxInfo;
                        z18 = y08.isRecExpAd();
                    } else {
                        str2 = reportSnsEvent.f54690g.f6703c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ReportSnsListener", "ReportSnsEvent, AdSnsInfo==null, uxInfo=".concat(str2));
                        z18 = false;
                    }
                    long j17 = snsAdClick.f71468f;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = snsAdClick;
                    objArr[1] = str2;
                    objArr[2] = java.lang.Integer.valueOf(snsAdClick.f71467e);
                    str = "MicroMsg.ReportSnsListener";
                    try {
                        objArr[3] = java.lang.Long.valueOf(snsAdClick.f71471i);
                        objArr[4] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                        java.lang.String a17 = i64.q0.a(j17, objArr);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(a17);
                        sb6.append(java.lang.String.format(",%s", snsAdClick.f71473n + ""));
                        java.lang.String sb7 = sb6.toString();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(sb7);
                        sb8.append(java.lang.String.format(",%s", ((java.lang.System.currentTimeMillis() - snsAdClick.f71471i) - snsAdClick.f71475p) + ""));
                        java.lang.String sb9 = sb8.toString();
                        if (z18) {
                            com.tencent.mm.plugin.sns.model.l4.Gj().h(14643, sb9);
                        } else {
                            com.tencent.mm.plugin.sns.model.l4.Gj().h(12013, sb9);
                        }
                        m21.w.c(733);
                        java.lang.System.currentTimeMillis();
                        z17 = false;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        z17 = false;
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "report ad click error", new java.lang.Object[0]);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                        return z17;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                }
            }
            z17 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReportSnsListener", "ReportSnsEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        return z17;
    }
}
