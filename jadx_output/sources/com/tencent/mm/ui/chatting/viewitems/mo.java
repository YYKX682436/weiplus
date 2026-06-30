package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class mo implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f204595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204598g;

    public mo(com.tencent.mm.ui.chatting.viewitems.lp lpVar, com.tencent.mm.storage.f9 f9Var, yb5.d dVar, android.content.Context context) {
        this.f204595d = lpVar;
        this.f204596e = f9Var;
        this.f204597f = dVar;
        this.f204598g = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = this.f204595d;
        java.lang.String charSequence = lpVar.f204516n.toString();
        int itemId = menuItem.getItemId();
        com.tencent.mm.storage.f9 f9Var = this.f204596e;
        if (itemId == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                com.tencent.mm.sdk.platformtools.b0.e(charSequence);
            }
            com.tencent.mm.ui.chatting.viewitems.mp.e(8, f9Var);
            wl5.x xVar = lpVar.f204515m;
            if (xVar != null) {
                xVar.k();
                lpVar.f204515m.f();
                wl5.x xVar2 = lpVar.f204515m;
                xVar2.M = true;
                xVar2.N = true;
                xVar2.i();
                return;
            }
            return;
        }
        if (itemId == 1) {
            wl5.x xVar3 = lpVar.f204515m;
            if (xVar3 != null) {
                wl5.v vVar = xVar3.f447166k;
                if (vVar != null) {
                    vVar.d();
                }
                wl5.x xVar4 = lpVar.f204515m;
                xVar4.M = true;
                xVar4.i();
                lpVar.f204515m.l(0, lpVar.f204511i.getContentView().a().length());
                lpVar.f204515m.o();
                wl5.x xVar5 = lpVar.f204515m;
                if (xVar5.f447168m) {
                    xVar5.f447168m = false;
                    xVar5.n(java.lang.Boolean.TRUE);
                }
                lpVar.f204515m.r();
                wl5.v vVar2 = lpVar.f204515m.f447166k;
                if (vVar2 != null) {
                    vVar2.e();
                    return;
                }
                return;
            }
            return;
        }
        yb5.d dVar = this.f204597f;
        if (itemId == 2) {
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            if (f9Var.X2()) {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 6);
            } else {
                intent.putExtra("Retr_Msg_content", charSequence);
                intent.putExtra("Retr_Msg_Type", 4);
            }
            intent.putExtra("scene_from", 17);
            yb5.d dVar2 = this.f204597f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$13", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar2.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$13", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.ui.chatting.viewitems.mp.e(9, f9Var);
            wl5.x xVar6 = lpVar.f204515m;
            if (xVar6 != null) {
                xVar6.k();
                lpVar.f204515m.f();
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
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemVoice", "transform text fav failed");
            }
            com.tencent.mm.ui.chatting.viewitems.mp.e(10, f9Var);
            wl5.x xVar7 = lpVar.f204515m;
            if (xVar7 != null) {
                xVar7.k();
                lpVar.f204515m.f();
                return;
            }
            return;
        }
        if (itemId != 4) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        java.lang.String charSequence2 = lpVar.f204516n.toString();
        ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(charSequence2);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = this.f204598g;
        j2Var.f412939b = 65;
        j2Var.f412941d = charSequence2;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        j2Var.f412953p = true;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        wl5.x xVar8 = lpVar.f204515m;
        if (xVar8 != null) {
            xVar8.k();
            lpVar.f204515m.f();
        }
    }
}
