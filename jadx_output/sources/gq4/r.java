package gq4;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {
    public r(gq4.s sVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        if (Bi.f176581x.f301233b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "no allow to show main ui");
            Bi.G();
            return;
        }
        uq4.a aVar = Bi.f176571n;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "do not need voip resume");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "on voip resume");
        java.lang.String str = aVar.f430229c;
        boolean z17 = aVar.f430227a;
        boolean z18 = aVar.f430228b;
        long j17 = aVar.f430230d;
        Bi.G();
        Bi.M(com.tencent.mm.sdk.platformtools.x2.f193071a, str, j17, z17, z18, true);
    }
}
