package x81;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.ipcinvoker.wx_extension.v {
    public c(x81.e eVar) {
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick page click errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
        }
    }
}
