package uc1;

/* loaded from: classes13.dex */
public class m0 implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f426336d;

    public m0(uc1.i1 i1Var, vc1.a3 a3Var) {
        this.f426336d = a3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "onBackground");
        vc1.a3 a3Var = this.f426336d;
        if (a3Var != null) {
            ((vc1.p1) a3Var).G();
        }
    }
}
