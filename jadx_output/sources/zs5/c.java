package zs5;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f475326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475327b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.d1 f475328c;

    /* renamed from: d, reason: collision with root package name */
    public final at5.b f475329d;

    public c(long j17, int i17, com.tencent.wechat.aff.iam_scan.d1 sessionInfo, at5.b decodeCallBack) {
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(decodeCallBack, "decodeCallBack");
        this.f475326a = j17;
        this.f475327b = i17;
        this.f475328c = sessionInfo;
        this.f475329d = decodeCallBack;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs5.c)) {
            return false;
        }
        zs5.c cVar = (zs5.c) obj;
        return this.f475326a == cVar.f475326a && this.f475327b == cVar.f475327b && kotlin.jvm.internal.o.b(this.f475328c, cVar.f475328c) && kotlin.jvm.internal.o.b(this.f475329d, cVar.f475329d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f475326a) * 31) + java.lang.Integer.hashCode(this.f475327b)) * 31) + this.f475328c.hashCode()) * 31) + this.f475329d.hashCode();
    }

    public java.lang.String toString() {
        return "SessionInfoWrapper(session=" + this.f475326a + ", tabType=" + this.f475327b + ", sessionInfo=" + this.f475328c + ", decodeCallBack=" + this.f475329d + ')';
    }
}
