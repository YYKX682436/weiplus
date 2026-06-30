package dk2;

/* loaded from: classes2.dex */
public final class sg {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f234082a;

    /* renamed from: b, reason: collision with root package name */
    public final long f234083b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f234084c;

    public sg(com.tencent.mm.protocal.protobuf.FinderObject info, long j17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 2) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(info, "info");
        this.f234082a = info;
        this.f234083b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.sg)) {
            return false;
        }
        dk2.sg sgVar = (dk2.sg) obj;
        return kotlin.jvm.internal.o.b(this.f234082a, sgVar.f234082a) && this.f234083b == sgVar.f234083b;
    }

    public int hashCode() {
        return (this.f234082a.hashCode() * 31) + java.lang.Long.hashCode(this.f234083b);
    }

    public java.lang.String toString() {
        return "LivingStatusInfoCacheItem(info=" + this.f234082a + ", timeStamp=" + this.f234083b + ')';
    }
}
