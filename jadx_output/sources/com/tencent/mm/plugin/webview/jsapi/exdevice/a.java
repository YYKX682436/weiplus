package com.tencent.mm.plugin.webview.jsapi.exdevice;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.z0 f182092a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f182093b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182094c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182095d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182096e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182097f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f182098g;

    public a(com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String str) {
        this.f182092a = null;
        this.f182093b = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f182094c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener$1
            {
                this.__eventId = -903193774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent exDeviceOnScanDeviceResultEvent) {
                return com.tencent.mm.plugin.webview.jsapi.exdevice.a.a(com.tencent.mm.plugin.webview.jsapi.exdevice.a.this, exDeviceOnScanDeviceResultEvent);
            }
        };
        this.f182095d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener$2
            {
                this.__eventId = -1671246574;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent exDeviceOnRecvDataFromDeviceEvent) {
                return com.tencent.mm.plugin.webview.jsapi.exdevice.a.a(com.tencent.mm.plugin.webview.jsapi.exdevice.a.this, exDeviceOnRecvDataFromDeviceEvent);
            }
        };
        this.f182096e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener$3
            {
                this.__eventId = 1424330308;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent exDeviceOnDeviceBindStateChangeEvent) {
                return com.tencent.mm.plugin.webview.jsapi.exdevice.a.a(com.tencent.mm.plugin.webview.jsapi.exdevice.a.this, exDeviceOnDeviceBindStateChangeEvent);
            }
        };
        this.f182097f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpFromExDeviceEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener$4
            {
                this.__eventId = 1739921302;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpFromExDeviceEvent opFromExDeviceEvent) {
                return com.tencent.mm.plugin.webview.jsapi.exdevice.a.a(com.tencent.mm.plugin.webview.jsapi.exdevice.a.this, opFromExDeviceEvent);
            }
        };
        this.f182098g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.jsapi.exdevice.WebViewExDeviceMgr$WVExDeviceEventListener$5
            {
                this.__eventId = -1539174833;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent exDeviceOnBluetoothStateChangeEvent) {
                return com.tencent.mm.plugin.webview.jsapi.exdevice.a.a(com.tencent.mm.plugin.webview.jsapi.exdevice.a.this, exDeviceOnBluetoothStateChangeEvent);
            }
        };
        this.f182092a = z0Var;
        this.f182093b = str;
    }

    public static boolean a(com.tencent.mm.plugin.webview.jsapi.exdevice.a aVar, com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent == null) {
            aVar.getClass();
            return false;
        }
        com.tencent.mm.plugin.webview.stub.z0 z0Var = aVar.f182092a;
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.WebViewExDeviceMgr", "callbacker is null");
            return false;
        }
        try {
            if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnScanDeviceResultEvent");
                android.os.Bundle bundle = new android.os.Bundle();
                am.n6 n6Var = ((com.tencent.mm.autogen.events.ExDeviceOnScanDeviceResultEvent) iEvent).f54153g;
                bundle.putString("exdevice_device_id", n6Var.f7403a);
                bundle.putByteArray("exdevice_broadcast_data", n6Var.f7404b);
                bundle.putBoolean("exdevice_is_complete", n6Var.f7405c);
                z0Var.callback(15, bundle);
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnRecvDataFromDeviceEvent");
                am.m6 m6Var = ((com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent) iEvent).f54152g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(m6Var.f7322b) && !com.tencent.mm.sdk.platformtools.t8.K0(m6Var.f7321a) && m6Var.f7323c != null) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("exdevice_device_id", m6Var.f7322b);
                    bundle2.putByteArray("exdevice_data", m6Var.f7323c);
                    bundle2.putString("exdevice_brand_name", m6Var.f7321a);
                    z0Var.callback(16, bundle2);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent) {
                am.l6 l6Var = ((com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent) iEvent).f54151g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l6Var.f7227a)) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("exdevice_device_id", l6Var.f7227a);
                    bundle3.putBoolean("exdevice_is_bound", l6Var.f7228b);
                    z0Var.callback(17, bundle3);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.OpFromExDeviceEvent) {
                am.in inVar = ((com.tencent.mm.autogen.events.OpFromExDeviceEvent) iEvent).f54589g;
                if (inVar.f6962a == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(inVar.f6964c) && aVar.f182093b.equals(inVar.f6964c)) {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString("exdevice_device_id", inVar.f6963b);
                    bundle4.putInt("exdevice_on_state_change_state", inVar.f6965d);
                    z0Var.callback(1004, bundle4);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent) {
                android.os.Bundle bundle5 = new android.os.Bundle();
                if (((com.tencent.mm.autogen.events.ExDeviceOnBluetoothStateChangeEvent) iEvent).f54150g.f7129a == 12) {
                    bundle5.putBoolean("exdevice_bt_state", true);
                } else {
                    bundle5.putBoolean("exdevice_bt_state", false);
                }
                z0Var.callback(18, bundle5);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.webview.WebViewExDeviceMgr", "exception in WVExDeviceEventListener callback, %s", e17.getMessage());
        }
        return true;
    }
}
