package r33;

/* loaded from: classes4.dex */
public final class a extends r33.i {
    public a(java.util.LinkedList linkedList) {
        p33.b bVar = new p33.b();
        p33.d dVar = new p33.d();
        p33.a aVar = new p33.a();
        aVar.f351517d = linkedList;
        bVar.f351520d = aVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = bVar;
        lVar.f70665b = dVar;
        lVar.f70667d = 4647;
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/batchgetcontentinfobycontentid";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetInteractiveMsgContentRequest", "contentIdList。size: %d", objArr);
    }
}
