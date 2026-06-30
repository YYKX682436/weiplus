package kh5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f308064a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f308065b;

    /* renamed from: c, reason: collision with root package name */
    public final jh5.a f308066c;

    public c(long j17, boolean z17, jh5.a ext) {
        kotlin.jvm.internal.o.g(ext, "ext");
        this.f308064a = j17;
        this.f308065b = z17;
        this.f308066c = ext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh5.c)) {
            return false;
        }
        kh5.c cVar = (kh5.c) obj;
        return this.f308064a == cVar.f308064a && this.f308065b == cVar.f308065b && kotlin.jvm.internal.o.b(this.f308066c, cVar.f308066c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f308064a) * 31) + java.lang.Boolean.hashCode(this.f308065b)) * 31) + this.f308066c.hashCode();
    }

    public java.lang.String toString() {
        return "MagicEggSendItem(sendTime=" + this.f308064a + ", clickable=" + this.f308065b + ", ext=" + this.f308066c + ')';
    }
}
