package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class ExceptionMonitorMMService extends com.tencent.mm.service.MMService implements com.tencent.mm.sandbox.monitor.j {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sandbox.monitor.k f192283i = null;

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.ExceptionMonitorMMService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        return null;
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        super.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorMMService", "onCreate()");
        com.tencent.mm.sandbox.monitor.k kVar = new com.tencent.mm.sandbox.monitor.k(2);
        this.f192283i = kVar;
        kVar.b(this);
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        super.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorMMService", "onDestroy()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192283i;
        if (kVar != null) {
            q65.d.b(kVar.hashCode(), kVar);
            com.tencent.mm.sandbox.monitor.k.f192293b.removeCallbacks(com.tencent.mm.sandbox.monitor.k.f192294c);
            com.tencent.mm.sandbox.monitor.k.f192295d = false;
            com.tencent.mm.sandbox.monitor.k.f192292a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "onDestroy");
            this.f192283i = null;
        }
    }

    @Override // com.tencent.mm.service.MMService
    public void f(android.content.Intent intent, int i17) {
        super.f(intent, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorMMService", "onStart()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192283i;
        if (kVar == null || kVar == null) {
            return;
        }
        kVar.a(intent);
    }

    @Override // com.tencent.mm.service.MMService
    public int g(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitorMMService", "onStartCommand()");
        com.tencent.mm.sandbox.monitor.k kVar = this.f192283i;
        if (kVar == null || kVar == null) {
            return 1;
        }
        kVar.a(intent);
        return 1;
    }
}
