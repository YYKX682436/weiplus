package ue4;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue4.q f426915d;

    public p(ue4.q qVar) {
        this.f426915d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f.INSTANCE.idkeyStat(625L, 3L, 1L, false);
        if (com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && com.tencent.mm.plugin.sport.model.c0.e()) {
            com.tencent.mm.plugin.sport.model.d wi6 = this.f426915d.f426916a.wi();
            long a17 = wi6.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", java.lang.Long.valueOf(a17));
            wi6.d(a17);
        }
    }
}
