package fm;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f263962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f263963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f263964c;

    public b(boolean z17, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f263962a = z17;
        this.f263963b = i17;
        this.f263964c = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm.b)) {
            return false;
        }
        fm.b bVar = (fm.b) obj;
        return this.f263962a == bVar.f263962a && this.f263963b == bVar.f263963b && kotlin.jvm.internal.o.b(this.f263964c, bVar.f263964c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f263962a) * 31) + java.lang.Integer.hashCode(this.f263963b)) * 31) + this.f263964c.hashCode();
    }

    public java.lang.String toString() {
        return "ResLoadResult(isSuccess=" + this.f263962a + ", errCode=" + this.f263963b + ", errMsg=" + this.f263964c + ')';
    }
}
