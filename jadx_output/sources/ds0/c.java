package ds0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f242786a;

    /* renamed from: b, reason: collision with root package name */
    public final long f242787b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f242788c;

    public c(byte[] data, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f242786a = data;
        this.f242787b = j17;
        this.f242788c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds0.c)) {
            return false;
        }
        ds0.c cVar = (ds0.c) obj;
        return kotlin.jvm.internal.o.b(this.f242786a, cVar.f242786a) && this.f242787b == cVar.f242787b && this.f242788c == cVar.f242788c;
    }

    public int hashCode() {
        return (((java.util.Arrays.hashCode(this.f242786a) * 31) + java.lang.Long.hashCode(this.f242787b)) * 31) + java.lang.Boolean.hashCode(this.f242788c);
    }

    public java.lang.String toString() {
        return "EncoderData(data=" + java.util.Arrays.toString(this.f242786a) + ", pts=" + this.f242787b + ", isEnd=" + this.f242788c + ')';
    }
}
