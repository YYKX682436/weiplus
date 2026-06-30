package f65;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f259869a = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f259870b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f259871c = new java.util.ArrayList();

    public final void a(long j17, java.util.Map params, f65.a callback) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (this.f259871c) {
            ((java.util.ArrayList) this.f259871c).add(java.lang.Long.valueOf(j17));
        }
        this.f259869a.postDelayed(new f65.b(j17, params, callback), 5000L);
    }

    public final java.util.Map b(long j17) {
        java.util.LinkedHashMap linkedHashMap;
        synchronized (this.f259870b) {
            java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) this.f259870b).get(java.lang.Long.valueOf(j17));
            if (map != null) {
                linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.putAll(map);
            } else {
                linkedHashMap = null;
            }
        }
        return linkedHashMap;
    }
}
