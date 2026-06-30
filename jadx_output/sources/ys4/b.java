package ys4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        r45.yj5 yj5Var = new r45.yj5();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        yj5Var.f391155d = str;
        yj5Var.f391156e = str2;
        yj5Var.f391157f = i17;
        yj5Var.f391158g = str3;
        lVar.f70664a = yj5Var;
        lVar.f70665b = new r45.pj5();
        lVar.f70667d = 1923;
        lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/realnamesendsms";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRealnameSendSms", "send sms: %s, %s, isRetry: %s", str2, str, java.lang.Integer.valueOf(i17));
    }
}
