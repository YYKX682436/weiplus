package lc3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317888a;

    /* renamed from: b, reason: collision with root package name */
    public final lc3.b f317889b;

    public c(java.lang.String pathInDataPath, lc3.b debugStrategy) {
        kotlin.jvm.internal.o.g(pathInDataPath, "pathInDataPath");
        kotlin.jvm.internal.o.g(debugStrategy, "debugStrategy");
        this.f317888a = pathInDataPath;
        this.f317889b = debugStrategy;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.c)) {
            return false;
        }
        lc3.c cVar = (lc3.c) obj;
        return kotlin.jvm.internal.o.b(this.f317888a, cVar.f317888a) && this.f317889b == cVar.f317889b;
    }

    public int hashCode() {
        return (this.f317888a.hashCode() * 31) + this.f317889b.hashCode();
    }

    public java.lang.String toString() {
        return "LocalDebugConfig(pathInDataPath=" + this.f317888a + ", debugStrategy=" + this.f317889b + ')';
    }
}
