package v11;

/* loaded from: classes11.dex */
public final class j extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432414a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f432415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.List blocks, v11.s sVar) {
        super(null);
        kotlin.jvm.internal.o.g(blocks, "blocks");
        this.f432414a = blocks;
        this.f432415b = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.j)) {
            return false;
        }
        v11.j jVar = (v11.j) obj;
        return kotlin.jvm.internal.o.b(this.f432414a, jVar.f432414a) && kotlin.jvm.internal.o.b(this.f432415b, jVar.f432415b);
    }

    public int hashCode() {
        int hashCode = this.f432414a.hashCode() * 31;
        v11.s sVar = this.f432415b;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "BlockquoteBlock(blocks=" + this.f432414a + ", sourceRange=" + this.f432415b + ')';
    }
}
