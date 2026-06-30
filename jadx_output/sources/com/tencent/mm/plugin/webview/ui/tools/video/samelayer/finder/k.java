package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/k;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes2.dex */
public final class k implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.protocal.protobuf.FinderObject Yk;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        if (iPCString != null) {
            java.lang.String str = iPCString.f68406d;
            if (!(str == null || str.length() == 0)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String str2 = iPCString.f68406d;
                if (str2 == null) {
                    str2 = "";
                }
                c61.l7 l7Var = (c61.l7) b6Var;
                l7Var.getClass();
                android.os.Bundle bundle2 = new android.os.Bundle();
                try {
                    cl0.g gVar = new cl0.g(str2);
                    java.lang.String optString = gVar.optString("nonceId");
                    java.lang.String optString2 = gVar.optString("exportId");
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.storage.FinderItem wi6 = cq.k.wi((cq.k) c17, optString2, 0, 2, null);
                    if (wi6 == null || (Yk = wi6.getFeedObject()) == null) {
                        kotlin.jvm.internal.o.d(optString2);
                        Yk = l7Var.Yk(0L, optString, 6, optString2);
                    }
                    java.lang.Long nl6 = l7Var.nl(str2, 6);
                    long longValue = nl6 != null ? nl6.longValue() : 0L;
                    int j17 = Yk != null ? hc2.o0.j(Yk) : 0;
                    bundle2.putLong("localFeedId", longValue);
                    bundle2.putLong("mediaType", j17);
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderCommonFeatureService", "json parse failed !");
                    bundle2 = new android.os.Bundle();
                }
                if (rVar != null) {
                    rVar.a(bundle2);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data invalid");
        bundle.putLong("localFeedId", 0L);
        bundle.putLong("mediaType", 0L);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
