package df2;

/* loaded from: classes3.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f231436a;

    /* renamed from: b, reason: collision with root package name */
    public int f231437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f231438c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f231439d;

    public tf(java.lang.String id6, int i17, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f231436a = id6;
        this.f231437b = i17;
        this.f231438c = z17;
        this.f231439d = z18;
    }

    public final void a(java.lang.String id6, dk2.cg cgVar) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f231436a = id6;
        this.f231437b = cgVar != null ? cgVar.s() : 0;
        this.f231438c = cgVar != null ? cgVar.o() : false;
        this.f231439d = cgVar != null ? cgVar.g() : false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.tf)) {
            return false;
        }
        df2.tf tfVar = (df2.tf) obj;
        return kotlin.jvm.internal.o.b(this.f231436a, tfVar.f231436a) && this.f231437b == tfVar.f231437b && this.f231438c == tfVar.f231438c && this.f231439d == tfVar.f231439d;
    }

    public int hashCode() {
        return (((((this.f231436a.hashCode() * 31) + java.lang.Integer.hashCode(this.f231437b)) * 31) + java.lang.Boolean.hashCode(this.f231438c)) * 31) + java.lang.Boolean.hashCode(this.f231439d);
    }

    public java.lang.String toString() {
        return "SubLikeMsg(id=" + this.f231436a + ", likeCount=" + this.f231437b + ", selfLike=" + this.f231438c + ", selfOp=" + this.f231439d + ')';
    }
}
