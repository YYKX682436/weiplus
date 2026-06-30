package sf2;

/* loaded from: classes8.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f407354a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gy1 f407355b;

    public x1(boolean z17, r45.gy1 gy1Var) {
        this.f407354a = z17;
        this.f407355b = gy1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2.x1)) {
            return false;
        }
        sf2.x1 x1Var = (sf2.x1) obj;
        return this.f407354a == x1Var.f407354a && kotlin.jvm.internal.o.b(this.f407355b, x1Var.f407355b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f407354a) * 31;
        r45.gy1 gy1Var = this.f407355b;
        return hashCode + (gy1Var == null ? 0 : gy1Var.hashCode());
    }

    public java.lang.String toString() {
        return "ModSongExtraInfo(onlySingSegment=" + this.f407354a + ", segmentInfo=" + this.f407355b + ')';
    }
}
