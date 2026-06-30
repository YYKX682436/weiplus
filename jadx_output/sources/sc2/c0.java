package sc2;

/* loaded from: classes2.dex */
public final class c0 implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f405797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405798b;

    public c0(android.view.ViewGroup viewGroup, sc2.h1 h1Var) {
        this.f405797a = viewGroup;
        this.f405798b = h1Var;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = this.f405797a.getContext();
        sc2.h1 h1Var = this.f405798b;
        com.tencent.mm.plugin.finder.report.k3 L = h1Var.L();
        com.tencent.mm.plugin.finder.report.h3 h3Var = kotlin.jvm.internal.o.b(str, "view_exp") ? com.tencent.mm.plugin.finder.report.h3.f125062e : com.tencent.mm.plugin.finder.report.h3.f125063f;
        com.tencent.mm.plugin.finder.report.i3 i3Var = com.tencent.mm.plugin.finder.report.i3.f125072e;
        com.tencent.mm.plugin.finder.report.g3 g3Var = h1Var.A1;
        kotlin.jvm.internal.o.d(o3Var);
        kotlin.jvm.internal.o.d(context);
        com.tencent.mm.plugin.finder.report.o3.Uk(o3Var, context, L, i3Var, h3Var, null, g3Var, 16, null);
    }
}
