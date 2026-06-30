package k91;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f305672a;

    /* renamed from: b, reason: collision with root package name */
    public float f305673b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f305674c;

    public m0(boolean z17, float f17, java.util.Map hitOptimizations, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        hitOptimizations = (i17 & 4) != 0 ? new java.util.LinkedHashMap() : hitOptimizations;
        kotlin.jvm.internal.o.g(hitOptimizations, "hitOptimizations");
        this.f305672a = z17;
        this.f305673b = f17;
        this.f305674c = hitOptimizations;
    }

    public final java.util.Map a() {
        java.util.Map map = this.f305674c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue()), entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            k91.q0 q0Var = (k91.q0) entry2.getValue();
            linkedHashMap2.put(key, kz5.c1.k(new jz5.l("needDownload", java.lang.Boolean.valueOf(q0Var.f305729a)), new jz5.l("startTime", java.lang.Long.valueOf(q0Var.f305730b))));
        }
        return kz5.c1.k(new jz5.l("loaded", java.lang.Boolean.valueOf(this.f305672a)), new jz5.l("progress", java.lang.Float.valueOf(this.f305673b)), new jz5.l("hitOptimizations", linkedHashMap2));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k91.m0)) {
            return false;
        }
        k91.m0 m0Var = (k91.m0) obj;
        return this.f305672a == m0Var.f305672a && java.lang.Float.compare(this.f305673b, m0Var.f305673b) == 0 && kotlin.jvm.internal.o.b(this.f305674c, m0Var.f305674c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f305672a) * 31) + java.lang.Float.hashCode(this.f305673b)) * 31) + this.f305674c.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandLoadInfo(loaded=" + this.f305672a + ", progress=" + this.f305673b + ", hitOptimizations=" + this.f305674c + ')';
    }
}
