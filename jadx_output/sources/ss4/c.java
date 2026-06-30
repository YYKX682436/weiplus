package ss4;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.wallet_core.model.h1 {
    public c(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.nr6 nr6Var = new r45.nr6();
        nr6Var.f381632e = str;
        nr6Var.f381633f = java.lang.System.currentTimeMillis();
        lVar.f70664a = nr6Var;
        lVar.f70665b = new r45.or6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktuncheckmchservicepos";
        lVar.f70667d = 2595;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiUnCheckMchServicePos", "CgiUnCheckMchServicePos: %s", str);
    }
}
