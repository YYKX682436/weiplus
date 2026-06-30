package fg1;

/* loaded from: classes7.dex */
public class z0 implements tf.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f261925a;

    public z0(fg1.g1 g1Var) {
        this.f261925a = g1Var;
    }

    @Override // tf.m0
    public void a() {
        fg1.f1 f1Var = this.f261925a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).a(f1Var);
        }
    }

    @Override // tf.m0
    public void e(boolean z17) {
        fg1.f1 f1Var = this.f261925a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).e(f1Var, z17);
        }
    }

    @Override // tf.m0
    public void f() {
        fg1.f1 f1Var = this.f261925a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).f(f1Var);
        }
    }

    @Override // tf.m0
    public void j() {
        fg1.g1 g1Var = this.f261925a;
        if (g1Var.f261869b.f261859b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoading from XWebOnPlayListener");
            fg1.f1 f1Var = g1Var.f261869b;
            ((com.tencent.mm.plugin.appbrand.pip.y) f1Var.f261859b).c(f1Var);
        }
    }

    @Override // tf.m0
    public void l() {
        fg1.g1 g1Var = this.f261925a;
        if (g1Var.f261869b.f261859b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "onLoadEnd from XWebOnPlayListener");
            fg1.f1 f1Var = g1Var.f261869b;
            ((com.tencent.mm.plugin.appbrand.pip.y) f1Var.f261859b).b(f1Var);
        }
    }

    @Override // tf.m0
    public void onPause() {
        fg1.f1 f1Var = this.f261925a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).d(f1Var);
        }
    }

    @Override // tf.m0
    public void onStop() {
        fg1.f1 f1Var = this.f261925a.f261869b;
        pd1.m mVar = f1Var.f261859b;
        if (mVar != null) {
            ((com.tencent.mm.plugin.appbrand.pip.y) mVar).g(f1Var);
        }
    }
}
