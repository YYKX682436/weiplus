package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ab extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.neattextview.textview.view.f, we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f203292s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.gc f203294u;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f203293t = "";

    /* renamed from: v, reason: collision with root package name */
    public int f203295v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f203296w = -1;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488510vc);
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = new com.tencent.mm.ui.chatting.viewitems.ya();
        yaVar.a(xgVar, true);
        xgVar.setTag(yaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
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
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                        yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", " transform text fav failed");
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
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.go goVar = (com.tencent.mm.ui.chatting.viewitems.go) view.getTag();
        int d17 = goVar.d();
        int i17 = goVar.R;
        if (i17 == 1) {
            if (!c01.ia.x(f9Var)) {
                g4Var.c(d17, 102, 0, this.f203292s.s().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
                g4Var.c(d17, 111, 0, this.f203292s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f203292s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String str = v17 == null ? "" : v17.f348654f;
            if (com.tencent.mm.app.plugin.k.a() && com.tencent.mm.plugin.record.ui.l2.d(str)) {
                if (f9Var.i2() && f9Var.b2()) {
                    g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
                } else {
                    g4Var.c(d17, 124, 0, view.getContext().getString(com.tencent.mm.R.string.b4a), com.tencent.mm.R.raw.icons_filled_translate);
                }
            }
            if (!this.f203292s.F()) {
                g4Var.c(d17, 100, 0, this.f203292s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (c01.ia.A(f9Var)) {
                g4Var.clear();
                if (!this.f203292s.F()) {
                    g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "翻译消息右键菜单");
            g4Var.c(d17, 141, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            j45.l.g("favorite");
            g4Var.c(d17, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (!com.tencent.mm.app.plugin.k.a() || !f9Var.i2() || !f9Var.b2()) {
                return false;
            }
            g4Var.c(d17, 163, 0, view.getContext().getString(com.tencent.mm.R.string.f490875b46), com.tencent.mm.R.raw.translate_off_filled);
            g4Var.c(d17, 164, 0, view.getContext().getString(com.tencent.mm.R.string.lsg), com.tencent.mm.R.raw.language_transfer_filled);
            qn4.y.a(g4Var, d17, view.getContext(), f9Var);
            g4Var.c(d17, 152, 0, view.getContext().getString(com.tencent.mm.R.string.b3s), com.tencent.mm.R.raw.icons_filled_feedback_error);
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

    @Override // we5.b
    public void e(final yb5.d dVar, final rd5.d dVar2, java.lang.String str, we5.y0 y0Var) {
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f203292s = dVar;
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$h
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                yb5.d dVar3 = dVar;
                abVar.f203292s = dVar3;
                com.tencent.mm.ui.chatting.component.f7 f7Var = (com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar3.f460708c.a(sb5.e0.class));
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                f7Var.n0(f9Var2);
                com.tencent.mm.ui.chatting.component.c0.x0(dVar3, yaVar.convertView, f9Var2);
                yaVar.f206051b.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var2.getMsgId()));
                yaVar.f206051b.setTag(com.tencent.mm.R.id.rfh, f9Var2.Q0());
                yaVar.f206051b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
            }
        });
        if (j65.e.b() && j65.e.f()) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$m
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    com.tencent.mm.ui.chatting.viewitems.ya.b(com.tencent.mm.storage.f9.this, (com.tencent.mm.ui.chatting.viewitems.ya) g0Var, dVar, bool);
                }
            });
        }
        final ot0.q v17 = ot0.q.v(f9Var.U1());
        int h17 = i65.a.h(dVar.g(), com.tencent.mm.R.dimen.f479628b3);
        if (v17 == null || v17.f348666i != 57) {
            return;
        }
        com.tencent.mm.storage.f9 a17 = com.tencent.mm.ui.chatting.viewitems.dc.a(com.tencent.mm.ui.chatting.viewitems.dc.b(dVar.D(), dVar.x(), f9Var.getMsgId(), f9Var.Q0(), v17.f348725w2, "handleQuoteMsgFillingFrom"), v17.f348725w2);
        final ti3.l c17 = com.tencent.mm.ui.chatting.viewitems.hc.c(dVar, h17, f9Var, a17, v17.f348725w2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity g17 = dVar.g();
        ((ke0.e) xVar).getClass();
        final android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(g17, c17.f419627b);
        final r15.f b17 = com.tencent.mm.ui.chatting.viewitems.hc.b(v17.f348725w2.f149493r, a17, dVar.g());
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$n
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                r15.f fVar = r15.f.this;
                final android.text.SpannableString spannableString = i17;
                if (fVar != null) {
                    yaVar.f206052c.setText(pl5.c.a(new android.text.SpannableStringBuilder(spannableString), c17.f419628c, fVar.f368644a, fVar.f368645b, new yz5.p() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$g
                        @Override // yz5.p
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(((android.text.style.ImageSpan[]) spannableString.getSpans(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue(), android.text.style.ImageSpan.class)).length > 0);
                        }
                    }));
                } else {
                    yaVar.f206052c.setText(spannableString);
                }
                yaVar.f206052c.setTag(v17.f348725w2);
            }
        });
        final f21.a m07 = f21.r0.wi().m0(dVar.x());
        final int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$o
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                f21.a aVar = f21.a.this;
                yb5.d dVar3 = dVar;
                if ((aVar == null || aVar.f258833b == -2) && (aVar != null || intValue == -2)) {
                    yaVar.f206052c.setTextColor(dVar3.g().getResources().getColor(com.tencent.mm.R.color.f478872ji));
                    yaVar.f206066q.setBackgroundResource(com.tencent.mm.R.drawable.apt);
                } else {
                    if (com.tencent.mm.ui.bk.C()) {
                        yaVar.f206066q.setBackgroundResource(com.tencent.mm.R.drawable.czg);
                    } else {
                        yaVar.f206066q.setBackgroundResource(com.tencent.mm.R.drawable.czh);
                    }
                    yaVar.f206052c.setTextColor(dVar3.g().getResources().getColor(com.tencent.mm.R.color.adg));
                }
            }
        });
        final int m17 = ti3.i.m(a17);
        java.lang.String str2 = null;
        if (m17 != -1) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$p
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                    yaVar.f206053d.setVisibility(0);
                    yb5.d dVar3 = yb5.d.this;
                    android.app.Activity context = dVar3.g();
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((la5.l0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(la5.l0.class)).setValue("quote_img", dVar3.g().getResources().getString(com.tencent.mm.R.string.b2g));
                    android.app.Activity context2 = dVar3.g();
                    kotlin.jvm.internal.o.g(context2, "context");
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((la5.u) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(la5.u.class)).setValue("quote_img", dVar3.g().getResources().getString(com.tencent.mm.R.string.b2g));
                    yaVar.f206052c.setMaxWidth((int) (com.tencent.mm.ui.zk.a(dVar3.g(), com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT) / i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a)));
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) yaVar.f206052c.getLayoutParams();
                    layoutParams.removeRule(15);
                    layoutParams.addRule(10);
                    layoutParams.topMargin = com.tencent.mm.ui.zk.e(dVar3.g(), com.tencent.mm.R.dimen.f479738dv);
                    layoutParams.rightMargin = 0;
                    yaVar.f206052c.setGravity(48);
                    yaVar.f206052c.setIncludeFontPadding(false);
                    yaVar.f206052c.setLayoutParams(layoutParams);
                    yaVar.f206055f.setVisibility(0);
                    if (m17 == 2) {
                        yaVar.f206054e.setVisibility(0);
                    } else {
                        yaVar.f206054e.setVisibility(8);
                    }
                    yaVar.f206053d.setVisibility(0);
                    yaVar.f206053d.setImageBitmap(null);
                }
            });
            com.tencent.mm.ui.tools.e3 e3Var = new com.tencent.mm.ui.tools.e3(null);
            boolean o17 = ti3.i.o(dVar.g(), null, e3Var, a17, true);
            y0Var.b(e3Var, new com.tencent.mm.ui.chatting.viewitems.bb(this));
            if (!o17) {
                y0Var.c(new com.tencent.mm.ui.chatting.viewitems.ab$$b());
            }
        } else {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$c
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                    yb5.d dVar3 = yb5.d.this;
                    yaVar.f206052c.setMaxWidth((int) (com.tencent.mm.ui.zk.a(dVar3.g(), com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE) / i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a)));
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) yaVar.f206052c.getLayoutParams();
                    layoutParams.rightMargin = com.tencent.mm.ui.zk.e(dVar3.g(), com.tencent.mm.R.dimen.f479738dv);
                    layoutParams.topMargin = com.tencent.mm.ui.zk.e(dVar3.g(), com.tencent.mm.R.dimen.f479643bi);
                    layoutParams.removeRule(10);
                    layoutParams.addRule(15);
                    yaVar.f206052c.setGravity(19);
                    yaVar.f206052c.setLayoutParams(layoutParams);
                    yaVar.f206055f.setVisibility(8);
                    yaVar.f206053d.setVisibility(8);
                    yaVar.f206054e.setVisibility(8);
                }
            });
        }
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$d
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                abVar.getClass();
                ti3.l lVar = c17;
                if (lVar.f419626a) {
                    yaVar.f206052c.setVisibility(0);
                    android.view.View view = yaVar.clickArea;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = yaVar.clickArea;
                    yb5.d dVar3 = dVar;
                    view2.setOnLongClickListener(new com.tencent.mm.ui.chatting.viewitems.db(abVar, yaVar, dVar3, f9Var));
                    yaVar.clickArea.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.eb(abVar, yaVar, dVar3));
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.J0(lVar.f419627b)) {
                        yaVar.f206052c.setVisibility(8);
                    }
                    android.view.View view3 = yaVar.clickArea;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "lambda$filling$8", "(Lcom/tencent/mm/plugin/msgquote/model/MsgQuoteHelp$QuoteSummaryResult;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$AppMsgMsgQuoteViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                yaVar.f206051b.setClickable(true);
            }
        });
        android.os.Bundle a18 = com.tencent.mm.pluginsdk.ui.span.m1.a(dVar.D(), k01.d.a(f9Var.Q0()));
        final android.text.SpannableString fj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(dVar.g(), v17.f348654f, i65.a.h(dVar.g(), com.tencent.mm.R.dimen.f479897ia), 1, a18, le0.x.P0);
        final boolean k17 = ti3.i.k(f9Var);
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$e
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                yb5.d dVar3 = dVar;
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                boolean z17 = k17;
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                abVar.getClass();
                yaVar.f206051b.c(fj6, android.widget.TextView.BufferType.SPANNABLE, null);
                android.content.Context context = yaVar.f206051b.getContext();
                yaVar.f206051b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.TRUE);
                if (yaVar.f206058i == null) {
                    rl5.r rVar = new rl5.r(context, yaVar.f206051b);
                    yaVar.f206058i = rVar;
                    rVar.L = new com.tencent.mm.ui.chatting.viewitems.fb(abVar, dVar3, yaVar, f9Var2);
                    rVar.C = true;
                    rVar.f397355y = new com.tencent.mm.ui.chatting.viewitems.gb(abVar, context, yaVar, z17, dVar3, f9Var2);
                    rVar.f397354x = new com.tencent.mm.ui.chatting.viewitems.hb(abVar, yaVar, context, dVar3, f9Var2);
                }
            }
        });
        if (c01.ia.A(f9Var) || c01.ia.x(f9Var)) {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$i
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                    com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                    abVar.getClass();
                    yaVar.f206051b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.FALSE);
                    yaVar.f206051b.setOnTouchListener(yaVar.f206060k);
                    yaVar.f206051b.setOnLongClickListener(abVar.u(dVar));
                    com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = yaVar.f206051b;
                    if (abVar.f203294u == null) {
                        abVar.f203294u = new com.tencent.mm.ui.chatting.viewitems.gc(abVar.f203292s);
                    }
                    mMNeat7extView.setOnClickListener(abVar.f203294u);
                }
            });
        } else {
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$f
                @Override // we5.t0
                public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                    com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                    com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                    abVar.getClass();
                    int i18 = c01.ia.i(f9Var);
                    int i19 = 0;
                    if (i18 <= 0 || i18 >= wl5.y.o(yaVar.f206051b).length()) {
                        i18 = 0;
                    }
                    com.tencent.mm.ui.chatting.viewitems.q0 u17 = abVar.u(dVar);
                    wl5.v x17 = abVar.x(u17);
                    wl5.x xVar2 = yaVar.f206059j;
                    if (xVar2 != null) {
                        xVar2.c();
                    }
                    int[] iArr = new int[2];
                    com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = yaVar.f206051b;
                    if (mMNeat7extView != null) {
                        mMNeat7extView.getLocationInWindow(iArr);
                        i19 = iArr[0];
                        if (i19 == 0) {
                            android.graphics.Rect rect = new android.graphics.Rect();
                            yaVar.f206051b.getGlobalVisibleRect(rect);
                            i19 = rect.left;
                        }
                    }
                    com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = yaVar.f206051b;
                    rl5.r rVar = yaVar.f206058i;
                    if (abVar.f203294u == null) {
                        abVar.f203294u = new com.tencent.mm.ui.chatting.viewitems.gc(abVar.f203292s);
                    }
                    wl5.o oVar = new wl5.o(mMNeat7extView2, rVar, x17, abVar.f203294u, yaVar.f206060k);
                    oVar.f447123g = com.tencent.mm.R.color.a3y;
                    oVar.f447124h = 18;
                    oVar.f447122f = com.tencent.mm.R.color.f478860j6;
                    if (i19 != 0) {
                        oVar.a(i19 + com.tencent.mm.ui.zk.e(yaVar.f206051b.getContext(), com.tencent.mm.R.dimen.f479688cn));
                    }
                    wl5.x xVar3 = new wl5.x(oVar);
                    yaVar.f206059j = xVar3;
                    com.tencent.mm.ui.chatting.viewitems.wb wbVar = new com.tencent.mm.ui.chatting.viewitems.wb(xVar3);
                    xVar3.f447159d = new com.tencent.mm.ui.chatting.viewitems.ib(abVar);
                    u17.f205293h = new com.tencent.mm.ui.chatting.viewitems.jb(abVar, yaVar);
                    xVar3.C = i18;
                    xVar3.Y = wbVar;
                }
            });
        }
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$j
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                abVar.getClass();
                com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar.D(), yaVar, null);
                yaVar.f206051b.setOnDoubleClickListener(abVar);
                yaVar.f206051b.setTag(goVar);
                yaVar.f206051b.setTextListener(new com.tencent.mm.ui.chatting.viewitems.kb(abVar, yaVar));
                yaVar.f206051b.setMaxLines(Integer.MAX_VALUE);
            }
        });
        com.tencent.mm.ui.chatting.viewitems.io ioVar = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        if (com.tencent.mm.app.plugin.k.a()) {
            if (f9Var.i2() && f9Var.b2()) {
                str2 = f9Var.W0();
            }
            ioVar = ((com.tencent.mm.ui.chatting.component.ym) ((sb5.l2) dVar.f460708c.a(sb5.l2.class))).v0(f9Var);
        }
        final com.tencent.mm.ui.chatting.viewitems.io ioVar2 = ioVar;
        final java.lang.String str3 = str2;
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$k
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                java.lang.String str4;
                android.view.ViewStub viewStub;
                java.lang.String str5 = str3;
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                abVar.getClass();
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str5);
                com.tencent.mm.ui.chatting.viewitems.io ioVar3 = ioVar2;
                if (K0 && ioVar3 == com.tencent.mm.ui.chatting.viewitems.io.NoTransform) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = yaVar.f206065p;
                    if (chattingItemTranslate != null) {
                        chattingItemTranslate.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (yaVar.f206065p == null && (viewStub = yaVar.f206064o) != null) {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate2 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) viewStub.inflate();
                    yaVar.f206065p = chattingItemTranslate2;
                    chattingItemTranslate2.c();
                }
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = yaVar.f206051b.getContext();
                int textSize = (int) yaVar.f206051b.getTextSize();
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                if (f9Var2 != null) {
                    java.lang.String a19 = c01.n2.a("" + f9Var2.I0());
                    c01.l2 c18 = c01.n2.d().c(a19, true);
                    c18.i("prePublishId", "msg_" + f9Var2.I0());
                    c18.i("preUsername", abVar.A(abVar.f203292s, f9Var2));
                    c18.i("preChatName", abVar.z(abVar.f203292s, f9Var2));
                    str4 = a19;
                } else {
                    str4 = null;
                }
                android.text.SpannableString rj6 = ((ke0.e) xVar2).rj(context, str5, textSize, 1, null, str4);
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "spannableString：%s", rj6);
                yaVar.f206065p.e(rj6, ioVar3, f9Var2.getMsgId());
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate3 = yaVar.f206065p;
                boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(f9Var2.U0());
                yb5.d dVar3 = dVar;
                chattingItemTranslate3.setBrandWording(K02 ? dVar3.s().getString(com.tencent.mm.R.string.jxn) : f9Var2.U0());
                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    return;
                }
                com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar2, dVar3.D(), yaVar, null);
                goVar.R = 2;
                yaVar.f206065p.setTag(goVar);
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate4 = yaVar.f206065p;
                if (abVar.f203294u == null) {
                    abVar.f203294u = new com.tencent.mm.ui.chatting.viewitems.gc(abVar.f203292s);
                }
                chattingItemTranslate4.setOnClickListener(abVar.f203294u);
                yaVar.f206065p.setOnDoubleClickListener(abVar);
                yaVar.f206065p.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar3.f460708c.a(sb5.z.class))).B1);
                yaVar.f206065p.setOnLongClickListener(abVar.u(dVar3));
                yaVar.f206065p.setVisibility(0);
            }
        });
        y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$l
            @Override // we5.t0
            public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
                android.widget.TextView textView;
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                com.tencent.mm.ui.chatting.viewitems.ya yaVar = (com.tencent.mm.ui.chatting.viewitems.ya) g0Var;
                android.widget.LinearLayout linearLayout = yaVar.f206061l;
                if (linearLayout == null || (textView = yaVar.f206062m) == null) {
                    return;
                }
                we5.e eVar = we5.v.f445393x;
                yb5.d dVar3 = yb5.d.this;
                eVar.a(dVar3, linearLayout, textView, f9Var2, dVar3.g());
                java.lang.String spannableString = fj6.toString();
                java.lang.String x17 = dVar3.x();
                if (spannableString == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFrom", "requestAutoTranslate talker is null or msg is null!");
                    return;
                }
                go.d dVar4 = go.d.f273696a;
                if (dVar4.c(x17) == 2 && f9Var2.A0() == 0 && !f9Var2.i2() && com.tencent.mm.plugin.record.ui.l2.c(spannableString)) {
                    if (go.d.f273698c.containsKey(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                        return;
                    }
                    dVar4.f(f9Var2);
                }
            }
        });
    }

    @Override // com.tencent.neattextview.textview.view.f
    public boolean f(android.view.View view, android.view.MotionEvent motionEvent) {
        if (com.tencent.mm.ui.tk.f209956c.a()) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.putExtra("key_chat_from", this.f203292s.getClass().getName());
        intent.addFlags(67108864);
        final com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar != null) {
            java.lang.CharSequence a17 = ((com.tencent.mm.ui.widget.MMNeat7extView) view).a();
            intent.putExtra("Chat_Msg_Id", erVar.c().getMsgId());
            intent.putExtra("Chat_User", erVar.c().Q0());
            intent.putExtra("key_chat_text", a17);
            yb5.d dVar = this.f203292s;
            if (dVar != null) {
                intent.putExtra("is_group_chat", dVar.D());
                j45.l.q(this.f203292s.f460709d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.ab$$a
                    @Override // j45.g
                    public final void onActivityResult(int i17, int i18, android.content.Intent intent2) {
                        com.tencent.mm.ui.chatting.viewitems.ab abVar = com.tencent.mm.ui.chatting.viewitems.ab.this;
                        abVar.getClass();
                        if (i17 == 1010 && i18 == 101) {
                            java.lang.Object a18 = ok5.d.a(intent2, "kPartialQuoteContent");
                            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) abVar.f203292s.f460708c.a(sb5.s0.class))).o0(erVar.c(), a18 instanceof r15.g ? (r15.g) a18 : null);
                        }
                    }
                });
            } else {
                android.content.Context context = view.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom", "onDoubleTap", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            db5.f.j(view.getContext());
        }
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
