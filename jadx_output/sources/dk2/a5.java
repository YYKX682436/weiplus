package dk2;

/* loaded from: classes14.dex */
public final class a5 extends dk2.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f233175a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(java.lang.String resultCode, java.lang.String resultDesc) {
        super(null);
        kotlin.jvm.internal.o.g(resultCode, "resultCode");
        kotlin.jvm.internal.o.g(resultDesc, "resultDesc");
        this.f233175a = resultCode;
        this.f233176b = resultDesc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.a5)) {
            return false;
        }
        dk2.a5 a5Var = (dk2.a5) obj;
        return kotlin.jvm.internal.o.b(this.f233175a, a5Var.f233175a) && kotlin.jvm.internal.o.b(this.f233176b, a5Var.f233176b);
    }

    public int hashCode() {
        return (this.f233175a.hashCode() * 31) + this.f233176b.hashCode();
    }

    public java.lang.String toString() {
        return "Failed(resultCode=" + this.f233175a + ", resultDesc=" + this.f233176b + ')';
    }
}
