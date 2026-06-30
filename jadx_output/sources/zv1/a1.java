package zv1;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.z0 f476259f = new zv1.z0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f476260a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476261b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476262c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f476263d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f476264e;

    public a1(java.lang.String path, long j17, long j18, boolean z17, jz5.l lVar) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f476260a = path;
        this.f476261b = j17;
        this.f476262c = j18;
        this.f476263d = z17;
        this.f476264e = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.a1)) {
            return false;
        }
        zv1.a1 a1Var = (zv1.a1) obj;
        return kotlin.jvm.internal.o.b(this.f476260a, a1Var.f476260a) && this.f476261b == a1Var.f476261b && this.f476262c == a1Var.f476262c && this.f476263d == a1Var.f476263d && kotlin.jvm.internal.o.b(this.f476264e, a1Var.f476264e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f476260a.hashCode() * 31) + java.lang.Long.hashCode(this.f476261b)) * 31) + java.lang.Long.hashCode(this.f476262c)) * 31) + java.lang.Boolean.hashCode(this.f476263d)) * 31;
        jz5.l lVar = this.f476264e;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public java.lang.String toString() {
        return "FileSizeInfo(path=" + this.f476260a + ", sizeIncludeSubFiles=" + this.f476261b + ", time=" + this.f476262c + ", isDirectory=" + this.f476263d + ", isExempted=" + this.f476264e + ')';
    }
}
