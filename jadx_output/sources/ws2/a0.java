package ws2;

/* loaded from: classes3.dex */
public final class a0 implements we2.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ws2.b0 f448997b;

    public a0(ws2.b0 b0Var, gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f448997b = b0Var;
        this.f448996a = "ReplayMsgRespLegalInterceptor";
    }

    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        r45.r71 r71Var;
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        int i17 = cgiResp.f445218a;
        int i18 = cgiResp.f445219b;
        we2.b bVar = cgiResp.f445220c;
        r45.nw1 nw1Var = (bVar == null || (r71Var = bVar.f445214a) == null) ? null : (r45.nw1) r71Var.getCustom(3);
        java.lang.String str = cgiResp.f445221d;
        ws2.b0 b0Var = this.f448997b;
        boolean z17 = nw1Var != null && nw1Var.getLong(0) == ((ct2.j) b0Var.f328963d.a(ct2.j.class)).O6();
        java.lang.String str2 = this.f448996a;
        if (z17 && com.tencent.mm.sdk.platformtools.t8.D0(str, ((mm2.e1) b0Var.f328963d.a(mm2.e1.class)).f328995y)) {
            if (i18 == 0 && i17 == 0) {
                return true;
            }
            com.tencent.mars.xlog.Log.e(str2, "handleReplayLiveMsgResp errCode:" + i17 + ",errType:" + i18);
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleReplayLiveMsgResp localUniqId:");
        sb6.append(((mm2.e1) b0Var.f328963d.a(mm2.e1.class)).f328995y);
        sb6.append(", respUniqId:");
        sb6.append(str);
        sb6.append(", local liveId:");
        sb6.append(((ct2.j) b0Var.f328963d.a(ct2.j.class)).O6());
        sb6.append(", resp.liveId:");
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        com.tencent.mars.xlog.Log.e(str2, sb6.toString());
        return false;
    }
}
