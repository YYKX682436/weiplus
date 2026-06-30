package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/l;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class l implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (iPCString != null) {
            java.lang.String str = iPCString.f68406d;
            if (!(str == null || str.length() == 0)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
                    java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    if (optString == null) {
                        optString = "";
                    }
                    if (jSONObject.has("isLike")) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Nk(optString, 184, jSONObject.optBoolean("isLike", false));
                    }
                    if (jSONObject.has("isFav")) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zj(optString, 184, jSONObject.optBoolean("isFav", false));
                    }
                    if (rVar != null) {
                        rVar.a(iPCVoid);
                        return;
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewVideoFinderActionHandler", e17, "operateFinderVideo exception", new java.lang.Object[0]);
                    if (rVar != null) {
                        rVar.a(iPCVoid);
                        return;
                    }
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo data invalid");
        if (rVar != null) {
            rVar.a(iPCVoid);
        }
    }
}
