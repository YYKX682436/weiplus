package db2;

/* loaded from: classes5.dex */
public final class u2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(int i17, java.lang.String authToken, java.lang.String username, r45.tt4 tt4Var, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 2, null);
        tt4Var = (i18 & 8) != 0 ? null : tt4Var;
        kotlin.jvm.internal.o.g(authToken, "authToken");
        kotlin.jvm.internal.o.g(username, "username");
        r45.is2 is2Var = new r45.is2();
        is2Var.set(1, java.lang.Integer.valueOf(i17));
        is2Var.set(2, authToken);
        is2Var.set(3, username);
        if (tt4Var != null) {
            is2Var.set(6, tt4Var);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = is2Var;
        r45.js2 js2Var = new r45.js2();
        js2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) js2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = js2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderrealnameverify";
        lVar.f70667d = 9950;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderRealName", "init opType:" + i17 + ", authToken:" + authToken + " username:" + username);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.js2 resp = (r45.js2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderRealName", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
