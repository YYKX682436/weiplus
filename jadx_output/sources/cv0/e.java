package cv0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final cv0.e f222530c;

    /* renamed from: d, reason: collision with root package name */
    public static final cv0.e f222531d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f222532a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f222533b;

    static {
        kz5.p0 p0Var = kz5.p0.f313996d;
        f222530c = new cv0.e(p0Var, "EMPTY");
        f222531d = new cv0.e(p0Var, com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);
    }

    public e(java.util.List options, java.lang.String name) {
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(name, "name");
        this.f222532a = options;
        this.f222533b = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.e)) {
            return false;
        }
        cv0.e eVar = (cv0.e) obj;
        return kotlin.jvm.internal.o.b(this.f222532a, eVar.f222532a) && kotlin.jvm.internal.o.b(this.f222533b, eVar.f222533b);
    }

    public int hashCode() {
        return (this.f222532a.hashCode() * 31) + this.f222533b.hashCode();
    }

    public java.lang.String toString() {
        return "HandleBoxShowOption(options=" + this.f222532a + ", name=" + this.f222533b + ')';
    }
}
