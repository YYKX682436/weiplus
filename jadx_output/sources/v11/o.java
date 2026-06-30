package v11;

/* loaded from: classes11.dex */
public final class o extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432451a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f432452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String content, v11.s sVar) {
        super(null);
        kotlin.jvm.internal.o.g(content, "content");
        this.f432451a = content;
        this.f432452b = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.o)) {
            return false;
        }
        v11.o oVar = (v11.o) obj;
        return kotlin.jvm.internal.o.b(this.f432451a, oVar.f432451a) && kotlin.jvm.internal.o.b(this.f432452b, oVar.f432452b);
    }

    public int hashCode() {
        int hashCode = this.f432451a.hashCode() * 31;
        v11.s sVar = this.f432452b;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "MathBlock(content=" + this.f432451a + ", sourceRange=" + this.f432452b + ')';
    }
}
