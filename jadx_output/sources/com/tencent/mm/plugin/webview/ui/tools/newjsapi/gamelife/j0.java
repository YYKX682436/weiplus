package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186189e;

    public j0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186188d = kVar;
        this.f186189e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgList getMsgList = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgList) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean z17 = getMsgList.f186156e;
        nw4.y2 y2Var = this.f186189e;
        nw4.k kVar = this.f186188d;
        java.lang.String str = getMsgList.f186157f;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:fail " + str, null);
            return;
        }
        java.util.List<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg> list = getMsgList.f186155d;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GameLifeMsg gameLifeMsg : list) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("toUsername", gameLifeMsg.f186125d);
                hashMap2.put("fromUsername", gameLifeMsg.f186126e);
                hashMap2.put("messageTime", java.lang.Double.valueOf(gameLifeMsg.f186127f));
                hashMap2.put("content", gameLifeMsg.f186128g);
                hashMap2.put("localMsgId", java.lang.Integer.valueOf(gameLifeMsg.f186129h));
                hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, gameLifeMsg.f186130i);
                hashMap2.put("uiSendingStatus", java.lang.Integer.valueOf(gameLifeMsg.f186131m));
                hashMap2.put("msgSource", gameLifeMsg.f186132n);
                hashMap2.put("appId", gameLifeMsg.f186133o);
                hashMap2.put("messageType", java.lang.Integer.valueOf(gameLifeMsg.f186134p));
                hashMap2.put("rawMsgType", java.lang.Integer.valueOf(gameLifeMsg.f186135q));
                arrayList.add(java.lang.Boolean.valueOf(linkedList.add(nw4.x2.b(hashMap2))));
            }
            hashMap.put("messageList", linkedList);
        }
        kVar.f340863d.e(y2Var.f341013c, "gamelifeManager:ok " + str, hashMap);
    }
}
