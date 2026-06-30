package w53;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.modelbase.i {
    public e(java.lang.String userName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        v53.p pVar = new v53.p();
        v53.a aVar = new v53.a();
        aVar.f433321d = userName;
        aVar.f433322e = z17;
        pVar.f433358d = aVar;
        pVar.f433359e = z18;
        lVar.f70664a = pVar;
        lVar.f70665b = new v53.q();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setblacklist";
        lVar.f70667d = 1102;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSetBlackList", "onCgiBack, errType = " + i17 + ", errCode = " + i18);
    }
}
