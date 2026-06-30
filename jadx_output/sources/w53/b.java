package w53;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(java.util.LinkedList sessionIdList) {
        kotlin.jvm.internal.o.g(sessionIdList, "sessionIdList");
        v53.f fVar = new v53.f();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        fVar.f433336d = sessionIdList;
        lVar.f70664a = fVar;
        lVar.f70665b = new v53.g();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessiondata";
        lVar.f70667d = 1910;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetChatSessionData", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
