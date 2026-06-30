package vf0;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f436156a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436157b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436158c;

    /* renamed from: d, reason: collision with root package name */
    public final int f436159d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436160e;

    public f(boolean z17, java.lang.String targetPath, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        this.f436156a = z17;
        this.f436157b = targetPath;
        this.f436158c = i17;
        this.f436159d = i18;
        this.f436160e = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.f)) {
            return false;
        }
        vf0.f fVar = (vf0.f) obj;
        return this.f436156a == fVar.f436156a && kotlin.jvm.internal.o.b(this.f436157b, fVar.f436157b) && this.f436158c == fVar.f436158c && this.f436159d == fVar.f436159d && kotlin.jvm.internal.o.b(this.f436160e, fVar.f436160e);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f436156a) * 31) + this.f436157b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f436158c)) * 31) + java.lang.Integer.hashCode(this.f436159d)) * 31;
        java.lang.String str = this.f436160e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "CompressExecuteResult(success=" + this.f436156a + ", targetPath=" + this.f436157b + ", duration=" + this.f436158c + ", errorCode=" + this.f436159d + ", errorMsg=" + this.f436160e + ')';
    }
}
