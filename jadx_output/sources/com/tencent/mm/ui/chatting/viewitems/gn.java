package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class gn extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204055s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.zn f204056t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f204057u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f204058v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f204059w = -1;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488488ul);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = new com.tencent.mm.ui.chatting.viewitems.ao();
        aoVar.a(xgVar, true);
        xgVar.setTag(aoVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.CharSequence] */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean O(android.view.MenuItem menuItem, final yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        int t17;
        com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct shareMsgClipStruct;
        int t18;
        int t19;
        int t27;
        if (erVar == null) {
            return false;
        }
        final com.tencent.mm.storage.f9 c17 = erVar.c();
        int itemId = menuItem.getItemId();
        if (itemId == 4) {
            java.lang.String str = "65_" + c01.id.c();
            java.lang.String W0 = c17.W0();
            if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(W0)) != -1) {
                W0 = W0.substring(t17 + 1).trim();
            }
            ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ai(W0);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412938a = dVar.g();
            j2Var.f412939b = 65;
            j2Var.f412941d = W0;
            j2Var.f412942e = str;
            j2Var.f412943f = true;
            j2Var.f412946i = false;
            j2Var.f412953p = true;
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } else {
            if (itemId == 102) {
                java.lang.String q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).q0(((com.tencent.mm.ui.chatting.viewitems.go) erVar).c(), false);
                dVar.f460710e.k0(c17.Q0(), c17.getMsgId(), q07);
                menuItem.getGroupId();
                try {
                    if (c01.ia.j(c17) >= 2 && !com.tencent.mm.sdk.platformtools.t8.J0(((com.tencent.mm.ui.chatting.viewitems.go) erVar).S)) {
                        q07 = ((com.tencent.mm.ui.chatting.viewitems.go) erVar).S;
                    }
                    com.tencent.mm.sdk.platformtools.b0.e(q07);
                    com.tencent.mm.ui.chatting.viewitems.bo.a(c17, 3, q07.length());
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFromBase", "clip.setText error ");
                }
                db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                w04.a.INSTANCE.A9(1, c17.I0() + "", com.tencent.mm.sdk.platformtools.t8.o0(q07.toString()));
                try {
                    shareMsgClipStruct = new com.tencent.mm.autogen.mmdata.rpt.ShareMsgClipStruct();
                    shareMsgClipStruct.f60342d = c17.I0();
                    shareMsgClipStruct.f60344f = q07.length();
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
                try {
                    shareMsgClipStruct.f60343e = this.f204057u.length();
                    shareMsgClipStruct.f60345g = c01.ia.i(c17);
                    shareMsgClipStruct.k();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFromBase", "report occur exception! %s", e.getMessage());
                    return true;
                }
                return true;
            }
            if (itemId == 108) {
                com.tencent.mm.ui.chatting.viewitems.bo.a(c17, 4, 0);
                com.tencent.mm.ui.chatting.manager.t.a(c17, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.gn$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yb5.d dVar2 = yb5.d.this;
                        com.tencent.mm.ui.chatting.component.ym ymVar = (com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar2.f460708c.a(sb5.l2.class));
                        com.tencent.mm.storage.f9 f9Var = c17;
                        java.lang.String q08 = ymVar.q0(f9Var, false);
                        android.content.Intent intent = new android.content.Intent(dVar2.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
                        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
                        if (f9Var.X2()) {
                            intent.putExtra("Retr_Msg_content", q08);
                            intent.putExtra("Retr_Msg_Type", 6);
                        } else {
                            intent.putExtra("Retr_Msg_content", q08);
                            intent.putExtra("Retr_Msg_Type", 4);
                        }
                        java.lang.String d17 = te5.e2.d(f9Var);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                            intent.putExtra("weAppSourceUserName", d17);
                        }
                        intent.putExtra("scene_from", 17);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar2.a0((android.content.Intent) arrayList.get(0));
                        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
            } else {
                if (itemId == 179) {
                    qn4.y.c(dVar.g(), c17, erVar, dVar);
                    return true;
                }
                if (itemId != 124 && itemId != 125) {
                    if (itemId == 151) {
                        com.tencent.mm.ui.chatting.w5.m(dVar, c17.Q0(), c17.getMsgId(), 2);
                        return false;
                    }
                    if (itemId == 152) {
                        ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).o0(c17);
                    } else if (itemId != 163 && itemId != 164) {
                        switch (itemId) {
                            case 141:
                                java.lang.String W02 = c17.W0();
                                if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t18 = c01.w9.t(W02)) != -1) {
                                    W02 = W02.substring(t18 + 1).trim();
                                }
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(W02)) {
                                    com.tencent.mm.sdk.platformtools.b0.e(W02);
                                }
                                db5.e1.T(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490361st));
                                return true;
                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                                java.lang.String W03 = c17.W0();
                                if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t19 = c01.w9.t(W03)) != -1) {
                                    W03 = W03.substring(t19 + 1).trim();
                                }
                                if (c17.X2()) {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 6);
                                } else {
                                    intent.putExtra("Retr_Msg_content", W03);
                                    intent.putExtra("Retr_Msg_Type", 4);
                                }
                                intent.putExtra("scene_from", 17);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                dVar.a0((android.content.Intent) arrayList.get(0));
                                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemTextBase$ChattingItemTextFromBase", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return true;
                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                                java.lang.String W04 = c17.W0();
                                if (dVar.D() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t27 = c01.w9.t(W04)) != -1) {
                                    W04 = W04.substring(t27 + 1).trim();
                                }
                                com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, W04, 1);
                                am.c4 c4Var = doFavoriteEvent.f54090g;
                                c4Var.f6324j = dVar.f460717l;
                                c4Var.f6327m = 43;
                                r45.bq0 bq0Var = c4Var.f6315a;
                                if (bq0Var != null) {
                                    r45.jq0 jq0Var = bq0Var.f370962d;
                                    if (jq0Var != null) {
                                        jq0Var.e(c17.Q0());
                                        jq0Var.j(c01.z1.r());
                                        doFavoriteEvent.e();
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFromBase", "transform text fav failed");
                                }
                                return true;
                        }
                    }
                }
                ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).t0(menuItem, c17);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        int i17;
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (!f9Var.b3() && !f9Var.X2() && f9Var.getType() != 1107296305) {
            return true;
        }
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        int d17 = goVar.d();
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        int i18 = goVar.R;
        if (i18 == 1) {
            if (f9Var.b3()) {
                if (x63.g.G(f9Var)) {
                    java.lang.String string = this.f204055s.s().getString(com.tencent.mm.R.string.fsr);
                    i17 = com.tencent.mm.R.string.b3m;
                    g4Var.c(d17, 151, 0, string, com.tencent.mm.R.raw.icons_filled_continued_form);
                } else {
                    i17 = com.tencent.mm.R.string.b3m;
                }
                if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 102, 0, view.getContext().getString(i17), com.tencent.mm.R.raw.icons_filled_copy);
                }
            }
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 108, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            if (!c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            }
            if (!this.f204055s.F()) {
                g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (com.tencent.mm.app.plugin.k.a() && com.tencent.mm.plugin.record.ui.l2.d(f9Var.j()) && !c01.ia.y(f9Var) && !c01.ia.x(f9Var)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                }
            }
            if (c01.ia.A(f9Var) || c01.ia.j(f9Var) == 4) {
                g4Var.clear();
                if (!this.f204055s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
        } else if (i18 == 2) {
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
            if (isTeenMode) {
                return false;
            }
            g4Var.c(d17, 4, 0, view.getContext().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (view instanceof com.tencent.mm.ui.widget.MMTextView) {
            ge5.d a17 = ge5.d.a();
            java.lang.CharSequence text = ((com.tencent.mm.ui.widget.MMTextView) view).getText();
            a17.getClass();
            ge5.d.b(text, f9Var, 1);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean c0(yb5.d dVar) {
        return dVar.D();
    }

    public java.lang.String d0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String a17 = c01.n2.a("" + f9Var.I0());
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", "msg_" + f9Var.I0());
        c17.i("preUsername", A(this.f204055s, f9Var));
        c17.i("preChatName", z(this.f204055s, f9Var));
        return a17;
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String q07;
        if (com.tencent.mm.ui.chatting.viewitems.ja.b(view)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTextFromBase", "onDoubleTap solitaire fold double click");
            return true;
        }
        if (com.tencent.mm.ui.tk.f209956c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(this.f204055s.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        if (view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.go) {
            final com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
            java.lang.Long valueOf = java.lang.Long.valueOf(goVar.c().getMsgId());
            intent.putExtra("Chat_Msg_Id", valueOf);
            intent.putExtra("Chat_User", goVar.c().Q0());
            if (((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204055s.f460708c.a(sb5.i2.class))).f199059e == valueOf.longValue() || ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204055s.f460708c.a(sb5.i2.class))).f199060f == valueOf.longValue()) {
                ((com.tencent.mm.ui.chatting.component.fm) ((sb5.i2) this.f204055s.f460708c.a(sb5.i2.class))).w0(this.f204055s, true);
            }
            if (((com.tencent.mm.ui.chatting.component.pc) ((sb5.v0) this.f204055s.f460708c.a(sb5.v0.class))).m0(goVar.c())) {
                q07 = ((com.tencent.mm.ui.widget.MMNeat7extView) view).a().toString();
            } else {
                q07 = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) this.f204055s.f460708c.a(sb5.l2.class))).q0(goVar.c(), goVar.R == 2);
            }
            intent.putExtra("key_chat_text", q07);
            intent.putExtra("key_chat_from", view.getContext().getClass().getName());
            intent.putExtra("is_group_chat", this.f204055s.D());
            j45.l.q(this.f204055s.f460709d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.gn$$b
                @Override // j45.g
                public final void onActivityResult(int i17, int i18, android.content.Intent intent2) {
                    com.tencent.mm.ui.chatting.viewitems.gn gnVar = com.tencent.mm.ui.chatting.viewitems.gn.this;
                    gnVar.getClass();
                    if (i17 == 1010 && i18 == 101) {
                        java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) gnVar.f204055s.f460708c.a(sb5.s0.class))).o0(goVar.c(), a17 instanceof r15.g ? (r15.g) a17 : null);
                    }
                }
            });
            db5.f.j(view.getContext());
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(goVar.c().Q0(), 1);
            com.tencent.mm.storage.f9 c17 = goVar.c();
            if (com.tencent.mm.storage.z3.L3(c17.Q0())) {
                ot0.q v17 = ot0.q.v(c17.j());
                int i17 = v17 != null ? v17.f348666i : 0;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("msgid", java.lang.Long.valueOf(c17.I0()));
                hashMap.put("msgtype", java.lang.Integer.valueOf(c17.getType()));
                hashMap.put("submsgtype", java.lang.Integer.valueOf(i17));
                hashMap.put("chat_name", c17.Q0());
                hashMap.put("enter_sessionid", this.f204055s.f460722q);
                hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(this.f204055s.k())));
                hashMap.put("fromtype", java.lang.Integer.valueOf(c17.A0() == 1 ? 1 : 11));
                hashMap.put("view_id", "yuanbao_msg_details");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new com.tencent.mm.ui.chatting.viewitems.un(f9Var);
    }
}
