package he0;

/* loaded from: classes4.dex */
public class e5 extends com.tencent.mm.sdk.event.n {
    public e5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.wq wqVar;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        com.tencent.mm.autogen.events.ReportAdH5LoadEvent reportAdH5LoadEvent = (com.tencent.mm.autogen.events.ReportAdH5LoadEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        boolean z17 = false;
        if (gm0.j1.a()) {
            try {
                wqVar = reportAdH5LoadEvent.f54681g;
                snsAdClick = wqVar.f8312a;
                y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(snsAdClick.f71468f);
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdH5LoadListener", "ad h5 report, snsId=" + ca4.z0.t0(snsAdClick.f71468f) + ", reportType=" + wqVar.f8315d + ", errCode=" + wqVar.f8314c);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReportAdH5LoadListener", e17, "report load ad h5 error", new java.lang.Object[0]);
            }
            if (y07 != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
                com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsAdClick.f71466d == 2 ? convertToSnsInfo.getAtAdInfo() : convertToSnsInfo.getAdInfo();
                if (atAdInfo != null) {
                    if (snsAdClick.f71466d == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdH5LoadListener", "at_friend_detail report ad h5 load");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdH5LoadListener", "report ad h5 load");
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16972, java.lang.Long.valueOf(snsAdClick.f71468f), java.lang.Integer.valueOf(snsAdClick.f71467e), atAdInfo.uxInfo, java.lang.Integer.valueOf(convertToSnsInfo.getAdRecSrc()), convertToSnsInfo.getTimeLine().statExtStr, wqVar.f8313b, java.lang.Integer.valueOf(wqVar.f8315d), java.lang.Integer.valueOf(wqVar.f8314c), java.lang.Long.valueOf(wqVar.f8316e));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
            } else {
                com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsAdClick.f71468f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report ad h5, AdSnsInfo==null, uxInfo=");
                sb6.append(wqVar.f8317f);
                sb6.append(", snsInfo==null?");
                sb6.append(W0 == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportAdH5LoadListener", sb6.toString());
                java.lang.String str = "";
                if (W0 != null) {
                    java.lang.String str2 = wqVar.f8317f;
                    int adRecSrc = W0.getAdRecSrc();
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
                    java.lang.String str3 = timeLine == null ? "" : timeLine.statExtStr;
                    if (str3 != null) {
                        str = str3;
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16972, java.lang.Long.valueOf(snsAdClick.f71468f), java.lang.Integer.valueOf(snsAdClick.f71467e), str2, java.lang.Integer.valueOf(adRecSrc), str, wqVar.f8313b, java.lang.Integer.valueOf(wqVar.f8315d), java.lang.Integer.valueOf(wqVar.f8314c), java.lang.Long.valueOf(wqVar.f8316e));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16972, java.lang.Long.valueOf(snsAdClick.f71468f), java.lang.Integer.valueOf(snsAdClick.f71467e), wqVar.f8317f, 0, "", wqVar.f8313b, java.lang.Integer.valueOf(wqVar.f8315d), java.lang.Integer.valueOf(wqVar.f8314c), java.lang.Long.valueOf(wqVar.f8316e));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                }
            }
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReportAdH5LoadListener", "ReportAdH5LoadEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        return z17;
    }
}
