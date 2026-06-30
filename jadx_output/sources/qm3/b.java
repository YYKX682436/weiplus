package qm3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final kp4.a f364765a;

    /* renamed from: b, reason: collision with root package name */
    public final long f364766b;

    public b(kp4.a track, long j17) {
        kotlin.jvm.internal.o.g(track, "track");
        this.f364765a = track;
        this.f364766b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm3.b)) {
            return false;
        }
        qm3.b bVar = (qm3.b) obj;
        return kotlin.jvm.internal.o.b(this.f364765a, bVar.f364765a) && this.f364766b == bVar.f364766b;
    }

    public int hashCode() {
        return (this.f364765a.hashCode() * 31) + java.lang.Long.hashCode(this.f364766b);
    }

    public java.lang.String toString() {
        return "Key(track=" + this.f364765a + ", time=" + this.f364766b + ')';
    }
}
