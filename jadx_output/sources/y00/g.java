package y00;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f458525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f458526b;

    public g(java.util.Map values, long j17) {
        kotlin.jvm.internal.o.g(values, "values");
        this.f458525a = values;
        this.f458526b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.g)) {
            return false;
        }
        y00.g gVar = (y00.g) obj;
        return kotlin.jvm.internal.o.b(this.f458525a, gVar.f458525a) && this.f458526b == gVar.f458526b;
    }

    public int hashCode() {
        return (this.f458525a.hashCode() * 31) + java.lang.Long.hashCode(this.f458526b);
    }

    public java.lang.String toString() {
        return "Entry(values=" + this.f458525a + ", updateTimeMs=" + this.f458526b + ')';
    }
}
