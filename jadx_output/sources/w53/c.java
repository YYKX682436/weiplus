package w53;

/* loaded from: classes4.dex */
public final class c extends com.tencent.mm.modelbase.i {
    public c(java.lang.String str, java.lang.String toUserName, int i17, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        v53.h hVar = new v53.h();
        hVar.f433338d = str;
        hVar.f433339e = toUserName;
        hVar.f433340f = i17;
        hVar.f433341g = gVar;
        lVar.f70664a = hVar;
        lVar.f70665b = new v53.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetChatSessionId", "fromUserName[" + hVar.f433338d + "], toUserName[" + hVar.f433339e + "], scene[" + hVar.f433340f + "], extInfo[" + hVar.f433341g + ']');
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessionid";
        lVar.f70667d = 1103;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetChatSessionId", "onCgiBack, errType = " + i17 + ", errMsg = " + str);
    }
}
