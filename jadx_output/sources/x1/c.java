package x1;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i1.e f451343a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451344b;

    public c(i1.e imageVector, int i17) {
        kotlin.jvm.internal.o.g(imageVector, "imageVector");
        this.f451343a = imageVector;
        this.f451344b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1.c)) {
            return false;
        }
        x1.c cVar = (x1.c) obj;
        return kotlin.jvm.internal.o.b(this.f451343a, cVar.f451343a) && this.f451344b == cVar.f451344b;
    }

    public int hashCode() {
        return (this.f451343a.hashCode() * 31) + java.lang.Integer.hashCode(this.f451344b);
    }

    public java.lang.String toString() {
        return "ImageVectorEntry(imageVector=" + this.f451343a + ", configFlags=" + this.f451344b + ')';
    }
}
