package com.tencent.mm.plugin.webview.ui.tools.exdevice;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.stub.z0 f184152a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f184153b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f184154c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f184155d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f184156e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f184157f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f184158g;

    public a(int i17, com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String str) {
        this.f184152a = null;
        this.f184153b = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f184154c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener$1
            {
                this.__eventId = 1424330308;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent exDeviceOnDeviceBindStateChangeEvent) {
                return com.tencent.mm.plugin.webview.ui.tools.exdevice.a.a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a.this, exDeviceOnDeviceBindStateChangeEvent);
            }
        };
        this.f184155d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener$2
            {
                this.__eventId = -545145475;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent exDeviceLanDeviceConnectStateEvent) {
                return com.tencent.mm.plugin.webview.ui.tools.exdevice.a.a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a.this, exDeviceLanDeviceConnectStateEvent);
            }
        };
        this.f184156e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener$3
            {
                this.__eventId = 444149556;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent exDeviceLanDeviceRecvDataEvent) {
                return com.tencent.mm.plugin.webview.ui.tools.exdevice.a.a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a.this, exDeviceLanDeviceRecvDataEvent);
            }
        };
        this.f184157f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener$4
            {
                this.__eventId = 1700482218;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent exDeviceLanDeviceScanResultEvent) {
                return com.tencent.mm.plugin.webview.ui.tools.exdevice.a.a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a.this, exDeviceLanDeviceScanResultEvent);
            }
        };
        this.f184158g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.exdevice.WebViewExDeviceLanMgr$WVExDeviceEventListener$5
            {
                this.__eventId = -536673841;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent exDeviceLanDeviceStateChangeEvent) {
                return com.tencent.mm.plugin.webview.ui.tools.exdevice.a.a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a.this, exDeviceLanDeviceStateChangeEvent);
            }
        };
        this.f184152a = z0Var;
        this.f184153b = str;
    }

    public static boolean a(com.tencent.mm.plugin.webview.ui.tools.exdevice.a aVar, com.tencent.mm.sdk.event.IEvent iEvent) {
        if (iEvent == null) {
            aVar.getClass();
            return false;
        }
        com.tencent.mm.plugin.webview.stub.z0 z0Var = aVar.f184152a;
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.webview.WebViewExDeviceLanMgr", "callbacker is null");
            return false;
        }
        try {
            if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent) {
                am.l6 l6Var = ((com.tencent.mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent) iEvent).f54151g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l6Var.f7227a)) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("exdevice_device_id", l6Var.f7227a);
                    bundle.putBoolean("exdevice_is_bound", l6Var.f7228b);
                    z0Var.callback(17, bundle);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent) {
                am.f6 f6Var = ((com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent) iEvent).f54145g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f6Var.f6639a) && aVar.f184153b.equals(f6Var.f6641c)) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("exdevice_device_id", f6Var.f6639a);
                    bundle2.putInt("exdevice_on_state_change_state", f6Var.f6640b);
                    bundle2.putString("exdevice_device_type", "lan");
                    z0Var.callback(1004, bundle2);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent) {
                am.g6 g6Var = ((com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent) iEvent).f54146g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g6Var.f6741b) && !com.tencent.mm.sdk.platformtools.t8.K0(g6Var.f6740a) && g6Var.f6742c != null) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("exdevice_device_id", g6Var.f6741b);
                    bundle3.putByteArray("exdevice_data", g6Var.f6742c);
                    bundle3.putString("exdevice_brand_name", g6Var.f6740a);
                    bundle3.putString("exdevice_device_type", "lan");
                    z0Var.callback(16, bundle3);
                }
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceScanResultEvent");
                android.os.Bundle bundle4 = new android.os.Bundle();
                am.h6 h6Var = ((com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent) iEvent).f54147g;
                bundle4.putString("exdevice_device_id", h6Var.f6824a);
                bundle4.putByteArray("exdevice_broadcast_data", h6Var.f6825b);
                bundle4.putBoolean("exdevice_is_complete", false);
                bundle4.putBoolean("exdevice_is_lan_device", true);
                bundle4.putString("exdevice_device_type", "lan");
                z0Var.callback(15, bundle4);
            } else if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceStateChangeEvent");
                android.os.Bundle bundle5 = new android.os.Bundle();
                if (((com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent) iEvent).f54148g.f6914a) {
                    bundle5.putBoolean("exdevice_lan_state", true);
                } else {
                    bundle5.putBoolean("exdevice_lan_state", false);
                }
                z0Var.callback(47, bundle5);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.webview.WebViewExDeviceLanMgr", "exception in WVExDeviceEventListener callback, %s", e17.getMessage());
        }
        return true;
    }
}
