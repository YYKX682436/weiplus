package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class a6 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData webViewLongClickHelper$CancelRecogQBarData = (com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData) obj;
        com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
        java.lang.String str = webViewLongClickHelper$CancelRecogQBarData.f183781d;
        am.q1 q1Var = cancelRecogImageFileEvent.f54026g;
        q1Var.getClass();
        q1Var.f7686a = webViewLongClickHelper$CancelRecogQBarData.f183782e;
        cancelRecogImageFileEvent.e();
        java.lang.String str2 = webViewLongClickHelper$CancelRecogQBarData.f183781d;
        com.tencent.mm.vfs.w6.h(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RemoteCallbackRecogQBarTask invoke:" + str2);
    }
}
