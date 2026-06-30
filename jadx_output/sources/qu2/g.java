package qu2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f366781a;

    public g(float f17) {
        this.f366781a = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu2.g) && java.lang.Float.compare(this.f366781a, ((qu2.g) obj).f366781a) == 0;
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f366781a);
    }

    public java.lang.String toString() {
        return "MemoryData(pss=" + this.f366781a + ')';
    }
}
