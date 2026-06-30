package com.tencent.mm.plugin.webview.modeltools;

@mk0.a
/* loaded from: classes8.dex */
final class e0 implements com.tencent.mm.ipcinvoker.j {
    private e0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper webViewClipBoardHelper$ClipBoardDataWrapper = (com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper$ClipBoardDataWrapper) obj;
        if (webViewClipBoardHelper$ClipBoardDataWrapper != null) {
            w04.a.INSTANCE.W8(3, webViewClipBoardHelper$ClipBoardDataWrapper.f183235d, webViewClipBoardHelper$ClipBoardDataWrapper.f183236e, webViewClipBoardHelper$ClipBoardDataWrapper.f183237f, webViewClipBoardHelper$ClipBoardDataWrapper.f183238g);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewClipBoardHelper", "InvokeTask, mm received invalid data");
        }
    }
}
