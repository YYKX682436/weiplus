package fb1;

/* loaded from: classes7.dex */
public final class a extends fb1.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String desc) {
        super(null);
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f260827a = desc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb1.a) && kotlin.jvm.internal.o.b(this.f260827a, ((fb1.a) obj).f260827a);
    }

    public int hashCode() {
        return this.f260827a.hashCode();
    }

    public java.lang.String toString() {
        return "Busy(desc=" + this.f260827a + ')';
    }
}
