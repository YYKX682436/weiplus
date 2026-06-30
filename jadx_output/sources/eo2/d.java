package eo2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f255559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f255560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f255561c;

    /* renamed from: d, reason: collision with root package name */
    public long f255562d;

    /* renamed from: e, reason: collision with root package name */
    public int f255563e;

    public d(boolean z17, int i17, int i18, long j17, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i19 = (i27 & 16) != 0 ? 0 : i19;
        this.f255559a = z17;
        this.f255560b = i17;
        this.f255561c = i18;
        this.f255562d = j17;
        this.f255563e = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo2.d)) {
            return false;
        }
        eo2.d dVar = (eo2.d) obj;
        return this.f255559a == dVar.f255559a && this.f255560b == dVar.f255560b && this.f255561c == dVar.f255561c && this.f255562d == dVar.f255562d && this.f255563e == dVar.f255563e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f255559a) * 31) + java.lang.Integer.hashCode(this.f255560b)) * 31) + java.lang.Integer.hashCode(this.f255561c)) * 31) + java.lang.Long.hashCode(this.f255562d)) * 31) + java.lang.Integer.hashCode(this.f255563e);
    }

    public java.lang.String toString() {
        return "StatusInfo(success=" + this.f255559a + ", memberShipStatus=" + this.f255560b + ", visitorMemberStatus=" + this.f255561c + ", expireTime=" + this.f255562d + ", repeatCount=" + this.f255563e + ')';
    }
}
