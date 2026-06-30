package lh5;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f318727a;

    /* renamed from: b, reason: collision with root package name */
    public final long f318728b;

    /* renamed from: c, reason: collision with root package name */
    public final long f318729c;

    public e(float f17, long j17, long j18) {
        this.f318727a = f17;
        this.f318728b = j17;
        this.f318729c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh5.e)) {
            return false;
        }
        lh5.e eVar = (lh5.e) obj;
        return java.lang.Float.compare(this.f318727a, eVar.f318727a) == 0 && this.f318728b == eVar.f318728b && this.f318729c == eVar.f318729c;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f318727a) * 31) + java.lang.Long.hashCode(this.f318728b)) * 31) + java.lang.Long.hashCode(this.f318729c);
    }

    public java.lang.String toString() {
        return "RotateAnimationPara(degree=" + this.f318727a + ", duration=" + this.f318728b + ", startOffset=" + this.f318729c + ')';
    }
}
