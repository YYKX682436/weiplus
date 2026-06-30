package wd;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final he.a f444687a = new he.a();

    public void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ah.d.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MBLogDelegateRegistry", "dl: load magicbrush [%d]ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void b() {
        boolean z17;
        he.a aVar = f444687a;
        wd.i iVar = new wd.i(this);
        if (aVar.f280656a) {
            return;
        }
        synchronized (he.b.class) {
            if (aVar.f280656a) {
                z17 = false;
            } else {
                z17 = true;
                aVar.f280656a = true;
            }
        }
        if (z17) {
            iVar.run();
        }
    }
}
