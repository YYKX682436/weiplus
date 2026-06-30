package sf5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final sf5.e f407629a = new sf5.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f407630b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final sf5.b f407631c;

    static {
        jz5.h.b(sf5.a.f407628d);
        f407631c = new sf5.b();
    }

    public static final java.util.ArrayList a(sf5.e eVar) {
        java.util.ArrayList arrayList;
        eVar.getClass();
        java.util.ArrayList arrayList2 = f407630b;
        synchronized (arrayList2) {
            arrayList = arrayList2.isEmpty() ^ true ? new java.util.ArrayList(arrayList2) : null;
        }
        return arrayList;
    }
}
