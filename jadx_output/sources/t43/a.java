package t43;

/* loaded from: classes2.dex */
public final class a extends i43.a {
    public a(android.os.Bundle atInfo) {
        kotlin.jvm.internal.o.g(atInfo, "atInfo");
        o33.a aVar = new o33.a();
        o33.b bVar = new o33.b();
        aVar.f342724e = new com.tencent.mm.protobuf.g(atInfo.getByteArray("context"));
        aVar.f342723d = atInfo.getString("contentId");
        aVar.f342725f = atInfo.getInt("limit", 50);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = aVar;
        lVar.f70665b = bVar;
        lVar.f70667d = 4712;
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getreminduserlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetAtSomeoneList", "RemindUserList。content_id: %s", aVar.f342723d);
    }
}
