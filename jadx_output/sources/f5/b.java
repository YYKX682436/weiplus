package f5;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f259568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f259569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f259570c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f259571d;

    public b(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f259568a = z17;
        this.f259569b = z18;
        this.f259570c = z19;
        this.f259571d = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5.b)) {
            return false;
        }
        f5.b bVar = (f5.b) obj;
        return this.f259568a == bVar.f259568a && this.f259569b == bVar.f259569b && this.f259570c == bVar.f259570c && this.f259571d == bVar.f259571d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public int hashCode() {
        boolean z17 = this.f259569b;
        ?? r17 = this.f259568a;
        int i17 = r17;
        if (z17) {
            i17 = r17 + 16;
        }
        int i18 = i17;
        if (this.f259570c) {
            i18 = i17 + 256;
        }
        return this.f259571d ? i18 + 4096 : i18;
    }

    public java.lang.String toString() {
        return java.lang.String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", java.lang.Boolean.valueOf(this.f259568a), java.lang.Boolean.valueOf(this.f259569b), java.lang.Boolean.valueOf(this.f259570c), java.lang.Boolean.valueOf(this.f259571d));
    }
}
