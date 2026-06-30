package ek2;

/* loaded from: classes3.dex */
public final class b0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253416u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j17, int i17, java.lang.String exportId, r45.s74 s74Var, r45.m71 m71Var, r45.da3 da3Var, ek2.a0 a0Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(exportId, "exportId");
        this.f253416u = "Finder.CgiFinderGetLiveInfo";
        r45.k71 k71Var = new r45.k71();
        k71Var.set(1, java.lang.Long.valueOf(j17));
        k71Var.set(2, xy2.c.f(this.f16135n));
        k71Var.set(5, zl2.q4.d(zl2.q4.f473933a, null, null, 3, null));
        k71Var.set(3, java.lang.Integer.valueOf(i17));
        k71Var.set(4, exportId);
        k71Var.set(6, s74Var);
        k71Var.set(8, m71Var);
        k71Var.set(9, da3Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get live info scene=");
        sb6.append(i17);
        sb6.append(", liveId=");
        sb6.append(j17);
        sb6.append(", notificationInfo:");
        sb6.append(m71Var != null ? java.lang.Integer.valueOf(m71Var.getInteger(1)) : null);
        sb6.append(',');
        sb6.append(m71Var != null ? java.lang.Integer.valueOf(m71Var.getInteger(0)) : null);
        sb6.append(',');
        sb6.append(da3Var);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetLiveInfo", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = k71Var;
        r45.l71 l71Var = new r45.l71();
        l71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l71Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = l71Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliveinfo";
        lVar.f70667d = 3861;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        r45.i72 i72Var;
        r45.l71 resp = (r45.l71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str3 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str4 = this.f253416u;
        com.tencent.mars.xlog.Log.i(str4, str3);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str4, "get live info:" + pm0.b0.g(resp));
            r45.nw1 nw1Var = (r45.nw1) resp.getCustom(1);
            if (nw1Var == null || (i72Var = (r45.i72) nw1Var.getCustom(44)) == null || (str2 = i72Var.getString(9)) == null) {
                str2 = "";
            }
            com.tencent.mars.xlog.Log.i(str4, "[saveReplayGuidePageUrl] url = ".concat(str2));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_REPLAY_GUIDE_URL_STRING_SYNC, str2);
        }
    }
}
