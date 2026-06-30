package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class ExceptionMonitorService extends android.app.Service implements com.tencent.mm.sandbox.monitor.j {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sandbox.monitor.k f192284d = null;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorService", "onCreate()");
        com.tencent.mm.sandbox.monitor.k kVar = new com.tencent.mm.sandbox.monitor.k(1);
        this.f192284d = kVar;
        kVar.b(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorService", "onDestroy()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192284d;
        if (kVar != null) {
            q65.d.b(kVar.hashCode(), kVar);
            com.tencent.mm.sandbox.monitor.k.f192293b.removeCallbacks(com.tencent.mm.sandbox.monitor.k.f192294c);
            com.tencent.mm.sandbox.monitor.k.f192295d = false;
            com.tencent.mm.sandbox.monitor.k.f192292a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f192284d = null;
        }
    }

    @Override // android.app.Service
    public void onStart(android.content.Intent intent, int i17) {
        super.onStart(intent, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorService", "onStart()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192284d;
        if (kVar != null) {
            kVar.a(intent);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorService", "onStartCommand()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192284d;
        if (kVar == null) {
            return 1;
        }
        kVar.a(intent);
        return 1;
    }
}
