package k55;

/* loaded from: classes8.dex */
public class j implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k55.k f304469d;

    public j(k55.k kVar) {
        this.f304469d = kVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        k55.h fVar;
        int i17 = k55.g.f304467d;
        if (iBinder == null) {
            fVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
            fVar = (queryLocalInterface == null || !(queryLocalInterface instanceof k55.h)) ? new k55.f(iBinder) : (k55.h) queryLocalInterface;
        }
        k55.k kVar = this.f304469d;
        kVar.f304471b = fVar;
        java.util.List list = kVar.f304470a;
        for (java.lang.Runnable runnable : (java.lang.Runnable[]) ((java.util.LinkedList) list).toArray(new java.lang.Runnable[((java.util.LinkedList) list).size()])) {
            if (runnable != null) {
                runnable.run();
            }
        }
        ((java.util.LinkedList) kVar.f304470a).clear();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        k55.k kVar = this.f304469d;
        kVar.f304471b = null;
        com.tencent.mm.sdk.platformtools.x2.f193071a.unbindService(kVar.f304472c);
    }
}
