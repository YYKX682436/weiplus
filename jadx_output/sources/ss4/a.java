package ss4;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {
    public a(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g10 g10Var = new r45.g10();
        g10Var.f374798e = str;
        g10Var.f374799f = java.lang.System.currentTimeMillis();
        lVar.f70664a = g10Var;
        lVar.f70665b = new r45.h10();
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktcheckmchservicepos";
        lVar.f70667d = 2553;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiCheckMchServicePos", "CgiCheckMchServicePos: %s", str);
    }
}
