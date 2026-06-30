package of1;

/* loaded from: classes7.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.k f344983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(of1.v0 v0Var, com.tencent.mm.plugin.appbrand.jsapi.webview.k kVar) {
        super(0);
        this.f344982d = v0Var;
        this.f344983e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f344982d.D1(), "startTrans done");
        com.tencent.mm.plugin.appbrand.jsapi.webview.k kVar = this.f344983e;
        if (kVar != null) {
            kVar.onDone();
        }
        return jz5.f0.f302826a;
    }
}
