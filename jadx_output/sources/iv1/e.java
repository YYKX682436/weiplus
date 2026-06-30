package iv1;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv1.f f295107d;

    public e(iv1.f fVar) {
        this.f295107d = fVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        iv1.f fVar = this.f295107d;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: " + i17);
        fv1.c cVar = fVar.f295111e;
        if (cVar != null) {
            try {
                cVar.X8(i17);
            } catch (android.os.RemoteException unused) {
            }
        }
    }
}
