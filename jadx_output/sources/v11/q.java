package v11;

/* loaded from: classes11.dex */
public final class q extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f432454a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f432455b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f432456c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.s f432457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List headers, java.util.List rows, java.util.List columnAlignments, v11.s sVar) {
        super(null);
        kotlin.jvm.internal.o.g(headers, "headers");
        kotlin.jvm.internal.o.g(rows, "rows");
        kotlin.jvm.internal.o.g(columnAlignments, "columnAlignments");
        this.f432454a = headers;
        this.f432455b = rows;
        this.f432456c = columnAlignments;
        this.f432457d = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.q)) {
            return false;
        }
        v11.q qVar = (v11.q) obj;
        return kotlin.jvm.internal.o.b(this.f432454a, qVar.f432454a) && kotlin.jvm.internal.o.b(this.f432455b, qVar.f432455b) && kotlin.jvm.internal.o.b(this.f432456c, qVar.f432456c) && kotlin.jvm.internal.o.b(this.f432457d, qVar.f432457d);
    }

    public int hashCode() {
        int hashCode = ((((this.f432454a.hashCode() * 31) + this.f432455b.hashCode()) * 31) + this.f432456c.hashCode()) * 31;
        v11.s sVar = this.f432457d;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "TableBlock(headers=" + this.f432454a + ", rows=" + this.f432455b + ", columnAlignments=" + this.f432456c + ", sourceRange=" + this.f432457d + ')';
    }
}
