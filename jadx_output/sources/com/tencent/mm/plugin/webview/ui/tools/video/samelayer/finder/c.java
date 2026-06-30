package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/c;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes2.dex */
public final class c implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        r45.n23 n23Var;
        java.lang.Object obj2;
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = (com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper) obj;
        if (webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper != null && (n23Var = webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d) != null) {
            c61.w8 w8Var = (c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class));
            w8Var.getClass();
            java.util.LinkedList linkedList = w8Var.f39386d;
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                com.tencent.mm.plugin.finder.report.n4 n4Var = (com.tencent.mm.plugin.finder.report.n4) obj2;
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) n23Var.getCustom(0);
                if ((finderObject != null ? finderObject.getId() : 0L) == n4Var.f125153a) {
                    break;
                }
            }
            com.tencent.mm.plugin.finder.report.n4 n4Var2 = (com.tencent.mm.plugin.finder.report.n4) obj2;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, 184);
            qt2Var.set(1, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(26, 33, qt2Var.getInteger(5)));
            if (n4Var2 != null) {
                long c17 = c01.id.c();
                n4Var2.f125173k = c17;
                n4Var2.N = c17 - n4Var2.f125157c;
                com.tencent.mm.plugin.finder.report.l4 l4Var = com.tencent.mm.plugin.finder.report.n4.f125151r0;
                r45.vd6 d17 = l4Var.d(n4Var2, qt2Var);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stat:");
                l4Var.c(d17, "stopPlayVideoInMp");
                sb6.append(jz5.f0.f302826a);
                ot5.g.c("stopPlayVideoInMp", sb6.toString());
                com.tencent.mm.plugin.finder.report.w4 w4Var = com.tencent.mm.plugin.finder.report.w4.f125422a;
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(d17);
                w4Var.b(linkedList2, qt2Var, 0);
                linkedList.remove(n4Var2);
            }
        }
        com.tencent.mm.autogen.events.OnFinderVideoPluginBackgroundEvent onFinderVideoPluginBackgroundEvent = new com.tencent.mm.autogen.events.OnFinderVideoPluginBackgroundEvent();
        onFinderVideoPluginBackgroundEvent.f54572g.getClass();
        onFinderVideoPluginBackgroundEvent.e();
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
