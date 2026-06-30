package i05;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String wtId, java.lang.String wxId, java.lang.String token) {
        kotlin.jvm.internal.o.g(wtId, "wtId");
        kotlin.jvm.internal.o.g(wxId, "wxId");
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        i05.f fVar = new i05.f();
        i05.h hVar = new i05.h();
        hVar.f286573d = wtId;
        hVar.f286574e = wxId;
        hVar.f286575f = token;
        fVar.f286571d = hVar;
        i05.g gVar = new i05.g();
        gVar.setBaseResponse(new r45.ie());
        gVar.getBaseResponse().f376960e = new r45.du5();
        lVar.f70664a = fVar;
        lVar.f70665b = gVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/keyboardverifywxtoken";
        lVar.f70667d = 11329;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiKeyBoardVerifyWxToken", "request wtId:" + wtId + ", wxId:" + wxId + ", token:" + token);
    }
}
