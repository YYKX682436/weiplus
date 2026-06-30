package ww1;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.wallet_core.model.h1 {
    public k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetQrcode", "CgiF2fQrcode requeset ");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.gw gwVar = new r45.gw();
        gwVar.f375557d = 1;
        lVar.f70664a = gwVar;
        lVar.f70665b = new r45.hw();
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fgetqrcodev2";
        lVar.f70667d = 5174;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
