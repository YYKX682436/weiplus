package ky1;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f313493a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f313494b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f313495c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f313496d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f313497e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f313498f;

    public c(long j17, java.lang.Object obj, java.lang.String str, java.util.Map map, java.util.List list, boolean z17, ky1.a aVar) {
        this.f313493a = j17;
        this.f313494b = obj;
        this.f313495c = str;
        if (map != null) {
            for (java.lang.String str2 : map.keySet()) {
                java.lang.Object obj2 = map.get(str2);
                if (obj2 != null) {
                    ((java.util.concurrent.ConcurrentHashMap) this.f313496d).put(str2, obj2);
                }
            }
        }
        this.f313497e = list;
        this.f313498f = z17;
    }

    public static ky1.b a() {
        return new ky1.b(null);
    }

    public java.lang.String toString() {
        return "EventData{mTarget=" + this.f313494b + ", mTime='" + this.f313493a + "', mEventId='" + this.f313495c + "', mRouteRules='" + this.f313497e + "', mIsBringPageInfo='" + this.f313498f + "', mParams=" + this.f313496d + '}';
    }
}
