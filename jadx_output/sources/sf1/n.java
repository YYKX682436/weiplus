package sf1;

/* loaded from: classes13.dex */
public final class n extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f407001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf1.g f407003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407004g;

    public n(kotlin.jvm.internal.c0 c0Var, yz5.a aVar, sf1.g gVar, java.lang.String str) {
        this.f407001d = c0Var;
        this.f407002e = aVar;
        this.f407003f = gVar;
        this.f407004g = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        super.g();
        if (this.f407001d.f310112d) {
            com.tencent.mm.plugin.appbrand.x0.e(this.f407004g, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, onActivityResult not call");
        this.f407002e.invoke();
        sf1.g.c(this.f407003f, null, 1, null);
    }
}
