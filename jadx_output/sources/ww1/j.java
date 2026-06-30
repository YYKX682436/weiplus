package ww1;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.wallet_core.model.h1 {
    public j(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiF2fShortTermQrcodeMch", "fee:%s，fee_type:%s，desc:%s payer_desc_required：%s, payer_desc_placeholder：%s, scene:%s", java.lang.Integer.valueOf(i17), str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.kw kwVar = new r45.kw();
        kwVar.f378993f = str2;
        if (i17 == 0) {
            kwVar.f378991d = "";
        } else {
            kwVar.f378991d = i17 + "";
        }
        kwVar.f378992e = str;
        kwVar.f378994g = z17;
        kwVar.f378995h = str3;
        kwVar.f378996i = i18;
        kwVar.f378997m = j17;
        lVar.f70664a = kwVar;
        lVar.f70665b = new r45.lw();
        lVar.f70667d = 4419;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtgetshorttermmchqr";
        p(lVar.a());
    }
}
