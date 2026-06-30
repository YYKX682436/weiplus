package fg1;

/* loaded from: classes7.dex */
public class b1 implements ye1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.f1 f261852a;

    public b1(fg1.f1 f1Var) {
        this.f261852a = f1Var;
    }

    @Override // ye1.m
    public void a(ye1.e eVar) {
        this.f261852a.f261860c = true;
        fg1.f1 f1Var = this.f261852a;
        if (f1Var.f261859b != null) {
            com.tencent.mars.xlog.Log.i(f1Var.f261858a, "onLoadEnd from OnPreparedListener");
            fg1.f1 f1Var2 = this.f261852a;
            ((com.tencent.mm.plugin.appbrand.pip.y) f1Var2.f261859b).b(f1Var2);
        }
    }
}
