package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class zq {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.zq f133490a = new com.tencent.mm.plugin.finder.view.zq();

    public final void a(gk2.e buContext, dk2.zf msg) {
        km2.r rVar;
        km2.r rVar2;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!(msg instanceof dk2.mf) && !(msg instanceof dk2.ab) && !(msg instanceof dk2.v5)) {
            if (!(msg instanceof dk2.a8)) {
                return;
            }
            java.lang.Object D = msg.D();
            r45.xj1 xj1Var = D instanceof r45.xj1 ? (r45.xj1) D : null;
            if (!(xj1Var != null && xj1Var.getInteger(5) == 1)) {
                return;
            }
        }
        r45.qt2 qt2Var = new r45.qt2();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
        km2.n nVar2 = dk2.ef.H;
        qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f309151c) == null) ? 0 : rVar.f309206k));
        new ke2.q0(ke2.q0.f306981w.a(msg), buContext, qt2Var, null).l();
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.daj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, string, com.tencent.mm.plugin.finder.view.nq.f132749a);
        java.lang.String v17 = msg.v();
        if (v17 != null) {
            if (!(v17.length() > 0)) {
                v17 = null;
            }
            if (v17 != null) {
            }
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = k0Var != null ? (com.tencent.mm.plugin.finder.live.plugin.mg) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.mg.class) : null;
        ((mm2.x4) buContext.a(mm2.x4.class)).f329528f.remove(msg);
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) buContext.a(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, false, null, 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0816  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r24, gk2.e r25, kotlinx.coroutines.y0 r26, android.view.View r27, com.tencent.mm.plugin.finder.live.plugin.mg r28, android.view.View r29, android.view.MenuItem r30, int r31, dk2.zf r32) {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.zq.b(int, gk2.e, kotlinx.coroutines.y0, android.view.View, com.tencent.mm.plugin.finder.live.plugin.mg, android.view.View, android.view.MenuItem, int, dk2.zf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0457  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r27, gk2.e r28, kotlinx.coroutines.y0 r29, android.view.View r30, com.tencent.mm.plugin.finder.live.plugin.mg r31, android.view.View r32, android.view.MenuItem r33, int r34, dk2.zf r35) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.zq.c(int, gk2.e, kotlinx.coroutines.y0, android.view.View, com.tencent.mm.plugin.finder.live.plugin.mg, android.view.View, android.view.MenuItem, int, dk2.zf):void");
    }

    public final void d(int i17, android.content.Context context, gk2.e buContext, kotlinx.coroutines.y0 y0Var, android.view.View view, com.tencent.mm.plugin.finder.live.plugin.mg commentPlugin, android.view.MenuItem menuItem, int i18, dk2.zf msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(commentPlugin, "commentPlugin");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kotlin.jvm.internal.o.g(msg, "msg");
        int i19 = i17 == 2 ? 2 : 1;
        int itemId = menuItem.getItemId();
        if (itemId == 163) {
            java.lang.String a17 = msg.a();
            if (a17 != null && a17.length() != 0) {
                r10 = false;
            }
            if (r10) {
                com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "goToFinderProfile finderUsername:" + a17);
                return;
            }
            boolean x07 = commentPlugin.x0();
            com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "goToFinderProfile isLandscape:" + x07);
            if (x07) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PORTRAIT_ACTION_KEY_FINDER_USERNAME", a17);
                com.tencent.mm.plugin.finder.live.plugin.l.s1(commentPlugin, "PORTRAIT_ACTION_GOTO_PROFILE_COMMENT", bundle, 0, 4, null);
                return;
            } else {
                dk2.q4 q4Var = dk2.q4.f233938a;
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context, buContext, false, a17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), false, null, 96, null);
                return;
            }
        }
        if (itemId == 165 || itemId == 166) {
            se2.w.f406895a.k(y0Var, msg, view, buContext, context);
            j(commentPlugin, menuItem.getItemId() == 165, msg, i19);
            return;
        }
        qo0.c cVar = commentPlugin.f113503p;
        switch (itemId) {
            case 154:
                com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "[LONGCLICK_MENU_FINDER_LIVE_REPLY],riskControlEnableComment:" + ((mm2.c1) buContext.a(mm2.c1.class)).f328884t + ",enableLiveRoomComment:" + ((mm2.c1) buContext.a(mm2.c1.class)).f328902w + ", enableCustomerComment:" + ((mm2.c1) buContext.a(mm2.c1.class)).f328896v);
                if (((mm2.c1) buContext.a(mm2.c1.class)).f328884t && ((mm2.c1) buContext.a(mm2.c1.class)).f328902w && ((mm2.c1) buContext.a(mm2.c1.class)).f328896v) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                    dk2.mf mfVar = msg instanceof dk2.mf ? (dk2.mf) msg : null;
                    boolean b17 = mfVar != null ? mfVar.b() : false;
                    if (!b17) {
                        r45.xn1 r17 = msg.r();
                        bundle2.putByteArray("PARAM_ENTER_COMMENT_AT_NAME", r17 != null ? r17.toByteArray() : null);
                        bundle2.putLong("PARAM_ENTER_COMMENT_REPLY_MSG_SEQ", msg.m());
                        bundle2.putInt("PARAM_ENTER_COMMENT_REPLY_MSG_TYPE", msg.getType());
                        ((mm2.x4) buContext.a(mm2.x4.class)).f329535p = msg;
                    }
                    com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "AnchorWelcomeAudienceNotify:" + b17);
                    cVar.statusChange(qo0.b.W, bundle2);
                } else {
                    zl2.q4 q4Var2 = zl2.q4.f473933a;
                    java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491813eb4);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    q4Var2.P(string);
                }
                k(commentPlugin, msg, i19);
                t(i17, 4, msg);
                return;
            case 155:
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(msg.j());
                if (cVar.getLiveRole() == 0) {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    r0Var.getClass();
                    ml2.r0.hj(r0Var, ml2.b4.f327260q, null, 0L, null, null, null, null, null, 252, null);
                }
                n(ml2.g5.f327485i, msg, i19);
                t(i17, 5, msg);
                return;
            case 156:
                a(buContext, msg);
                if (cVar.getLiveRole() == 0) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Hj(msg.a(), ml2.r1.f327893e);
                }
                i(commentPlugin, msg, i19);
                t(i17, 6, msg);
                return;
            default:
                com.tencent.mm.plugin.finder.view.zq zqVar = f133490a;
                switch (itemId) {
                    case 170:
                        java.lang.Object D = msg.D();
                        r45.ei1 ei1Var = D instanceof r45.ei1 ? (r45.ei1) D : null;
                        if (ei1Var != null) {
                            zqVar.o(context, ei1Var);
                        }
                        java.lang.Object D2 = msg.D();
                        r45.xj1 xj1Var = D2 instanceof r45.xj1 ? (r45.xj1) D2 : null;
                        if (xj1Var != null) {
                            zqVar.p(context, xj1Var);
                        }
                        g(commentPlugin, msg, i19);
                        return;
                    case 171:
                        java.lang.Object D3 = msg.D();
                        r45.ei1 ei1Var2 = D3 instanceof r45.ei1 ? (r45.ei1) D3 : null;
                        if (ei1Var2 != null) {
                            zqVar.e(context, ei1Var2);
                        }
                        java.lang.Object D4 = msg.D();
                        r45.xj1 xj1Var2 = D4 instanceof r45.xj1 ? (r45.xj1) D4 : null;
                        if (xj1Var2 != null) {
                            zqVar.f(context, xj1Var2);
                        }
                        l(commentPlugin, msg, i19);
                        return;
                    case 172:
                        t(i17, 8, msg);
                        q(buContext, context, msg);
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r4, r45.ei1 r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r5.getString(r0)
            r2 = 1
            if (r1 == 0) goto L11
            int r1 = r1.length()
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L12
        L11:
            r1 = r2
        L12:
            if (r1 != 0) goto L21
            com.tencent.mm.protobuf.g r1 = r5.getByteString(r2)
            if (r1 == 0) goto L1c
            r1 = r2
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L21
            r1 = r2
            goto L22
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto L25
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L46
            java.lang.Class<com.tencent.mm.feature.emoji.api.n6> r1 = com.tencent.mm.feature.emoji.api.n6.class
            i95.m r1 = i95.n0.c(r1)
            com.tencent.mm.feature.emoji.api.n6 r1 = (com.tencent.mm.feature.emoji.api.n6) r1
            java.lang.String r0 = r5.getString(r0)
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.protobuf.g r5 = r5.getByteString(r2)
            com.tencent.mm.feature.emoji.t2 r1 = (com.tencent.mm.feature.emoji.t2) r1
            com.tencent.mm.api.IEmojiInfo r5 = r1.Bi(r0, r5)
            zl2.r4 r0 = zl2.r4.f473950a
            r0.F2(r4, r5)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.zq.e(android.content.Context, r45.ei1):void");
    }

    public final void f(android.content.Context context, r45.xj1 xj1Var) {
        java.lang.String string = xj1Var.getString(6);
        boolean z17 = false;
        if (!(string == null || string.length() == 0)) {
            if (xj1Var.getByteString(7) != null) {
                z17 = true;
            }
        }
        if (!z17) {
            xj1Var = null;
        }
        if (xj1Var != null) {
            com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            java.lang.String string2 = xj1Var.getString(6);
            kotlin.jvm.internal.o.d(string2);
            zl2.r4.f473950a.F2(context, ((com.tencent.mm.feature.emoji.t2) n6Var).Bi(string2, xj1Var.getByteString(7)));
        }
    }

    public final void g(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, int i17) {
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, ml2.b5.f327296r, zfVar, null, 4, null);
        } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
            n(ml2.g5.N, zfVar, i17);
        } else {
            n(ml2.g5.G, zfVar, i17);
        }
    }

    public final void h(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, int i17, boolean z17, dk2.zf zfVar, int i18) {
        if (!zl2.r4.f473950a.w1()) {
            if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
                n(z17 ? ml2.g5.S : ml2.g5.R, zfVar, i18);
            }
        } else {
            ml2.b5 b5Var = z17 ? ml2.b5.f327295q : ml2.b5.f327294p;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, b5Var, zfVar, null, 4, null);
            s(i17, z17 ? 7 : 3, mm2.j2.F.a(zfVar.p()));
        }
    }

    public final void i(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, int i17) {
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, ml2.b5.f327298t, zfVar, null, 4, null);
        } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
            n(ml2.g5.Q, zfVar, i17);
        } else {
            n(ml2.g5.f327486m, zfVar, i17);
        }
    }

    public final void j(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, boolean z17, dk2.zf zfVar, int i17) {
        if (zl2.r4.f473950a.w1()) {
            ml2.b5 b5Var = z17 ? ml2.b5.f327299u : ml2.b5.f327301w;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, b5Var, zfVar, null, 4, null);
            return;
        }
        if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
            n(z17 ? ml2.g5.f327480J : ml2.g5.L, zfVar, i17);
        } else {
            n(z17 ? ml2.g5.f327493t : ml2.g5.f327495v, zfVar, i17);
        }
    }

    public final void k(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, int i17) {
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, ml2.b5.f327293o, zfVar, null, 4, null);
        } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
            n(ml2.g5.f327487n, zfVar, i17);
        } else {
            n(ml2.g5.f327484h, zfVar, i17);
        }
    }

    public final void l(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, dk2.zf zfVar, int i17) {
        if (zl2.r4.f473950a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.j0.Dj((ml2.j0) c17, ml2.b5.f327297s, zfVar, null, 4, null);
        } else if (((mm2.c1) mgVar.S0().a(mm2.c1.class)).T) {
            n(ml2.g5.P, zfVar, i17);
        } else {
            n(ml2.g5.H, zfVar, i17);
        }
    }

    public final void m(com.tencent.mm.plugin.finder.live.plugin.mg commentPlugin, r45.t12 msg) {
        kotlin.jvm.internal.o.g(commentPlugin, "commentPlugin");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (commentPlugin.f113503p.getLiveRole() == 1) {
            cl0.g gVar = new cl0.g();
            gVar.h("content", msg.getString(2));
            gVar.o("msgtype", msg.getInteger(3));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328372q, gVar.toString(), null, 4, null);
        }
    }

    public final void n(ml2.g5 g5Var, dk2.zf zfVar, int i17) {
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Aj(g5Var, zfVar, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r6, r45.ei1 r7) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r7.getString(r0)
            r2 = 1
            if (r1 == 0) goto L11
            int r1 = r1.length()
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L12
        L11:
            r1 = r2
        L12:
            if (r1 != 0) goto L21
            com.tencent.mm.protobuf.g r1 = r7.getByteString(r2)
            if (r1 == 0) goto L1c
            r1 = r2
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L21
            r1 = r2
            goto L22
        L21:
            r1 = r0
        L22:
            r3 = 0
            if (r1 == 0) goto L26
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L8a
            java.lang.Class<com.tencent.mm.feature.emoji.api.n6> r1 = com.tencent.mm.feature.emoji.api.n6.class
            i95.m r4 = i95.n0.c(r1)
            com.tencent.mm.feature.emoji.api.n6 r4 = (com.tencent.mm.feature.emoji.api.n6) r4
            java.lang.String r0 = r7.getString(r0)
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.protobuf.g r7 = r7.getByteString(r2)
            com.tencent.mm.feature.emoji.t2 r4 = (com.tencent.mm.feature.emoji.t2) r4
            com.tencent.mm.api.IEmojiInfo r7 = r4.Bi(r0, r7)
            java.lang.Class<com.tencent.mm.feature.emoji.api.v5> r0 = com.tencent.mm.feature.emoji.api.v5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.api.v5 r0 = (com.tencent.mm.feature.emoji.api.v5) r0
            r2 = r7
            com.tencent.mm.storage.emotion.EmojiInfo r2 = (com.tencent.mm.storage.emotion.EmojiInfo) r2
            java.lang.String r4 = r2.getMd5()
            com.tencent.mm.feature.emoji.k0 r0 = (com.tencent.mm.feature.emoji.k0) r0
            com.tencent.mm.api.IEmojiInfo r0 = r0.Bi(r4)
            if (r0 != 0) goto L7a
            i95.m r0 = i95.n0.c(r1)
            com.tencent.mm.feature.emoji.api.n6 r0 = (com.tencent.mm.feature.emoji.api.n6) r0
            java.lang.String r1 = r2.getMd5()
            java.lang.String r2 = "getMd5(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            com.tencent.mm.feature.emoji.t2 r0 = (com.tencent.mm.feature.emoji.t2) r0
            r0.wi(r1, r7)
            java.lang.Class<com.tencent.mm.feature.emoji.api.z5> r0 = com.tencent.mm.feature.emoji.api.z5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.api.z5 r0 = (com.tencent.mm.feature.emoji.api.z5) r0
            com.tencent.mm.feature.emoji.q0 r0 = (com.tencent.mm.feature.emoji.q0) r0
            r0.Vi(r7)
        L7a:
            java.lang.Class<com.tencent.mm.feature.emoji.api.y5> r0 = com.tencent.mm.feature.emoji.api.y5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.api.y5 r0 = (com.tencent.mm.feature.emoji.api.y5) r0
            r1 = 1000077(0xf428d, float:1.401406E-39)
            com.tencent.mm.feature.emoji.s0 r0 = (com.tencent.mm.feature.emoji.s0) r0
            r0.wi(r6, r7, r1, r3)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.zq.o(android.content.Context, r45.ei1):void");
    }

    public final void p(android.content.Context context, r45.xj1 xj1Var) {
        java.lang.String string = xj1Var.getString(6);
        boolean z17 = false;
        if (!(string == null || string.length() == 0)) {
            if (xj1Var.getByteString(7) != null) {
                z17 = true;
            }
        }
        if (!z17) {
            xj1Var = null;
        }
        if (xj1Var != null) {
            com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            java.lang.String string2 = xj1Var.getString(6);
            kotlin.jvm.internal.o.d(string2);
            com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.t2) n6Var).Bi(string2, xj1Var.getByteString(7));
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) Bi;
            if (((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(emojiInfo.getMd5()) == null) {
                com.tencent.mm.feature.emoji.api.n6 n6Var2 = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
                java.lang.String md52 = emojiInfo.getMd5();
                kotlin.jvm.internal.o.f(md52, "getMd5(...)");
                ((com.tencent.mm.feature.emoji.t2) n6Var2).wi(md52, Bi);
                ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Vi(Bi);
            }
            ((com.tencent.mm.feature.emoji.s0) ((com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class))).wi(context, Bi, 1000077, null);
        }
    }

    public final void q(gk2.e eVar, android.content.Context context, dk2.zf zfVar) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.view.vq(0, context);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.view.wq(0, eVar, zfVar);
        k0Var.C = new com.tencent.mm.plugin.finder.view.xq(zfVar);
        k0Var.v();
    }

    public final void r(gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.mg mgVar, android.view.View view, r45.xn1 xn1Var) {
        java.lang.String str;
        km2.r rVar;
        km2.r rVar2;
        java.lang.String username;
        kk.l lVar = ((mm2.c1) eVar.a(mm2.c1.class)).f328919y2;
        int i17 = 0;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        java.lang.String str2 = "";
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        java.lang.Long l17 = (java.lang.Long) lVar.get(str);
        if (java.lang.System.currentTimeMillis() - (l17 == null ? 0L : l17.longValue()) < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            db5.t7.makeText(view.getContext(), view.getContext().getString(com.tencent.mm.R.string.egh), 0).show();
            kk.l lVar2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328919y2;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            lVar2.put(finderContact2 != null ? finderContact2.getUsername() : null, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        kk.l lVar3 = ((mm2.c1) eVar.a(mm2.c1.class)).f328919y2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        lVar3.put(finderContact3 != null ? finderContact3.getUsername() : null, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ke2.p0 p0Var = ke2.q0.f306981w;
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, xn1Var);
        r45.hk1 hk1Var = new r45.hk1();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        if (finderContact4 != null && (username = finderContact4.getUsername()) != null) {
            str2 = username;
        }
        hk1Var.set(0, lp3.p.a(str2));
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(hk1Var.toByteArray()));
        ch1Var.set(1, 20001);
        ch1Var.set(2, zl2.q4.f473933a.m());
        r45.qt2 qt2Var = new r45.qt2();
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 != null && (rVar = nVar2.f309151c) != null) {
            i17 = rVar.f309206k;
        }
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        new ke2.q0(ch1Var, eVar, qt2Var, new com.tencent.mm.plugin.finder.view.yq(view)).l();
        zl2.r4 r4Var = zl2.r4.f473950a;
        kotlin.jvm.internal.o.g(view, "view");
        view.performHapticFeedback(1, 3);
        dk2.a8 H = r4Var.H(ch1Var, eVar);
        if (r4Var.k3(H, eVar)) {
            com.tencent.mars.xlog.Log.i("LiveCommentPopupWindowItemClick", "tickleSomeone addSelfMsg success");
        }
        com.tencent.mm.plugin.finder.live.util.d0.f115473a.c(eVar, H, new java.util.HashMap());
        qo0.c.a(mgVar.f113503p, qo0.b.N, null, 2, null);
        if (mgVar.f113503p.getLiveRole() == 1) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328374r, "", null, 4, null);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.j0.f327583i.T.f327677x++;
        }
    }

    public final void s(int i17, int i18, int i19) {
        if (i17 == 2) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.F1;
            cl0.g gVar = new cl0.g();
            gVar.o("type", i18);
            gVar.o("barrage_type", i19);
            zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
        }
    }

    public final void t(int i17, int i18, dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (i17 == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ij(i18, mm2.j2.F.a(msg.p()));
        }
    }
}
