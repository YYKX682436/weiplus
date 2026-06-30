package ey2;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f257338a;

    /* renamed from: b, reason: collision with root package name */
    public final float f257339b;

    /* renamed from: c, reason: collision with root package name */
    public final long f257340c;

    public d0(float f17, float f18, long j17) {
        this.f257338a = f17;
        this.f257339b = f18;
        this.f257340c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.d0)) {
            return false;
        }
        ey2.d0 d0Var = (ey2.d0) obj;
        return java.lang.Float.compare(this.f257338a, d0Var.f257338a) == 0 && java.lang.Float.compare(this.f257339b, d0Var.f257339b) == 0 && this.f257340c == d0Var.f257340c;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f257338a) * 31) + java.lang.Float.hashCode(this.f257339b)) * 31) + java.lang.Long.hashCode(this.f257340c);
    }

    public java.lang.String toString() {
        return "LocationInfo(longitude=" + this.f257338a + ", latitude=" + this.f257339b + ", locationTimestamp=" + this.f257340c + ')';
    }

    public /* synthetic */ d0(float f17, float f18, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? 0L : j17);
    }
}
