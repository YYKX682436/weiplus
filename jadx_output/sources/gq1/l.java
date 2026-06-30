package gq1;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f274508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274509e;

    public l(gq1.o oVar, java.util.UUID uuid) {
        this.f274509e = oVar;
        this.f274508d = uuid;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        gq1.o oVar = this.f274509e;
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "stopRanging");
        java.util.UUID uuid = this.f274508d;
        if (uuid == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
            z17 = false;
        } else {
            oVar.f274522f.remove(uuid);
            oVar.e();
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "stopRanging failed!!!");
    }
}
