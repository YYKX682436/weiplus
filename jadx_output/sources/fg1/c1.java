package fg1;

/* loaded from: classes7.dex */
public class c1 implements ye1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.f1 f261854a;

    public c1(fg1.f1 f1Var) {
        this.f261854a = f1Var;
    }

    @Override // ye1.n
    public void a(ye1.e eVar) {
        fg1.f1 f1Var = this.f261854a;
        if (f1Var.f261859b != null) {
            com.tencent.mars.xlog.Log.i(f1Var.f261858a, "onLoadEnd from OnSeekCompleteListener");
            ((com.tencent.mm.plugin.appbrand.pip.y) f1Var.f261859b).b(f1Var);
            ((com.tencent.mm.plugin.appbrand.pip.y) f1Var.f261859b).e(f1Var, false);
        }
    }
}
