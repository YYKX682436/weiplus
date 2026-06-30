package of1;

/* loaded from: classes7.dex */
public final class t1 implements com.tencent.mm.plugin.appbrand.jsapi.x, com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f345009d;

    public t1(of1.w1 w1Var) {
        this.f345009d = w1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        of1.w1 w1Var = this.f345009d;
        w1Var.f345045s.onResume();
        of1.v0 v0Var = (of1.v0) w1Var.getController();
        v0Var.g0().Z(true);
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = v0Var.W1;
        if (oVar != null) {
            oVar.post(new of1.i0(v0Var));
        } else {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        of1.w1 w1Var = this.f345009d;
        w1Var.f345045s.onPause();
        ((of1.v0) w1Var.getController()).g0().Z(false);
    }
}
