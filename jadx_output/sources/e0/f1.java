package e0;

/* loaded from: classes14.dex */
public final class f1 implements b0.f3 {

    /* renamed from: q, reason: collision with root package name */
    public static final w0.x f245574q = w0.b.a(e0.a1.f245494d, e0.b1.f245512d);

    /* renamed from: a, reason: collision with root package name */
    public final e0.z0 f245575a;

    /* renamed from: d, reason: collision with root package name */
    public float f245578d;

    /* renamed from: h, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.t f245582h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245583i;

    /* renamed from: j, reason: collision with root package name */
    public s1.r1 f245584j;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245588n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245589o;

    /* renamed from: b, reason: collision with root package name */
    public final n0.v2 f245576b = n0.s4.c(e0.a.f245489a, null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public final c0.o f245577c = new c0.p();

    /* renamed from: e, reason: collision with root package name */
    public final b0.f3 f245579e = new b0.r(new e0.e1(this));

    /* renamed from: f, reason: collision with root package name */
    public final boolean f245580f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f245581g = -1;

    /* renamed from: k, reason: collision with root package name */
    public final s1.s1 f245585k = new e0.c1(this);

    /* renamed from: l, reason: collision with root package name */
    public final n0.v2 f245586l = n0.s4.c(null, null, 2, null);

    /* renamed from: m, reason: collision with root package name */
    public long f245587m = p2.d.b(0, 0, 0, 0, 15, null);

    /* renamed from: p, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.v f245590p = new androidx.compose.foundation.lazy.layout.v();

    public f1(int i17, int i18) {
        this.f245575a = new e0.z0(i17, i18);
    }

    public static java.lang.Object g(e0.f1 f1Var, int i17, int i18, kotlin.coroutines.Continuation continuation, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        java.lang.Object a17 = b0.e3.a(f1Var.f245579e, null, new e0.d1(f1Var, i17, i18, null), continuation, 1, null);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    @Override // b0.f3
    public boolean a() {
        return ((b0.r) this.f245579e).a();
    }

    @Override // b0.f3
    public float b(float f17) {
        return ((b0.r) this.f245579e).b(f17);
    }

    @Override // b0.f3
    public java.lang.Object c(a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = ((b0.r) this.f245579e).c(k2Var, pVar, continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    public final int d() {
        return ((java.lang.Number) ((n0.q4) this.f245575a.f245732c).getValue()).intValue();
    }

    public final int e() {
        return ((java.lang.Number) ((n0.q4) this.f245575a.f245733d).getValue()).intValue();
    }

    public final e0.h0 f() {
        return (e0.h0) ((n0.q4) this.f245576b).getValue();
    }

    public final void h(e0.s itemProvider) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(itemProvider, "itemProvider");
        e0.z0 z0Var = this.f245575a;
        z0Var.getClass();
        java.lang.Object obj = z0Var.f245735f;
        int i17 = z0Var.f245730a;
        if (obj != null) {
            e0.u uVar = (e0.u) itemProvider;
            if ((i17 >= uVar.e() || !kotlin.jvm.internal.o.b(obj, uVar.c(i17))) && (num = (java.lang.Integer) uVar.b().get(obj)) != null) {
                i17 = num.intValue();
            }
        }
        z0Var.a(i17, z0Var.f245731b);
    }
}
