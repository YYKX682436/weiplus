package yj;

/* loaded from: classes5.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f462630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData f462631b;

    public b(com.tencent.mm.ipcinvoker.r rVar, yj.f fVar, com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData magicAdIPCCgiPullData) {
        this.f462630a = rVar;
        this.f462631b = magicAdIPCCgiPullData;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        com.tencent.mm.ipcinvoker.r rVar = this.f462630a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "pullAds cgi fail, errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData(false, null, java.lang.Integer.valueOf(fVar.f70616b), 2, null));
            }
        } else {
            r45.l93 l93Var = (r45.l93) fVar.f70618d;
            if (l93Var == null || l93Var.getInteger(1) == 0) {
                r45.m93 m93Var = (r45.m93) l93Var.getCustom(2);
                if (m93Var == null) {
                    com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "pullAds cgi success but result is null");
                    if (rVar != null) {
                        rVar.a(new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData(false, null, null, 6, null));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "pullAds cgi success, posIds: " + this.f462631b.f53154d + ", size: " + m93Var.getList(3).size());
                    if (rVar != null) {
                        rVar.a(new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData(false, ((r45.m93) l93Var.getCustom(2)).toByteArray(), null, 5, null));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "cgi resp return error, retCode: " + l93Var.getInteger(1));
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData(false, null, null, 6, null));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
