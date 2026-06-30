package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ud implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.od f205676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.pd f205679g;

    public ud(com.tencent.mm.ui.chatting.viewitems.pd pdVar, com.tencent.mm.ui.chatting.viewitems.od odVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        this.f205679g = pdVar;
        this.f205676d = odVar;
        this.f205677e = context;
        this.f205678f = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        com.tencent.mm.ui.chatting.viewitems.pd pdVar = this.f205679g;
        com.tencent.mm.ui.chatting.viewitems.od odVar = this.f205676d;
        if (itemId == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = pdVar.f205252t;
            com.tencent.mm.sdk.platformtools.b0.d(context, charSequence, charSequence, null);
            wl5.x xVar = odVar.f205184g;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = odVar.f205184g;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            android.app.Activity g17 = pdVar.f205251s.g();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
            e4Var.f211776c = pdVar.f205251s.g().getResources().getString(com.tencent.mm.R.string.f490361st);
            e4Var.c();
            try {
                com.tencent.mm.ui.chatting.viewitems.er erVar2 = (com.tencent.mm.ui.chatting.viewitems.er) odVar.f205179b.getTag();
                if (erVar2 != null) {
                    java.lang.String q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) pdVar.f205251s.f460708c.a(sb5.l2.class))).q0(erVar2.c(), false);
                    com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct shareMsgClipStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct();
                    shareMsgClipStruct.f60342d = erVar2.c().I0();
                    shareMsgClipStruct.f60344f = q07.length();
                    shareMsgClipStruct.f60343e = pdVar.f205252t.length();
                    shareMsgClipStruct.f60345g = c01.ia.i(erVar2.c());
                    shareMsgClipStruct.k();
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgTextFrom", "report occur exception! %s", e17.getMessage());
                return;
            }
        }
        if (itemId == 1) {
            wl5.x xVar3 = odVar.f205184g;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = odVar.f205184g;
                xVar4.M = true;
                xVar4.i();
                odVar.f205184g.l(0, odVar.f205179b.a().length());
                odVar.f205184g.o();
                wl5.x xVar5 = odVar.f205184g;
                if (xVar5.f447168m) {
                    xVar5.f447168m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                odVar.f205184g.r();
                wl5.v vVar2 = odVar.f205184g.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        android.content.Context context2 = this.f205677e;
        com.tencent.mm.storage.f9 f9Var = this.f205678f;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_content", pdVar.f205252t);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("scene_from", 17);
            android.content.Context context3 = this.f205677e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, pdVar.f205252t.toString(), 1);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = pdVar.f205251s.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) odVar.f205179b.getTag()) != null) {
                jq0Var.e(c01.z1.r());
                jq0Var.j(erVar.c().Q0());
                doFavoriteEvent.e();
            }
            wl5.x xVar6 = odVar.f205184g;
            if (xVar6 != null) {
                xVar6.k();
                wl5.x xVar7 = odVar.f205184g;
                xVar7.M = true;
                xVar7.N = true;
                xVar7.i();
                return;
            }
            return;
        }
        if (itemId != 4) {
            if (itemId == 136 && ((com.tencent.mm.ui.chatting.viewitems.er) odVar.f205179b.getTag()) != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.J0(pdVar.f205252t)) {
                    gVar = r15.h.a(odVar.f205179b.a().toString(), pdVar.f205252t, ((java.lang.Integer) odVar.f205184g.e().first).intValue(), ((java.lang.Integer) odVar.f205184g.e().second).intValue());
                    wl5.x xVar8 = odVar.f205184g;
                    if (xVar8 != null) {
                        xVar8.k();
                        wl5.x xVar9 = odVar.f205184g;
                        xVar9.M = true;
                        xVar9.N = true;
                        xVar9.i();
                    }
                }
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) pdVar.f205251s.f460708c.a(sb5.s0.class))).o0(f9Var, gVar);
                return;
            }
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = pdVar.f205252t.toString();
        pdVar.D(pdVar.f205251s, this.f205678f, 2, !com.tencent.mm.sdk.platformtools.t8.K0(((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2)), charSequence2, true, str, 3);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = context2;
        j2Var.f412939b = 65;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        j2Var.f412953p = true;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
