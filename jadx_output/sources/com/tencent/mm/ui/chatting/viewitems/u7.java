package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class u7 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205666s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(inflater, com.tencent.mm.R.layout.f488501v1);
        com.tencent.mm.ui.chatting.viewitems.t7 t7Var = new com.tencent.mm.ui.chatting.viewitems.t7();
        t7Var.a(xgVar, false);
        xgVar.setTag(t7Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
        if (c01.ia.A(f9Var) || c01.ia.x(f9Var)) {
            return true;
        }
        menu.c(0, 111, 0, v17.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
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

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f205666s = ui6;
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
            yb5.d dVar = this.f205666s;
            kotlin.jvm.internal.o.d(dVar);
            t7Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(msgData, dVar.D(), t7Var, null));
        }
    }
}
