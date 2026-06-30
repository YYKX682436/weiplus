package dj2;

/* loaded from: classes10.dex */
public final class c extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
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
            ((lj2.j) view).l(pm2.a.f356866v, b(i17));
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f232897d;
        lj2.v0 v0Var = this.f232896c;
        android.content.Context context = this.f232895b;
        if (i17 == 3) {
            return new wj2.b(context, v0Var, x0Var);
        }
        if (i17 == 4) {
            return new rj2.a(context, v0Var, x0Var);
        }
        com.tencent.mars.xlog.Log.e("FinderLiveMicDualRatioAdapter", "createItemView: micType is invalid");
        return new android.view.View(context);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "FinderLiveMicDualRatioAdapter";
    }
}
