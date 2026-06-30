package pa3;

/* loaded from: classes5.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final pa3.v f353011d = new pa3.v();

    @Override // java.lang.Runnable
    public final void run() {
        if (java.lang.System.currentTimeMillis() - pa3.w.f353014c >= 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "stop thread SnapShotUtil");
            android.os.HandlerThread handlerThread = pa3.w.f353013b;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            pa3.w.f353013b = null;
        }
    }
}
