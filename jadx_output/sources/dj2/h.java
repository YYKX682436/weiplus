package dj2;

/* loaded from: classes10.dex */
public final class h extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // hn5.c
    public void f() {
        super.f();
        this.f232897d.J();
    }

    @Override // dj2.b, hn5.c
    public void g(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.g(i17, view);
        if (view instanceof lj2.j) {
            lj2.j jVar = (lj2.j) view;
            lj2.v0 v0Var = this.f232896c;
            jVar.l((v0Var.a0().g().size() != 0 || v0Var.a0().l().size() < 5) ? pm2.a.f356853f : pm2.a.f356854g, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f232897d;
        lj2.v0 v0Var = this.f232896c;
        android.content.Context context = this.f232895b;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 5 ? i17 != 6 ? i17 != 7 ? new android.view.View(context) : new wj2.a(context, v0Var, x0Var) : new wj2.y(context, v0Var, x0Var) : new wj2.c0(context, v0Var, x0Var) : new wj2.b(context, v0Var, x0Var) : new wj2.e0(context, v0Var, x0Var) : new wj2.d(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicNormalRatioAdapter";
    }
}
