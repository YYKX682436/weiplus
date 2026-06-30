package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class aq extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203402s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f203403t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.zp f203404u;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488571xm);
        com.tencent.mm.ui.chatting.viewitems.ds dsVar = new com.tencent.mm.ui.chatting.viewitems.ds();
        dsVar.a(xgVar, true);
        xgVar.setTag(dsVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        menuItem.getItemId();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        if (this.f203402s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f203402s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ds dsVar = (com.tencent.mm.ui.chatting.viewitems.ds) g0Var;
        this.f203402s = dVar;
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 != null) {
            dsVar.f203821b.setText(v17.f348658g);
        }
        com.tencent.mm.sdk.platformtools.t8.G1(f9Var.j());
        zf4.o a17 = zf4.o.a(U1);
        if (a17 != null && (str2 = a17.f472684c) != null && str2.length() > 0 && a17.f472685d > 0 && this.f203403t == null && v17 != null && com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0())) {
            java.lang.String y07 = zf4.b0.y0(c01.z1.r());
            java.lang.String b17 = zf4.r.b(y07, false);
            f9Var.i1(y07);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            int i17 = v17.f348650e;
            java.lang.String str3 = v17.f348646d;
            java.lang.String str4 = a17.f472684c;
            com.tencent.mm.pluginsdk.model.app.k0.t(b17, msgId, Q0, i17, str3, str4, a17.f472685d, v17.f348666i, v17.T, v17.f348714u);
            if (str4 != null) {
                com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
                com.tencent.mm.ui.chatting.viewitems.yp ypVar = new com.tencent.mm.ui.chatting.viewitems.yp(this, f9Var, str4, dsVar);
                this.f203403t = ypVar;
                e17.a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, ypVar);
                bt3.l0 l0Var = new bt3.l0(str4, (com.tencent.mm.modelbase.v0) null);
                l0Var.f24331z = true;
                com.tencent.mm.vfs.w6.a(l0Var.f24315g.field_fileFullPath, "#!AMR\n".getBytes());
                c01.d9.e().g(l0Var);
            }
        }
        dsVar.f203821b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), dsVar, null));
        android.widget.TextView textView = dsVar.f203821b;
        if (this.f203404u == null) {
            this.f203404u = new com.tencent.mm.ui.chatting.viewitems.zp(this, this.f203402s);
        }
        textView.setOnClickListener(this.f203404u);
        if (c01.d9.b().E()) {
            dsVar.f203821b.setOnLongClickListener(u(dVar));
        }
    }
}
