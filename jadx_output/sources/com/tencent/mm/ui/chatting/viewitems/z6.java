package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class z6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f206115s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1r);
        com.tencent.mm.ui.chatting.viewitems.v6 v6Var = new com.tencent.mm.ui.chatting.viewitems.v6();
        v6Var.a(xgVar, true);
        xgVar.setTag(v6Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.a7 a7Var = com.tencent.mm.ui.chatting.viewitems.a7.f203285a;
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.a7.a(a7Var, g17, f9Var);
        java.lang.String A = A(ui6, f9Var);
        kotlin.jvm.internal.o.f(A, "getUserName(...)");
        java.util.Map b17 = a7Var.b(f9Var, A);
        if (b17 == null) {
            return true;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_forward", "view_exp", b17, 1, false);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        if (f9Var != null) {
            ot0.q v18 = ot0.q.v(f9Var.U1());
            com.tencent.mm.ui.chatting.viewitems.a7 a7Var = com.tencent.mm.ui.chatting.viewitems.a7.f203285a;
            java.lang.String A = A(this.f206115s, f9Var);
            kotlin.jvm.internal.o.f(A, "getUserName(...)");
            java.util.Map b17 = a7Var.b(f9Var, A);
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f206115s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f206115s;
                kotlin.jvm.internal.o.d(dVar);
                if (!dVar.A()) {
                    menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(d17, 111, 0, v17.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                if (b17 != null) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_forward", "view_exp", b17, 1, false);
                }
            }
            if (!c01.ia.A(f9Var) && v18.f348666i != 119) {
                yb5.d dVar2 = this.f206115s;
                kotlin.jvm.internal.o.d(dVar2);
                menu.c(d17, 116, 0, dVar2.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
                if (b17 != null) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("long_press_fav", "view_exp", b17, 1, false);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ui.chatting.viewitems.a7 a7Var = com.tencent.mm.ui.chatting.viewitems.a7.f203285a;
        a7Var.c(ui6, msg);
        java.lang.String A = A(ui6, msg);
        kotlin.jvm.internal.o.f(A, "getUserName(...)");
        a7Var.d(msg, A);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(msg);
            c01.w9.f(msg.getMsgId(), msg.Q0());
            ui6.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f206115s = ui6;
        com.tencent.mm.ui.chatting.viewitems.v6 v6Var = (com.tencent.mm.ui.chatting.viewitems.v6) tag;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f477383b) == null) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l.f460502a.h(ev2Var.getString(3), v6Var.f205838d, mn2.f1.B);
        android.widget.TextView textView = v6Var.f205836b;
        if (textView != null) {
            textView.setText(ev2Var.getString(1));
        }
        android.widget.TextView textView2 = v6Var.f205837c;
        if (textView2 != null) {
            android.app.Activity g17 = ui6.g();
            textView2.setText(g17 != null ? g17.getString(com.tencent.mm.R.string.ok6, java.lang.Integer.valueOf(ev2Var.getInteger(4))) : null);
        }
        android.widget.TextView textView3 = v6Var.f205839e;
        if (textView3 != null) {
            if (v17.f348666i == 119) {
                android.app.Activity g18 = ui6.g();
                if (g18 != null) {
                    string = g18.getString(com.tencent.mm.R.string.nyc);
                    textView3.setText(string);
                }
                string = null;
                textView3.setText(string);
            } else {
                android.app.Activity g19 = ui6.g();
                if (g19 != null) {
                    string = g19.getString(com.tencent.mm.R.string.njl);
                    textView3.setText(string);
                }
                string = null;
                textView3.setText(string);
            }
        }
        v6Var.clickArea.setOnClickListener(w(ui6));
        v6Var.clickArea.setOnLongClickListener(u(ui6));
        android.view.View view = v6Var.clickArea;
        sb5.z zVar = (sb5.z) ui6.f460708c.a(sb5.z.class);
        view.setOnTouchListener(zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null);
        yb5.d dVar = this.f206115s;
        kotlin.jvm.internal.o.d(dVar);
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(msgData, dVar.D(), v6Var, null);
        android.view.View view2 = v6Var.clickArea;
        if (view2 != null) {
            view2.setTag(erVar);
        }
        android.view.View convertView = v6Var.convertView;
        kotlin.jvm.internal.o.f(convertView, "convertView");
        ym5.a1.h(convertView, new com.tencent.mm.ui.chatting.viewitems.y6(f9Var, this, ui6));
    }
}
