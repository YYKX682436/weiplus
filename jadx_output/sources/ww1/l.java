package ww1;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.wallet_core.model.h1 {
    public l(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fQrcodeMch", "NetSceneF2fQrcodeMch requeset ");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ew ewVar = new r45.ew();
        ewVar.f373757d = i17;
        lVar.f70664a = ewVar;
        lVar.f70665b = new r45.fw();
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtgetonlineqr";
        lVar.f70667d = 4364;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }
}
