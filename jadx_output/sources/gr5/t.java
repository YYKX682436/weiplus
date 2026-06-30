package gr5;

/* loaded from: classes8.dex */
public final class t implements gr5.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f274947b;

    public t(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f274947b = (i18 & 1) != 0 ? 200 : i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gr5.t.class == obj.getClass() && this.f274947b == ((gr5.t) obj).f274947b;
    }

    public int hashCode() {
        return this.f274947b;
    }

    public java.lang.String toString() {
        return "DefaultPanToScaleTransformer(reference=" + this.f274947b + ')';
    }
}
