package db2;

/* loaded from: classes.dex */
public final class u1 extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f228187m;

    public u1(java.util.List nicknameList, java.lang.String str) {
        kotlin.jvm.internal.o.g(nicknameList, "nicknameList");
        this.f228187m = "Finder.CgiFinderGetUser";
        r45.ta1 ta1Var = new r45.ta1();
        ta1Var.getList(3).addAll(nicknameList);
        if (str != null) {
            ta1Var.set(4, str);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ta1Var;
        r45.ua1 ua1Var = new r45.ua1();
        ua1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ua1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ua1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetuser";
        lVar.f70667d = 3512;
        p(lVar.a());
        java.lang.String str2 = (java.lang.String) kz5.n0.Z(nicknameList);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetUser", "init nickname:".concat(str2 == null ? "" : str2));
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ua1 resp = (r45.ua1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228187m, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
