package mm2;

/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.w1 f329551e = new mm2.w1(null);

    /* renamed from: a, reason: collision with root package name */
    public mm2.e2 f329552a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f329553b;

    /* renamed from: c, reason: collision with root package name */
    public final mm2.z1 f329554c;

    /* renamed from: d, reason: collision with root package name */
    public final mm2.c2 f329555d;

    public y1(mm2.e2 commentMode, boolean z17, mm2.z1 danmakuConfig, mm2.c2 speed) {
        kotlin.jvm.internal.o.g(commentMode, "commentMode");
        kotlin.jvm.internal.o.g(danmakuConfig, "danmakuConfig");
        kotlin.jvm.internal.o.g(speed, "speed");
        this.f329552a = commentMode;
        this.f329553b = z17;
        this.f329554c = danmakuConfig;
        this.f329555d = speed;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y1)) {
            return false;
        }
        mm2.y1 y1Var = (mm2.y1) obj;
        return this.f329552a == y1Var.f329552a && this.f329553b == y1Var.f329553b && kotlin.jvm.internal.o.b(this.f329554c, y1Var.f329554c) && kotlin.jvm.internal.o.b(this.f329555d, y1Var.f329555d);
    }

    public int hashCode() {
        return (((((this.f329552a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f329553b)) * 31) + this.f329554c.hashCode()) * 31) + this.f329555d.hashCode();
    }

    public java.lang.String toString() {
        return "Config(commentMode=" + this.f329552a + ", enablePrivilegeFloatMsg=" + this.f329553b + ", danmakuConfig=" + this.f329554c + ", speed=" + this.f329555d + ')';
    }
}
