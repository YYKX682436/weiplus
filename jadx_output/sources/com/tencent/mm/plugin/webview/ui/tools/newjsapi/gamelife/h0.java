package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes4.dex */
public final class h0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186185e;

    public h0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186184d = kVar;
        this.f186185e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData getGamelifeConversationData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData) obj;
        boolean z17 = getGamelifeConversationData.f186151f;
        nw4.y2 y2Var = this.f186185e;
        nw4.k kVar = this.f186184d;
        java.lang.String str = getGamelifeConversationData.f186150e;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:fail " + str, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData> list = getGamelifeConversationData.f186149d;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData gamelifeConversationData : list) {
                arrayList.add(java.lang.Boolean.valueOf(linkedList.add(nw4.x2.b(kz5.c1.k(new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, gamelifeConversationData.f186136d), new jz5.l("unreadCount", java.lang.Integer.valueOf(gamelifeConversationData.f186137e)), new jz5.l("lastMsgUpdateTime", java.lang.Integer.valueOf(gamelifeConversationData.f186138f)), new jz5.l("draftMsg", gamelifeConversationData.f186139g), new jz5.l("draftMsgTime", java.lang.Integer.valueOf(gamelifeConversationData.f186140h)), new jz5.l("selfUsername", gamelifeConversationData.f186141i), new jz5.l("talker", gamelifeConversationData.f186142m), new jz5.l("digest", gamelifeConversationData.f186143n))))));
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("conversationList", linkedList);
        kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:ok " + str, hashMap);
    }
}
