package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f205504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lb f205508h;

    public sb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, com.tencent.mm.ui.chatting.viewitems.ya yaVar, android.content.Context context, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205508h = lbVar;
        this.f205504d = yaVar;
        this.f205505e = context;
        this.f205506f = dVar;
        this.f205507g = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        com.tencent.mm.ui.chatting.viewitems.er erVar2;
        com.tencent.mm.ui.chatting.viewitems.lb lbVar = this.f205508h;
        lbVar.f204416w = i17;
        lbVar.f204415v = menuItem.getItemId();
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        android.content.Context context = this.f205505e;
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f205504d;
        if (itemId == 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = lbVar.f204413t;
            com.tencent.mm.sdk.platformtools.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = yaVar.f206059j;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = yaVar.f206059j;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.tencent.mm.ui.chatting.viewitems.bo.g(context);
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = yaVar.f206059j;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = yaVar.f206059j;
                xVar4.M = true;
                xVar4.i();
                yaVar.f206059j.l(0, yaVar.f206051b.a().length());
                yaVar.f206059j.o();
                yaVar.f206059j.r();
                wl5.v vVar2 = yaVar.f206059j.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", lbVar.f204413t);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("scene_from", 17);
            android.content.Context context3 = this.f205505e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, lbVar.f204413t.toString(), 1);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = lbVar.f204412s.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) yaVar.f206051b.getTag()) != null) {
                jq0Var.e(erVar.c().Q0());
                jq0Var.j(c01.z1.r());
                doFavoriteEvent.e();
            }
            com.tencent.mm.ui.chatting.viewitems.hc.a(yaVar);
            return;
        }
        if (itemId != 4) {
            if (itemId == 136 && (erVar2 = (com.tencent.mm.ui.chatting.viewitems.er) yaVar.f206051b.getTag()) != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.J0(lbVar.f204413t)) {
                    gVar = r15.h.a(yaVar.f206051b.a().toString(), lbVar.f204413t, ((java.lang.Integer) yaVar.f206059j.e().first).intValue(), ((java.lang.Integer) yaVar.f206059j.e().second).intValue());
                    com.tencent.mm.ui.chatting.viewitems.hc.a(yaVar);
                }
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f205506f.f460708c.a(sb5.s0.class))).o0(erVar2.c(), gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = lbVar.f204413t.toString();
        this.f205508h.D(this.f205506f, this.f205507g, 2, !com.tencent.mm.sdk.platformtools.t8.K0(((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2)), charSequence2, true, str, 3);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context;
        j2Var.f412939b = 65;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
