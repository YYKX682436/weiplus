package sc5;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406580a;

    public h(java.lang.String convSessionId) {
        kotlin.jvm.internal.o.g(convSessionId, "convSessionId");
        this.f406580a = convSessionId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc5.h) && kotlin.jvm.internal.o.b(this.f406580a, ((sc5.h) obj).f406580a);
    }

    public int hashCode() {
        return this.f406580a.hashCode();
    }

    public java.lang.String toString() {
        return "FilePreviewParams(convSessionId=" + this.f406580a + ')';
    }
}
