package ys4;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.wallet_core.model.h1 {
    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        r45.sj5 sj5Var = new r45.sj5();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        sj5Var.f385783e = str2;
        sj5Var.f385784f = str3;
        sj5Var.f385782d = str;
        sj5Var.f385785g = str4;
        lVar.f70664a = sj5Var;
        lVar.f70665b = new r45.tj5();
        lVar.f70667d = 2752;
        lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/realnameverifysms";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRealnameVerifySms", "verify sms: %s, %s, reqkey: %s", str3, str2, str);
    }
}
