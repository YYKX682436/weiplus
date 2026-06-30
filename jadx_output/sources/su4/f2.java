package su4;

/* loaded from: classes5.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final su4.f2 f412879b = new su4.f2(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f412880a;

    public f2(long j17) {
        this.f412880a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su4.f2) && this.f412880a == ((su4.f2) obj).f412880a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f412880a);
    }

    public java.lang.String toString() {
        return "SearchEntryStatistics(clickTeachEnterTimestamp=" + this.f412880a + ')';
    }
}
