package t0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f414260a;

    public a(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f414260a = (i18 & 1) != 0 ? 0 : i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0.a) && this.f414260a == ((t0.a) obj).f414260a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f414260a);
    }

    public java.lang.String toString() {
        return "DeltaCounter(count=" + this.f414260a + ')';
    }
}
