package dk2;

/* loaded from: classes3.dex */
public final class vc {

    /* renamed from: a, reason: collision with root package name */
    public boolean f234246a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f234247b;

    public vc(boolean z17, com.tencent.mm.protobuf.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        gVar = (i17 & 2) != 0 ? null : gVar;
        this.f234246a = z17;
        this.f234247b = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.vc)) {
            return false;
        }
        dk2.vc vcVar = (dk2.vc) obj;
        return this.f234246a == vcVar.f234246a && kotlin.jvm.internal.o.b(this.f234247b, vcVar.f234247b);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f234246a) * 31;
        com.tencent.mm.protobuf.g gVar = this.f234247b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public java.lang.String toString() {
        return "GroupGiftPagingData(hasMore=" + this.f234246a + ", lastBuffer=" + this.f234247b + ')';
    }
}
