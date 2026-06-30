package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class bn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f203497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203500g;

    public bn(com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        this.f203497d = aoVar;
        this.f203498e = dVar;
        this.f203499f = f9Var;
        this.f203500g = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f203497d;
        java.lang.String charSequence = aoVar.f203392o.toString();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                com.tencent.mm.sdk.platformtools.b0.e(charSequence);
            }
            wl5.x xVar = aoVar.f203391n;
            if (xVar != null) {
                xVar.k();
                aoVar.f203391n.f();
                wl5.x xVar2 = aoVar.f203391n;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
                return;
            }
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = aoVar.f203391n;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = aoVar.f203391n;
                xVar4.M = true;
                xVar4.i();
                aoVar.f203391n.l(0, aoVar.f203382e.getContentView().a().length());
                aoVar.f203391n.o();
                wl5.x xVar5 = aoVar.f203391n;
                if (xVar5.f447168m) {
                    xVar5.f447168m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                aoVar.f203391n.r();
                wl5.v vVar2 = aoVar.f203391n.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f203499f;
        yb5.d dVar = this.f203498e;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            if (f9Var.X2()) {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 6);
            } else {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 4);
            }
            intent.putExtra("Retr_Is_Partial_Text_Select", true);
            intent.putExtra("scene_from", 17);
            intent.putExtra("ForwardParams_ForwardMsgType", 5);
            yb5.d dVar2 = this.f203498e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar2.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            wl5.x xVar6 = aoVar.f203391n;
            if (xVar6 != null) {
                xVar6.k();
                aoVar.f203391n.f();
                return;
            }
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, charSequence, 1);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 43;
            r45.bq0 bq0Var = c4Var.f6315a;
            if (bq0Var != null) {
                r45.jq0 jq0Var = bq0Var.f370962d;
                if (jq0Var != null) {
                    jq0Var.e(c01.z1.r());
                    jq0Var.j(f9Var.Q0());
                    doFavoriteEvent.e();
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextBase", "transform text fav failed");
            }
            wl5.x xVar7 = aoVar.f203391n;
            if (xVar7 != null) {
                xVar7.k();
                aoVar.f203391n.f();
                return;
            }
            return;
        }
        if (itemId != 4) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = aoVar.f203392o.toString();
        ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = this.f203500g;
        j2Var.f412939b = 65;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        j2Var.f412953p = true;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        wl5.x xVar8 = aoVar.f203391n;
        if (xVar8 != null) {
            xVar8.k();
            aoVar.f203391n.f();
        }
    }
}
