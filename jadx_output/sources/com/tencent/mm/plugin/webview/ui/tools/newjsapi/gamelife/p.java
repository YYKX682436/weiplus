package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/p;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/AddConversationParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class p implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams addConversationParams = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams) obj;
        if (addConversationParams == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(false, "system err"));
                return;
            }
            return;
        }
        z53.t Di = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di();
        java.lang.String str = addConversationParams.f186119d;
        z53.i z07 = Di.z0(str);
        if (z07.systemRowid != -1 && rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(false, "conversation already exist"));
        }
        z07.field_digest = "";
        z07.field_sessionId = str;
        z07.field_talker = addConversationParams.f186121f;
        z07.field_selfUserName = addConversationParams.f186120e;
        Di.insert(z07);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeGeneralReturnParam(true, "add conversation"));
        }
    }
}
