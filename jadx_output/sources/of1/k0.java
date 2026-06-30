package of1;

/* loaded from: classes7.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.k f344953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(of1.v0 v0Var, com.tencent.mm.plugin.appbrand.jsapi.webview.k kVar) {
        super(0);
        this.f344952d = v0Var;
        this.f344953e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f344952d.D1(), "revertTrans done");
        com.tencent.mm.plugin.appbrand.jsapi.webview.k kVar = this.f344953e;
        if (kVar != null) {
            kVar.onDone();
        }
        return jz5.f0.f302826a;
    }
}
