package zv1;

/* loaded from: classes14.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final zv1.d1 f476292f = new zv1.d1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f476293a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476294b;

    /* renamed from: c, reason: collision with root package name */
    public final long f476295c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f476296d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f476297e;

    public e1(java.lang.String path, long j17, long j18, boolean z17, jz5.l lVar) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f476293a = path;
        this.f476294b = j17;
        this.f476295c = j18;
        this.f476296d = z17;
        this.f476297e = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.e1)) {
            return false;
        }
        zv1.e1 e1Var = (zv1.e1) obj;
        return kotlin.jvm.internal.o.b(this.f476293a, e1Var.f476293a) && this.f476294b == e1Var.f476294b && this.f476295c == e1Var.f476295c && this.f476296d == e1Var.f476296d && kotlin.jvm.internal.o.b(this.f476297e, e1Var.f476297e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f476293a.hashCode() * 31) + java.lang.Long.hashCode(this.f476294b)) * 31) + java.lang.Long.hashCode(this.f476295c)) * 31) + java.lang.Boolean.hashCode(this.f476296d)) * 31;
        jz5.l lVar = this.f476297e;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public java.lang.String toString() {
        return "FileTimeInfo(path=" + this.f476293a + ", sizeOfCurrFile=" + this.f476294b + ", time=" + this.f476295c + ", isDirectory=" + this.f476296d + ", isExempted=" + this.f476297e + ')';
    }
}
