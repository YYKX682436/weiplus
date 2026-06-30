package i45;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String wtId, java.lang.String wxId, java.lang.String token) {
        kotlin.jvm.internal.o.g(wtId, "wtId");
        kotlin.jvm.internal.o.g(wxId, "wxId");
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.m44 m44Var = new r45.m44();
        r45.uy6 uy6Var = new r45.uy6();
        uy6Var.f387740d = wtId;
        uy6Var.f387741e = wxId;
        uy6Var.f387742f = token;
        m44Var.f380141d = uy6Var;
        r45.n44 n44Var = new r45.n44();
        n44Var.setBaseResponse(new r45.ie());
        n44Var.getBaseResponse().f376960e = new r45.du5();
        lVar.f70664a = m44Var;
        lVar.f70665b = n44Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/keyboardverifywxtoken";
        lVar.f70667d = 11329;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiKeyBoardVerifyWxToken", "request wtId:" + wtId + ", wxId:" + wxId + ", token:" + token);
    }
}
