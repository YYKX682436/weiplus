package ke2;

/* loaded from: classes.dex */
public final class t extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, long j18, java.lang.String finderUserName, int i17, com.tencent.mm.protobuf.g gVar, r45.yn1 yn1Var, ke2.s sVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f306987t = "Finder.CgiFinderLiveGetContact";
        r45.as1 as1Var = new r45.as1();
        as1Var.set(2, java.lang.Long.valueOf(j17));
        as1Var.set(3, java.lang.Long.valueOf(j18));
        as1Var.set(4, finderUserName);
        as1Var.set(1, db2.t4.f228171a.a(6678));
        as1Var.set(7, gVar);
        as1Var.set(5, java.lang.Integer.valueOf(i17));
        as1Var.set(8, yn1Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = as1Var;
        r45.bs1 bs1Var = new r45.bs1();
        bs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bs1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bs1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetcontact";
        lVar.f70667d = 6678;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGetContact", "init " + as1Var.getLong(2) + ',' + as1Var.getString(4) + ',' + as1Var.getInteger(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bs1 resp = (r45.bs1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306987t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
