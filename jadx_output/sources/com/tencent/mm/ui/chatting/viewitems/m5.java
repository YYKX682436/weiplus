package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class m5 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204562s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488515vl);
        com.tencent.mm.ui.chatting.viewitems.l5 l5Var = new com.tencent.mm.ui.chatting.viewitems.l5();
        l5Var.a(xgVar, true);
        xgVar.setTag(l5Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        ot0.q v17;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 103) {
            java.lang.String j17 = f9Var.j();
            if (j17 != null && (v17 = ot0.q.v(j17)) != null && v17.f348666i == 16) {
                com.tencent.mm.autogen.events.GiftCardEvent giftCardEvent = new com.tencent.mm.autogen.events.GiftCardEvent();
                java.lang.String str = v17.T0;
                am.yg ygVar = giftCardEvent.f54423g;
                ygVar.f8458a = str;
                ygVar.f8459b = f9Var.getMsgId();
                ygVar.f8460c = f9Var.Q0();
                giftCardEvent.e();
            }
        } else if (itemId == 111) {
            java.lang.String l17 = c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0());
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", l17);
            intent.putExtra("scene_from", 17);
            ot0.q v18 = ot0.q.v(l17);
            if (v18 == null || 16 != v18.f348666i) {
                intent.putExtra("Retr_Msg_Type", 2);
            } else {
                intent.putExtra("Retr_Msg_Type", 14);
            }
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        ot0.q v17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var.j() == null || (v17 = ot0.q.v(c01.w9.l(this.f204562s.D(), f9Var.j(), f9Var.A0()))) == null) {
            return true;
        }
        int i17 = v17.f348666i;
        if (i17 == 16) {
            int i18 = v17.W0;
            if (i18 == 5 || i18 == 6 || i18 == 2) {
                if (i18 != 2) {
                    g4Var.clear();
                }
                g4Var.c(d17, 100, 0, this.f204562s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                g4Var.c(d17, 122, 0, this.f204562s.g().getString(com.tencent.mm.R.string.b3u), com.tencent.mm.R.raw.icons_filled_multiple_choice);
                return false;
            }
        } else if (i17 == 34) {
            g4Var.clear();
            g4Var.c(d17, 100, 0, this.f204562s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        boolean z17;
        com.tencent.mm.storage.f9 f9Var2;
        if (!com.tencent.mm.sdk.platformtools.f9.SessionCouponCard.k(view.getContext(), null)) {
            return true;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        int i17 = v17.f348666i;
        if (i17 == 16) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(v17.T0)) {
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(65536);
            intent.putExtra("key_card_app_msg", v17.T0);
            intent.putExtra("key_from_scene", v17.W0);
            j45.l.j(dVar.g(), "card", ".ui.CardDetailUI", intent, null);
            te5.t.i(dVar, f9Var, 0);
            return true;
        }
        if (i17 != 34) {
            return false;
        }
        wt1.o a17 = wt1.o.a(v17);
        if (1 < a17.f449318c) {
            java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f348678l, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            android.content.pm.PackageInfo j18 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), v17.f348646d);
            z17 = true;
            com.tencent.mm.ui.chatting.w5.n(dVar, wi6, wi6, j18 == null ? null : j18.versionName, j18 == null ? 0 : j18.versionCode, v17.f348646d, true, f9Var.getMsgId(), f9Var.I0(), f9Var, v17, A(dVar, f9Var));
            f9Var2 = f9Var;
        } else {
            z17 = true;
            android.content.Intent intent2 = new android.content.Intent();
            f9Var2 = f9Var;
            intent2.putExtra("key_from_user_name", A(dVar, f9Var2));
            intent2.putExtra("key_biz_uin", a17.f449316a);
            intent2.putExtra("key_order_id", a17.f449317b);
            if (f9Var.Q0() != null && !f9Var.Q0().equals("") && com.tencent.mm.storage.z3.R4(f9Var.Q0())) {
                intent2.putExtra("key_chatroom_name", f9Var.Q0());
            }
            j45.l.j(dVar.g(), "card", ".ui.CardGiftAcceptUI", intent2, null);
        }
        te5.t.i(dVar, f9Var2, 0);
        return z17;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204562s = dVar;
        com.tencent.mm.ui.chatting.viewitems.l5 l5Var = (com.tencent.mm.ui.chatting.viewitems.l5) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (l5Var != null && v17 != null) {
            l5Var.b(f9Var, dVar.g(), v17, f9Var.z0());
        }
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), g0Var, null);
        android.view.View view = g0Var.clickArea;
        if (view != null) {
            view.setTag(erVar);
            g0Var.clickArea.setOnClickListener(w(dVar));
            g0Var.clickArea.setOnLongClickListener(u(dVar));
            g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        }
    }
}
