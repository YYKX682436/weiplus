package r01;

/* loaded from: classes7.dex */
public class a3 {

    /* renamed from: a, reason: collision with root package name */
    public int f368021a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long[] f368022b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet[] f368023c;

    public a3(int i17) {
        this.f368021a = i17;
        java.lang.Long[] lArr = new java.lang.Long[3];
        for (int i18 = 0; i18 < 3; i18++) {
            lArr[i18] = 0L;
        }
        this.f368022b = lArr;
        java.util.HashSet[] hashSetArr = new java.util.HashSet[3];
        for (int i19 = 0; i19 < 3; i19++) {
            hashSetArr[i19] = new java.util.HashSet();
        }
        this.f368023c = hashSetArr;
    }

    public final void a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        long abs = java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() / this.f368021a);
        int i17 = (int) (abs % 3);
        java.lang.Long[] lArr = this.f368022b;
        long longValue = lArr[i17].longValue();
        java.util.HashSet[] hashSetArr = this.f368023c;
        if (longValue != abs) {
            hashSetArr[i17].clear();
            lArr[i17] = java.lang.Long.valueOf(abs);
        }
        hashSetArr[i17].add(key);
    }

    public final boolean b(java.lang.String key) {
        java.util.HashSet hashSet;
        kotlin.jvm.internal.o.g(key, "key");
        long abs = java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() / this.f368021a);
        int i17 = (int) (abs % 3);
        java.lang.Long[] lArr = this.f368022b;
        long longValue = lArr[i17].longValue();
        java.util.HashSet[] hashSetArr = this.f368023c;
        if (abs == longValue) {
            hashSet = hashSetArr[i17];
        } else {
            int abs2 = java.lang.Math.abs(i17 - 1) % 3;
            hashSet = abs == lArr[abs2].longValue() ? hashSetArr[abs2] : null;
        }
        if (hashSet != null) {
            return hashSet.contains(key);
        }
        return false;
    }
}
