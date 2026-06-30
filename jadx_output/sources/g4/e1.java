package g4;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public g4.y0 f268261a;

    /* renamed from: b, reason: collision with root package name */
    public g4.y0 f268262b;

    /* renamed from: c, reason: collision with root package name */
    public g4.y0 f268263c;

    /* renamed from: d, reason: collision with root package name */
    public g4.z0 f268264d;

    /* renamed from: e, reason: collision with root package name */
    public g4.z0 f268265e;

    public e1() {
        g4.x0 x0Var = g4.x0.f268605c;
        this.f268261a = x0Var;
        this.f268262b = x0Var;
        this.f268263c = x0Var;
        g4.z0 z0Var = g4.z0.f268644d;
        this.f268264d = g4.z0.f268644d;
    }

    public final g4.y0 a(g4.y0 y0Var, g4.y0 y0Var2, g4.y0 y0Var3, g4.y0 y0Var4) {
        return y0Var4 == null ? y0Var3 : (!(y0Var instanceof g4.w0) || ((y0Var2 instanceof g4.x0) && (y0Var4 instanceof g4.x0)) || (y0Var4 instanceof g4.v0)) ? y0Var4 : y0Var;
    }

    public final boolean b(g4.a1 type, boolean z17, g4.y0 state) {
        boolean b17;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(state, "state");
        if (z17) {
            g4.z0 z0Var = this.f268265e;
            g4.z0 c17 = (z0Var != null ? z0Var : g4.z0.f268644d).c(type, state);
            this.f268265e = c17;
            b17 = kotlin.jvm.internal.o.b(c17, z0Var);
        } else {
            g4.z0 z0Var2 = this.f268264d;
            g4.z0 c18 = z0Var2.c(type, state);
            this.f268264d = c18;
            b17 = kotlin.jvm.internal.o.b(c18, z0Var2);
        }
        boolean z18 = !b17;
        g4.y0 y0Var = this.f268261a;
        g4.y0 y0Var2 = this.f268264d.f268645a;
        g4.z0 z0Var3 = this.f268265e;
        this.f268261a = a(y0Var, y0Var2, y0Var2, z0Var3 != null ? z0Var3.f268645a : null);
        g4.y0 y0Var3 = this.f268262b;
        g4.z0 z0Var4 = this.f268264d;
        g4.y0 y0Var4 = z0Var4.f268645a;
        g4.z0 z0Var5 = this.f268265e;
        this.f268262b = a(y0Var3, y0Var4, z0Var4.f268646b, z0Var5 != null ? z0Var5.f268646b : null);
        g4.y0 y0Var5 = this.f268263c;
        g4.z0 z0Var6 = this.f268264d;
        g4.y0 y0Var6 = z0Var6.f268645a;
        g4.z0 z0Var7 = this.f268265e;
        this.f268263c = a(y0Var5, y0Var6, z0Var6.f268647c, z0Var7 != null ? z0Var7.f268647c : null);
        return z18;
    }

    public final g4.a0 c() {
        return new g4.a0(this.f268261a, this.f268262b, this.f268263c, this.f268264d, this.f268265e);
    }
}
