package v11;

/* loaded from: classes11.dex */
public final class l extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final int f432434a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f432435b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.s f432436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, java.util.List runs, v11.s sVar) {
        super(null);
        kotlin.jvm.internal.o.g(runs, "runs");
        this.f432434a = i17;
        this.f432435b = runs;
        this.f432436c = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.l)) {
            return false;
        }
        v11.l lVar = (v11.l) obj;
        return this.f432434a == lVar.f432434a && kotlin.jvm.internal.o.b(this.f432435b, lVar.f432435b) && kotlin.jvm.internal.o.b(this.f432436c, lVar.f432436c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f432434a) * 31) + this.f432435b.hashCode()) * 31;
        v11.s sVar = this.f432436c;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "Heading(level=" + this.f432434a + ", runs=" + this.f432435b + ", sourceRange=" + this.f432436c + ')';
    }
}
