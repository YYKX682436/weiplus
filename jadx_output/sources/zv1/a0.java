package zv1;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: h, reason: collision with root package name */
    public static final zv1.z f476250h = new zv1.z(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f476251i = jz5.h.b(zv1.y.f476393d);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.cache.CleanCacheTrigger f476252a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f476253b;

    /* renamed from: c, reason: collision with root package name */
    public final zv1.e0 f476254c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f476255d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f476256e;

    /* renamed from: f, reason: collision with root package name */
    public final zv1.s f476257f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f476258g;

    public a0(com.tencent.mm.plugin.clean.cache.CleanCacheTrigger trigger, java.util.Set cacheTypes, zv1.e0 threshold, boolean z17, boolean z18, zv1.s config) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(cacheTypes, "cacheTypes");
        kotlin.jvm.internal.o.g(threshold, "threshold");
        kotlin.jvm.internal.o.g(config, "config");
        this.f476252a = trigger;
        this.f476253b = cacheTypes;
        this.f476254c = threshold;
        this.f476255d = z17;
        this.f476256e = z18;
        this.f476257f = config;
        int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) ((jz5.n) f476251i).getValue()).getAndIncrement();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(trigger.name());
        sb6.append('@');
        sb6.append(andIncrement);
        sb6.append('|');
        sb6.append(kk.v.a(gm0.j1.b().h()));
        sb6.append('_');
        long j17 = 1000000;
        sb6.append(threshold.f476290a / j17);
        sb6.append('|');
        sb6.append(threshold.f476291b / j17);
        this.f476258g = sb6.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.a0)) {
            return false;
        }
        zv1.a0 a0Var = (zv1.a0) obj;
        return this.f476252a == a0Var.f476252a && kotlin.jvm.internal.o.b(this.f476253b, a0Var.f476253b) && kotlin.jvm.internal.o.b(this.f476254c, a0Var.f476254c) && this.f476255d == a0Var.f476255d && this.f476256e == a0Var.f476256e && kotlin.jvm.internal.o.b(this.f476257f, a0Var.f476257f);
    }

    public int hashCode() {
        return (((((((((this.f476252a.hashCode() * 31) + this.f476253b.hashCode()) * 31) + this.f476254c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f476255d)) * 31) + java.lang.Boolean.hashCode(this.f476256e)) * 31) + this.f476257f.hashCode();
    }

    public java.lang.String toString() {
        return "CleanCacheParams(trigger=" + this.f476252a + ", cacheTypes=" + this.f476253b + ", threshold=" + this.f476254c + ", forceClean=" + this.f476255d + ", dryRun=" + this.f476256e + ", config=" + this.f476257f + ')';
    }
}
