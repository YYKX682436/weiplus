package yn5;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f464032a;

    /* renamed from: b, reason: collision with root package name */
    public int f464033b;

    public h(long j17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f464032a = j17;
        this.f464033b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn5.h)) {
            return false;
        }
        yn5.h hVar = (yn5.h) obj;
        return this.f464032a == hVar.f464032a && this.f464033b == hVar.f464033b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f464032a) * 31) + java.lang.Integer.hashCode(this.f464033b);
    }

    public java.lang.String toString() {
        return "SortStruct(cost=" + this.f464032a + ", cnt=" + this.f464033b + ')';
    }
}
