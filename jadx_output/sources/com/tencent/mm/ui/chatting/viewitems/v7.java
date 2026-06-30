package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class v7 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205840s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(inflater, com.tencent.mm.R.layout.f488544wl);
        com.tencent.mm.ui.chatting.viewitems.t7 t7Var = new com.tencent.mm.ui.chatting.viewitems.t7();
        t7Var.a(xgVar, true);
        xgVar.setTag(t7Var);
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
        com.tencent.mm.ui.chatting.viewitems.w7 w7Var = com.tencent.mm.ui.chatting.viewitems.w7.f205911a;
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.w7.a(w7Var, g17, f9Var);
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
            if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f205840s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0())) {
                yb5.d dVar = this.f205840s;
                kotlin.jvm.internal.o.d(dVar);
                if (!dVar.A()) {
                    menu.c(d17, 123, 0, v17.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
                }
            }
            if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                menu.c(d17, 111, 0, v17.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.ui.chatting.viewitems.w7.f205911a.b(ui6, msg);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View v17, yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.k2()) {
            android.util.Pair z17 = com.tencent.mm.pluginsdk.model.app.k0.z(msg);
            if (z17 == null || z17.second != null) {
                c01.w9.f(msg.getMsgId(), msg.Q0());
            }
            ui6.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f205840s = ui6;
        com.tencent.mm.ui.chatting.viewitems.t7 t7Var = (com.tencent.mm.ui.chatting.viewitems.t7) tag;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.h hVar = (zy2.h) v17.y(zy2.h.class);
            if (hVar != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d a17 = g1Var.a();
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                mn2.h3 e17 = ya2.l.f460502a.e(hVar.f477393d, com.tencent.mm.plugin.finder.storage.y90.f128356f);
                android.widget.ImageView imageView = t7Var.f205565b;
                kotlin.jvm.internal.o.d(imageView);
                a17.c(e17, imageView, g1Var.h(mn2.f1.f329962p));
                android.widget.TextView textView = t7Var.f205566c;
                kotlin.jvm.internal.o.d(textView);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = ui6.g();
                java.lang.String str2 = hVar.f477394e;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str2));
            }
            t7Var.clickArea.setOnClickListener(w(ui6));
            t7Var.clickArea.setOnLongClickListener(u(ui6));
            t7Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) ui6.f460708c.a(sb5.z.class))).B1);
            yb5.d dVar = this.f205840s;
            kotlin.jvm.internal.o.d(dVar);
            t7Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(msgData, dVar.D(), t7Var, null));
        }
        android.widget.ImageView imageView2 = t7Var.f205567d;
        if (imageView2 != null) {
            kotlin.jvm.internal.o.d(imageView2);
            imageView2.setVisibility(8);
        }
        Z(t7Var, f9Var.P0() < 2, true);
        V(t7Var, msgData, ui6.t(), ui6.D(), ui6, this);
    }
}
