package zv;

/* loaded from: classes11.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final zv.n1 f476059d = new zv.n1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.mm_foundation.DartServiceCallerApi Bi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Bi();
        if (Bi != null) {
            Bi.flutterBSClearNotifyCache(zv.m1.f476051d);
        }
        ow.t.f349266b = false;
    }
}
