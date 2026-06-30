package ru5;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static final ru5.d f399792b = new ru5.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f399793c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Looper f399794a;

    public d() {
        int i17 = pu5.h.f358472b;
        android.os.HandlerThread a17 = pu5.f.a("TP#Internal", 5);
        a17.setPriority(8);
        a17.start();
        this.f399794a = a17.getLooper();
    }

    public static android.os.Handler a(java.lang.String str, android.os.Handler.Callback callback) {
        ru5.d dVar = f399792b;
        ru5.c cVar = new ru5.c(str, dVar.f399794a, callback);
        f399793c.put(dVar.f399794a, new java.lang.ref.WeakReference(cVar));
        return cVar;
    }
}
