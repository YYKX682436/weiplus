package ek2;

/* loaded from: classes.dex */
public final class v0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f253551t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i17, int i18, gk2.e buContext, r45.z63 info) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(info, "info");
        this.f253551t = "Finder.CgiFinderLiveGamePopScene";
        r45.ar1 ar1Var = new r45.ar1();
        ar1Var.set(1, db2.t4.f228171a.b(6965, this.f16135n));
        ar1Var.set(2, java.lang.Integer.valueOf(i17));
        ar1Var.set(3, java.lang.Integer.valueOf(i18));
        ar1Var.set(4, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0)));
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) buContext.a(mm2.c1.class)).f328846n;
        ar1Var.set(5, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : -1L));
        ar1Var.set(6, info.getString(0));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ar1Var;
        r45.br1 br1Var = new r45.br1();
        br1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) br1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = br1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegamepopscene";
        lVar.f70667d = 6965;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveGamePopScene", "init scene:" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.br1 resp = (r45.br1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253551t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
