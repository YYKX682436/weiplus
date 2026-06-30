package df5;

/* loaded from: classes11.dex */
public final class e0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.l f232081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v11.l block, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.hashCode() : i17;
        kotlin.jvm.internal.o.g(block, "block");
        this.f232081a = block;
        this.f232082b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f232082b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.e0)) {
            return false;
        }
        df5.e0 e0Var = (df5.e0) obj;
        return kotlin.jvm.internal.o.b(this.f232081a, e0Var.f232081a) && this.f232082b == e0Var.f232082b;
    }

    public int hashCode() {
        return (this.f232081a.hashCode() * 31) + java.lang.Integer.hashCode(this.f232082b);
    }

    public java.lang.String toString() {
        return "Heading(block=" + this.f232081a + ", contentHash=" + this.f232082b + ')';
    }
}
