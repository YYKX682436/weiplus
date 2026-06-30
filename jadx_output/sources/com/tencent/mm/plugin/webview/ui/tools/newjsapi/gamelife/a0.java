package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/a0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetSessionIdParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeSessionIdData;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class a0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams getSessionIdParams = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams) obj;
        if (getSessionIdParams != null) {
            ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).wi(getSessionIdParams.f186162d, getSessionIdParams.f186163e, getSessionIdParams.f186164f, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.z(rVar));
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeSessionIdData("", "system err", false));
        }
    }
}
