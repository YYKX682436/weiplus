package com.tencent.mm.plugin.performance.jectl;

/* loaded from: classes11.dex */
public class JeVersion$JeService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f152995d = 0;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.performance.jectl.d(this), 60000L);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.performance.jectl.b(this));
        return 2;
    }
}
