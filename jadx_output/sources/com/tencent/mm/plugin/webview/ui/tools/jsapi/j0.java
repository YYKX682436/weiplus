package com.tencent.mm.plugin.webview.ui.tools.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/j0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("shouldShowRedDot");
            boolean z18 = bundle.getBoolean("isNeedRefresh");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetRedPacketDone", "get red packet: " + z17 + ", " + z18);
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).wj(z17, z18);
            com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent refreshLuckyMoneyEnvelopeListEvent = new com.tencent.mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent();
            refreshLuckyMoneyEnvelopeListEvent.f54670g.getClass();
            refreshLuckyMoneyEnvelopeListEvent.e();
        }
        return com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
    }
}
