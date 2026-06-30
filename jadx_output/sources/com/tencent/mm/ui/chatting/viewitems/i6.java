package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class i6 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204166s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f204167t = false;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.g6 f204168u;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488494ut);
        com.tencent.mm.ui.chatting.viewitems.h6 h6Var = new com.tencent.mm.ui.chatting.viewitems.h6();
        h6Var.a(xgVar, true);
        xgVar.setTag(h6Var);
        return xgVar;
    }

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
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            v17 = new ot0.q();
            v17.f348698q = y4Var.f196356d;
        }
        if (!x51.t1.b(v17.f348698q) && !v17.f348698q.equals("-1")) {
            com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f348698q);
            if (N != null) {
                if (!N.I1()) {
                    g4Var.c(d17, 104, 0, view.getContext().getString(com.tencent.mm.R.string.f490870b41), com.tencent.mm.R.raw.icons_filled_addsticker);
                }
                boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                java.lang.String x17 = this.f204166s.x();
                z75.c.f470622a = java.lang.System.currentTimeMillis();
                z75.c.f470623b = N;
                z75.c.f470624c = x17;
                com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct relatedEmoticonActionStruct = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct();
                relatedEmoticonActionStruct.f59953d = z75.c.f470622a;
                relatedEmoticonActionStruct.f59954e = 1L;
                relatedEmoticonActionStruct.r(N.field_groupId);
                relatedEmoticonActionStruct.q(N.getMd5());
                relatedEmoticonActionStruct.p(x17);
                relatedEmoticonActionStruct.k();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 1L);
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_similar_emoji, true);
                if (!isTeenMode && (view.getContext() instanceof android.app.Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && fj6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "menu add similar emoji item.");
                    g4Var.c(d17, 115, 0, view.getContext().getString(com.tencent.mm.R.string.f490872b43), com.tencent.mm.R.raw.icons_filled_othersticker);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12789, 0, N.getMd5(), 0, N.field_designerID, N.field_groupId, "", "", "", "", N.field_activityid);
                if (!N.E0() || c01.ia.x(f9Var)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEmojiFrom", "emoji file no exist. cannot save or resend.");
                } else {
                    g4Var.c(d17, 113, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                }
                if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(N)) {
                    g4Var.c(d17, 135, 0, view.getContext().getString(com.tencent.mm.R.string.b3t), com.tencent.mm.R.raw.icons_filled_makesticker);
                }
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if (!this.f204166s.F()) {
            g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3n), com.tencent.mm.R.raw.icons_filled_delete);
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

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        java.lang.String str;
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
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204166s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        com.tencent.mm.ui.chatting.viewitems.h6 h6Var = (com.tencent.mm.ui.chatting.viewitems.h6) g0Var;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mm.storage.emotion.EmojiInfo N = (v17 == null || v17.f348698q == null) ? null : ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f348698q);
        if (N == null || !N.E0()) {
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
            android.graphics.Bitmap e17 = n11.a.b().e(mj6);
            if (e17 == null || e17.isRecycled()) {
                e17 = com.tencent.mm.sdk.platformtools.x.J(mj6, null);
                n11.a.b().o(mj6, e17);
            }
            h6Var.f204083d.setVisibility(0);
            h6Var.f204082c.setVisibility(8);
            h6Var.f204084e.setText(x51.t1.a(v17 == null ? 0L : v17.f348682m));
            h6Var.f204084e.setVisibility(0);
            h6Var.f204083d.setImageResource(com.tencent.mm.R.drawable.emoji_download_btn);
            if (v17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348698q)) {
                ((java.util.HashMap) com.tencent.mm.ui.chatting.viewitems.h6.f204080i).put(v17.f348698q, new java.lang.ref.WeakReference(h6Var));
            }
            if (e17 == null || e17.isRecycled()) {
                e17 = com.tencent.mm.sdk.platformtools.x.K0(this.f204166s.s().getDrawable(com.tencent.mm.R.drawable.bg8));
            }
            h6Var.f204081b.setImageBitmap(e17);
        } else {
            N.D2 = f9Var.Q0();
            h6Var.f204081b.b(N, f9Var.getMsgId(), N.k() && bm5.d1.d(f9Var.getMsgId(), f9Var.Q0()));
            h6Var.f204083d.setVisibility(8);
            h6Var.f204082c.setVisibility(8);
            h6Var.f204084e.setVisibility(8);
            h6Var.f204083d.setVisibility(8);
            if (v17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348698q)) {
                ((java.util.HashMap) com.tencent.mm.ui.chatting.viewitems.h6.f204080i).remove(v17.f348698q);
            }
            com.tencent.mm.autogen.events.EmojiFileCheckerEvent emojiFileCheckerEvent = new com.tencent.mm.autogen.events.EmojiFileCheckerEvent();
            emojiFileCheckerEvent.f54101g.f7400a = N;
            N.D2 = f9Var.Q0();
            emojiFileCheckerEvent.e();
        }
        h6Var.f204081b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), h6Var, str));
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = h6Var.f204081b;
        if (this.f204168u == null) {
            this.f204168u = new com.tencent.mm.ui.chatting.viewitems.g6(dVar);
        }
        rTChattingEmojiView.setOnClickListener(this.f204168u);
        h6Var.f204081b.setOnLongClickListener(u(dVar));
        h6Var.f204081b.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        android.widget.ImageView imageView = h6Var.f204083d;
        if (this.f204168u == null) {
            this.f204168u = new com.tencent.mm.ui.chatting.viewitems.g6(dVar);
        }
        imageView.setOnClickListener(this.f204168u);
        h6Var.f204083d.setOnLongClickListener(u(dVar));
        h6Var.f204083d.setTag(h6Var.f204081b.getTag());
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        int i17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.f97533a;
        boolean booleanValue = java.lang.Boolean.valueOf(java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_app_msg_auto_download_android, false)).booleanValue() || java.lang.Boolean.valueOf(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonAppMsgAutoDownload()) == 1).booleanValue()).booleanValue();
        if (!this.f204167t && booleanValue) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
            ot0.q v18 = ot0.q.v(f9Var.j());
            if (v18 == null) {
                v18 = new ot0.q();
                v18.f348698q = y4Var.f196356d;
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(v18.f348698q);
            if (u17 == null || !u17.E0()) {
                y12.h.G(f9Var.getMsgId(), v18);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiMgrImpl", "no need to download emoji");
            }
        }
        com.tencent.mm.ui.chatting.viewitems.k6.a(f9Var, this, dVar, h6Var, true);
        ze5.l6 l6Var = (ze5.l6) f9Var.f193927g2;
        lf5.f.f318534a.a(dVar, f9Var, h6Var, this, l6Var.f472070d, l6Var.f472071e);
    }
}
