package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e9 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203862s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488505v7);
        com.tencent.mm.ui.chatting.viewitems.d9 d9Var = new com.tencent.mm.ui.chatting.viewitems.d9();
        d9Var.a(xgVar, false);
        xgVar.setTag(d9Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.s1.c(dVar, f9Var, A(dVar, f9Var), -1, null);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        g4Var.c(0, 111, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.g9.b(dVar, f9Var);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203862s = dVar;
        com.tencent.mm.ui.chatting.viewitems.d9 d9Var = (com.tencent.mm.ui.chatting.viewitems.d9) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            c53.a aVar = (c53.a) v17.y(c53.a.class);
            if (aVar != null) {
                com.tencent.mm.ui.chatting.viewitems.g9.a(d9Var.f203776b, aVar.f38644b);
                android.widget.TextView textView = d9Var.f203777c;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g17 = dVar.g();
                java.lang.String str2 = aVar.f38645c;
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str2));
                if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f38646d)) {
                    d9Var.f203778d.setVisibility(8);
                } else {
                    d9Var.f203778d.setVisibility(0);
                    android.widget.TextView textView2 = d9Var.f203778d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g18 = dVar.g();
                    java.lang.String str3 = aVar.f38646d;
                    ((ke0.e) xVar2).getClass();
                    textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g18, str3));
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f38647e)) {
                    d9Var.f203779e.setText(dVar.s().getString(com.tencent.mm.R.string.f492220fo1));
                } else {
                    android.widget.TextView textView3 = d9Var.f203779e;
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g19 = dVar.g();
                    java.lang.String str4 = aVar.f38647e;
                    ((ke0.e) xVar3).getClass();
                    textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g19, str4));
                }
            }
            d9Var.clickArea.setOnClickListener(w(dVar));
            d9Var.clickArea.setOnLongClickListener(u(dVar));
            d9Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            d9Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f203862s.D(), d9Var, null));
        }
    }
}
