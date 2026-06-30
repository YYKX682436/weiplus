package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/u;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class u implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.database.Cursor all = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        all.moveToFirst();
        while (!all.isAfterLast()) {
            z53.i iVar = new z53.i();
            iVar.convertFrom(all);
            java.lang.String field_sessionId = iVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            int i17 = iVar.field_unReadCount;
            int i18 = (int) (iVar.field_updateTime / 1000);
            java.lang.String field_editingMsg = iVar.field_editingMsg;
            kotlin.jvm.internal.o.f(field_editingMsg, "field_editingMsg");
            java.lang.String field_selfUserName = iVar.field_selfUserName;
            kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
            java.lang.String field_talker = iVar.field_talker;
            kotlin.jvm.internal.o.f(field_talker, "field_talker");
            java.lang.String field_digest = iVar.field_digest;
            kotlin.jvm.internal.o.f(field_digest, "field_digest");
            arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData(field_sessionId, i17, i18, field_editingMsg, 0, field_selfUserName, field_talker, field_digest));
            all.moveToNext();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData) it.next()).f186136d);
        }
        if (!arrayList2.isEmpty()) {
            new w53.b(new java.util.LinkedList(arrayList2)).l().H(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.t(arrayList, rVar));
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData(null, "no conversation", true));
        }
    }
}
