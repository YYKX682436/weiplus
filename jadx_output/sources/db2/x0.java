package db2;

/* loaded from: classes.dex */
public final class x0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228227t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String finderUsername) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f228227t = "MicroMsg.CgiFinderGetLiveIncomePage";
        r45.i71 i71Var = new r45.i71();
        i71Var.set(1, db2.t4.f228171a.a(6477));
        i71Var.set(2, finderUsername);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = i71Var;
        r45.j71 j71Var = new r45.j71();
        j71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j71Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = j71Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliveincomepage";
        lVar.f70667d = 6477;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiFinderGetLiveIncomePage", "init " + i71Var.getString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j71 resp = (r45.j71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228227t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
