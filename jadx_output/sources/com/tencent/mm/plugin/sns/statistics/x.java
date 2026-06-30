package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsPostInfoEvent f164996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1 f164997e;

    public x(com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1 snsPostReportLogic$1, com.tencent.mm.autogen.events.SnsPostInfoEvent snsPostInfoEvent) {
        this.f164997e = snsPostReportLogic$1;
        this.f164996d = snsPostInfoEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
        com.tencent.mm.plugin.sns.statistics.z zVar = this.f164997e.f164824d;
        am.mw mwVar = this.f164996d.f54830g;
        long j17 = mwVar.f7373a;
        java.util.HashMap hashMap = mwVar.f7375c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        if (hashMap != null && !hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                com.tencent.mm.plugin.sns.statistics.y yVar = (com.tencent.mm.plugin.sns.statistics.y) zVar.f165003a.remove(java.lang.Integer.valueOf(intValue));
                if (yVar != null) {
                    java.lang.String str = yVar.f165000b;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        try {
                            i17 = ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 1 ? 1 : 2;
                        } catch (java.lang.Exception unused) {
                            i17 = 0;
                        }
                        com.tencent.mm.autogen.mmdata.rpt.MMImageExifInfoStruct mMImageExifInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.MMImageExifInfoStruct(str);
                        mMImageExifInfoStruct.B = mMImageExifInfoStruct.b("publishId", ca4.z0.t0(j17), true);
                        mMImageExifInfoStruct.f58834r = i17;
                        mMImageExifInfoStruct.C = yVar.f164999a;
                        mMImageExifInfoStruct.k();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostReportLogic", "report sns image exif [%s]", mMImageExifInfoStruct.n());
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsImageExif", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsPostReportLogic$1$1");
    }
}
