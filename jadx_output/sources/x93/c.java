package x93;

/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f452723a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.lite.api.q f452724b;

    public static final synchronized com.tencent.mm.plugin.lite.api.q a(long j17) {
        synchronized (x93.c.class) {
            if (f452723a != j17) {
                if (f452724b != null) {
                    com.tencent.mars.xlog.Log.i("ScreenshotShareConfigManager", "getConfig: pageId mismatch (stored=" + f452723a + ", current=" + j17 + "), clearing config");
                    f452723a = -1L;
                    f452724b = null;
                }
                return null;
            }
            com.tencent.mm.plugin.lite.api.q qVar = f452724b;
            if (qVar == null) {
                com.tencent.mars.xlog.Log.w("ScreenshotShareConfigManager", "getConfig: no config for pageId=" + j17);
                return null;
            }
            com.tencent.mars.xlog.Log.i("ScreenshotShareConfigManager", "getConfig: found config for pageId=" + j17);
            return qVar;
        }
    }
}
