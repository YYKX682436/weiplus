package rh2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f395646a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f395647b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f395648c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f395649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f395650e;

    public f(java.lang.String engineSoPath, java.lang.String kwsJniSoPath, java.lang.String modelPath) {
        java.lang.String concat;
        kotlin.jvm.internal.o.g(engineSoPath, "engineSoPath");
        kotlin.jvm.internal.o.g(kwsJniSoPath, "kwsJniSoPath");
        kotlin.jvm.internal.o.g(modelPath, "modelPath");
        this.f395646a = engineSoPath;
        this.f395647b = kwsJniSoPath;
        this.f395648c = modelPath;
        java.lang.String parent = new java.io.File(modelPath).getParent();
        this.f395649d = (parent == null || (concat = parent.concat("/")) == null) ? "" : concat;
        java.lang.String name = new java.io.File(modelPath).getName();
        this.f395650e = name.length() == 0 ? modelPath : name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh2.f)) {
            return false;
        }
        rh2.f fVar = (rh2.f) obj;
        return kotlin.jvm.internal.o.b(this.f395646a, fVar.f395646a) && kotlin.jvm.internal.o.b(this.f395647b, fVar.f395647b) && kotlin.jvm.internal.o.b(this.f395648c, fVar.f395648c);
    }

    public int hashCode() {
        return (((this.f395646a.hashCode() * 31) + this.f395647b.hashCode()) * 31) + this.f395648c.hashCode();
    }

    public java.lang.String toString() {
        return "KWSPaths(engineSoPath=" + this.f395646a + ", kwsJniSoPath=" + this.f395647b + ", modelPath=" + this.f395648c + ')';
    }
}
