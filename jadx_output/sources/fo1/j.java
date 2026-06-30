package fo1;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f264878d;

    public j(long j17) {
        this.f264878d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetMediaTimeByPkgId, pkgId=");
        long j17 = this.f264878d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("RoamBackup.MediaPullObserver", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(j17);
        sb7.append('_');
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("RoamMediaTime", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        java.lang.String[] b17 = J2.b();
        kotlin.jvm.internal.o.f(b17, "allKeys(...)");
        for (java.lang.String str : b17) {
            kotlin.jvm.internal.o.d(str);
            if (r26.i0.y(str, sb8, false)) {
                J2.remove(str);
            }
        }
    }
}
