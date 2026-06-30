package yj;

/* loaded from: classes5.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData f462634a;

    public e(com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData) {
        this.f462634a = magicAdIPCCgiReportData;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "reportAd(pay) cgi fail, errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        } else {
            r45.w65 w65Var = (r45.w65) fVar.f70618d;
            if (w65Var == null || w65Var.getInteger(1) == 0) {
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "reportAd(pay) cgi success, serverAid: " + this.f462634a.f53156e);
            } else {
                com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "reportAd(pay) cgi resp return error, retCode: " + w65Var.getInteger(1));
            }
        }
        return jz5.f0.f302826a;
    }
}
