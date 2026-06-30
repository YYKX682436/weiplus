package w53;

/* loaded from: classes.dex */
public final class d extends com.tencent.mm.modelbase.i {
    public d(java.util.LinkedList userNameList) {
        kotlin.jvm.internal.o.g(userNameList, "userNameList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        v53.j jVar = new v53.j();
        jVar.f433344d = userNameList;
        lVar.f70664a = jVar;
        lVar.f70665b = new v53.k();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatuserinfo";
        lVar.f70667d = 1111;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetChatUserInfo", "errType = " + i17 + ", errCode = " + i18);
    }
}
