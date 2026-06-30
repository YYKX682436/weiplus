package tm2;

/* loaded from: classes3.dex */
public final class g extends bf2.e {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f420509g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.v3 f420510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f420509g = "FinderLiveSecondaryEndUIC";
    }

    @Override // bf2.e
    public void e(fm2.b baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        super.e(baseRouter);
        fm2.b bVar = this.f19601c;
        if (bVar != null) {
            android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.ej_);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = new com.tencent.mm.plugin.finder.live.plugin.v3((android.view.ViewGroup) findViewById, bVar);
            this.f420510h = v3Var;
            v3Var.K0(8);
        }
    }

    public final void f() {
        if (((mm2.c1) c(mm2.c1.class)).U7()) {
            zl2.r4.D2(zl2.r4.f473950a, ((mm2.e1) c(mm2.e1.class)).f328988r.getLong(0), ((mm2.c1) c(mm2.c1.class)).f328852o, 2, 0, 8, null);
        }
    }
}
