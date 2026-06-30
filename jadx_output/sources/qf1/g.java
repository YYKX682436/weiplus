package qf1;

/* loaded from: classes13.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f362263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f362264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf1.j f362267h;

    public g(qf1.j jVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, android.content.Context context) {
        this.f362267h = jVar;
        this.f362263d = atomicBoolean;
        this.f362264e = lVar;
        this.f362265f = i17;
        this.f362266g = context;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "onTimerExpired");
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
        rf1.l.f394635g = null;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f362263d;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWifiList", "onTimerExpired, hasCallback");
            return false;
        }
        rf1.i a17 = rf1.l.a(true);
        qf1.j.C(this.f362267h, this.f362264e, this.f362265f, this.f362266g, a17);
        atomicBoolean.set(true);
        return false;
    }
}
