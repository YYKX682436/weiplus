package of1;

/* loaded from: classes8.dex */
public class l implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.m f344958a;

    public l(of1.m mVar) {
        this.f344958a = mVar;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        of1.m mVar = this.f344958a;
        try {
            if (mVar.f344882f != null) {
                mVar.f344965i = java.lang.System.currentTimeMillis();
                mVar.f344882f.D8(str, new int[]{3}, 0, 0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "viewCaptureCallback, invoker is null");
            }
        } catch (android.os.RemoteException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "recog failed");
        }
    }
}
