package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes2.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString != null) {
            java.lang.String str = iPCString.f68406d;
            if (!(str == null || str.length() == 0)) {
                com.tencent.mm.protocal.protobuf.FinderObject Yk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yk(pm0.v.Z(iPCString.f68406d), null, 184, "");
                if (Yk == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo failed finderObject null");
                    if (rVar != null) {
                        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin();
                        finderFeedInfoForVideoPlugin.f186976d = "";
                        rVar.a(finderFeedInfoForVideoPlugin);
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo success localFeedId: " + iPCString.f68406d);
                if (rVar != null) {
                    com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin2 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin();
                    java.lang.String str2 = iPCString.f68406d;
                    finderFeedInfoForVideoPlugin2.f186976d = str2 != null ? str2 : "";
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    nv2.n1 n1Var = nv2.n1.f340551h;
                    finderFeedInfoForVideoPlugin2.f186977e = ((java.lang.Boolean) n1Var.k(Yk).f302833d).booleanValue();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    nv2.o oVar = nv2.o.f340558e;
                    finderFeedInfoForVideoPlugin2.f186978f = oVar.c(Yk);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    finderFeedInfoForVideoPlugin2.f186979g = n1Var.l(Yk);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    finderFeedInfoForVideoPlugin2.f186980h = oVar.b(Yk);
                    rVar.a(finderFeedInfoForVideoPlugin2);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo localFeedId invalid");
        if (rVar != null) {
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin3 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin();
            finderFeedInfoForVideoPlugin3.f186976d = "";
            rVar.a(finderFeedInfoForVideoPlugin3);
        }
    }
}
