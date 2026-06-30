package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f204014a;

    public static com.tencent.mm.storage.a9 a(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = U1 != null ? ot0.q.v(U1) : null;
        if (v17 == null) {
            return null;
        }
        boolean equals = "1001".equals(v17.f348700q1);
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = new com.tencent.mm.autogen.events.WalletQueryHbStatusEvent();
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348704r1) || equals) {
            return null;
        }
        walletQueryHbStatusEvent.f54969g.f8253a = v17.f348704r1;
        walletQueryHbStatusEvent.e();
        return new com.tencent.mm.ui.chatting.viewitems.f4(walletQueryHbStatusEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:
    
        if (((com.tencent.mm.ui.chatting.component.zg) ((sb5.d1) r42.f460708c.a(sb5.d1.class))).o0(0, r36.f203275s) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c8, code lost:
    
        if (((com.tencent.mm.ui.chatting.component.zg) ((sb5.d1) r42.f460708c.a(sb5.d1.class))).o0(9, r36.f203275s) != false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.tencent.mm.ui.chatting.viewitems.a4 r36, ot0.c r37, boolean r38, int r39, java.lang.String r40, com.tencent.mm.storage.f9 r41, yb5.d r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.g4.b(com.tencent.mm.ui.chatting.viewitems.a4, ot0.c, boolean, int, java.lang.String, com.tencent.mm.storage.f9, yb5.d, boolean):void");
    }

    public static void c(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, ot0.c cVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, ot0.q qVar, com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent) {
        java.lang.String str2 = qVar.f348712t1;
        int i17 = f9Var.A0() == 1 ? 1 : 2;
        ot0.j jVar = cVar.I;
        java.lang.String str3 = jVar != null ? jVar.f348539k : "";
        am.x10 x10Var = walletQueryHbStatusEvent.f54970h;
        int i18 = x10Var.f8336b;
        int i19 = ((i18 == 4 || (i18 == 3 && x10Var.f8337c == 2)) ? 0 : 1) ^ 1;
        int i27 = (i18 != 5 ? 1 : 0) ^ 1;
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.lang.String str4 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMsgActionReport", "doReportBubbleRender：order_id %s, send_recv: %s  hb_scene:%s cover_id:%s has_open :%s is_valid：%s", str2, java.lang.Integer.valueOf(i17), str, str4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28839, str2, java.lang.Integer.valueOf(i17), str, str4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public static void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f204014a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo: usecase is running, ignore click");
            return;
        }
        byte[] parseHKHongbaoRouteInfoData = ((h45.q) i95.n0.c(h45.q.class)).parseHKHongbaoRouteInfoData(str, str2);
        if (parseHKHongbaoRouteInfoData != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo routeInfoData size:%s", java.lang.Integer.valueOf(parseHKHongbaoRouteInfoData.length));
            f204014a = true;
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putBinary("route_info", parseHKHongbaoRouteInfoData);
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, new com.tencent.mm.ui.chatting.viewitems.s3());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "handleHKHongbaoRouteInfo routeInfoData is null, use content.url");
        f204014a = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static com.tencent.mm.sdk.platformtools.n3 e() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a;
        }
        return null;
    }

    public static boolean f() {
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) || com.tencent.mm.ui.bk.M(q17, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a));
    }

    public static void g(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, ot0.c cVar, boolean z17, yb5.d dVar) {
        if (a4Var == null || a4Var.clickArea == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource holder or click area is null");
            return;
        }
        if (cVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource piece is null");
            return;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource ui is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "renderEnvelopeResource start");
        com.tencent.mm.ui.chatting.viewitems.u3 u3Var = new com.tencent.mm.ui.chatting.viewitems.u3(a4Var, cVar, z17, dVar);
        if (!a4Var.clickArea.isAttachedToWindow() && com.tencent.mm.sdk.platformtools.o3.c()) {
            a4Var.clickArea.addOnAttachStateChangeListener(new com.tencent.mm.ui.chatting.viewitems.v3(a4Var, u3Var));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgC2C", "post runnable %s", u3Var);
            a4Var.clickArea.post(u3Var);
        }
    }

    public static void h(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, ot0.c cVar) {
        a4Var.f203279w.n();
        a4Var.f203279w.i(a4Var.C);
        a4Var.C = null;
        android.view.View view = a4Var.f203280x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagAll", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;Lcom/tencent/mm/message/AppContentC2cMsgPiece;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a4Var.f203281y.setImageBitmap(null);
        a4Var.f203281y.setVisibility(8);
        a4Var.E = true;
        a4Var.B = cVar.f348420m;
        a4Var.f203282z = cVar.f348430w;
        a4Var.A = cVar.f348432y;
        a4Var.I.n();
        a4Var.I.i(a4Var.f203257J);
        a4Var.f203257J = null;
        a4Var.G.setVisibility(8);
        a4Var.K = true;
        a4Var.B = cVar.f348420m;
        a4Var.F = cVar.E;
    }

    public static void i(com.tencent.mm.ui.chatting.viewitems.a4 a4Var) {
        a4Var.f203279w.n();
        android.view.View view = a4Var.f203280x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C", "resetPagStatus", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2C$AppMsgC2CHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a4Var.f203281y.setVisibility(8);
    }

    public static void j(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, int i17, boolean z17) {
        float f17;
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a4Var.f203268l.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) a4Var.clickArea.getLayoutParams();
            if (i17 != 0) {
                layoutParams.topMargin = i17 - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                layoutParams2.topMargin = i17;
                android.view.View view = a4Var.f203270n;
                if (view != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams3.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                    layoutParams3.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                    a4Var.f203270n.setLayoutParams(layoutParams3);
                }
            } else {
                layoutParams.topMargin = i17;
                layoutParams2.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                android.view.View view2 = a4Var.f203270n;
                if (view2 != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams4.topMargin = 0;
                    layoutParams4.bottomMargin = 0;
                    a4Var.f203270n.setLayoutParams(layoutParams4);
                }
            }
            a4Var.f203268l.setLayoutParams(layoutParams);
            a4Var.clickArea.setLayoutParams(layoutParams2);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) a4Var.f203268l.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) a4Var.clickArea.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) a4Var.f203267k.getLayoutParams();
        layoutParams7.topMargin = 0;
        android.widget.TextView textView = a4Var.userTV;
        if (textView == null || textView.getVisibility() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(a4Var.userTV.getText().toString())) {
            layoutParams5.topMargin = i17;
            layoutParams6.removeRule(3);
            layoutParams6.topMargin = i17;
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) a4Var.userTV.getLayoutParams();
            layoutParams6.addRule(3, com.tencent.mm.R.id.brc);
            layoutParams6.topMargin = 0;
            if (i17 != 0) {
                int height = (i17 - a4Var.userTV.getHeight()) - layoutParams8.bottomMargin;
                if (height != 0 && height != -1 && height != 1) {
                    if (height > 0) {
                        layoutParams5.topMargin = height;
                        layoutParams8.topMargin = height;
                        layoutParams6.topMargin = 0;
                    } else {
                        layoutParams5.topMargin = 0;
                        layoutParams8.topMargin = 0;
                        layoutParams6.topMargin = 0;
                        if (f()) {
                            float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            if (com.tencent.mm.ui.bk.M(q17, i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                                f17 = i65.a.u(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            } else if (com.tencent.mm.ui.bk.M(q17, i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
                                f17 = i65.a.v(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            }
                            layoutParams7.topMargin = java.lang.Math.abs((int) (height / f17));
                        }
                        f17 = 1.0f;
                        layoutParams7.topMargin = java.lang.Math.abs((int) (height / f17));
                    }
                }
            } else {
                layoutParams5.topMargin = 0;
                layoutParams8.topMargin = 0;
                layoutParams6.topMargin = 0;
            }
            a4Var.userTV.setLayoutParams(layoutParams8);
            int i18 = a4Var.f203278v;
            android.widget.TextView textView2 = a4Var.userTV;
            if (textView2 != null && textView2.getVisibility() == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(a4Var.userTV.getText().toString())) {
                int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 7);
                android.widget.RelativeLayout.LayoutParams layoutParams9 = (android.widget.RelativeLayout.LayoutParams) a4Var.userTV.getLayoutParams();
                layoutParams9.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 3) / 2;
                if (f()) {
                    a4Var.userTV.setIncludeFontPadding(false);
                } else {
                    a4Var.userTV.setIncludeFontPadding(true);
                }
                android.widget.ImageView imageView = a4Var.f203267k;
                if (imageView == null || imageView.getVisibility() != 0) {
                    layoutParams9.width = -2;
                    a4Var.userTV.setLayoutParams(layoutParams9);
                    a4Var.userTV.setPadding(b17, 0, b17, 0);
                } else {
                    if (i18 != 0) {
                        layoutParams9.width = i18;
                    }
                    a4Var.userTV.setLayoutParams(layoutParams9);
                    a4Var.userTV.setEllipsize(android.text.TextUtils.TruncateAt.END);
                    a4Var.userTV.setPadding(b17, 0, 0, 0);
                }
            }
        }
        a4Var.f203268l.setLayoutParams(layoutParams5);
        a4Var.clickArea.setLayoutParams(layoutParams6);
        a4Var.f203267k.setLayoutParams(layoutParams7);
    }
}
