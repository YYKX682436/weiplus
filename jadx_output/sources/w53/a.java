package w53;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        v53.d dVar = new v53.d();
        dVar.f433333d = userName;
        lVar.f70664a = dVar;
        lVar.f70665b = new v53.e();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getblacklist";
        lVar.f70667d = 2982;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetBlackList", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
