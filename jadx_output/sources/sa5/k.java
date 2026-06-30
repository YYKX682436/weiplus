package sa5;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f405353a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.Interpolator f405354b;

    public k(float f17, android.view.animation.Interpolator interpolator, int i17, kotlin.jvm.internal.i iVar) {
        interpolator = (i17 & 2) != 0 ? null : interpolator;
        this.f405353a = f17;
        this.f405354b = interpolator;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa5.k)) {
            return false;
        }
        sa5.k kVar = (sa5.k) obj;
        return java.lang.Float.compare(this.f405353a, kVar.f405353a) == 0 && kotlin.jvm.internal.o.b(this.f405354b, kVar.f405354b);
    }

    public int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.f405353a) * 31;
        android.view.animation.Interpolator interpolator = this.f405354b;
        return hashCode + (interpolator == null ? 0 : interpolator.hashCode());
    }

    public java.lang.String toString() {
        return "FadeData(alpha=" + this.f405353a + ", interpolator=" + this.f405354b + ')';
    }
}
