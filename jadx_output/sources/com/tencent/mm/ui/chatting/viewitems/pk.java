package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class pk extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205274s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.sk f205275t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.rk f205276u;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return ((com.tencent.mm.ui.chatting.component.da) ((sb5.o0) dVar.f460708c.a(sb5.o0.class))).n0(menuItem, dVar, dVar2.f394254d.f445300b);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (f9Var.C2() && c01.d9.b().E()) {
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
            com.tencent.mm.storage.emotion.EmojiInfo M = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
            if (M == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.ChattingItemEmojiFromBase", "emoji is null. md5:%s", f9Var.z0());
                return true;
            }
            boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag() != 1;
            boolean E0 = M.E0();
            if (!M.I1() && !M.v0()) {
                if (E0) {
                    g4Var.c(d17, 104, 0, view.getContext().getString(com.tencent.mm.R.string.f490870b41), com.tencent.mm.R.raw.icons_filled_addsticker);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiFromBase", "file do no exist. cant do add or resend.");
                }
            }
            if (!M.I1()) {
                if (E0) {
                    g4Var.c(d17, 113, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiFromBase", "file do no exist. cant do add or resend.");
                }
            }
            java.lang.String x17 = this.f205274s.x();
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
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.ChattingItemEmojiFromBase", "menu add similar emoji item.");
                g4Var.c(d17, 115, 0, view.getContext().getString(com.tencent.mm.R.string.f490872b43), com.tencent.mm.R.raw.icons_filled_othersticker);
            }
            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(M)) {
                g4Var.c(d17, 135, 0, view.getContext().getString(com.tencent.mm.R.string.b3t), com.tencent.mm.R.raw.icons_filled_makesticker);
            }
            if (!z17) {
                java.lang.String str = M.field_groupId;
                if (((com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.D0(str, "capture")) ? false : true) && !M.k() && !M.v0()) {
                    g4Var.c(d17, 128, 0, view.getContext().getString(com.tencent.mm.R.string.f490871b42), com.tencent.mm.R.raw.icons_filled_sticker_album);
                }
            }
            if (!this.f205274s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3n), com.tencent.mm.R.raw.icons_filled_delete);
            }
            g0Var.d(12789, 0, M.getMd5(), 0, M.field_designerID, M.field_groupId, "", "", "", "", M.field_activityid);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }
}
