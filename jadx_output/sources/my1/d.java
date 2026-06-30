package my1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f332675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332677c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f332678d;

    public d(com.tencent.mm.protobuf.f fVar, int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f332675a = fVar;
        this.f332676b = i17;
        this.f332677c = i18;
        this.f332678d = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my1.d)) {
            return false;
        }
        my1.d dVar = (my1.d) obj;
        return kotlin.jvm.internal.o.b(this.f332675a, dVar.f332675a) && this.f332676b == dVar.f332676b && this.f332677c == dVar.f332677c && kotlin.jvm.internal.o.b(this.f332678d, dVar.f332678d);
    }

    public int hashCode() {
        com.tencent.mm.protobuf.f fVar = this.f332675a;
        return ((((((fVar == null ? 0 : fVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f332676b)) * 31) + java.lang.Integer.hashCode(this.f332677c)) * 31) + this.f332678d.hashCode();
    }

    public java.lang.String toString() {
        return "CgiBack(resp=" + this.f332675a + ", errType=" + this.f332676b + ", errCode=" + this.f332677c + ", errMsg=" + this.f332678d + ')';
    }
}
