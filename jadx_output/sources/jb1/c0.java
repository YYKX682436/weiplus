package jb1;

/* loaded from: classes7.dex */
public final class c0 implements com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f298701d;

    public c0(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f298701d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o
    public void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f newState) {
        kotlin.jvm.internal.o.g(newState, "newState");
        com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServerManager", "onAuthorizeStateChange, newState: " + newState);
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.f80063d == newState) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.b(this.f298701d.getAppId(), this);
            jb1.d0 d0Var = jb1.d0.f298705a;
            jb1.d0.f298709e = true;
            jb1.d0.f298705a.a();
            jb1.d0.f298708d = null;
            jb1.d0.f298709e = false;
        }
    }
}
