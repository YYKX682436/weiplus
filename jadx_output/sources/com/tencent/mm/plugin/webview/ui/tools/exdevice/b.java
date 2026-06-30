package com.tencent.mm.plugin.webview.ui.tools.exdevice;

/* loaded from: classes.dex */
public class b implements com.tencent.mm.pluginsdk.ui.tools.q8 {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.ui.tools.exdevice.b f184159d;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.exdevice.a f184160a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f184161b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f184162c = false;

    public static com.tencent.mm.plugin.webview.ui.tools.exdevice.b d() {
        if (f184159d == null) {
            f184159d = new com.tencent.mm.plugin.webview.ui.tools.exdevice.b();
        }
        return f184159d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void a(android.content.Context context) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void b(android.content.Context context) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void c(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", java.lang.Boolean.valueOf(this.f184162c));
        if (this.f184162c) {
            com.tencent.mm.autogen.events.ExDeviceStartScanLanDeviceEvent exDeviceStartScanLanDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceStartScanLanDeviceEvent();
            exDeviceStartScanLanDeviceEvent.f54181g.f7607a = false;
            exDeviceStartScanLanDeviceEvent.e();
            this.f184162c = false;
        }
        this.f184161b = false;
        com.tencent.mm.plugin.webview.ui.tools.exdevice.a aVar = this.f184160a;
        if (aVar != null) {
            aVar.f184154c.dead();
            this.f184160a.f184155d.dead();
            this.f184160a.f184157f.dead();
            this.f184160a.f184156e.dead();
            this.f184160a.f184158g.dead();
            this.f184160a = null;
        }
        com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent exDeviceOpenLanDeviceLibEvent = new com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent();
        exDeviceOpenLanDeviceLibEvent.f54155g.f7606a = false;
        exDeviceOpenLanDeviceLibEvent.e();
    }

    public void e(com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "tryInit");
        if (this.f184160a == null) {
            com.tencent.mm.plugin.webview.ui.tools.exdevice.a aVar = new com.tencent.mm.plugin.webview.ui.tools.exdevice.a(0, z0Var, str);
            this.f184160a = aVar;
            aVar.f184154c.alive();
            this.f184160a.f184155d.alive();
            this.f184160a.f184157f.alive();
            this.f184160a.f184156e.alive();
            this.f184160a.f184158g.alive();
        }
        com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent exDeviceOpenLanDeviceLibEvent = new com.tencent.mm.autogen.events.ExDeviceOpenLanDeviceLibEvent();
        exDeviceOpenLanDeviceLibEvent.f54155g.f7606a = true;
        exDeviceOpenLanDeviceLibEvent.e();
        this.f184161b = true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public java.lang.String getName() {
        return "WebViewExDeviceLanMgr";
    }
}
