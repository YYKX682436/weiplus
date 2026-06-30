package i33;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f288194a;

    /* renamed from: b, reason: collision with root package name */
    public int f288195b;

    public g1(android.view.View view, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 2) != 0 ? -1 : i17;
        kotlin.jvm.internal.o.g(view, "view");
        this.f288194a = view;
        this.f288195b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33.g1)) {
            return false;
        }
        i33.g1 g1Var = (i33.g1) obj;
        return kotlin.jvm.internal.o.b(this.f288194a, g1Var.f288194a) && this.f288195b == g1Var.f288195b;
    }

    public int hashCode() {
        return (this.f288194a.hashCode() * 31) + java.lang.Integer.hashCode(this.f288195b);
    }

    public java.lang.String toString() {
        return "ViewVisibilitySnapshot(view=" + this.f288194a + ", visibility=" + this.f288195b + ')';
    }
}
