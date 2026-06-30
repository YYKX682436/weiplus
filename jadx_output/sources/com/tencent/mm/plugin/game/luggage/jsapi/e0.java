package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class e0 implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z53.i f139619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl0.g f139621c;

    public e0(com.tencent.mm.plugin.game.luggage.jsapi.f0 f0Var, z53.i iVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, cl0.g gVar) {
        this.f139619a = iVar;
        this.f139620b = q5Var;
        this.f139621c = gVar;
    }

    @Override // u53.x
    public void a(java.util.Map map) {
        cl0.g gVar = this.f139621c;
        z53.i iVar = this.f139619a;
        u53.u uVar = (u53.u) map.get(iVar.field_talker);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139620b;
        if (uVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetGameChatRedInfo", "contact is null");
            q5Var.a("contact is null", null);
            return;
        }
        cl0.g gVar2 = new cl0.g();
        try {
            gVar2.h("avatarUrl", ((y53.m) uVar).field_avatarURL);
            gVar2.r("isValid", ((y53.m) uVar).B);
            gVar2.h("nickName", ((y53.m) uVar).field_nickname);
            gVar2.o("unreadCount", iVar.field_unReadCount);
            gVar2.h("userName", iVar.field_talker);
            gVar2.p("lastMsgUpdateTime", iVar.field_updateTime);
            gVar.h("lastUnReadConversationInfo", gVar2);
        } catch (cl0.f unused) {
        }
        q5Var.a(null, gVar);
    }
}
