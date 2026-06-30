package j01;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f296973b = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f296974a = new java.util.concurrent.ConcurrentHashMap(64);

    public void a(j01.b bVar) {
        for (java.util.Map.Entry entry : this.f296974a.entrySet()) {
            java.lang.Object key = entry.getKey();
            android.os.Looper looper = entry.getValue() instanceof android.os.Looper ? (android.os.Looper) entry.getValue() : null;
            j01.a aVar = new j01.a(this, bVar, key);
            if (looper != null) {
                new com.tencent.mm.sdk.platformtools.n3(looper).post(aVar);
            } else {
                f296973b.post(aVar);
            }
        }
    }
}
