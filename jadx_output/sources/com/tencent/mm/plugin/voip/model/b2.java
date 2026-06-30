package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public abstract class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.content.DialogInterface.OnClickListener f176340a = new com.tencent.mm.plugin.voip.model.c2();

    public static void a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipPluginManager", "talker is null");
            return;
        }
        int n17 = gm0.j1.d().n();
        if (n17 == 4 || n17 == 6) {
            gq4.v.Bi().N(context, str);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, 0);
            db5.e1.m(context, com.tencent.mm.R.string.f490500wu, com.tencent.mm.R.string.kcn, f176340a);
        }
    }

    public static long b(java.lang.String str, java.lang.String str2, boolean z17, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipPluginManager", "insertRecallTip() called with: talker = [" + str + "], reason = [" + str2 + "], isVideoCall = [" + z17 + "], createTimeMin = [" + j17 + "], errorCode = [" + i17 + "]");
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(10000);
        f9Var.e1(java.lang.Math.max(c01.w9.o(str), j17 + 1));
        f9Var.r1(6);
        f9Var.d1(str2 + "  <a href=\"weixin://voip/callagain/?username=" + str + "&isvideocall=" + z17 + "\">" + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493456ka1) + "</a>");
        f9Var.l1(f9Var.F | 8);
        com.tencent.mm.autogen.mmdata.rpt.VoipExceptionReportStruct voipExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipExceptionReportStruct();
        voipExceptionReportStruct.f61758d = (long) i17;
        voipExceptionReportStruct.k();
        if (str == null || str.equals("")) {
            return 0L;
        }
        f9Var.u1(str);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        return f9Var.getCreateTime();
    }

    public static void c(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        d(str, str2, i17, i18, str3, false, null, null);
    }

    public static void d(final java.lang.String str, final java.lang.String str2, final int i17, final int i18, final java.lang.String str3, final boolean z17, com.tencent.mm.plugin.voip.model.k0 k0Var, final yz5.l lVar) {
        final com.tencent.mm.plugin.voip.model.k0 z18 = k0Var != null ? k0Var : gq4.v.Bi().z();
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.b2$$a
            @Override // java.lang.Runnable
            public final void run() {
                final long M9;
                java.lang.String str4 = str;
                int i19 = i17;
                java.lang.String str5 = str3;
                java.lang.String str6 = str2;
                int i27 = i18;
                boolean z19 = z17;
                com.tencent.mm.plugin.voip.model.k0 voipInfo = z18;
                final yz5.l lVar2 = lVar;
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.e1(c01.w9.o(str4));
                f9Var.j1(i19);
                f9Var.setType(50);
                f9Var.u1(str4);
                f9Var.u3(str5);
                f9Var.d1(str6);
                f9Var.r1(i27);
                if (z19) {
                    f9Var.l1(f9Var.F | 8);
                }
                if (com.tencent.mm.plugin.voip.model.j0.d()) {
                    synchronized (com.tencent.mm.plugin.voip.model.j0.class) {
                        kotlin.jvm.internal.o.g(voipInfo, "voipInfo");
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "insertMsg() called with: voipInfo = " + voipInfo + ", msgInfo = " + f9Var);
                        com.tencent.mm.plugin.voip.model.j0 j0Var = com.tencent.mm.plugin.voip.model.j0.f176682a;
                        dm.sb f17 = j0Var.f(voipInfo);
                        if (f17 != null && f17.L0() == 4) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPBubbleHelper", "insertMsg: already has bubble msg");
                            M9 = f17.G0();
                        } else if (f17 != null) {
                            M9 = j0Var.l(f17, f9Var);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "insertMsg: get bubble info error");
                            M9 = 0;
                        }
                    }
                } else {
                    M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                }
                if (M9 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoipPluginManager", "inset voip  failed!");
                }
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.b2$$n
                    @Override // java.lang.Runnable
                    public final void run() {
                        yz5.l lVar3 = yz5.l.this;
                        if (lVar3 != null) {
                            lVar3.invoke(java.lang.Long.valueOf(M9));
                        }
                    }
                });
            }
        });
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, yz5.l lVar) {
        d(str, str2, i17, i18, str3, z17, null, lVar);
    }

    public static void f(final android.content.Context context, java.lang.String str) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$o
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                if (iArr[0] != 0) {
                    final android.content.Context context2 = context;
                    db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hhn), context2.getResources().getString(com.tencent.mm.R.string.gv_), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context2);
                        }
                    }, new com.tencent.mm.plugin.voip.model.b2$$c());
                }
            }
        })) {
            a(context, str);
        }
    }

    public static void g(final android.content.Context context, java.lang.String str) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$r
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                if (iArr[0] != 0) {
                    final android.content.Context context2 = context;
                    db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hhn), context2.getResources().getString(com.tencent.mm.R.string.gv_), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$s
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context2);
                        }
                    }, new com.tencent.mm.plugin.voip.model.b2$$t());
                }
            }
        })) {
            a(context, str);
        }
    }

    public static void h(final android.content.Context context, final java.lang.String str, final boolean z17, final boolean z18) {
        if (z17) {
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.CAMERA", 19, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$p
                @Override // j35.b0
                public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                    if (iArr.length <= 0 || iArr[0] == 0) {
                        return;
                    }
                    final android.content.Context context2 = context;
                    db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hh8), context2.getResources().getString(com.tencent.mm.R.string.f490774aq2), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$f
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context2);
                        }
                    }, new com.tencent.mm.plugin.voip.model.b2$$g());
                }
            })) {
                return;
            }
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$q
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                if (iArr.length == 0 || iArr[0] == 0) {
                    return;
                }
                final android.content.Context context2 = context;
                db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hhn), context2.getResources().getString(com.tencent.mm.R.string.gv_), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        dialogInterface.dismiss();
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.g(context2);
                    }
                }, new com.tencent.mm.plugin.voip.model.b2$$i());
            }
        })) {
            final com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
            Bi.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "startVideoCall, toUser:" + str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (java.lang.System.currentTimeMillis() - Bi.f176566i >= 2000 || java.lang.System.currentTimeMillis() - Bi.f176566i <= 0) {
                if (java.lang.System.currentTimeMillis() - Bi.f176569l < Bi.f176570m && java.lang.System.currentTimeMillis() - Bi.f176569l > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "fail! cuz overloadInterval fail!");
                    db5.e1.m(context, com.tencent.mm.R.string.kd9, com.tencent.mm.R.string.kdo, null);
                    return;
                }
                Bi.f176566i = java.lang.System.currentTimeMillis();
                boolean z19 = true;
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true) == null) {
                    return;
                }
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).o2()) {
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    u1Var.g(context.getString(com.tencent.mm.R.string.kcq));
                    u1Var.n(context.getString(com.tencent.mm.R.string.f490454vi));
                    u1Var.l(new com.tencent.mm.plugin.voip.model.h2$$b());
                    u1Var.q(false);
                    return;
                }
                com.tencent.mm.plugin.voip.model.g1 g1Var = Bi.f176558a.f176411a;
                if (2 != g1Var.f176510b) {
                    g1Var.f176510b = 2;
                }
                ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Ai(java.lang.String.valueOf(Bi.n()), 1);
                final long n17 = Bi.n();
                android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
                nq4.f.f339014a.g(z18);
                vq4.b0.o();
                com.tencent.mm.plugin.voip.model.d3 d3Var = Bi.f176558a;
                d3Var.f176431u = str;
                d3Var.f176433w = z18;
                d3Var.f176432v = z17;
                if (vq4.b0.f439271b && z17 && Bi.E == null) {
                    gq4.v.wi().d();
                    if (!fp.h.a(26) && !z18 && (!com.tencent.mm.app.w.INSTANCE.f53889n || Bi.u() || Bi.v())) {
                        z19 = false;
                    }
                    dr4.p1 p1Var = new dr4.p1(z18, z19);
                    Bi.E = p1Var;
                    if (vq4.b0.f439280k) {
                        p1Var.f();
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.n2(Bi, z17, str, n17));
                Bi.G();
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s", java.lang.Boolean.valueOf(com.tencent.mm.app.w.INSTANCE.f53889n));
                final long m17 = Bi.m();
                final boolean z27 = false;
                final android.content.Context context3 = context2;
                ((y03.e) i95.n0.c(y03.e.class)).d8(context2, str, z17, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.h2$$f
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        java.lang.String str2;
                        android.content.Intent intent;
                        android.content.Context context4;
                        long j17;
                        java.lang.String str3;
                        android.widget.RemoteViews remoteViews;
                        java.lang.String string;
                        android.widget.RemoteViews remoteViews2;
                        com.tencent.mm.plugin.voip.model.h2 h2Var = com.tencent.mm.plugin.voip.model.h2.this;
                        long j18 = m17;
                        boolean z28 = z17;
                        boolean z29 = z18;
                        java.lang.String str4 = str;
                        long j19 = currentTimeMillis;
                        long j27 = n17;
                        boolean z37 = z27;
                        android.content.Context context5 = context3;
                        android.content.Intent intent2 = (android.content.Intent) obj;
                        if (j18 != h2Var.f176558a.f176434x || j18 == 0) {
                            vq4.m0 m0Var = new vq4.m0();
                            h2Var.D = m0Var;
                            m0Var.f439359w = z29;
                            m0Var.f439360x = z28;
                            com.tencent.mm.plugin.voip.model.j0.o(h2Var.z());
                            intent2.putExtra("Voip_User", str4);
                            intent2.putExtra("Voip_Outcall", z29);
                            intent2.putExtra("Voip_VideoCall", z28);
                            intent2.putExtra("Voip_LastPage_Hash", j19);
                            intent2.putExtra("Voip_CallRoomKey", j27);
                            if (!z29 && fp.h.c(29) && (!com.tencent.mm.app.w.INSTANCE.f53889n || h2Var.u() || h2Var.v())) {
                                str2 = "MicroMsg.Voip.VoipService";
                                intent = intent2;
                                context4 = context5;
                                j17 = j27;
                                h2Var.f176571n = new uq4.a(false, z28, str4, z37, j27);
                                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String d17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(intent.getStringExtra("Voip_User"), true).d1();
                                ((sg3.a) v0Var).getClass();
                                java.lang.String e17 = c01.a2.e(d17);
                                if (ip.b.a()) {
                                    remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4o);
                                    remoteViews2.setTextViewText(com.tencent.mm.R.id.f486168kg0, e17);
                                    if (intent.getBooleanExtra("Voip_VideoCall", true)) {
                                        string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493470kc3);
                                        remoteViews2.setImageViewResource(com.tencent.mm.R.id.kfv, com.tencent.mm.R.drawable.btp);
                                    } else {
                                        string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493469kc2);
                                        remoteViews2.setImageViewResource(com.tencent.mm.R.id.kfv, com.tencent.mm.R.drawable.btq);
                                    }
                                    remoteViews2.setTextViewText(com.tencent.mm.R.id.kg7, string);
                                    remoteViews2.setImageViewBitmap(com.tencent.mm.R.id.kfq, h2Var.y(str4));
                                    remoteViews2.setImageViewResource(com.tencent.mm.R.id.pjk, com.tencent.mm.R.drawable.btt);
                                } else {
                                    string = intent.getBooleanExtra("Voip_VideoCall", true) ? com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493470kc3) : com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493469kc2);
                                    if (!fp.h.c(31) || com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion < 31) {
                                        remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.d4p);
                                        remoteViews2.setTextViewText(com.tencent.mm.R.id.pjm, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490495wp));
                                        remoteViews2.setTextViewText(com.tencent.mm.R.id.kfu, string);
                                    } else {
                                        remoteViews2 = new android.widget.RemoteViews(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.R.layout.eqj);
                                        remoteViews2.setTextViewText(com.tencent.mm.R.id.kfu, string);
                                    }
                                }
                                str3 = e17 + string;
                                remoteViews = remoteViews2;
                            } else {
                                str2 = "MicroMsg.Voip.VoipService";
                                intent = intent2;
                                context4 = context5;
                                j17 = j27;
                                str3 = "";
                                remoteViews = null;
                            }
                            if (z37) {
                                intent.setFlags(603979776);
                                intent.addFlags(268435456);
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 29 && (!com.tencent.mm.app.w.INSTANCE.f53889n || h2Var.u() || h2Var.v())) {
                                h2Var.f176580w = j19;
                                com.tencent.mars.xlog.Log.i(str2, "start channel ring, now:" + h2Var.f176580w);
                            }
                            h2Var.f176582y = false;
                            mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(j17));
                            if (wi6 != null) {
                                wi6.a();
                            }
                            ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).wi(context4, intent, remoteViews, str3, intent.getComponent().getClassName(), true, mx3.i0.h(str4), true, true);
                            if (mx3.f0.j() && fp.e0.g()) {
                                com.tencent.mm.sdk.platformtools.x2.f193071a.grantUriPermission("com.android.systemui", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.vfs.r6.j(new java.io.File(mx3.i0.j(str4).h()))), 1);
                            }
                            rq4.u.f399109a.c(false, z29);
                            h2Var.E(7);
                            if (!z29 && !com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.isForeground()) {
                                ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).aj(j17);
                            }
                        } else {
                            h2Var.G();
                            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "current room is exit %s", java.lang.Long.valueOf(j18));
                        }
                        return null;
                    }
                });
            }
        }
    }

    public static void i(final android.content.Context context, java.lang.String str) {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.CAMERA", 19, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$l
            @Override // j35.b0
            public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                if (iArr.length <= 0 || iArr[0] == 0) {
                    return;
                }
                final android.content.Context context2 = context;
                db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hh8), context2.getResources().getString(com.tencent.mm.R.string.f490774aq2), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        dialogInterface.dismiss();
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.g(context2);
                    }
                }, new com.tencent.mm.plugin.voip.model.b2$$e());
            }
        })) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 82, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.b2$$m
                @Override // j35.b0
                public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                    if (iArr.length == 0 || iArr[0] == 0) {
                        return;
                    }
                    final android.content.Context context2 = context;
                    db5.e1.C(context2, context2.getResources().getString(com.tencent.mm.R.string.hhn), context2.getResources().getString(com.tencent.mm.R.string.gv_), context2.getResources().getString(com.tencent.mm.R.string.kct), context2.getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.b2$$j
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context2);
                        }
                    }, new com.tencent.mm.plugin.voip.model.b2$$k());
                }
            })) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoipPluginManager", "talker is null");
                    return;
                }
                int n17 = gm0.j1.d().n();
                if (n17 == 4 || n17 == 6) {
                    gq4.v.Bi().L(context, str);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, 0);
                    db5.e1.m(context, com.tencent.mm.R.string.f490500wu, com.tencent.mm.R.string.kcn, f176340a);
                }
            }
        }
    }
}
