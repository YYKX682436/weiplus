package rj1;

/* loaded from: classes7.dex */
public abstract class m {
    public static final void a(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo) {
        kotlin.jvm.internal.o.g(tipsMsgInfo, "<this>");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData(tipsMsgInfo, false), rj1.h.class, null);
            return;
        }
        rj1.n nVar = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
        if (nVar != null) {
            nVar.z0(tipsMsgInfo);
        }
    }

    public static final com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo b(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo, int i17) {
        kotlin.jvm.internal.o.g(tipsMsgInfo, "<this>");
        com.tencent.mm.autogen.mmdata.rpt.TipsMsgReportStruct tipsMsgReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TipsMsgReportStruct();
        tipsMsgReportStruct.f61309e = tipsMsgReportStruct.b("Appid", tipsMsgInfo.field_appId, true);
        tipsMsgReportStruct.f61308d = tipsMsgInfo.field_receiveTime;
        tipsMsgReportStruct.f61310f = tipsMsgReportStruct.b("MsgId", tipsMsgInfo.field_msgId, true);
        tipsMsgReportStruct.f61311g = tipsMsgInfo.field_busiType;
        tipsMsgReportStruct.f61312h = tipsMsgInfo.field_msgType;
        tipsMsgReportStruct.f61313i = i17;
        tipsMsgReportStruct.k();
        return tipsMsgInfo;
    }

    public static final void c(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo) {
        kotlin.jvm.internal.o.g(tipsMsgInfo, "<this>");
        if (tipsMsgInfo.field_msgType != 1) {
            b(tipsMsgInfo, 3);
            a(tipsMsgInfo);
            com.tencent.mars.xlog.Log.i("TipsMsgInfo", "ignore info = " + tipsMsgInfo);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            rj1.n nVar = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
            if (nVar != null) {
                nVar.y0(tipsMsgInfo);
            }
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData(tipsMsgInfo, true), rj1.h.class, null);
        }
        b(tipsMsgInfo, 2);
    }
}
