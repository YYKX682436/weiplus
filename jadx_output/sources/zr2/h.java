package zr2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final zr2.h f475189d = new zr2.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("FinderSearchRelPreLoader", "clear task");
        synchronized (zr2.d.f475180b) {
            com.tencent.mars.xlog.Log.i("FinderSearchRelBatchLoadObjectCache", "clear cache");
            ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) zr2.d.f475181c).getValue()).clear();
        }
    }
}
