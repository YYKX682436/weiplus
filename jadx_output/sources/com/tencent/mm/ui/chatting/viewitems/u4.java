package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class u4 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205663s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488491uq);
        com.tencent.mm.ui.chatting.viewitems.t4 t4Var = new com.tencent.mm.ui.chatting.viewitems.t4();
        t4Var.a(xgVar, false);
        xgVar.setTag(t4Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return menuItem.getItemId() == 100;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d(), 100, 0, this.f205663s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.A)) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348668i1) ? v17.f348674k : v17.f348668i1;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str);
                    intent.putExtra("msgUsername", A(dVar, f9Var));
                    intent.putExtra("geta8key_username", dVar.x());
                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                }
            } else {
                com.tencent.mm.ui.chatting.viewitems.w4.b(bVar.A, A(dVar, f9Var), dVar.x(), dVar.g());
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205663s = dVar;
        com.tencent.mm.ui.chatting.viewitems.t4 t4Var = (com.tencent.mm.ui.chatting.viewitems.t4) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            com.tencent.mm.ui.chatting.viewitems.w4.a(g0Var.clickArea, v17, "MicroMsg.ChattingItemAppMsgC2CNewFrom", false, t4Var);
            t4Var.f205555c.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            t4Var.clickArea.setPadding(0, 0, 0, 0);
            t4Var.resetChatBubbleWidthWithNewStyle(t4Var.clickArea, t4Var.f205558f);
            ot0.b bVar = (ot0.b) v17.y(ot0.b.class);
            java.lang.String str2 = f9Var.A0() == 1 ? bVar.f348381g : bVar.f348380f;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = v17.f348658g;
                t4Var.f205555c.setSingleLine(false);
                t4Var.f205555c.setMaxLines(3);
            } else {
                t4Var.f205555c.setSingleLine(true);
            }
            t4Var.f205555c.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar.g(), str2, t4Var.f205559g));
            t4Var.f205555c.setTextSize(0, t4Var.f205559g);
            if (com.tencent.mm.ui.bk.C()) {
                long V = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348395u, -1L);
                if (V >= 0) {
                    t4Var.f205555c.setTextColor((int) V);
                }
            } else {
                long V2 = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348382h, -1L);
                if (V2 >= 0) {
                    t4Var.f205555c.setTextColor((int) V2);
                }
            }
            t4Var.f205556d.setText(f9Var.A0() == 1 ? bVar.f348385k : bVar.f348386l);
            if (com.tencent.mm.ui.bk.C()) {
                long V3 = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348397w, -1L);
                if (V3 >= 0) {
                    t4Var.f205556d.setTextColor((int) V3);
                }
            } else {
                long V4 = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348387m, -1L);
                if (V4 >= 0) {
                    t4Var.f205556d.setTextColor((int) V4);
                }
            }
            t4Var.f205557e.setText(f9Var.A0() == 1 ? bVar.f348383i : bVar.f348384j);
            if (com.tencent.mm.ui.bk.C()) {
                long V5 = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348399y, -1L);
                if (V5 >= 0) {
                    t4Var.f205557e.setTextColor((int) V5);
                }
            } else {
                long V6 = com.tencent.mm.sdk.platformtools.t8.V(bVar.f348400z, -1L);
                if (V6 >= 0) {
                    t4Var.f205557e.setTextColor((int) V6);
                }
            }
            t4Var.f205554b.setImageBitmap(null);
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348379e)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f348378d)) {
                    if (bVar.f348378d.startsWith("http")) {
                        o11.f fVar = new o11.f();
                        fVar.f342083g = g83.a.b();
                        fVar.f342078b = true;
                        fVar.f342095s = true;
                        n11.a.b().h(bVar.f348378d, t4Var.f205554b, fVar.a());
                    } else {
                        int identifier = com.tencent.mm.sdk.platformtools.x2.f193075e.getIdentifier(bVar.f348378d, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b);
                        if (identifier > 0) {
                            t4Var.f205554b.setImageResource(identifier);
                        }
                    }
                }
            } else if (bVar.f348379e.startsWith("http")) {
                o11.f fVar2 = new o11.f();
                fVar2.f342083g = g83.a.b();
                fVar2.f342078b = true;
                fVar2.f342095s = true;
                n11.a.b().h(bVar.f348379e, t4Var.f205554b, fVar2.a());
            } else {
                int identifier2 = com.tencent.mm.sdk.platformtools.x2.f193075e.getIdentifier(bVar.f348379e, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b);
                if (identifier2 > 0) {
                    t4Var.f205554b.setImageResource(identifier2);
                }
            }
        }
        g0Var.clickArea.setOnClickListener(w(dVar));
        g0Var.clickArea.setOnLongClickListener(u(dVar));
        g0Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        g0Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f205663s.D(), g0Var, null));
    }
}
