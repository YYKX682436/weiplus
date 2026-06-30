package n02;

/* loaded from: classes4.dex */
public class e implements com.tencent.mm.plugin.downloader_app.model.u {
    public void Z(int i17, long j17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, event = %d, appId = %s", java.lang.Integer.valueOf(i17), c17.field_appId);
        if (com.tencent.mm.plugin.downloader_app.model.s0.b(c17.field_appId)) {
            if (i17 == 9) {
                java.lang.String str = c17.field_appId;
                com.tencent.mm.plugin.downloader_app.model.s0.d();
                java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.s0.f97330b;
                if (linkedList.contains(str)) {
                    return;
                }
                com.tencent.mm.plugin.downloader_app.model.s0.f97329a.remove(str);
                linkedList.addFirst(str);
                q02.b.c(str, 1);
                return;
            }
            if (i17 == 1 || i17 == 7) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str2 = c17.field_appId;
                ((kt.c) i0Var).getClass();
                com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
                if (h17 != null && com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, h17.field_packageName)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, hasInstall");
                    return;
                }
                java.lang.String str3 = c17.field_appId;
                com.tencent.mm.plugin.downloader_app.model.s0.d();
                java.util.LinkedList linkedList2 = com.tencent.mm.plugin.downloader_app.model.s0.f97329a;
                if (linkedList2.contains(str3)) {
                    return;
                }
                com.tencent.mm.plugin.downloader_app.model.s0.f97330b.remove(str3);
                linkedList2.addFirst(str3);
                q02.b.c(str3, 0);
            }
        }
    }
}
