package ke2;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f307002a;

    /* renamed from: b, reason: collision with root package name */
    public final long f307003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f307004c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f307005d;

    public z(long j17, long j18, int i17, com.tencent.mm.protobuf.g gVar) {
        this.f307002a = j17;
        this.f307003b = j18;
        this.f307004c = i17;
        this.f307005d = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke2.z)) {
            return false;
        }
        ke2.z zVar = (ke2.z) obj;
        return this.f307002a == zVar.f307002a && this.f307003b == zVar.f307003b && this.f307004c == zVar.f307004c && kotlin.jvm.internal.o.b(this.f307005d, zVar.f307005d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f307002a) * 31) + java.lang.Long.hashCode(this.f307003b)) * 31) + java.lang.Integer.hashCode(this.f307004c)) * 31;
        com.tencent.mm.protobuf.g gVar = this.f307005d;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public java.lang.String toString() {
        return "FinderLiveModPromoteInfoReq(objectId=" + this.f307002a + ", liveId=" + this.f307003b + ", optType=" + this.f307004c + ", op_cmd_req_buf=" + this.f307005d + ')';
    }
}
