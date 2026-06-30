package ze5;

/* loaded from: classes9.dex */
public final class k6 extends com.tencent.mm.ui.chatting.viewitems.qk implements we5.b {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1y);
        ze5.m6 m6Var = new ze5.m6();
        m6Var.a(xgVar, false);
        xgVar.setTag(m6Var);
        return xgVar;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.n6(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlocks) {
        int i17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlocks, "uiBlocks");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f205376s = ui6;
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(f9Var.z0());
        if (N == null) {
            return;
        }
        com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
        z01.k kVar = new z01.k();
        boolean z17 = y4Var.f196355c;
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        af5.y0.a(kVar, f9Var, N, z17, g17);
        N.D2 = f9Var.Q0();
        uiBlocks.d(new ze5.h6(this, f9Var, N, ui6));
        if (N.k() && !y4Var.f196355c) {
            y4Var.f196355c = true;
            f9Var.d1(y4Var.d());
            f9Var.r1(pt0.f0.f358209b1.n(f9Var.Q0(), f9Var.getMsgId()).P0());
            com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
            g9Var.getClass();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("content", f9Var.j());
            contentValues.put("status", java.lang.Integer.valueOf(f9Var.P0()));
            if (g9Var.Pb(g9Var.P8(f9Var.getMsgId(), f9Var.Q0()))) {
                up5.w wVar = new up5.w();
                i17 = ot0.z2.f348822a.u1(g9Var.f193989r, g9Var.P8(f9Var.getMsgId(), f9Var.Q0()), wVar, g95.e0.l(wVar, contentValues), f9Var.getMsgId());
            } else {
                i17 = g9Var.f193989r.p(g9Var.P8(f9Var.getMsgId(), f9Var.Q0()), contentValues, "msgId=?", new java.lang.String[]{java.lang.String.valueOf(f9Var.getMsgId())});
            }
            if (i17 != 0) {
                g9Var.doNotify();
                g9Var.m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
            }
        }
        uiBlocks.d(new ze5.i6(msgData, ui6, kVar, this));
        uiBlocks.d(new ze5.j6(this, msgData, ui6));
        com.tencent.mm.storage.a9 a9Var = f9Var.f193927g2;
        ze5.l6 l6Var = a9Var instanceof ze5.l6 ? (ze5.l6) a9Var : null;
        if (l6Var == null) {
            return;
        }
        wd5.b model = l6Var.f472070d;
        kotlin.jvm.internal.o.g(model, "model");
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem quoteItem = l6Var.f472071e;
        kotlin.jvm.internal.o.g(quoteItem, "quoteItem");
        uiBlocks.d(new lf5.e(ui6, f9Var, this, model, quoteItem));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        wd5.b bVar = new wd5.b();
        java.lang.String j17 = f9Var != null ? f9Var.j() : null;
        if (!(j17 == null || j17.length() == 0)) {
            r15.b bVar2 = new r15.b();
            bVar2.fromXml(j17);
            bVar.k(bVar2.n());
        }
        if (qVar == null || (str = qVar.f460742a) == null) {
            str = "";
        }
        return new ze5.l6(bVar, lf5.g.c(bVar, str));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        ze5.m6 m6Var = tag instanceof ze5.m6 ? (ze5.m6) tag : null;
        if (m6Var != null) {
            e(ui6, msgData, userName, new we5.y0(new we5.u0(m6Var)));
        }
    }
}
