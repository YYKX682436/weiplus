package sa5;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f405363a;

    /* renamed from: b, reason: collision with root package name */
    public final float f405364b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f405365c;

    /* renamed from: d, reason: collision with root package name */
    public final sa5.v f405366d;

    public p(float f17, float f18, android.view.animation.Interpolator interpolator, sa5.v scaleType, int i17, kotlin.jvm.internal.i iVar) {
        interpolator = (i17 & 4) != 0 ? null : interpolator;
        scaleType = (i17 & 8) != 0 ? sa5.r.f405369a : scaleType;
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        this.f405363a = f17;
        this.f405364b = f18;
        this.f405365c = interpolator;
        this.f405366d = scaleType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa5.p)) {
            return false;
        }
        sa5.p pVar = (sa5.p) obj;
        return java.lang.Float.compare(this.f405363a, pVar.f405363a) == 0 && java.lang.Float.compare(this.f405364b, pVar.f405364b) == 0 && kotlin.jvm.internal.o.b(this.f405365c, pVar.f405365c) && kotlin.jvm.internal.o.b(this.f405366d, pVar.f405366d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Float.hashCode(this.f405363a) * 31) + java.lang.Float.hashCode(this.f405364b)) * 31;
        android.view.animation.Interpolator interpolator = this.f405365c;
        return ((hashCode + (interpolator == null ? 0 : interpolator.hashCode())) * 31) + this.f405366d.hashCode();
    }

    public java.lang.String toString() {
        return "ScaleData(scaleX=" + this.f405363a + ", scaleY=" + this.f405364b + ", interpolator=" + this.f405365c + ", scaleType=" + this.f405366d + ')';
    }
}
