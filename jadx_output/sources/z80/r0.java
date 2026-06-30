package z80;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470666a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f470667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f470668c;

    public r0(java.lang.String weAppId, java.lang.String weAppUrl, int i17) {
        kotlin.jvm.internal.o.g(weAppId, "weAppId");
        kotlin.jvm.internal.o.g(weAppUrl, "weAppUrl");
        this.f470666a = weAppId;
        this.f470667b = weAppUrl;
        this.f470668c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.r0)) {
            return false;
        }
        z80.r0 r0Var = (z80.r0) obj;
        return kotlin.jvm.internal.o.b(this.f470666a, r0Var.f470666a) && kotlin.jvm.internal.o.b(this.f470667b, r0Var.f470667b) && this.f470668c == r0Var.f470668c;
    }

    public int hashCode() {
        return (((this.f470666a.hashCode() * 31) + this.f470667b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f470668c);
    }

    public java.lang.String toString() {
        return "POIJumpData(weAppId=" + this.f470666a + ", weAppUrl=" + this.f470667b + ", weAppScene=" + this.f470668c + ')';
    }
}
