package uc5;

/* loaded from: classes10.dex */
public final class b implements uc5.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f426471a;

    public b(boolean z17) {
        this.f426471a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc5.b) && this.f426471a == ((uc5.b) obj).f426471a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f426471a);
    }

    public java.lang.String toString() {
        return "SELECTING(isSelected=" + this.f426471a + ')';
    }
}
