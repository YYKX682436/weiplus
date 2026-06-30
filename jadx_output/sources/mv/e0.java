package mv;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f331494a;

    /* renamed from: b, reason: collision with root package name */
    public final mv.h0 f331495b;

    /* renamed from: c, reason: collision with root package name */
    public final mv.f0 f331496c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331497d;

    /* renamed from: e, reason: collision with root package name */
    public int f331498e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f331499f;

    /* renamed from: g, reason: collision with root package name */
    public final long f331500g;

    public e0(long j17, mv.h0 taskType, mv.f0 status, java.lang.String display, int i17, java.lang.String progressHint, long j18) {
        kotlin.jvm.internal.o.g(taskType, "taskType");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(display, "display");
        kotlin.jvm.internal.o.g(progressHint, "progressHint");
        this.f331494a = j17;
        this.f331495b = taskType;
        this.f331496c = status;
        this.f331497d = display;
        this.f331498e = i17;
        this.f331499f = progressHint;
        this.f331500g = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv.e0)) {
            return false;
        }
        mv.e0 e0Var = (mv.e0) obj;
        return this.f331494a == e0Var.f331494a && this.f331495b == e0Var.f331495b && this.f331496c == e0Var.f331496c && kotlin.jvm.internal.o.b(this.f331497d, e0Var.f331497d) && this.f331498e == e0Var.f331498e && kotlin.jvm.internal.o.b(this.f331499f, e0Var.f331499f) && this.f331500g == e0Var.f331500g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Long.hashCode(this.f331494a) * 31) + this.f331495b.hashCode()) * 31) + this.f331496c.hashCode()) * 31) + this.f331497d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f331498e)) * 31) + this.f331499f.hashCode()) * 31) + java.lang.Long.hashCode(this.f331500g);
    }

    public java.lang.String toString() {
        return "RoamSettingsDisplayInfo(pkgId=" + this.f331494a + ", taskType=" + this.f331495b + ", status=" + this.f331496c + ", display=" + this.f331497d + ", progress=" + this.f331498e + ", progressHint=" + this.f331499f + ", msgTime=" + this.f331500g + ')';
    }
}
