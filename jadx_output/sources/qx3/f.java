package qx3;

/* loaded from: classes10.dex */
public final class f extends qx3.g {

    /* renamed from: a, reason: collision with root package name */
    public final long f367353a;

    /* renamed from: b, reason: collision with root package name */
    public final vx3.i f367354b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367355c;

    public f(long j17, vx3.i iVar, int i17) {
        super(null);
        this.f367353a = j17;
        this.f367354b = iVar;
        this.f367355c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx3.f)) {
            return false;
        }
        qx3.f fVar = (qx3.f) obj;
        return this.f367353a == fVar.f367353a && kotlin.jvm.internal.o.b(this.f367354b, fVar.f367354b) && this.f367355c == fVar.f367355c;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f367353a) * 31;
        vx3.i iVar = this.f367354b;
        return ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f367355c);
    }

    public java.lang.String toString() {
        return "onPlay(id=" + this.f367353a + ", desc=" + this.f367354b + ", state=" + this.f367355c + ')';
    }
}
