package dj2;

/* loaded from: classes10.dex */
public final class f extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            ((lj2.j) view).l(pm2.a.f356861q, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f232897d;
        lj2.v0 v0Var = this.f232896c;
        android.content.Context context = this.f232895b;
        if (i17 == 1) {
            return new vj2.b(context, v0Var, x0Var);
        }
        if (i17 == 2) {
            return new vj2.c(context, v0Var, x0Var);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                wj2.h0 h0Var = new wj2.h0(context, v0Var, x0Var);
                int b17 = i65.a.b(h0Var.getContext(), 24);
                fg2.k0 k0Var = h0Var.K;
                k0Var.f262114d.setTextSize(1, 12.0f);
                android.view.ViewGroup.LayoutParams layoutParams = k0Var.f262113c.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = b17;
                    layoutParams.height = b17;
                }
                return h0Var;
            }
            if (i17 != 7) {
                return new android.view.View(context);
            }
        }
        return new vj2.a(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicFocusRatioAdapter";
    }
}
