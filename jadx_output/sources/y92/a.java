package y92;

/* loaded from: classes2.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.modelbase.o a(r45.la1 request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = request;
        r45.ma1 ma1Var = new r45.ma1();
        ma1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ma1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ma1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettopicinfo";
        lVar.f70667d = 6277;
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("Cgi.FinderGetTopicInfoCgi", "initReqResp init request:" + request.toJSON());
        }
        return lVar.a();
    }
}
