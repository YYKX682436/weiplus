package vf3;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436371a;

    public c(java.lang.String errorText) {
        kotlin.jvm.internal.o.g(errorText, "errorText");
        this.f436371a = errorText;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf3.c) && kotlin.jvm.internal.o.b(this.f436371a, ((vf3.c) obj).f436371a);
    }

    public int hashCode() {
        return this.f436371a.hashCode();
    }

    public java.lang.String toString() {
        return "LiveErrorInfo(errorText=" + this.f436371a + ')';
    }
}
