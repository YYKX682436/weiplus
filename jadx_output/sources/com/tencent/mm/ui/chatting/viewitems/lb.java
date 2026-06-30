package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class lb extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f, com.tencent.mm.ui.chatting.l6, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204412s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.gc f204414u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f204413t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f204415v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f204416w = -1;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488554wx);
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = new com.tencent.mm.ui.chatting.viewitems.ya();
        yaVar.a(xgVar, false);
        xgVar.setTag(yaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        int t17;
        int t18;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            java.lang.String str = ot0.q.v(c01.w9.l(dVar.C(), f9Var.j(), f9Var.A0())).f348654f;
            com.tencent.mm.sdk.platformtools.b0.e(str);
            w04.a.INSTANCE.A9(1, f9Var.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(str));
            return false;
        }
        if (itemId == 103) {
            d0(f9Var);
        } else {
            if (itemId == 111) {
                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
                intent.putExtra("Retr_Msg_Type", 2);
                intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
            if (itemId == 152) {
                ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).o0(f9Var);
            } else {
                if (itemId == 179) {
                    qn4.y.c(dVar.g(), f9Var, null, dVar);
                    return true;
                }
                if (itemId == 124 || itemId == 125 || itemId == 163 || itemId == 164) {
                    ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).t0(menuItem, f9Var);
                } else {
                    switch (itemId) {
                        case 141:
                            java.lang.String W0 = f9Var.W0();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(W0)) {
                                com.tencent.mm.sdk.platformtools.b0.e(W0);
                            }
                            db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                            return true;
                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                            android.content.Intent intent2 = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                            java.lang.String W02 = f9Var.W0();
                            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(W02)) != -1) {
                                W02 = W02.substring(t17 + 1).trim();
                            }
                            if (f9Var.X2()) {
                                intent2.putExtra("Retr_Msg_content", W02);
                                intent2.putExtra("Retr_Msg_Type", 6);
                            } else {
                                intent2.putExtra("Retr_Msg_content", W02);
                                intent2.putExtra("Retr_Msg_Type", 4);
                            }
                            intent2.putExtra("scene_from", 17);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(intent2);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            dVar.a0((android.content.Intent) arrayList2.get(0));
                            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return true;
                        case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                            java.lang.String W03 = f9Var.W0();
                            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t18 = c01.w9.t(W03)) != -1) {
                                W03 = W03.substring(t18 + 1).trim();
                            }
                            com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, W03, 1);
                            am.c4 c4Var = doFavoriteEvent.f54090g;
                            c4Var.f6324j = dVar.f460717l;
                            c4Var.f6327m = 43;
                            r45.bq0 bq0Var = c4Var.f6315a;
                            if (bq0Var == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", " transform text fav failed");
                                break;
                            } else {
                                r45.jq0 jq0Var = bq0Var.f370962d;
                                if (jq0Var != null) {
                                    jq0Var.e(f9Var.Q0());
                                    jq0Var.j(c01.z1.r());
                                    doFavoriteEvent.e();
                                    return true;
                                }
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        java.lang.String str = f9Var.G;
        boolean z17 = str != null && str.contains("announcement@all");
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        int d17 = goVar.d();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (c01.ia.x(f9Var)) {
                i17 = 2;
            } else {
                i17 = 2;
                g4Var.c(d17, 102, 0, this.f204412s.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
                g4Var.c(d17, 111, 0, this.f204412s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            if (f9Var.P0() == 5) {
                g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f204412s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (!z17 && !f9Var.t2() && ((f9Var.P0() == i17 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f204412s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !this.f204412s.A())) {
                g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
            }
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String str2 = v17 == null ? "" : v17.f348654f;
            if (com.tencent.mm.app.plugin.k.a() && com.tencent.mm.plugin.record.ui.l2.d(str2)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                }
            }
            if (!this.f204412s.F()) {
                g4Var.c(d17, 100, 0, this.f204412s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "翻译消息右键菜单");
            g4Var.c(d17, 141, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            j45.l.g("favorite");
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (com.tencent.mm.app.plugin.k.a() && f9Var.i2() && f9Var.b2()) {
                g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                g4Var.c(d17, 164, 0, view.getContext().getString(com.tencent.mm.R.string.lsg), com.tencent.mm.R.raw.language_transfer_filled);
                qn4.y.a(g4Var, d17, view.getContext(), f9Var);
                g4Var.c(d17, 152, 0, view.getContext().getString(com.tencent.mm.R.string.b3s), com.tencent.mm.R.raw.icons_filled_feedback_error);
            }
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.za(aVar);
    }

    @Override // we5.b
    public boolean c() {
        boolean z17 = od5.b.f344655a;
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.asyncbind.RepairerConfigChatListAsyncBind_AppMsgMsgQuote()) == 1;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        d0(f9Var);
    }

    public final void d0(com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        if (f9Var.T2()) {
            aa0.e eVar = (aa0.e) i95.n0.c(aa0.e.class);
            ui3.b z07 = ((ri3.e) eVar).Di().z0(f9Var.Q0(), f9Var.getMsgId());
            android.util.Pair z18 = com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            if (z18 != null) {
                if (z07 != null) {
                    z07.field_msgId = ((java.lang.Long) z18.second).longValue();
                    z17 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().P0(z07);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg() msgQute is null!");
                    z17 = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "resendQuoteMsg result:%s msgId:%s result:%s", z18.first, z18.second, java.lang.Boolean.valueOf(z17));
            }
            if (z18 == null || z18.second != null) {
                c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            }
            this.f204412s.L(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194  */
    @Override // we5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(final yb5.d r21, final rd5.d r22, java.lang.String r23, we5.y0 r24) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.lb.e(yb5.d, rd5.d, java.lang.String, we5.y0):void");
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        if (com.tencent.mm.ui.tk.f209956c.a()) {
            return true;
        }
        java.lang.CharSequence a17 = ((com.tencent.mm.ui.widget.MMNeat7extView) view).a();
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.putExtra("key_chat_from", this.f204412s.getClass().getName());
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", a17);
        final com.tencent.mm.storage.f9 f9Var = null;
        if ((view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er) && (erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag()) != null) {
            f9Var = erVar.c();
            intent.putExtra("Chat_Msg_Id", erVar.c().getMsgId());
            intent.putExtra("Chat_User", erVar.c().Q0());
        }
        yb5.d dVar = this.f204412s;
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
            j45.l.q(this.f204412s.f460709d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.lb$$b
                @Override // j45.g
                public final void onActivityResult(int i17, int i18, android.content.Intent intent2) {
                    com.tencent.mm.storage.f9 f9Var2;
                    com.tencent.mm.ui.chatting.viewitems.lb lbVar = com.tencent.mm.ui.chatting.viewitems.lb.this;
                    lbVar.getClass();
                    if (i17 == 1010 && i18 == 101 && (f9Var2 = f9Var) != null) {
                        java.lang.Object a18 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) lbVar.f204412s.f460708c.a(sb5.s0.class))).o0(f9Var2, a18 instanceof r15.g ? (r15.g) a18 : null);
                    }
                }
            });
        } else {
            android.content.Context context = view.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        db5.f.j(view.getContext());
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.xb(f9Var, context, qVar);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.tencent.mm.ui.chatting.viewitems.ya) g0Var));
    }
}
