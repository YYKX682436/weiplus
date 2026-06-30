package jh;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.s f299740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jh.t f299741e;

    public q(jh.t tVar, jh.s sVar) {
        this.f299741e = tVar;
        this.f299740d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jh.t tVar = this.f299741e;
        jh.s sVar = this.f299740d;
        int ordinal = tVar.f299757h.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            int ordinal2 = sVar.ordinal();
            android.os.Handler handler = tVar.f299755f;
            long j17 = tVar.f299758i;
            if (ordinal2 == 0) {
                oj.j.c("Matrix.WarmUpScheduler", "Schedule warm-up in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 1, new android.os.CancellationSignal()), j17);
                return;
            } else if (ordinal2 == 1) {
                oj.j.c("Matrix.WarmUpScheduler", "Schedule clean-up in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 3, new android.os.CancellationSignal()), j17);
                return;
            } else {
                if (ordinal2 != 2) {
                    return;
                }
                oj.j.c("Matrix.WarmUpScheduler", "Schedule request consuming in %ss", java.lang.Long.valueOf(j17 / 1000));
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 2, new android.os.CancellationSignal()), j17);
                return;
            }
        }
        android.content.Context context = tVar.f299756g;
        synchronized (tVar) {
            jh.r rVar = tVar.f299753d;
            if (rVar != null) {
                synchronized (rVar) {
                    if (!((java.util.HashSet) rVar.f299747f).contains(sVar)) {
                        ((java.util.HashSet) rVar.f299747f).add(sVar);
                    }
                }
                return;
            }
            jh.r rVar2 = new jh.r(context, tVar.f299755f, tVar.f299757h, tVar.f299758i);
            tVar.f299753d = rVar2;
            synchronized (rVar2) {
                if (!((java.util.HashSet) rVar2.f299747f).contains(sVar)) {
                    ((java.util.HashSet) rVar2.f299747f).add(sVar);
                }
            }
            oj.j.c("Matrix.WarmUpScheduler", "Register idle receiver.", new java.lang.Object[0]);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(tVar.f299753d, intentFilter);
            } else {
                context.registerReceiver(tVar.f299753d, intentFilter, 4);
            }
            tVar.f299753d.a(context);
            return;
        }
    }
}
