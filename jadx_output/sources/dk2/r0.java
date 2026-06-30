package dk2;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f233991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f233992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f233993c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233994d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.b f233995e;

    public r0(boolean z17, int i17, int i18, java.lang.String errMsg, km2.b bVar) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f233991a = z17;
        this.f233992b = i17;
        this.f233993c = i18;
        this.f233994d = errMsg;
        this.f233995e = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.r0)) {
            return false;
        }
        dk2.r0 r0Var = (dk2.r0) obj;
        return this.f233991a == r0Var.f233991a && this.f233992b == r0Var.f233992b && this.f233993c == r0Var.f233993c && kotlin.jvm.internal.o.b(this.f233994d, r0Var.f233994d) && kotlin.jvm.internal.o.b(this.f233995e, r0Var.f233995e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f233991a) * 31) + java.lang.Integer.hashCode(this.f233992b)) * 31) + java.lang.Integer.hashCode(this.f233993c)) * 31) + this.f233994d.hashCode()) * 31;
        km2.b bVar = this.f233995e;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public java.lang.String toString() {
        return "CloseLiveResult(success=" + this.f233991a + ", errCode=" + this.f233992b + ", errType=" + this.f233993c + ", errMsg=" + this.f233994d + ", anchorFinishInfo=" + this.f233995e + ')';
    }
}
