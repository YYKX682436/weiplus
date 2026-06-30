package ze2;

/* loaded from: classes3.dex */
public final class e implements we2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f471776a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f471777b;

    public e(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f471776a = liveContext;
        this.f471777b = "LiveMsgRespLegalInterceptor";
    }

    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        r45.r71 r71Var;
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        int i17 = cgiResp.f445218a;
        we2.b bVar = cgiResp.f445220c;
        r45.nw1 nw1Var = (bVar == null || (r71Var = bVar.f445214a) == null) ? null : (r45.nw1) r71Var.getCustom(3);
        java.lang.String str = cgiResp.f445221d;
        we2.b bVar2 = cgiResp.f445220c;
        java.lang.Integer valueOf = bVar2 != null ? java.lang.Integer.valueOf(bVar2.f445215b) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleLiveMsgResp errCode:");
        sb6.append(i17);
        sb6.append(" curData:");
        gk2.e eVar = this.f471776a;
        r45.nw1 nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        sb6.append(nw1Var2 != null ? java.lang.Long.valueOf(nw1Var2.getLong(0)) : null);
        sb6.append(", resp.liveId:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        sb6.append(",reqVisitorRoleType:");
        sb6.append(valueOf);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f471777b;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        java.lang.Long valueOf2 = nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null;
        r45.nw1 nw1Var3 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        if (!kotlin.jvm.internal.o.b(valueOf2, nw1Var3 != null ? java.lang.Long.valueOf(nw1Var3.getLong(0)) : null)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleLiveMsgResp invalid live resp, curData:");
            r45.nw1 nw1Var4 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
            sb8.append(nw1Var4 != null ? java.lang.Long.valueOf(nw1Var4.getLong(0)) : null);
            sb8.append(", resp.liveId:");
            sb8.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
            com.tencent.mars.xlog.Log.i(str2, sb8.toString());
            return false;
        }
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        if (!((str == null || str.length() == 0) || !com.tencent.mm.sdk.platformtools.t8.D0(str, e1Var != null ? e1Var.f328995y : null))) {
            if (!(((mm2.c1) eVar.a(mm2.c1.class)).U7())) {
                return true;
            }
            com.tencent.mars.xlog.Log.i(str2, "handleLiveMsgResp live has finished");
            return false;
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("handleLiveMsgResp invalid live id, curData:");
        r45.nw1 nw1Var5 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r;
        sb9.append(nw1Var5 != null ? java.lang.Long.valueOf(nw1Var5.getLong(0)) : null);
        sb9.append(", resp.liveId:");
        sb9.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        sb9.append(", curUniqueId:");
        sb9.append(((mm2.e1) eVar.a(mm2.e1.class)).f328995y);
        sb9.append(", cgi.uniqueId:");
        sb9.append(str);
        com.tencent.mars.xlog.Log.i(str2, sb9.toString());
        return false;
    }
}
