package xu5;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.ThreadLocal f457298c = new java.lang.ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public static xu5.b f457299d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f457300e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f457301f = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f457302a;

    /* renamed from: b, reason: collision with root package name */
    public final xu5.t f457303b = new xu5.t(new xu5.d(new xu5.a(this)));

    public b(java.lang.String str) {
        this.f457302a = str;
        f457300e.put(str, this);
    }

    public static xu5.b a(java.lang.String str) {
        return new xu5.b(str + "@" + f457301f.getAndIncrement());
    }

    public static xu5.b b() {
        if (f457299d == null) {
            java.lang.String c17 = c(android.os.Looper.getMainLooper());
            xu5.b bVar = (xu5.b) f457300e.get(c17);
            if (bVar == null) {
                bVar = new xu5.b(c17);
            }
            f457299d = bVar;
        }
        return f457299d;
    }

    public static java.lang.String c(android.os.Looper looper) {
        if (looper == null) {
            return null;
        }
        java.lang.Thread thread = looper.getThread();
        return thread.getName() + "@" + thread.getId();
    }

    public static xu5.b d() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper() ? b() : (xu5.b) f457298c.get();
    }

    public static java.lang.String e() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            return b().f457302a;
        }
        xu5.b bVar = (xu5.b) f457298c.get();
        if (bVar == null) {
            return null;
        }
        return bVar.f457302a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof xu5.b) {
            return ((xu5.b) obj).f457302a.equals(this.f457302a);
        }
        return false;
    }

    public int hashCode() {
        return this.f457302a.hashCode();
    }

    public java.lang.String toString() {
        return "[" + this.f457302a + "]";
    }
}
