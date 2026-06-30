package xf0;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final xf0.k f454192a;

    /* renamed from: b, reason: collision with root package name */
    public int f454193b;

    public j(xf0.k resultType) {
        kotlin.jvm.internal.o.g(resultType, "resultType");
        this.f454192a = resultType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf0.j) && this.f454192a == ((xf0.j) obj).f454192a;
    }

    public int hashCode() {
        return this.f454192a.hashCode();
    }

    public java.lang.String toString() {
        return "MsgVideoDownloadResult(resultType=" + this.f454192a + ')';
    }
}
