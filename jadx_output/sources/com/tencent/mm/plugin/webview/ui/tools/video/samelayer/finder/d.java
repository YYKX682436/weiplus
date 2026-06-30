package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        r45.n23 n23Var;
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = (com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper) obj;
        if (webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper != null && (n23Var = webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d) != null) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).oj(n23Var);
        }
        com.tencent.mm.autogen.events.OnFinderVideoPluginForegroundEvent onFinderVideoPluginForegroundEvent = new com.tencent.mm.autogen.events.OnFinderVideoPluginForegroundEvent();
        onFinderVideoPluginForegroundEvent.f54573g.getClass();
        onFinderVideoPluginForegroundEvent.e();
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
