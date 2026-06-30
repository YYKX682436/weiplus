package h82;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h82.i f279530d;

    public f(h82.i iVar) {
        this.f279530d = iVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        java.util.concurrent.Future future;
        h82.i iVar = this.f279530d;
        try {
            if (i17 == 0 || i17 == 3 || i17 == 2 || i17 == 5) {
                iVar.f279542d = false;
            } else {
                iVar.f279542d = true;
            }
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineService", "onNetworkChange st:%d hasNet:%s isWifi:%B, lastIsWifi:%B", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(iVar.f279542d), java.lang.Boolean.valueOf(isWifi), java.lang.Boolean.valueOf(iVar.f279541c));
            if (!iVar.f279541c) {
                iVar.f279541c = isWifi;
                if (isWifi) {
                    iVar.e();
                    return;
                }
                return;
            }
            iVar.f279541c = isWifi;
            if (isWifi || (future = iVar.f279544f) == null) {
                return;
            }
            future.cancel(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.offline.FavOfflineService", e17, "", new java.lang.Object[0]);
        }
    }
}
