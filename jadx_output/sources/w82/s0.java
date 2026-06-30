package w82;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f443926b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f443927c;

    public s0(java.lang.String content, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f443925a = content;
        this.f443926b = i17;
        this.f443927c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w82.s0)) {
            return false;
        }
        w82.s0 s0Var = (w82.s0) obj;
        return kotlin.jvm.internal.o.b(this.f443925a, s0Var.f443925a) && this.f443926b == s0Var.f443926b;
    }

    public int hashCode() {
        return (((this.f443925a.hashCode() * 31) + this.f443926b) * 31) + java.lang.Boolean.hashCode(this.f443927c);
    }

    public java.lang.String toString() {
        return "PanelInfo(content=" + this.f443925a + ", type=" + this.f443926b + ", canCancel=" + this.f443927c + ')';
    }
}
