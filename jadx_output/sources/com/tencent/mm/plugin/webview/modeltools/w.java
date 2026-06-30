package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public abstract class w {
    public static void a(com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent) {
        android.os.Bundle bundle;
        com.tencent.mars.xlog.Log.i("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult actionCode: %d", java.lang.Integer.valueOf(apduEngineFuncEvent.f53975g.f7493a));
        try {
            com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer nFCIPCHelper$NFCEventTransfer = (com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193055c, new com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer(apduEngineFuncEvent), com.tencent.mm.plugin.webview.modeltools.v.class);
            if (nFCIPCHelper$NFCEventTransfer == null || (bundle = nFCIPCHelper$NFCEventTransfer.f183234h) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult error");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX, 0);
            } else {
                apduEngineFuncEvent.f53976h.f7588a = bundle;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NFCIPCHelper", e17, "nfcInvokeAsResult exception", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX, 0);
        }
    }
}
