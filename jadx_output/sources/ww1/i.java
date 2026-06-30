package ww1;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.wallet_core.model.h1 {
    public i(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiF2fShortTermQrcode", "fee:%s，fee_type:%s，desc:%s， payer_desc_required：%s, payer_desc_placeholder：%s, scene:%s", java.lang.Integer.valueOf(i17), str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.mw mwVar = new r45.mw();
        mwVar.f380863f = str2;
        mwVar.f380861d = i17 + "";
        mwVar.f380862e = str;
        mwVar.f380864g = z17;
        mwVar.f380865h = str3;
        mwVar.f380866i = i18;
        lVar.f70664a = mwVar;
        lVar.f70665b = new r45.nw();
        lVar.f70667d = 1729;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fshorttermqrcode";
        p(lVar.a());
    }
}
