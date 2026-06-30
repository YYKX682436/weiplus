package e60;

/* loaded from: classes11.dex */
public final class t0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f249733d;

    /* renamed from: e, reason: collision with root package name */
    public final int f249734e;

    /* renamed from: f, reason: collision with root package name */
    public final int f249735f;

    /* renamed from: g, reason: collision with root package name */
    public final int f249736g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f249737h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f249738i;

    /* renamed from: m, reason: collision with root package name */
    public final e60.u0 f249739m;

    public t0(java.lang.String cdnTaskName, int i17, int i18, int i19, boolean z17, boolean z18, e60.u0 enterRect, int i27, kotlin.jvm.internal.i iVar) {
        cdnTaskName = (i27 & 1) != 0 ? "task_default" : cdnTaskName;
        i17 = (i27 & 2) != 0 ? 1 : i17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        z17 = (i27 & 16) != 0 ? false : z17;
        z18 = (i27 & 32) != 0 ? false : z18;
        enterRect = (i27 & 64) != 0 ? new e60.u0(0, 0, 0, 0) : enterRect;
        kotlin.jvm.internal.o.g(cdnTaskName, "cdnTaskName");
        kotlin.jvm.internal.o.g(enterRect, "enterRect");
        this.f249733d = cdnTaskName;
        this.f249734e = i17;
        this.f249735f = i18;
        this.f249736g = i19;
        this.f249737h = z17;
        this.f249738i = z18;
        this.f249739m = enterRect;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.t0)) {
            return false;
        }
        e60.t0 t0Var = (e60.t0) obj;
        return kotlin.jvm.internal.o.b(this.f249733d, t0Var.f249733d) && this.f249734e == t0Var.f249734e && this.f249735f == t0Var.f249735f && this.f249736g == t0Var.f249736g && this.f249737h == t0Var.f249737h && this.f249738i == t0Var.f249738i && kotlin.jvm.internal.o.b(this.f249739m, t0Var.f249739m);
    }

    public int hashCode() {
        return (((((((((((this.f249733d.hashCode() * 31) + java.lang.Integer.hashCode(this.f249734e)) * 31) + java.lang.Integer.hashCode(this.f249735f)) * 31) + java.lang.Integer.hashCode(this.f249736g)) * 31) + java.lang.Boolean.hashCode(this.f249737h)) * 31) + java.lang.Boolean.hashCode(this.f249738i)) * 31) + this.f249739m.hashCode();
    }

    public java.lang.String toString() {
        return "GalleryConfig(cdnTaskName=" + this.f249733d + ", cdnPriority=" + this.f249734e + ", mediaAttachType=" + this.f249735f + ", enterIndex=" + this.f249736g + ", needTranslate=" + this.f249737h + ", needForwardSns=" + this.f249738i + ", enterRect=" + this.f249739m + ')';
    }
}
