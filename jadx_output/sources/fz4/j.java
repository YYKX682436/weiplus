package fz4;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final fz4.j f267313d = new fz4.j();

    @Override // java.lang.Runnable
    public final void run() {
        if (java.lang.System.currentTimeMillis() - fz4.k.f267316c >= 60000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "stop thread SnapShotUtil");
            android.os.HandlerThread handlerThread = fz4.k.f267315b;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            fz4.k.f267315b = null;
        }
    }
}
