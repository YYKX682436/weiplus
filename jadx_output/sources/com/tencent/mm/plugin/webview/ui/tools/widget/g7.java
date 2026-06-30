package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
final class g7 implements com.tencent.mm.ipcinvoker.j {
    private g7() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagService", "ipc invoke:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            if (i95.n0.c(dx4.e.class) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
                return;
            }
            gx4.w wVar = (gx4.w) ((dx4.e) i95.n0.c(dx4.e.class));
            wVar.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new gx4.u(wVar));
            return;
        }
        if (i17 != 2) {
            return;
        }
        if (i95.n0.c(dx4.e.class) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagService", "doOp ServiceManager.getService(IWebViewBagService.class) null");
            return;
        }
        gx4.w wVar2 = (gx4.w) ((dx4.e) i95.n0.c(dx4.e.class));
        wVar2.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new gx4.v(wVar2));
    }
}
