package gy;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.c f277463d;

    public b(gy.c cVar) {
        this.f277463d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy.c cVar = this.f277463d;
        synchronized (cVar.f277467d) {
            if (cVar.f277471h) {
                long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                try {
                    cVar.f277469f.clear();
                    if (com.tencent.wechat.aff.chatbot.w0.f216518b.d(cVar.f277469f, cVar.f277470g) == 0) {
                        int remaining = cVar.f277469f.remaining();
                        int i17 = cVar.f277470g;
                        if (remaining >= i17) {
                            if (cVar.f277465b.write(cVar.f277469f, i17, cVar.f277475l ? 1 : 0) < 0) {
                                if (cVar.f277475l) {
                                    cVar.b();
                                } else {
                                    cVar.f();
                                }
                                long elapsedRealtimeNanos2 = (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000;
                                long j17 = cVar.f277473j + 20;
                                long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - elapsedRealtimeNanos2) - j17;
                                cVar.f277474k = cVar.f277475l ? java.lang.Math.max(0L, java.lang.Math.min(cVar.f277474k + elapsedRealtime, 60L)) : java.lang.Math.max(0L, java.lang.Math.min(cVar.f277474k + elapsedRealtime, 40L));
                                cVar.f277473j = j17;
                                if (cVar.f277471h) {
                                    cVar.c();
                                }
                            }
                        }
                    } else if (cVar.f277475l) {
                        java.lang.Thread.sleep(5L);
                    }
                } finally {
                    long elapsedRealtimeNanos3 = (android.os.SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000;
                    long j18 = cVar.f277473j + 20;
                    long elapsedRealtime2 = (android.os.SystemClock.elapsedRealtime() - elapsedRealtimeNanos3) - j18;
                    cVar.f277474k = cVar.f277475l ? java.lang.Math.max(0L, java.lang.Math.min(cVar.f277474k + elapsedRealtime2, 60L)) : java.lang.Math.max(0L, java.lang.Math.min(cVar.f277474k + elapsedRealtime2, 40L));
                    cVar.f277473j = j18;
                    if (cVar.f277471h) {
                        cVar.c();
                    }
                }
            }
        }
    }
}
