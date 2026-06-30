package df5;

/* loaded from: classes11.dex */
public final class g0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.o f232108a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v11.o block, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.hashCode() : i17;
        kotlin.jvm.internal.o.g(block, "block");
        this.f232108a = block;
        this.f232109b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f232109b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.g0)) {
            return false;
        }
        df5.g0 g0Var = (df5.g0) obj;
        return kotlin.jvm.internal.o.b(this.f232108a, g0Var.f232108a) && this.f232109b == g0Var.f232109b;
    }

    public int hashCode() {
        return (this.f232108a.hashCode() * 31) + java.lang.Integer.hashCode(this.f232109b);
    }

    public java.lang.String toString() {
        return "MathBlock(block=" + this.f232108a + ", contentHash=" + this.f232109b + ')';
    }
}
