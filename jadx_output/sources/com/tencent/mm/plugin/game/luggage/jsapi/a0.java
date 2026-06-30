package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class a0 implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.QueryGameLifeMsgEvent f139584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.b0 f139585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139586c;

    public a0(com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent, com.tencent.mm.plugin.game.luggage.jsapi.b0 b0Var, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139584a = queryGameLifeMsgEvent;
        this.f139585b = b0Var;
        this.f139586c = q5Var;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent = this.f139584a;
        u53.u uVar = (u53.u) map.get(queryGameLifeMsgEvent.f54636g.f6484c);
        this.f139585b.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uVar != null ? ((y53.m) uVar).field_avatarURL : null;
        objArr[1] = queryGameLifeMsgEvent.f54636g.f6483b;
        com.tencent.mars.xlog.Log.i("fetchGameCenterEntranceInfo", "gameLifeEvent isShow = true iconUrl:%s , wording:%s", objArr);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("iconUrl", uVar != null ? ((y53.m) uVar).field_avatarURL : null);
        jSONObject.put("wording", queryGameLifeMsgEvent.f54636g.f6483b);
        jSONObject.put("unReadCount", queryGameLifeMsgEvent.f54636g.f6485d);
        jSONObject.put("msgType", 3);
        this.f139586c.a(null, jSONObject);
    }
}
