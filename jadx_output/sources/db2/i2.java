package db2;

/* loaded from: classes.dex */
public final class i2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(java.lang.String username) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.e31 e31Var = new r45.e31();
        e31Var.set(2, username);
        lVar.f70664a = e31Var;
        r45.f31 f31Var = new r45.f31();
        f31Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f31Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = f31Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfetchmyredpacketcover";
        lVar.f70667d = 8946;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderMyRedPackCover", "[init] username:" + e31Var.getString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f31 resp = (r45.f31) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderMyRedPackCover", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
