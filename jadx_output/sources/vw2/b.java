package vw2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f440829a;

    /* renamed from: b, reason: collision with root package name */
    public final long f440830b;

    /* renamed from: c, reason: collision with root package name */
    public final vw2.c f440831c;

    public b(long j17, long j18, vw2.c button) {
        kotlin.jvm.internal.o.g(button, "button");
        this.f440829a = j17;
        this.f440830b = j18;
        this.f440831c = button;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw2.b)) {
            return false;
        }
        vw2.b bVar = (vw2.b) obj;
        return this.f440829a == bVar.f440829a && this.f440830b == bVar.f440830b && this.f440831c == bVar.f440831c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f440829a) * 31) + java.lang.Long.hashCode(this.f440830b)) * 31) + this.f440831c.hashCode();
    }

    public java.lang.String toString() {
        return "AnimationData(animateDuration=" + this.f440829a + ", reverseDelay=" + this.f440830b + ", button=" + this.f440831c + ')';
    }
}
