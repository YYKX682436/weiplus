package jy4;

/* loaded from: classes11.dex */
public class d0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(x51.j1.g(p0Var.f70726a.f377561h), "sysmsg", null).get(".sysmsg.pushloginurl.url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreWebWX.pushloginurl", "pushloginurl is null");
        }
        com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent = new com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent();
        am.ys ysVar = scanQrcodeExtDeviceLoginEvent.f54735g;
        ysVar.f8475a = str;
        ysVar.f8476b = 1;
        scanQrcodeExtDeviceLoginEvent.e();
        p0Var.f70726a.f377567q = null;
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
