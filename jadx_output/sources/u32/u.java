package u32;

/* loaded from: classes13.dex */
public class u extends u32.y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final u32.u f424372d = new u32.u();

    public boolean d(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", str, java.lang.String.valueOf(z17));
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
            return false;
        }
        if (u32.h1.c().f99006a != null) {
            return ((u32.k1) u32.h1.c().f99006a).a(str, z17, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
        com.tencent.mm.plugin.exdevice.model.d0 Bi = com.tencent.mm.plugin.exdevice.model.l3.Bi();
        u32.t tVar = new u32.t(this, str, z17);
        u32.r rVar = Bi.f98865a;
        if (rVar == null || !rVar.f424357e) {
            if (Bi.f98865a == null) {
                Bi.f98865a = new u32.r();
            }
            u32.r rVar2 = Bi.f98865a;
            rVar2.f424356d = new com.tencent.mm.plugin.exdevice.model.s(Bi, 0, tVar);
            rVar2.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            u32.r rVar3 = Bi.f98865a;
            if (rVar3.f424357e) {
                tVar.run();
            } else {
                synchronized (rVar3.f424358f) {
                    ((java.util.LinkedList) rVar3.f424358f).add(tVar);
                }
            }
        }
        return false;
    }

    @Override // u32.z0
    public void di(double d17, int i17, int i18, byte[] bArr, double d18, int i19, java.lang.String str) {
        a42.i.a(bArr);
        com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent exDeviceIBeaconRangingResultEvent = new com.tencent.mm.autogen.events.ExDeviceIBeaconRangingResultEvent();
        java.lang.String a17 = a42.i.a(bArr);
        if (a17.length() >= 32) {
            a17 = a17.substring(0, 8) + "-" + a17.substring(8, 12) + "-" + a17.substring(12, 16) + "-" + a17.substring(16, 20) + "-" + a17.substring(20);
        }
        am.e6 e6Var = exDeviceIBeaconRangingResultEvent.f54144g;
        e6Var.f6537a = a17;
        e6Var.f6540d = d17;
        e6Var.f6538b = i17;
        e6Var.f6539c = i18;
        e6Var.getClass();
        e6Var.getClass();
        e6Var.getClass();
        exDeviceIBeaconRangingResultEvent.e();
    }
}
