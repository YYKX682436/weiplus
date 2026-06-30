package w53;

/* loaded from: classes.dex */
public final class f extends com.tencent.mm.modelbase.i {
    public f(java.lang.String sessionId, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        v53.r rVar = new v53.r();
        rVar.f433360d = sessionId;
        rVar.f433361e = j17;
        rVar.f433362f = z17;
        lVar.f70664a = rVar;
        lVar.f70665b = new v53.s();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setchatsessiondata";
        lVar.f70667d = 1910;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSetChatSessionData", "onCgiBack, errType = " + i17 + ", errMsg = " + str);
    }
}
