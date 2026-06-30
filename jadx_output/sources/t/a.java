package t;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f414256a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414257b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f414258c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f414259d;

    public a(long j17, long j18, java.lang.String msgTalker, java.lang.String srcVideoFullPath) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(srcVideoFullPath, "srcVideoFullPath");
        this.f414256a = j17;
        this.f414257b = j18;
        this.f414258c = msgTalker;
        this.f414259d = srcVideoFullPath;
    }

    public final long a() {
        return this.f414257b;
    }

    public final long b() {
        return this.f414256a;
    }

    public final java.lang.String c() {
        return this.f414258c;
    }

    public final java.lang.String d() {
        return this.f414259d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        return this.f414256a == aVar.f414256a && this.f414257b == aVar.f414257b && kotlin.jvm.internal.o.b(this.f414258c, aVar.f414258c) && kotlin.jvm.internal.o.b(this.f414259d, aVar.f414259d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f414256a) * 31) + java.lang.Long.hashCode(this.f414257b)) * 31) + this.f414258c.hashCode()) * 31) + this.f414259d.hashCode();
    }

    public java.lang.String toString() {
        return "ConvertToH265VideoInfo(msgLocalId=" + this.f414256a + ", createTime=" + this.f414257b + ", msgTalker=" + this.f414258c + ", srcVideoFullPath=" + this.f414259d + ')';
    }
}
