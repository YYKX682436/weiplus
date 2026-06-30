package lb;

/* loaded from: classes13.dex */
public class d implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lb.e f317653d;

    public d(lb.e eVar, lb.a aVar) {
        this.f317653d = eVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        lb.i gVar;
        synchronized (this.f317653d.f317654a) {
            lb.e eVar = this.f317653d;
            int i17 = lb.h.f317661d;
            if (iBinder == null) {
                gVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.nfc.sdk.service.ICUPOnlinePayService");
                gVar = (queryLocalInterface == null || !(queryLocalInterface instanceof lb.i)) ? new lb.g(iBinder) : (lb.i) queryLocalInterface;
            }
            eVar.f317656c = gVar;
            this.f317653d.f317654a.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f317653d.f317654a) {
            lb.e eVar = this.f317653d;
            eVar.f317656c = null;
            eVar.f317654a.notifyAll();
        }
    }
}
