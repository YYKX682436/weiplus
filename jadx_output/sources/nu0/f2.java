package nu0;

/* loaded from: classes5.dex */
public final class f2 implements eb5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339936a;

    public f2(nu0.b4 b4Var) {
        this.f339936a = b4Var;
    }

    @Override // eb5.c
    public /* bridge */ /* synthetic */ boolean a(int i17, android.view.View view, java.lang.Object obj) {
        return false;
    }

    @Override // eb5.c
    public void b(int i17, android.view.View view, java.lang.Object obj) {
        ku0.a aVar = (ku0.a) obj;
        if (aVar == null) {
            return;
        }
        nu0.b4 b4Var = this.f339936a;
        b4Var.f339880p0 = true;
        if (aVar.f312060a.f475661a.getIdentifierType() != qg.a.Unknown) {
            b4Var.A7("click", i17, new nu0.e2(b4Var, i17));
            b4Var.q7().W6(2);
            return;
        }
        int n76 = b4Var.n7() - b4Var.f339887w.size();
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qs2.v.f366327a.c(b4Var.getContext(), null, 1, n76, java.lang.Boolean.TRUE, 100, 47, false);
        nu0.i q76 = b4Var.q7();
        q76.V6("edit_add_photo", "view_clk", q76.U6());
    }
}
