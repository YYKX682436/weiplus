package l91;

/* loaded from: classes4.dex */
public final class b extends l91.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String value) {
        super(null);
        kotlin.jvm.internal.o.g(value, "value");
        this.f317263a = value;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l91.b) && kotlin.jvm.internal.o.b(this.f317263a, ((l91.b) obj).f317263a);
    }

    public int hashCode() {
        return this.f317263a.hashCode();
    }

    public java.lang.String toString() {
        return "USERNAME(value=" + this.f317263a + ')';
    }
}
