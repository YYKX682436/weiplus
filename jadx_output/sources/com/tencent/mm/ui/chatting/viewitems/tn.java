package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class tn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f205620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.nn f205623g;

    public tn(com.tencent.mm.ui.chatting.viewitems.nn nnVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var) {
        this.f205623g = nnVar;
        this.f205620d = aoVar;
        this.f205621e = context;
        this.f205622f = f9Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        com.tencent.mm.ui.chatting.viewitems.er erVar2;
        com.tencent.mm.ui.chatting.viewitems.nn nnVar = this.f205623g;
        nnVar.f204939w = i17;
        nnVar.f204938v = menuItem.getItemId();
        int itemId = menuItem.getItemId();
        r15.g gVar = null;
        android.content.Context context = this.f205621e;
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f205620d;
        if (itemId == 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = nnVar.f204937u;
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
                    java.lang.String q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) nnVar.f204935s.f460708c.a(sb5.l2.class))).q0(erVar3.c(), false);
                    com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct shareMsgClipStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct();
                    shareMsgClipStruct.f60342d = erVar3.c().I0();
                    shareMsgClipStruct.f60344f = q07.length();
                    shareMsgClipStruct.f60343e = nnVar.f204937u.length();
                    shareMsgClipStruct.f60345g = c01.ia.i(erVar3.c());
                    shareMsgClipStruct.k();
                    com.tencent.mm.ui.chatting.viewitems.bo.a(erVar3.c(), 3, nnVar.f204937u.length());
                    return;
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextToBase", "report occur exception! %s", e17.getMessage());
                return;
            }
        }
        if (itemId == 1) {
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
        com.tencent.mm.storage.f9 f9Var = this.f205622f;
        if (itemId == 2) {
            com.tencent.mm.ui.chatting.viewitems.bo.a(f9Var, 4, 0);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_Msg_content", nnVar.f204937u);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("Retr_Is_Partial_Text_Select", true);
            intent.putExtra("scene_from", 17);
            intent.putExtra("ForwardParams_ForwardMsgType", 5);
            android.content.Context context3 = this.f205621e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextToBase$6", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.ui.chatting.viewitems.bo.a(f9Var, 5, 0);
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, nnVar.f204937u.toString(), 1);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = nnVar.f204935s.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag()) != null) {
                jq0Var.e(c01.z1.r());
                jq0Var.j(erVar.c().Q0());
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
        if (itemId == 4) {
            java.lang.String str = "65_" + c01.id.c();
            java.lang.String charSequence2 = nnVar.f204937u.toString();
            su4.j2 j2Var = new su4.j2();
            j2Var.f412938a = context;
            j2Var.f412939b = 65;
            j2Var.f412941d = charSequence2;
            j2Var.f412942e = str;
            j2Var.f412943f = true;
            j2Var.f412946i = false;
            j2Var.f412953p = true;
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            return;
        }
        if (itemId == 136 && (erVar2 = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag()) != null) {
            java.lang.CharSequence a17 = aoVar.f203379b.a();
            if (!com.tencent.mm.sdk.platformtools.t8.J0(nnVar.f204937u)) {
                gVar = r15.h.a(a17.toString(), nnVar.f204937u, ((java.lang.Integer) aoVar.f203386i.e().first).intValue(), ((java.lang.Integer) aoVar.f203386i.e().second).intValue());
                wl5.x xVar8 = aoVar.f203386i;
                if (xVar8 != null) {
                    xVar8.k();
                    wl5.x xVar9 = aoVar.f203386i;
                    xVar9.M = true;
                    xVar9.N = true;
                    xVar9.i();
                }
            }
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) nnVar.f204935s.f460708c.a(sb5.s0.class))).o0(erVar2.c(), gVar);
        }
    }
}
