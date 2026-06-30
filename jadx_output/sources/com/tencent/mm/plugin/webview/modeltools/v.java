package com.tencent.mm.plugin.webview.modeltools;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class v implements com.tencent.mm.ipcinvoker.k0 {
    private v() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer nFCIPCHelper$NFCEventTransfer = (com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.NFCIPCHelper", "NfcEventInvokeTask invoke process: %s", ((km0.c) gm0.j1.p().a()).f308987a);
        com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent = new com.tencent.mm.autogen.events.ApduEngineFuncEvent();
        int i17 = nFCIPCHelper$NFCEventTransfer.f183230d;
        am.o oVar = apduEngineFuncEvent.f53975g;
        oVar.f7493a = i17;
        oVar.f7495c = nFCIPCHelper$NFCEventTransfer.f183231e;
        oVar.f7496d = nFCIPCHelper$NFCEventTransfer.f183232f;
        oVar.f7497e = nFCIPCHelper$NFCEventTransfer.f183233g;
        apduEngineFuncEvent.e();
        nFCIPCHelper$NFCEventTransfer.f183234h = apduEngineFuncEvent.f53976h.f7588a;
        return nFCIPCHelper$NFCEventTransfer;
    }
}
