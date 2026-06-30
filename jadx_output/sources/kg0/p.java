package kg0;

@j95.b
/* loaded from: classes14.dex */
public class p extends i95.w implements lg0.m {
    public void Ai() {
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        Bi.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "onForegroundServiceStart");
        dr4.p1 p1Var = Bi.E;
        if (p1Var == null || !Bi.f176575r) {
            return;
        }
        if (!p1Var.f242703b && !p1Var.f242719r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onCameraAllowLaunch succ ");
            p1Var.f242703b = true;
            p1Var.m();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onCameraAllowLaunch failed " + p1Var.f242703b + " and " + p1Var.f242719r + ' ');
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
    }

    public java.lang.String wi(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.voip.model.s1.f176798a.c(sb6, 112, i17);
        return sb6.toString();
    }
}
