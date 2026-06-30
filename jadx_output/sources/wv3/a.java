package wv3;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r26.t f450046a;

    /* renamed from: b, reason: collision with root package name */
    public final wv3.k f450047b;

    public a(r26.t regex, wv3.k type) {
        kotlin.jvm.internal.o.g(regex, "regex");
        kotlin.jvm.internal.o.g(type, "type");
        this.f450046a = regex;
        this.f450047b = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3.a)) {
            return false;
        }
        wv3.a aVar = (wv3.a) obj;
        return kotlin.jvm.internal.o.b(this.f450046a, aVar.f450046a) && kotlin.jvm.internal.o.b(this.f450047b, aVar.f450047b);
    }

    public int hashCode() {
        return (this.f450046a.hashCode() * 31) + this.f450047b.hashCode();
    }

    public java.lang.String toString() {
        return "MusicPattern(regex=" + this.f450046a + ", type=" + this.f450047b + ')';
    }
}
