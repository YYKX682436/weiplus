package dj2;

/* loaded from: classes10.dex */
public final class n extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            jVar.l(jVar instanceof xj2.o ? pm2.a.f356856i : pm2.a.f356859o, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f232897d;
        lj2.v0 v0Var = this.f232896c;
        android.content.Context context = this.f232895b;
        if (i17 == 1) {
            return new xj2.g(context, v0Var, x0Var);
        }
        if (i17 == 2) {
            return new xj2.h(context, v0Var, x0Var);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return new xj2.o(context, v0Var, x0Var);
            }
            if (i17 != 7) {
                return new android.view.View(context);
            }
        }
        return new xj2.f(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicNormalRatioAdapter";
    }
}
