package q7;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f360302a = new java.util.LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f360303b;

    /* renamed from: c, reason: collision with root package name */
    public long f360304c;

    public k(long j17) {
        this.f360303b = j17;
    }

    public int a(java.lang.Object obj) {
        return 1;
    }

    public void b(java.lang.Object obj, java.lang.Object obj2) {
    }

    public synchronized java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        long a17 = a(obj2);
        if (a17 >= this.f360303b) {
            b(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f360304c += a17;
        }
        java.lang.Object put = this.f360302a.put(obj, obj2);
        if (put != null) {
            this.f360304c -= a(put);
            if (!put.equals(obj2)) {
                b(obj, put);
            }
        }
        d(this.f360303b);
        return put;
    }

    public synchronized void d(long j17) {
        while (this.f360304c > j17) {
            java.util.Iterator it = ((java.util.LinkedHashMap) this.f360302a).entrySet().iterator();
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object value = entry.getValue();
            this.f360304c -= a(value);
            java.lang.Object key = entry.getKey();
            it.remove();
            b(key, value);
        }
    }
}
