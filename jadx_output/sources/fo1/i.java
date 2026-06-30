package fo1;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final fo1.i f264877d = new fo1.i();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("RoamBackup.MediaPullObserver", "resetAll");
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("RoamMediaTime", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        J2.d();
    }
}
