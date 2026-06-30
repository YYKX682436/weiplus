package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class qk extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205376s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.sk f205377t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.rk f205378u;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return ((com.tencent.mm.ui.chatting.component.da) ((sb5.o0) dVar.f460708c.a(sb5.o0.class))).n0(menuItem, dVar, dVar2.f394254d.f445300b);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        java.lang.String str;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (f9Var.C2() && c01.d9.b().E()) {
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
            com.tencent.mm.storage.emotion.EmojiInfo M = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
            if (M == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.ChattingItemEmojiToBase", "emoji is null. md5:%s", f9Var.z0());
                return true;
            }
            boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag() != 1;
            boolean E0 = M.E0();
            if (M.I1() || M.v0()) {
                str = "emoji file no exist. cannot save or resend.";
            } else if (E0) {
                str = "emoji file no exist. cannot save or resend.";
                g4Var.c(d17, 104, 0, view.getContext().getString(com.tencent.mm.R.string.f490870b41), com.tencent.mm.R.raw.icons_filled_addsticker);
            } else {
                str = "emoji file no exist. cannot save or resend.";
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", str);
            }
            if (!M.I1()) {
                if (E0) {
                    g4Var.c(d17, 113, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", str);
                }
            }
            java.lang.String x17 = this.f205376s.x();
            z75.c.f470622a = java.lang.System.currentTimeMillis();
            z75.c.f470623b = M;
            z75.c.f470624c = x17;
            com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct relatedEmoticonActionStruct = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct();
            relatedEmoticonActionStruct.f59953d = z75.c.f470622a;
            relatedEmoticonActionStruct.f59954e = 1L;
            relatedEmoticonActionStruct.r(M.field_groupId);
            relatedEmoticonActionStruct.q(M.getMd5());
            relatedEmoticonActionStruct.p(x17);
            relatedEmoticonActionStruct.k();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(1257L, 1L);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_similar_emoji, true);
            if (!z17 && !M.k() && (view.getContext() instanceof android.app.Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && fj6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiToBase", "menu add similar emoji item.");
                g4Var.c(d17, 115, 0, view.getContext().getString(com.tencent.mm.R.string.f490872b43), com.tencent.mm.R.raw.icons_filled_othersticker);
            }
            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(M)) {
                g4Var.c(d17, 135, 0, view.getContext().getString(com.tencent.mm.R.string.b3t), com.tencent.mm.R.raw.icons_filled_makesticker);
            }
            if (!z17) {
                java.lang.String str2 = M.field_groupId;
                if (((com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.D0(str2, "capture")) ? false : true) && !M.k() && !M.v0()) {
                    g4Var.c(d17, 128, 0, view.getContext().getString(com.tencent.mm.R.string.f490871b42), com.tencent.mm.R.raw.icons_filled_sticker_album);
                }
            }
            if (!f9Var.t2() && f9Var.C2() && ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f205376s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            if (!this.f205376s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3n), com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
            }
            g0Var.d(12789, 0, M.getMd5(), 0, M.field_designerID, M.field_groupId, "", "", "", "", "", M.field_activityid);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        f9Var.unsetOmittedFailResend();
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        ((com.tencent.mm.ui.chatting.component.da) ((sb5.o0) dVar.f460708c.a(sb5.o0.class))).o0(f9Var);
    }
}
