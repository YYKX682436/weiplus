package hc1;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.h1 f280289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var, int i17) {
        super(0);
        this.f280289d = h1Var;
        this.f280290e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.widget.input.h1 v17 = this.f280289d;
        kotlin.jvm.internal.o.g(v17, "v");
        android.view.View findViewById = v17.getRootView().findViewById(com.tencent.mm.R.id.sdv);
        hc1.b bVar = findViewById instanceof hc1.b ? (hc1.b) findViewById : null;
        if (bVar != null) {
            bVar.n(this.f280290e);
            bVar.requestLayout();
        }
        return jz5.f0.f302826a;
    }
}
