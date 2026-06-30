package com.tencent.xweb.pinus.sdk.process;

/* loaded from: classes13.dex */
public class ContentChildProcessService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public vx5.a f220464d;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (this.f220464d == null) {
            vx5.a aVar = new vx5.a(intent, this, getApplicationContext());
            this.f220464d = aVar;
            try {
                by5.c4.f("ChildProcessServiceWrapper", "onCreate, call");
                aVar.d().getMethod("onCreate", new java.lang.Class[0]).invoke(aVar.f441325f, new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
                by5.c4.d("ChildProcessServiceWrapper", "onCreate, error", th6);
                xx5.e.a(aVar.b(), aVar.f441324e, aVar.f441322c, 1, aVar.e(), stackTraceString);
            }
        }
        vx5.a aVar2 = this.f220464d;
        aVar2.getClass();
        try {
            by5.c4.f("ChildProcessServiceWrapper", "onBind, call");
            return (android.os.IBinder) aVar2.d().getMethod("onBind", android.content.Intent.class).invoke(aVar2.f441325f, intent);
        } catch (java.lang.Throwable th7) {
            java.lang.String stackTraceString2 = android.util.Log.getStackTraceString(th7);
            by5.c4.d("ChildProcessServiceWrapper", "onBind, error", th7);
            xx5.e.a(aVar2.b(), aVar2.f441324e, aVar2.f441322c, 2, aVar2.e(), stackTraceString2);
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        vx5.a aVar = this.f220464d;
        aVar.getClass();
        try {
            by5.c4.f("ChildProcessServiceWrapper", "onDestroy, call");
            aVar.d().getMethod("onDestroy", new java.lang.Class[0]).invoke(aVar.f441325f, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            by5.c4.d("ChildProcessServiceWrapper", "onDestroy, error", th6);
            xx5.e.a(aVar.b(), aVar.f441324e, aVar.f441322c, 3, aVar.e(), stackTraceString);
        }
        this.f220464d = null;
    }
}
