package yj;

/* loaded from: classes5.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData f462633a;

    public d(com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData) {
        this.f462633a = magicAdIPCCgiReportData;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "report cgi fail, errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
        } else {
            r45.w2 w2Var = (r45.w2) fVar.f70618d;
            if (w2Var == null || w2Var.getInteger(0) != 0) {
                com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "report cgi resp return error, retCode: " + w2Var.getInteger(0) + ", message: " + w2Var.getString(1));
            } else {
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "report cgi success, aid: " + this.f462633a.f53156e);
            }
        }
        return jz5.f0.f302826a;
    }
}
