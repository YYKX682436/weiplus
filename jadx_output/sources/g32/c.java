package g32;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f268147a;

    /* renamed from: b, reason: collision with root package name */
    public static int f268148b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.os.Handler f268149c = new g32.a(android.os.Looper.getMainLooper());

    public static /* synthetic */ int a(int i17) {
        int i18 = i17 & f268148b;
        f268148b = i18;
        return i18;
    }

    public static /* synthetic */ int b(int i17) {
        int i18 = i17 | f268148b;
        f268148b = i18;
        return i18;
    }

    public static void c(g32.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExDeviceProcessBusyMonitor", "Operating %s", bVar);
        android.os.Handler handler = f268149c;
        handler.removeMessages(1);
        handler.sendMessage(android.os.Message.obtain(handler, 0, bVar));
    }
}
