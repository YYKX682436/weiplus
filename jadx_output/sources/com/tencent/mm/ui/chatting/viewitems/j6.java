package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class j6 extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204233s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.g6 f204234t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488537wd);
        com.tencent.mm.ui.chatting.viewitems.h6 h6Var = new com.tencent.mm.ui.chatting.viewitems.h6();
        h6Var.a(xgVar, false);
        xgVar.setTag(h6Var);
        return xgVar;
    }

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
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (c01.d9.b().E()) {
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
                    java.lang.String x17 = this.f204233s.x();
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "menu add similar emoji item.");
                        g4Var.c(d17, 115, 0, view.getContext().getString(com.tencent.mm.R.string.f490872b43), com.tencent.mm.R.raw.icons_filled_othersticker);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12789, 0, N.getMd5(), 0, N.field_designerID, N.field_groupId, "", "", "", "", N.field_activityid);
                    if (N.E0()) {
                        g4Var.c(d17, 113, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji file no exist. cannot save or resend.");
                    }
                    if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).H(N)) {
                        g4Var.c(d17, 135, 0, view.getContext().getString(com.tencent.mm.R.string.b3t), com.tencent.mm.R.raw.icons_filled_makesticker);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji is null. app content md5 is :%s", v17.f348698q);
                }
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
            }
            if (!f9Var.t2() && f9Var.m2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204233s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            if (!this.f204233s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3n), com.tencent.mm.R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
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
        ot0.q qVar;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204233s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        com.tencent.mm.ui.chatting.viewitems.h6 h6Var = (com.tencent.mm.ui.chatting.viewitems.h6) g0Var;
        if (f9Var != null) {
            java.lang.String U1 = f9Var.U1();
            com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
            if (y4Var.f196355c) {
                qVar = null;
                emojiInfo = null;
            } else {
                qVar = U1 != null ? ot0.q.v(U1) : null;
                emojiInfo = qVar != null ? ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(qVar.f348698q) : null;
            }
            java.lang.String str2 = y4Var.f196356d;
            if (str2 != null && !str2.equals("-1") && emojiInfo == null) {
                emojiInfo = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str2);
            }
            if (emojiInfo == null || !emojiInfo.E0()) {
                java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true);
                android.graphics.Bitmap e17 = n11.a.b().e(mj6);
                if (e17 == null || e17.isRecycled()) {
                    e17 = com.tencent.mm.sdk.platformtools.x.J(mj6, null);
                    n11.a.b().o(mj6, e17);
                }
                Z(h6Var, false, true);
                h6Var.f204083d.setVisibility(0);
                h6Var.f204082c.setVisibility(8);
                h6Var.f204084e.setText(x51.t1.a(qVar == null ? 0L : qVar.f348682m));
                h6Var.f204084e.setVisibility(0);
                h6Var.f204083d.setImageResource(com.tencent.mm.R.drawable.emoji_download_btn);
                if (e17 == null || e17.isRecycled()) {
                    e17 = com.tencent.mm.sdk.platformtools.x.K0(this.f204233s.s().getDrawable(com.tencent.mm.R.drawable.bg8));
                }
                h6Var.f204081b.setImageBitmap(e17);
                if (qVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348698q)) {
                    ((java.util.HashMap) com.tencent.mm.ui.chatting.viewitems.h6.f204080i).put(qVar.f348698q, new java.lang.ref.WeakReference(h6Var));
                }
            } else {
                emojiInfo.D2 = f9Var.Q0();
                h6Var.f204081b.b(emojiInfo, f9Var.getMsgId(), emojiInfo.k() && bm5.d1.d(f9Var.getMsgId(), f9Var.Q0()));
                com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView chattingEmojiView = h6Var.f204081b.f190826m;
                if (chattingEmojiView != null) {
                    chattingEmojiView.resume();
                }
                Z(h6Var, !(f9Var.P0() != 1), true);
                com.tencent.mm.autogen.events.EmojiFileCheckerEvent emojiFileCheckerEvent = new com.tencent.mm.autogen.events.EmojiFileCheckerEvent();
                emojiFileCheckerEvent.f54101g.f7400a = emojiInfo;
                emojiInfo.D2 = f9Var.Q0();
                emojiFileCheckerEvent.e();
            }
            h6Var.f204081b.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), h6Var, dVar.t()));
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = h6Var.f204081b;
            if (this.f204234t == null) {
                this.f204234t = new com.tencent.mm.ui.chatting.viewitems.g6(dVar);
            }
            rTChattingEmojiView.setOnClickListener(this.f204234t);
            h6Var.f204081b.setOnLongClickListener(u(dVar));
            h6Var.f204081b.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
            V(h6Var, dVar2, dVar.t(), dVar.D(), dVar, this);
            com.tencent.mm.ui.chatting.viewitems.k6.a(f9Var, this, dVar, h6Var, false);
        }
    }
}
