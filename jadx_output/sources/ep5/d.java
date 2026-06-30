package ep5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f255773a = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f255774b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f255775c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f255776d;

    public final void a(java.lang.String tag, boolean z17) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f255774b;
        java.lang.Object obj = concurrentHashMap.get(tag);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new ep5.a(tag)))) != null) {
            obj = putIfAbsent;
        }
        ep5.a aVar = (ep5.a) obj;
        if (aVar.f255768e == 0) {
            aVar.f255768e = java.lang.System.currentTimeMillis();
        }
        if (!z17) {
            aVar.f255766c++;
        } else {
            aVar.f255765b++;
            aVar.f255767d = java.lang.System.currentTimeMillis();
        }
    }
}
