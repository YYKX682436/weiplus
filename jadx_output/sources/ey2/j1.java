package ey2;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f257402a;

    /* renamed from: b, reason: collision with root package name */
    public long f257403b;

    /* renamed from: c, reason: collision with root package name */
    public int f257404c;

    /* renamed from: d, reason: collision with root package name */
    public long f257405d;

    /* renamed from: e, reason: collision with root package name */
    public ec2.f f257406e;

    /* renamed from: f, reason: collision with root package name */
    public ec2.f f257407f;

    public j1(int i17, long j17, int i18, long j18, ec2.f fVar, ec2.f fVar2, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        j17 = (i19 & 2) != 0 ? 0L : j17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        j18 = (i19 & 8) != 0 ? 0L : j18;
        fVar = (i19 & 16) != 0 ? null : fVar;
        fVar2 = (i19 & 32) != 0 ? null : fVar2;
        this.f257402a = i17;
        this.f257403b = j17;
        this.f257404c = i18;
        this.f257405d = j18;
        this.f257406e = fVar;
        this.f257407f = fVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.j1)) {
            return false;
        }
        ey2.j1 j1Var = (ey2.j1) obj;
        return this.f257402a == j1Var.f257402a && this.f257403b == j1Var.f257403b && this.f257404c == j1Var.f257404c && this.f257405d == j1Var.f257405d && kotlin.jvm.internal.o.b(this.f257406e, j1Var.f257406e) && kotlin.jvm.internal.o.b(this.f257407f, j1Var.f257407f);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Integer.hashCode(this.f257402a) * 31) + java.lang.Long.hashCode(this.f257403b)) * 31) + java.lang.Integer.hashCode(this.f257404c)) * 31) + java.lang.Long.hashCode(this.f257405d)) * 31;
        ec2.f fVar = this.f257406e;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        ec2.f fVar2 = this.f257407f;
        return hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ThumbPlayerInfo(total=" + this.f257402a + ", actualDuration=" + this.f257403b + ", duration=" + this.f257404c + ", lastSeekTimestamp=" + this.f257405d + ", lastNotProgressEvent=" + this.f257406e + ", lastProgressEvent=" + this.f257407f + ')';
    }
}
