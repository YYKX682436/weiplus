package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ca implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q9 f203707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ga f203710g;

    public ca(com.tencent.mm.ui.chatting.viewitems.ga gaVar, com.tencent.mm.ui.chatting.viewitems.q9 q9Var, android.content.Context context, yb5.d dVar) {
        this.f203710g = gaVar;
        this.f203707d = q9Var;
        this.f203708e = context;
        this.f203709f = dVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.jq0 jq0Var;
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.viewitems.ga gaVar = this.f203710g;
        gaVar.f204023v = itemId;
        gaVar.f204024w = i17;
        int itemId2 = menuItem.getItemId();
        android.content.Context context = this.f203708e;
        r15.g gVar = null;
        com.tencent.mm.ui.chatting.viewitems.q9 q9Var = this.f203707d;
        if (itemId2 == 0) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.CharSequence charSequence = gaVar.f204021t;
            com.tencent.mm.sdk.platformtools.b0.d(context2, charSequence, charSequence, null);
            wl5.x xVar = q9Var.f205333f;
            if (xVar != null) {
                xVar.k();
                wl5.x xVar2 = q9Var.f205333f;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
            }
            com.tencent.mm.ui.chatting.viewitems.bo.g(context);
            return;
        }
        if (itemId2 == 1) {
            wl5.x xVar3 = q9Var.f205333f;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = q9Var.f205333f;
                xVar4.M = true;
                xVar4.i();
                q9Var.f205333f.l(0, q9Var.f205329b.a().length());
                q9Var.f205333f.o();
                wl5.x xVar5 = q9Var.f205333f;
                if (xVar5.f447168m) {
                    xVar5.f447168m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                q9Var.f205333f.r();
                wl5.v vVar2 = q9Var.f205333f.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        if (itemId2 == 2) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", gaVar.f204021t);
            intent.putExtra("Retr_Msg_Type", 4);
            intent.putExtra("scene_from", 17);
            android.content.Context context3 = this.f203708e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$4", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (itemId2 != 3) {
            if (itemId2 == 136 && ((com.tencent.mm.ui.chatting.viewitems.er) q9Var.f205329b.getTag()) != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.J0(gaVar.f204021t)) {
                    gVar = r15.h.a(q9Var.f205329b.a().toString(), gaVar.f204021t, ((java.lang.Integer) q9Var.f205333f.e().first).intValue(), ((java.lang.Integer) q9Var.f205333f.e().second).intValue());
                    wl5.x xVar6 = q9Var.f205333f;
                    if (xVar6 != null) {
                        xVar6.k();
                        wl5.x xVar7 = q9Var.f205333f;
                        xVar7.M = true;
                        xVar7.N = true;
                        xVar7.i();
                    }
                }
                yb5.d dVar = this.f203709f;
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).o0(q9Var.getCurrentMsgInfo(dVar), gVar);
                return;
            }
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, gaVar.f204021t.toString(), 1);
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = gaVar.f204020s.f460717l;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6324j = baseChattingUIFragment;
        c4Var.f6327m = 43;
        r45.bq0 bq0Var = c4Var.f6315a;
        if (bq0Var != null && (jq0Var = bq0Var.f370962d) != null && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) q9Var.f205329b.getTag()) != null) {
            jq0Var.e(erVar.c().Q0());
            jq0Var.j(c01.z1.r());
            doFavoriteEvent.e();
        }
        wl5.x xVar8 = q9Var.f205333f;
        if (xVar8 != null) {
            xVar8.k();
            wl5.x xVar9 = q9Var.f205333f;
            xVar9.M = true;
            xVar9.N = true;
            xVar9.i();
        }
    }
}
