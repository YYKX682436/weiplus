package ss4;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(java.lang.String str, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.h43 h43Var = new r45.h43();
        h43Var.f375820e = str;
        h43Var.f375821f = i17;
        h43Var.f375822g = i18;
        lVar.f70664a = h43Var;
        lVar.f70665b = new r45.i43();
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktfollowcardbdmch";
        lVar.f70667d = 2720;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiFollowCardBDMch", "CgiFollowCardBDMch: %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
