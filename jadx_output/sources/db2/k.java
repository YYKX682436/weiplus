package db2;

/* loaded from: classes.dex */
public final class k extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String username) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        r45.jt0 jt0Var = new r45.jt0();
        jt0Var.set(2, username);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = jt0Var;
        r45.kt0 kt0Var = new r45.kt0();
        kt0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) kt0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = kt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadcommentapply";
        lVar.f70667d = 7212;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kt0 resp = (r45.kt0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdCommentApply", "onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        hz2.d.f286313a.h(i17, i18, str);
    }
}
