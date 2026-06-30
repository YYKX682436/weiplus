package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class mn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f204587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.gn f204590g;

    public mn(com.tencent.mm.ui.chatting.viewitems.gn gnVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        this.f204590g = gnVar;
        this.f204587d = aoVar;
        this.f204588e = context;
        this.f204589f = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        com.tencent.mm.ui.chatting.viewitems.er erVar2;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.viewitems.gn gnVar = this.f204590g;
        gnVar.f204058v = itemId;
        gnVar.f204059w = i17;
        int itemId2 = menuItem.getItemId();
        r15.g gVar = null;
        final android.content.Context context = this.f204588e;
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f204587d;
        if (itemId2 == 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = gnVar.f204057u;
            com.tencent.mm.sdk.platformtools.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = aoVar.f203386i;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = aoVar.f203386i;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.tencent.mm.ui.chatting.viewitems.bo.g(context);
            try {
                com.tencent.mm.ui.chatting.viewitems.er erVar3 = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag();
                if (erVar3 != null) {
                    java.lang.String q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) gnVar.f204055s.f460708c.a(sb5.l2.class))).q0(erVar3.c(), false);
                    com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct shareMsgClipStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct();
                    shareMsgClipStruct.f60342d = erVar3.c().I0();
                    shareMsgClipStruct.f60344f = q07.length();
                    shareMsgClipStruct.f60343e = gnVar.f204057u.length();
                    shareMsgClipStruct.f60345g = c01.ia.i(erVar3.c());
                    shareMsgClipStruct.k();
                    com.tencent.mm.ui.chatting.viewitems.bo.a(erVar3.c(), 3, gnVar.f204057u.length());
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFromBase", "report occur exception! %s", e17.getMessage());
                return;
            }
        }
        if (itemId2 == 1) {
            wl5.x xVar3 = aoVar.f203386i;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = aoVar.f203386i;
                xVar4.M = true;
                xVar4.i();
                aoVar.f203386i.l(0, aoVar.f203379b.a().length());
                aoVar.f203386i.o();
                wl5.x xVar5 = aoVar.f203386i;
                if (xVar5.f447168m) {
                    xVar5.f447168m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                aoVar.f203386i.r();
                wl5.v vVar2 = aoVar.f203386i.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId2 == 2) {
            final com.tencent.mm.ui.chatting.viewitems.er erVar4 = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag();
            if (erVar4 != null) {
                com.tencent.mm.ui.chatting.viewitems.bo.a(erVar4.c(), 4, 0);
                final com.tencent.mm.storage.f9 f9Var = this.f204589f;
                com.tencent.mm.ui.chatting.manager.t.a(erVar4.c(), context, new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.mn$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Context context3 = context;
                        com.tencent.mm.ui.chatting.viewitems.mn mnVar = com.tencent.mm.ui.chatting.viewitems.mn.this;
                        mnVar.getClass();
                        android.content.Intent intent = new android.content.Intent(context3, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                        intent.putExtra("Retr_Msg_Id", erVar4.c().getMsgId());
                        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                        intent.putExtra("Retr_Msg_content", mnVar.f204590g.f204057u);
                        intent.putExtra("Retr_Msg_Type", 4);
                        intent.putExtra("Retr_Is_Partial_Text_Select", true);
                        intent.putExtra("scene_from", 17);
                        intent.putExtra("ForwardParams_ForwardMsgType", 5);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context3.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
                return;
            }
            return;
        }
        if (itemId2 == 3) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, gnVar.f204057u.toString(), 1);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = gnVar.f204055s.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag()) != null) {
                com.tencent.mm.ui.chatting.viewitems.bo.a(erVar.c(), 5, 0);
                jq0Var.e(erVar.c().Q0());
                jq0Var.j(c01.z1.r());
                doFavoriteEvent.e();
            }
            wl5.x xVar6 = aoVar.f203386i;
            if (xVar6 != null) {
                xVar6.k();
                wl5.x xVar7 = aoVar.f203386i;
                xVar7.M = true;
                xVar7.N = true;
                xVar7.i();
                return;
            }
            return;
        }
        if (itemId2 != 4) {
            if (itemId2 == 136 && (erVar2 = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag()) != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.J0(gnVar.f204057u)) {
                    gVar = r15.h.a(aoVar.f203379b.a().toString(), gnVar.f204057u, ((java.lang.Integer) aoVar.f203386i.e().first).intValue(), ((java.lang.Integer) aoVar.f203386i.e().second).intValue());
                    wl5.x xVar8 = aoVar.f203386i;
                    if (xVar8 != null) {
                        xVar8.k();
                        wl5.x xVar9 = aoVar.f203386i;
                        xVar9.M = true;
                        xVar9.N = true;
                        xVar9.i();
                    }
                }
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) gnVar.f204055s.f460708c.a(sb5.s0.class))).o0(erVar2.c(), gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = gnVar.f204057u.toString();
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context;
        j2Var.f412939b = 65;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        j2Var.f412953p = false;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
