package df5;

/* loaded from: classes11.dex */
public final class i0 extends df5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f232132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f232133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.util.List blocks, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null);
        i17 = (i18 & 2) != 0 ? blocks.hashCode() : i17;
        kotlin.jvm.internal.o.g(blocks, "blocks");
        this.f232132a = blocks;
        this.f232133b = i17;
    }

    @Override // df5.j0
    public int a() {
        return this.f232133b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.i0)) {
            return false;
        }
        df5.i0 i0Var = (df5.i0) obj;
        return kotlin.jvm.internal.o.b(this.f232132a, i0Var.f232132a) && this.f232133b == i0Var.f232133b;
    }

    public int hashCode() {
        return (this.f232132a.hashCode() * 31) + java.lang.Integer.hashCode(this.f232133b);
    }

    public java.lang.String toString() {
        return "TextSegment(blocks=" + this.f232132a + ", contentHash=" + this.f232133b + ')';
    }
}
