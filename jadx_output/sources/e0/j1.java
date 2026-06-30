package e0;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.s f245617a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.r f245618b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.t1 f245619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f245620d;

    public j1(long j17, boolean z17, e0.s sVar, androidx.compose.foundation.lazy.layout.r rVar, e0.t1 t1Var, kotlin.jvm.internal.i iVar) {
        this.f245617a = sVar;
        this.f245618b = rVar;
        this.f245619c = t1Var;
        this.f245620d = p2.d.b(0, z17 ? p2.c.h(j17) : Integer.MAX_VALUE, 0, z17 ? Integer.MAX_VALUE : p2.c.g(j17), 5, null);
    }

    public final e0.i1 a(int i17) {
        java.lang.Object c17 = ((e0.u) this.f245617a).c(i17);
        s1.o1[] b17 = ((androidx.compose.foundation.lazy.layout.s) this.f245618b).b(i17, this.f245620d);
        e0.e0 e0Var = (e0.e0) this.f245619c;
        e0Var.getClass();
        return new e0.i1(i17, b17, e0Var.f245554f, e0Var.f245555g, e0Var.f245556h, ((androidx.compose.foundation.lazy.layout.s) e0Var.f245551c).getLayoutDirection(), e0Var.f245557i, e0Var.f245558j, e0Var.f245559k, e0Var.f245560l, i17 == e0Var.f245549a + (-1) ? 0 : e0Var.f245550b, p2.n.a(e0Var.f245552d, e0Var.f245553e), c17, null);
    }
}
