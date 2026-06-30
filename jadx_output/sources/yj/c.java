package yj;

/* loaded from: classes5.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData f462632a;

    public c(com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData) {
        this.f462632a = magicAdIPCCgiReportData;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData = this.f462632a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "report cgi fail, aid: " + magicAdIPCCgiReportData.f53156e + ", reportType: " + magicAdIPCCgiReportData.f53155d + ", errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        } else {
            r45.ip5 ip5Var = (r45.ip5) fVar.f70618d;
            if (ip5Var == null || ip5Var.getInteger(1) == 0) {
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "report cgi success, aid: " + magicAdIPCCgiReportData.f53156e + ", reportType: " + magicAdIPCCgiReportData.f53155d);
            } else {
                com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "report cgi resp return error, aid: " + magicAdIPCCgiReportData.f53156e + ", reportType: " + magicAdIPCCgiReportData.f53155d + ", retCode: " + ip5Var.getInteger(1));
            }
        }
        return jz5.f0.f302826a;
    }
}
