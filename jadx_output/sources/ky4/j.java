package ky4;

/* loaded from: classes11.dex */
public class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent = (com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent) iEvent;
        if (scanQrcodeExtDeviceLoginEvent == null) {
            return false;
        }
        iy4.y0 y0Var = new iy4.y0(scanQrcodeExtDeviceLoginEvent.f54735g.f8475a);
        c01.d9.e().a(971, new ky4.i(this, y0Var, scanQrcodeExtDeviceLoginEvent));
        c01.d9.e().g(y0Var);
        com.tencent.mars.xlog.Log.i("ScanQrcodeExtDeviceLoginListener", "MMCore.getNetSceneQueue().doScene(netSceneExtDeviceLoginConfirmGet);");
        return false;
    }
}
