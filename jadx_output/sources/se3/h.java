package se3;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406918a;

    public h(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f406918a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.h) && kotlin.jvm.internal.o.b(this.f406918a, ((se3.h) obj).f406918a);
    }

    public int hashCode() {
        return this.f406918a.hashCode();
    }

    public java.lang.String toString() {
        return "UpdateDataEvent(data=" + this.f406918a + ')';
    }
}
