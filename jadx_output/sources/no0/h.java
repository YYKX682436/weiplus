package no0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final no0.h f338720a = new no0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f338721b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f338722c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f338723d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f338724e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f338725f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f338726g = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public final void a() {
        java.util.Map liveMessageCallbacks = f338722c;
        kotlin.jvm.internal.o.f(liveMessageCallbacks, "liveMessageCallbacks");
        synchronized (liveMessageCallbacks) {
            java.util.Iterator it = liveMessageCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                ((yz5.a) ((java.util.Map.Entry) it.next()).getValue()).invoke();
            }
        }
    }

    public final void b() {
        java.util.Map liveSlowMessageCallbacks = f338726g;
        kotlin.jvm.internal.o.f(liveSlowMessageCallbacks, "liveSlowMessageCallbacks");
        synchronized (liveSlowMessageCallbacks) {
            java.util.Iterator it = liveSlowMessageCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                ((yz5.a) ((java.util.Map.Entry) it.next()).getValue()).invoke();
            }
        }
    }

    public final void c(java.lang.String key, yz5.a callback) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Map liveMessageCallbacks = f338722c;
        kotlin.jvm.internal.o.f(liveMessageCallbacks, "liveMessageCallbacks");
        liveMessageCallbacks.put(key, callback);
    }

    public final void d(java.lang.String key, yz5.a callback) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Map liveSlowMessageCallbacks = f338726g;
        kotlin.jvm.internal.o.f(liveSlowMessageCallbacks, "liveSlowMessageCallbacks");
        liveSlowMessageCallbacks.put(key, callback);
    }

    public final void e() {
        f338722c.clear();
        f338726g.clear();
        f338723d.clear();
        f338724e.clear();
        f338721b.clear();
        f338725f.clear();
    }
}
