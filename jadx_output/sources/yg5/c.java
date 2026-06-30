package yg5;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f462340a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f462341b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f462342c;

    public c(java.lang.String uniqueId, java.lang.CharSequence name, boolean z17) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(name, "name");
        this.f462340a = uniqueId;
        this.f462341b = name;
        this.f462342c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5.c)) {
            return false;
        }
        yg5.c cVar = (yg5.c) obj;
        return kotlin.jvm.internal.o.b(this.f462340a, cVar.f462340a) && kotlin.jvm.internal.o.b(this.f462341b, cVar.f462341b) && this.f462342c == cVar.f462342c;
    }

    public int hashCode() {
        return (((this.f462340a.hashCode() * 31) + this.f462341b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f462342c);
    }

    public java.lang.String toString() {
        return "Option(uniqueId=" + this.f462340a + ", name=" + ((java.lang.Object) this.f462341b) + ", defaultSelected=" + this.f462342c + ')';
    }
}
