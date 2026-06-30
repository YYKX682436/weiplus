package e2;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final i2.h f246455a = new i2.h();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f246456b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f246457c;

    /* renamed from: d, reason: collision with root package name */
    public int f246458d;

    /* renamed from: e, reason: collision with root package name */
    public int f246459e;

    /* renamed from: f, reason: collision with root package name */
    public int f246460f;

    public b(int i17) {
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f246456b = new java.util.HashMap(0, 0.75f);
        this.f246457c = new java.util.LinkedHashSet();
    }

    public final java.lang.Object a(java.lang.Object obj) {
        synchronized (this.f246455a) {
            java.lang.Object obj2 = this.f246456b.get(obj);
            if (obj2 == null) {
                this.f246460f++;
                return null;
            }
            this.f246457c.remove(obj);
            this.f246457c.add(obj);
            this.f246459e++;
            return obj2;
        }
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        java.lang.Object obj3;
        java.lang.Object obj4;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        synchronized (this.f246455a) {
            this.f246458d = d() + 1;
            put = this.f246456b.put(obj, obj2);
            if (put != null) {
                this.f246458d = d() - 1;
            }
            if (this.f246457c.contains(obj)) {
                this.f246457c.remove(obj);
            }
            this.f246457c.add(obj);
        }
        while (true) {
            synchronized (this.f246455a) {
                if (d() < 0 || ((this.f246456b.isEmpty() && d() != 0) || this.f246456b.isEmpty() != this.f246457c.isEmpty())) {
                    break;
                }
                if (d() <= 16 || this.f246456b.isEmpty()) {
                    obj3 = null;
                    obj4 = null;
                } else {
                    obj3 = kz5.n0.W(this.f246457c);
                    obj4 = this.f246456b.get(obj3);
                    if (obj4 == null) {
                        throw new java.lang.IllegalStateException("inconsistent state");
                    }
                    kotlin.jvm.internal.m0.c(this.f246456b).remove(obj3);
                    kotlin.jvm.internal.m0.a(this.f246457c).remove(obj3);
                    int d17 = d();
                    kotlin.jvm.internal.o.d(obj3);
                    this.f246458d = d17 - 1;
                }
            }
            if (obj3 == null && obj4 == null) {
                return put;
            }
            kotlin.jvm.internal.o.d(obj3);
            kotlin.jvm.internal.o.d(obj4);
        }
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
    }

    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object remove;
        obj.getClass();
        synchronized (this.f246455a) {
            remove = this.f246456b.remove(obj);
            this.f246457c.remove(obj);
            if (remove != null) {
                this.f246458d = d() - 1;
            }
        }
        return remove;
    }

    public final int d() {
        int i17;
        synchronized (this.f246455a) {
            i17 = this.f246458d;
        }
        return i17;
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this.f246455a) {
            int i17 = this.f246459e;
            int i18 = this.f246460f + i17;
            str = "LruCache[maxSize=16,hits=" + this.f246459e + ",misses=" + this.f246460f + ",hitRate=" + (i18 != 0 ? (i17 * 100) / i18 : 0) + "%]";
        }
        return str;
    }
}
