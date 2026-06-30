package qf1;

/* loaded from: classes13.dex */
public class h implements rf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f362268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f362269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f362270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf1.j f362273f;

    public h(qf1.j jVar, com.tencent.mm.sdk.platformtools.b4 b4Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.content.Context context) {
        this.f362273f = jVar;
        this.f362268a = b4Var;
        this.f362269b = atomicBoolean;
        this.f362270c = lVar;
        this.f362271d = i17;
        this.f362272e = context;
    }

    public void a(rf1.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "onGetWiFiList");
        this.f362268a.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
        rf1.l.f394635g = null;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f362269b;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "onGetWiFiList, hasCallback");
            return;
        }
        qf1.j.C(this.f362273f, this.f362270c, this.f362271d, this.f362272e, iVar);
        atomicBoolean.set(true);
    }
}
