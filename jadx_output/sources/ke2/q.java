package ke2;

/* loaded from: classes.dex */
public final class q extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306980t;

    public q(com.tencent.mm.protobuf.g gVar, long j17, long j18, com.tencent.mm.protobuf.g gVar2, int i17, r45.qt2 qt2Var, int i18, int i19) {
        super(qt2Var, null, 2, null);
        this.f306980t = "CgiFinderLiveFanClubMember";
        r45.is1 is1Var = new r45.is1();
        is1Var.set(1, db2.t4.f228171a.a(6282));
        is1Var.set(2, xy2.c.f(qt2Var));
        is1Var.set(3, gVar);
        is1Var.set(4, java.lang.Long.valueOf(j17));
        is1Var.set(5, java.lang.Long.valueOf(j18));
        is1Var.set(6, gVar2);
        is1Var.set(7, java.lang.Integer.valueOf(i17));
        is1Var.set(8, java.lang.Integer.valueOf(i18));
        is1Var.set(9, java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = is1Var;
        r45.js1 js1Var = new r45.js1();
        js1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) js1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = js1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetfanclubmembers";
        lVar.f70667d = 6282;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveFanClubMember", "init " + is1Var.getString(2) + ',' + is1Var.getByteString(3) + ',' + is1Var.getLong(4) + ',' + is1Var.getLong(5) + ',' + is1Var.getByteString(6) + ',' + is1Var.getInteger(7));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.js1 resp = (r45.js1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306980t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " size=" + resp.getList(4).size() + " thread=" + java.lang.Thread.currentThread());
    }
}
