package df5;

/* loaded from: classes11.dex */
public final class h0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.q f232118a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v11.q block, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? block.hashCode() : i17;
        kotlin.jvm.internal.o.g(block, "block");
        this.f232118a = block;
        this.f232119b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f232119b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.h0)) {
            return false;
        }
        df5.h0 h0Var = (df5.h0) obj;
        return kotlin.jvm.internal.o.b(this.f232118a, h0Var.f232118a) && this.f232119b == h0Var.f232119b;
    }

    public int hashCode() {
        return (this.f232118a.hashCode() * 31) + java.lang.Integer.hashCode(this.f232119b);
    }

    public java.lang.String toString() {
        return "Table(block=" + this.f232118a + ", contentHash=" + this.f232119b + ')';
    }
}
