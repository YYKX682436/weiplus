package rw;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400567a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f400568b;

    public a(java.lang.String name, yz5.a execute) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(execute, "execute");
        this.f400567a = name;
        this.f400568b = execute;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw.a)) {
            return false;
        }
        rw.a aVar = (rw.a) obj;
        return kotlin.jvm.internal.o.b(this.f400567a, aVar.f400567a) && kotlin.jvm.internal.o.b(this.f400568b, aVar.f400568b);
    }

    public int hashCode() {
        return (this.f400567a.hashCode() * 31) + this.f400568b.hashCode();
    }

    public java.lang.String toString() {
        return "TestItem(name=" + this.f400567a + ", execute=" + this.f400568b + ')';
    }
}
