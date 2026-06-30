package db2;

/* loaded from: classes.dex */
public final class o0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f228104t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        qt2Var = (i19 & 4) != 0 ? null : qt2Var;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        this.f228104t = 2;
        r45.c51 c51Var = new r45.c51();
        c51Var.set(1, db2.t4.f228171a.b(10149, qt2Var));
        c51Var.set(2, str);
        c51Var.set(3, gVar);
        c51Var.set(4, java.lang.Integer.valueOf(i17));
        c51Var.set(5, java.lang.Integer.valueOf(i18));
        r45.d51 d51Var = new r45.d51();
        d51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = c51Var;
        lVar.f70665b = d51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcollectionlist";
        lVar.f70667d = 10149;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "init userName = " + str + ", lastBuffer:" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d51 resp = (r45.d51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
