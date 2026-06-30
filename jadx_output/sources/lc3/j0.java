package lc3;

/* loaded from: classes7.dex */
public final class j0 extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String text) {
        super(null);
        kotlin.jvm.internal.o.g(text, "text");
        this.f317903a = text;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.j0) && kotlin.jvm.internal.o.b(this.f317903a, ((lc3.j0) obj).f317903a);
    }

    public int hashCode() {
        return this.f317903a.hashCode();
    }

    public java.lang.String toString() {
        return "MBTextScriptDescriptor(text=" + r26.p0.E0(this.f317903a, 100) + "...)";
    }
}
