package fx4;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lfx4/e;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Args;", "Lcom/tencent/mm/plugin/webview/ui/tools/audio/AddItemToPlayLaterIPCTask$Result;", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class e extends com.tencent.mm.ipcinvoker.g<com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args, com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args data = (com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args) obj;
        kotlin.jvm.internal.o.g(data, "data");
        try {
            com.tencent.mars.xlog.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater executeAsync in main process");
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.parseFrom(data.f183914d);
            java.lang.String b17 = lp0Var.b();
            kotlin.jvm.internal.o.f(b17, "getClientId(...)");
            if (!(b17.length() == 0) && lp0Var.d() != null) {
                int i17 = data.f183915e;
                bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                if (i17 == 1104) {
                    com.tencent.wechat.iam.biz.o.f217761b.a(lp0Var, i17, new fx4.i(new fx4.d(rVar)));
                }
            }
            com.tencent.mars.xlog.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater data failed");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result(false));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AddItemToPlayLaterIPCTask", "addItemToPlayLater handle error: " + e17);
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result(false));
            }
        }
    }
}
