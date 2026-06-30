package sm2;

/* loaded from: classes3.dex */
public final class f extends bf2.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f409448f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.v3 f409449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f409448f = "FinderLiveAnchorEndUIC";
    }

    @Override // bf2.b
    public void i(fm2.a baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        super.i(baseRouter);
        fm2.a aVar = this.f19595c;
        if (aVar != null) {
            android.view.View findViewById = aVar.findViewById(com.tencent.mm.R.id.ej_);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = new com.tencent.mm.plugin.finder.live.plugin.v3((android.view.ViewGroup) findViewById, aVar);
            this.f409449g = v3Var;
            v3Var.K0(8);
        }
    }

    public final void j() {
        in0.q qVar = this.f19597e;
        if (qVar != null) {
            qVar.F(new sm2.e());
        }
    }
}
