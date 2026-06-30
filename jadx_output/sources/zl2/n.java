package zl2;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f473894a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f473895b;

    /* renamed from: c, reason: collision with root package name */
    public final zl2.o f473896c;

    /* renamed from: d, reason: collision with root package name */
    public final zl2.m f473897d;

    public n(android.view.View view, boolean z17, zl2.o lpHeight, zl2.m alpha, int i17, kotlin.jvm.internal.i iVar) {
        lpHeight = (i17 & 4) != 0 ? new zl2.o(0, 0, 0) : lpHeight;
        alpha = (i17 & 8) != 0 ? new zl2.m(1.0f, 1.0f, 1.0f) : alpha;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(lpHeight, "lpHeight");
        kotlin.jvm.internal.o.g(alpha, "alpha");
        this.f473894a = view;
        this.f473895b = z17;
        this.f473896c = lpHeight;
        this.f473897d = alpha;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.n)) {
            return false;
        }
        zl2.n nVar = (zl2.n) obj;
        return kotlin.jvm.internal.o.b(this.f473894a, nVar.f473894a) && this.f473895b == nVar.f473895b && kotlin.jvm.internal.o.b(this.f473896c, nVar.f473896c) && kotlin.jvm.internal.o.b(this.f473897d, nVar.f473897d);
    }

    public int hashCode() {
        return (((((this.f473894a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f473895b)) * 31) + this.f473896c.hashCode()) * 31) + this.f473897d.hashCode();
    }

    public java.lang.String toString() {
        return "InOutConf(view=" + this.f473894a + ", resetAfterFinish=" + this.f473895b + ", lpHeight=" + this.f473896c + ", alpha=" + this.f473897d + ')';
    }
}
