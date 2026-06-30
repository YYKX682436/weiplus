package com.tencent.mm.plugin.webview.jsapi.exdevice;

/* loaded from: classes.dex */
public class b implements com.tencent.mm.pluginsdk.ui.tools.q8 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.jsapi.exdevice.b f182099f;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.jsapi.exdevice.a f182100a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f182102c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f182101b = false;

    /* renamed from: d, reason: collision with root package name */
    public int f182103d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182104e = false;

    public static com.tencent.mm.plugin.webview.jsapi.exdevice.b d() {
        if (f182099f == null) {
            f182099f = new com.tencent.mm.plugin.webview.jsapi.exdevice.b();
        }
        return f182099f;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void a(android.content.Context context) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void b(android.content.Context context) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void c(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "stopPlugin, isScaning = %s", java.lang.Boolean.valueOf(this.f182104e));
        if (this.f182104e) {
            com.tencent.mm.autogen.events.ExDeviceScanDeviceEvent exDeviceScanDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceScanDeviceEvent();
            am.q6 q6Var = exDeviceScanDeviceEvent.f54156g;
            q6Var.f7693b = false;
            q6Var.f7692a = this.f182102c;
            exDeviceScanDeviceEvent.e();
            if (!exDeviceScanDeviceEvent.f54157h.f7801a) {
                com.tencent.mars.xlog.Log.e("MicroMsg.webview.WebViewExDeviceMgr", "stopScanWXDevice fail");
            }
            this.f182104e = false;
        }
        this.f182101b = false;
        com.tencent.mm.plugin.webview.jsapi.exdevice.a aVar = this.f182100a;
        if (aVar != null) {
            aVar.f182094c.dead();
            this.f182100a.f182095d.dead();
            this.f182100a.f182097f.dead();
            this.f182100a.f182096e.dead();
            this.f182100a.f182098g.dead();
            this.f182100a = null;
        }
        com.tencent.mm.autogen.events.ExDeviceSetSendDataDirectionEvent exDeviceSetSendDataDirectionEvent = new com.tencent.mm.autogen.events.ExDeviceSetSendDataDirectionEvent();
        am.a7 a7Var = exDeviceSetSendDataDirectionEvent.f54166g;
        a7Var.f6130a = "";
        a7Var.f6131b = 0;
        a7Var.f6132c = true;
        exDeviceSetSendDataDirectionEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "stop EcDeviceMgr for webview %s", java.lang.Boolean.valueOf(exDeviceSetSendDataDirectionEvent.f54167h.f6223a));
    }

    public void e(com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "tryInit");
        if (this.f182100a == null) {
            com.tencent.mm.plugin.webview.jsapi.exdevice.a aVar = new com.tencent.mm.plugin.webview.jsapi.exdevice.a(z0Var, str);
            this.f182100a = aVar;
            aVar.f182094c.alive();
            this.f182100a.f182095d.alive();
            this.f182100a.f182097f.alive();
            this.f182100a.f182096e.alive();
            this.f182100a.f182098g.alive();
        }
        com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent exDeviceOPFromJSAPIEvent = new com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent();
        exDeviceOPFromJSAPIEvent.f54149g.f7013a = 1;
        exDeviceOPFromJSAPIEvent.e();
        this.f182101b = true;
        this.f182102c = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public java.lang.String getName() {
        return "WebViewExDeviceMgr";
    }
}
