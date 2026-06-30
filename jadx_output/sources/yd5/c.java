package yd5;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f461088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f461089b;

    /* renamed from: c, reason: collision with root package name */
    public final long f461090c;

    /* renamed from: d, reason: collision with root package name */
    public final long f461091d;

    /* renamed from: e, reason: collision with root package name */
    public final long f461092e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f461093f;

    public c(long j17, long j18, long j19, long j27, long j28, java.lang.String contentMd5) {
        kotlin.jvm.internal.o.g(contentMd5, "contentMd5");
        this.f461088a = j17;
        this.f461089b = j18;
        this.f461090c = j19;
        this.f461091d = j27;
        this.f461092e = j28;
        this.f461093f = contentMd5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd5.c)) {
            return false;
        }
        yd5.c cVar = (yd5.c) obj;
        return this.f461088a == cVar.f461088a && this.f461089b == cVar.f461089b && this.f461090c == cVar.f461090c && this.f461091d == cVar.f461091d && this.f461092e == cVar.f461092e && kotlin.jvm.internal.o.b(this.f461093f, cVar.f461093f);
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f461088a) * 31) + java.lang.Long.hashCode(this.f461089b)) * 31) + java.lang.Long.hashCode(this.f461090c)) * 31) + java.lang.Long.hashCode(this.f461091d)) * 31) + java.lang.Long.hashCode(this.f461092e)) * 31) + this.f461093f.hashCode();
    }

    public java.lang.String toString() {
        return "UrlParseData(biz=" + this.f461088a + ", msgId=" + this.f461089b + ", idx=" + this.f461090c + ", beginOffset=" + this.f461091d + ", endOffset=" + this.f461092e + ", contentMd5=" + this.f461093f + ')';
    }
}
