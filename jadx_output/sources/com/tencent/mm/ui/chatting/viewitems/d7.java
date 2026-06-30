package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class d7 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203774s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488539wg);
        com.tencent.mm.ui.chatting.viewitems.b7 b7Var = new com.tencent.mm.ui.chatting.viewitems.b7();
        b7Var.a(xgVar, true);
        xgVar.setTag(b7Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (f9Var != null && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f203774s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f203774s.A())) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        zy2.z4 z4Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null || (z4Var = (zy2.z4) v17.y(zy2.z4.class)) == null) {
            return false;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context = dVar.g();
        java.lang.String appId = z4Var.f477638f;
        java.lang.String enterPath = z4Var.f477636d;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).ll(context, appId, enterPath, com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, "");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203774s = dVar;
        com.tencent.mm.ui.chatting.viewitems.b7 b7Var = (com.tencent.mm.ui.chatting.viewitems.b7) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            zy2.z4 z4Var = (zy2.z4) v17.y(zy2.z4.class);
            if (z4Var != null) {
                b7Var.f203459b.setImageDrawable(com.tencent.mm.ui.uk.e(dVar.g(), com.tencent.mm.R.raw.icons_outlined_finder_guarantee, dVar.s().getColor(com.tencent.mm.R.color.f478526a7)));
                b7Var.f203460c.setText(com.tencent.mm.R.string.f491348cu0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(z4Var.f477635c)) {
                    b7Var.f203461d.setVisibility(8);
                } else {
                    b7Var.f203461d.setVisibility(0);
                    android.widget.TextView textView = b7Var.f203461d;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity g17 = dVar.g();
                    java.lang.String str2 = z4Var.f477635c;
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g17, str2));
                }
                android.widget.TextView textView2 = b7Var.f203462e;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g18 = dVar.g();
                java.lang.String str3 = z4Var.f477634b;
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g18, str3));
            }
            b7Var.clickArea.setOnClickListener(w(dVar));
            b7Var.clickArea.setOnLongClickListener(u(dVar));
            b7Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            b7Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, this.f203774s.D(), b7Var, null));
        }
        android.widget.ImageView imageView = b7Var.f203463f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Z(b7Var, f9Var.P0() < 2, true);
        V(b7Var, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
