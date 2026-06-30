package sn1;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f410031a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410033c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410034d;

    public j(com.tencent.mm.protobuf.f fVar, int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f410031a = fVar;
        this.f410032b = i17;
        this.f410033c = i18;
        this.f410034d = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn1.j)) {
            return false;
        }
        sn1.j jVar = (sn1.j) obj;
        return kotlin.jvm.internal.o.b(this.f410031a, jVar.f410031a) && this.f410032b == jVar.f410032b && this.f410033c == jVar.f410033c && kotlin.jvm.internal.o.b(this.f410034d, jVar.f410034d);
    }

    public int hashCode() {
        com.tencent.mm.protobuf.f fVar = this.f410031a;
        return ((((((fVar == null ? 0 : fVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410032b)) * 31) + java.lang.Integer.hashCode(this.f410033c)) * 31) + this.f410034d.hashCode();
    }

    public java.lang.String toString() {
        return "CgiBack(resp=" + this.f410031a + ", errType=" + this.f410032b + ", errCode=" + this.f410033c + ", errMsg=" + this.f410034d + ')';
    }
}
