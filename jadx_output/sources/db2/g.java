package db2;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(java.lang.String username, java.lang.String msgSessionId) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(msgSessionId, "msgSessionId");
        r45.f11 f11Var = new r45.f11();
        f11Var.set(1, db2.t4.f228171a.a(18657));
        f11Var.set(2, username);
        f11Var.set(3, msgSessionId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = f11Var;
        r45.g11 g11Var = new r45.g11();
        g11Var.set(0, new r45.ie());
        lVar.f70665b = g11Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdelpersonalmsg";
        lVar.f70667d = 18657;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Cgi.CgiDelPrivateMsg", "CgiDelPrivateMsg init username = " + username + ", sessionId = " + msgSessionId);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Cgi.CgiDelPrivateMsg", "CgiDelPrivateMsg back, errType: " + i17 + ", errCode: " + i18);
    }
}
