package sl3;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static sl3.b f409252b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f409253a = new java.util.concurrent.ConcurrentHashMap();

    public b(android.content.Context context) {
    }

    public static void a(java.lang.Class cls, sl3.a aVar) {
        if (aVar != null) {
            if (f409252b == null) {
                synchronized (sl3.b.class) {
                    if (f409252b == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                        f409252b = new sl3.b(null);
                    }
                }
            }
            f409252b.f409253a.put(cls, aVar);
        }
    }

    public static sl3.a b(java.lang.Class cls) {
        if (f409252b == null) {
            synchronized (sl3.b.class) {
                if (f409252b == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    f409252b = new sl3.b(null);
                }
            }
        }
        sl3.a aVar = (sl3.a) f409252b.f409253a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return null;
    }
}
