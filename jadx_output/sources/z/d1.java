package z;

/* loaded from: classes13.dex */
public final class d1 implements z.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final z.c1 f468627a;

    public d1(z.c1 config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f468627a = config;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z.d1) {
            if (kotlin.jvm.internal.o.b(this.f468627a, ((z.d1) obj).f468627a)) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g0, z.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public z.c4 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        z.c1 c1Var = this.f468627a;
        java.util.Map map = c1Var.f468615b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.Object key = entry.getKey();
            z.b1 b1Var = (z.b1) entry.getValue();
            b1Var.getClass();
            yz5.l convertToVector = ((z.x2) converter).f468873a;
            kotlin.jvm.internal.o.g(convertToVector, "convertToVector");
            linkedHashMap.put(key, new jz5.l(convertToVector.invoke(b1Var.f468593a), b1Var.f468594b));
        }
        int i17 = c1Var.f468614a;
        c1Var.getClass();
        return new z.c4(linkedHashMap, i17, 0);
    }

    public int hashCode() {
        return this.f468627a.hashCode();
    }
}
