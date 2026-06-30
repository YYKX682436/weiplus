package uc1;

/* loaded from: classes13.dex */
public class n0 implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f426337d;

    public n0(uc1.i1 i1Var, vc1.a3 a3Var) {
        this.f426337d = a3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "onForeground");
        vc1.a3 a3Var = this.f426337d;
        if (a3Var != null) {
            ((vc1.p1) a3Var).H();
        }
    }
}
