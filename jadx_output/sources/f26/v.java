package f26;

/* loaded from: classes16.dex */
public final class v extends f26.x implements f26.s, i26.e {

    /* renamed from: g, reason: collision with root package name */
    public static final f26.u f259227g = new f26.u(null);

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f259228e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f259229f;

    public v(f26.z0 z0Var, boolean z17) {
        this.f259228e = z0Var;
        this.f259229f = z17;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 ? this.f259228e.A0(z17) : this;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        return new f26.v(this.f259228e.C0(newAttributes), this.f259229f);
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f259228e;
    }

    @Override // f26.s
    public f26.o0 G(f26.o0 replacement) {
        kotlin.jvm.internal.o.g(replacement, "replacement");
        return f26.d1.a(replacement.z0(), this.f259229f);
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        return new f26.v(delegate, this.f259229f);
    }

    @Override // f26.s
    public boolean s0() {
        f26.z0 z0Var = this.f259228e;
        z0Var.w0();
        return z0Var.w0().i() instanceof o06.e2;
    }

    @Override // f26.z0
    public java.lang.String toString() {
        return this.f259228e + " & Any";
    }

    @Override // f26.x, f26.o0
    public boolean x0() {
        return false;
    }
}
