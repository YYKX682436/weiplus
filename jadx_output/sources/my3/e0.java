package my3;

/* loaded from: classes13.dex */
public final class e0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final my3.d0 f332799d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f332800e;

    public e0(my3.d0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f332799d = callback;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceConnected");
        this.f332800e = true;
        my3.g gVar = (my3.g) this.f332799d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceConnected %s", componentName);
        my3.q qVar = gVar.f332802a;
        qVar.f332836v.d();
        qVar.f332825h = 0;
        java.util.concurrent.locks.ReentrantLock reentrantLock = qVar.f332826i;
        reentrantLock.lock();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("serviceConnectionCallbackList size ");
        java.util.ArrayList arrayList = qVar.f332828n;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", sb6.toString());
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((my3.k) ((fy3.g) it.next())).a();
            }
            arrayList.clear();
        }
        ky3.b bVar = qVar.f332824g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ky3.b bVar2 = qVar.f332824g;
        bVar.f313616c = currentTimeMillis - bVar2.f313615b;
        bVar2.f313615b = 0L;
        reentrantLock.unlock();
        qVar.f332830p = true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceConnection", "onServiceDisconnected");
        this.f332800e = false;
        my3.g gVar = (my3.g) this.f332799d;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceDisconnected %s", componentName);
        my3.q qVar = gVar.f332802a;
        qVar.Ni();
        qVar.f332830p = false;
    }
}
