package fn2;

/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f264284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264286c;

    public i1(boolean z17, int i17, int i18) {
        this.f264284a = z17;
        this.f264285b = i17;
        this.f264286c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2.i1)) {
            return false;
        }
        fn2.i1 i1Var = (fn2.i1) obj;
        return this.f264284a == i1Var.f264284a && this.f264285b == i1Var.f264285b && this.f264286c == i1Var.f264286c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f264284a) * 31) + java.lang.Integer.hashCode(this.f264285b)) * 31) + java.lang.Integer.hashCode(this.f264286c);
    }

    public java.lang.String toString() {
        return "TargetSongLocateResult(isInSungList=" + this.f264284a + ", targetTab=" + this.f264285b + ", songPosition=" + this.f264286c + ')';
    }
}
