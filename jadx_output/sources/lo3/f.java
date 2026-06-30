package lo3;

/* loaded from: classes8.dex */
public class f implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo3.g f320185d;

    public f(lo3.g gVar) {
        this.f320185d = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        nb.f dVar;
        lo3.g gVar = this.f320185d;
        try {
            int i17 = nb.e.f336028d;
            if (iBinder == null) {
                dVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.iqoo.secure.antifraud.thirdpart.IAntiFraudDetectService");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof nb.f)) ? new nb.d(iBinder) : (nb.f) queryLocalInterface;
            }
            gVar.f320189e = dVar;
            int g17 = ((nb.d) gVar.f320189e).g(gVar.f320188d);
            if (g17 != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VAFM", "register failed: ret=" + g17);
            }
            gVar.f320189e.asBinder().linkToDeath(new lo3.e(this), 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VAFM", "connect error: " + th6);
            gVar.f320189e = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f320185d.f320189e = null;
    }
}
