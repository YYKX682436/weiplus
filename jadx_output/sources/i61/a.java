package i61;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {
    public a(java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        r45.w wVar = new r45.w();
        wVar.f388733d = str;
        wVar.f388734e = j17;
        wVar.f388735f = i17;
        wVar.f388736g = str2;
        wVar.f388737h = str3;
        wVar.f388738i = str4;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wVar;
        lVar.f70665b = new r45.x();
        lVar.f70667d = 1344;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaapaysucc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", wVar.f388733d, java.lang.Long.valueOf(wVar.f388734e), java.lang.Integer.valueOf(wVar.f388735f), wVar.f388736g, wVar.f388737h, wVar.f388738i);
    }
}
