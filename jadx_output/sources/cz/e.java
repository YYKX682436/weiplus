package cz;

@j95.b
/* loaded from: classes7.dex */
public class e extends i95.w implements dz.i {
    public void Ai(boolean z17) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s2 s2Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s2.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceServiceIsolated", "setWaitingVoipChat wait:%b", java.lang.Boolean.valueOf(z17));
        synchronized (s2Var) {
            s2Var.f96090e = z17;
        }
    }

    public boolean wi() {
        boolean z17;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s2 s2Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s2.INSTANCE;
        synchronized (s2Var) {
            z17 = s2Var.f96090e;
        }
        return z17;
    }
}
