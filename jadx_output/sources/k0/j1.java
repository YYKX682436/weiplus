package k0;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f302934a;

    /* renamed from: b, reason: collision with root package name */
    public final long f302935b;

    public j1(long j17, long j18, kotlin.jvm.internal.i iVar) {
        this.f302934a = j17;
        this.f302935b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0.j1)) {
            return false;
        }
        k0.j1 j1Var = (k0.j1) obj;
        return e1.y.c(this.f302934a, j1Var.f302934a) && e1.y.c(this.f302935b, j1Var.f302935b);
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return (java.lang.Long.hashCode(this.f302934a) * 31) + java.lang.Long.hashCode(this.f302935b);
    }

    public java.lang.String toString() {
        return "SelectionColors(selectionHandleColor=" + ((java.lang.Object) e1.y.i(this.f302934a)) + ", selectionBackgroundColor=" + ((java.lang.Object) e1.y.i(this.f302935b)) + ')';
    }
}
