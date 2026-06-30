package vh0;

@j95.b
/* loaded from: classes11.dex */
public final class f3 extends i95.w implements vh0.n1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f436857d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f436858e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f436859f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f436860g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f436861h;

    public f3() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f436857d = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a);
        this.f436858e = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        this.f436859f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a);
        this.f436860g = new java.util.concurrent.ConcurrentHashMap();
        this.f436861h = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public static final java.lang.String Ai(vh0.f3 f3Var, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        f3Var.getClass();
        if (!b0Var.k()) {
            return null;
        }
        java.lang.String str = b0Var.f322637e;
        if (android.text.TextUtils.isEmpty(str)) {
            str = b0Var.f322638f;
        }
        java.lang.String str2 = str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return str2;
        }
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return tg3.u0.ob((tg3.u0) c17, f9Var, bm5.c0.f22550a.d(b0Var.l()), str2, "", "", false, false, 64, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Bi(vh0.f3 r4, android.content.Context r5, int r6, android.content.DialogInterface.OnCancelListener r7, kotlin.coroutines.Continuation r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof vh0.x2
            if (r0 == 0) goto L16
            r0 = r8
            vh0.x2 r0 = (vh0.x2) r0
            int r1 = r0.f436999f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f436999f = r1
            goto L1b
        L16:
            vh0.x2 r0 = new vh0.x2
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.f436997d
            pz5.a r8 = pz5.a.f359186d
            int r1 = r0.f436999f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L48
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            vh0.y2 r1 = new vh0.y2
            r3 = 0
            r1.<init>(r5, r6, r7, r3)
            r0.f436999f = r2
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r1, r0)
            if (r4 != r8) goto L48
            goto L4f
        L48:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            r8 = r4
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.f3.Bi(vh0.f3, android.content.Context, int, android.content.DialogInterface$OnCancelListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Di(vh0.f3 r4, android.content.Context r5, int r6, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof vh0.z2
            if (r0 == 0) goto L16
            r0 = r7
            vh0.z2 r0 = (vh0.z2) r0
            int r1 = r0.f437009f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f437009f = r1
            goto L1b
        L16:
            vh0.z2 r0 = new vh0.z2
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f437007d
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f437009f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r4)
            goto L48
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            vh0.a3 r1 = new vh0.a3
            r3 = 0
            r1.<init>(r5, r6, r3)
            r0.f437009f = r2
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r1, r0)
            if (r4 != r7) goto L48
            goto L4f
        L48:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            r7 = r4
        L4f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.f3.Di(vh0.f3, android.content.Context, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void hj(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "send yuanbao command with cmdId:%d, username:%s", java.lang.Integer.valueOf(i17), str);
        gm0.j1.d().g(new wh0.e(str2, i17, (int) (java.lang.System.currentTimeMillis() / 1000)));
    }

    public static final void mj(java.lang.Runnable runnable, java.lang.String str) {
        try {
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).Bi().q(str);
            if (q17 != null && !android.text.TextUtils.isEmpty(q17.F1) && !q17.X4()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] yuanbao contact has already existed, skip get contact.");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] yuanbao contact was not found or needs to update, trigger get contact now.");
            ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(str, 12, new vh0.d3(runnable));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotRoutineService", th6, "[-] Failure.", new java.lang.Object[0]);
        }
    }

    public static final m11.b0 wi(vh0.f3 f3Var, java.lang.String str, final long j17) {
        boolean moveToFirst;
        f3Var.getClass();
        if (j17 == 0) {
            return null;
        }
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).cj();
        final java.lang.String X8 = cj6.X8(str);
        if (cj6.Da(X8)) {
            moveToFirst = true;
            if (ot0.c3.l().b("hasSvrIdFast", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n3
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(ot0.z2.f348822a.n1(com.tencent.mm.storage.g9.this.f193989r, X8, j17) ? 1 : 0);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$o3
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    java.lang.String str2 = X8;
                    android.database.Cursor D = com.tencent.mm.storage.g9.this.f193989r.D(str2, null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
                    boolean moveToFirst2 = D.moveToFirst();
                    D.close();
                    return java.lang.Integer.valueOf(moveToFirst2 ? 1 : 0);
                }
            }) != 1) {
                moveToFirst = false;
            }
        } else if (cj6.Pb(X8)) {
            moveToFirst = ot0.z2.f348822a.n1(cj6.f193989r, X8, j17);
        } else {
            android.database.Cursor D = cj6.f193989r.D(X8, null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
            moveToFirst = D.moveToFirst();
            D.close();
        }
        if (!moveToFirst) {
            return null;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return m11.b1.Di().b2(str, j17);
    }

    public void Ni(java.lang.String chatbotUsername) {
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] clearChatBotHistory: ".concat(chatbotUsername));
        fj(chatbotUsername, r45.ab5.E_CMD_CLEAR_MSG);
    }

    public java.util.Set Ri() {
        return xh0.b.J0().D0();
    }

    public java.util.Set Ui() {
        java.util.Set D0 = xh0.b.J0().D0();
        ((java.util.HashSet) D0).remove("wxid_wi_1d142z0zdj03");
        return D0;
    }

    public void Vi(android.content.Context context, int i17, java.lang.String chatbotUsername) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        r45.ab5 ab5Var = r45.ab5.E_CMD_ENTER_FROMSEARCH;
        r45.ab5 ab5Var2 = r45.ab5.E_CMD_UNKNOWN;
        if (i17 != 5) {
            if (i17 == 10) {
                ab5Var = r45.ab5.E_CMD_ENTER_FROM_QRSCAN;
            } else if (i17 != 12) {
                switch (i17) {
                    case 14:
                        ab5Var = r45.ab5.E_CMD_ENTER_FROMCARD;
                        break;
                    case 15:
                    case 16:
                        break;
                    default:
                        ab5Var = ab5Var2;
                        break;
                }
            } else {
                ab5Var = r45.ab5.E_CMD_ENTER_FROMHB;
            }
        }
        if (ab5Var != ab5Var2) {
            fj(chatbotUsername, ab5Var);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotRoutineService", "[!] unexpected scene: " + i17 + ", cmd: " + ab5Var + ", skip notifying.");
    }

    public void Zi(android.content.Context context, java.lang.String url) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("hide_option_menu", true);
        intent.putExtra("KRightBtn", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public vh0.l1 aj(android.content.Context context, int i17, java.lang.String chatbotUsername, boolean z17, vh0.j1 j1Var, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        if (!com.tencent.mm.storage.z3.L3(chatbotUsername)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotRoutineService", "[-] username is not a yuanbao");
            return vh0.l1.NOT_A_CHATBOT;
        }
        android.content.Intent intent = new android.content.Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("chat_from_scene", i17);
        intent.putExtra("Chat_User", chatbotUsername);
        intent.putExtra("Chat_Mode", 1);
        intent.putExtra("finish_direct", true);
        if (j1Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBinder("chatting_ui_callback_binder", new vh0.t2(j1Var));
            intent.putExtras(bundle2);
        }
        if (z17) {
            intent.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(5));
            intent.putExtra("kHalfScreenClearTop", false);
            ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).wi(context, chatbotUsername, intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(context, "com.tencent.mm.ui.chatting.ChattingUI");
            intent2.putExtras(intent);
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/yuanbao/YuanBaoRoutineService", "openChatBotChatting", "(Landroid/content/Context;ILjava/lang/String;ZLcom/tencent/mm/feature/yuanbao/IYuanBaoRoutine$OnChattingUICallback;Landroid/os/Bundle;)Lcom/tencent/mm/feature/yuanbao/IYuanBaoRoutine$OpenChatBotResult;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/yuanbao/YuanBaoRoutineService", "openChatBotChatting", "(Landroid/content/Context;ILjava/lang/String;ZLcom/tencent/mm/feature/yuanbao/IYuanBaoRoutine$OnChattingUICallback;Landroid/os/Bundle;)Lcom/tencent/mm/feature/yuanbao/IYuanBaoRoutine$OpenChatBotResult;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return vh0.l1.OK;
    }

    public void bj(android.content.Context context, java.lang.String chatbotUsername, int i17, java.lang.String enterSessionId, vh0.i1 i1Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        kotlin.jvm.internal.o.g(enterSessionId, "enterSessionId");
        if (!kotlin.jvm.internal.o.b("wxid_wi_1d142z0zdj03", chatbotUsername)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] Not YuanBao user, skip YuanBao agreement dialog.");
            if (i1Var != null) {
                i1Var.onResult(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        java.lang.String s17 = c01.e2.s();
        boolean z17 = true;
        if (!r26.i0.p("CN", s17, true) && !r26.i0.p("HK", s17, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] user reg country or region is " + s17 + ", so skip agreement dialog.");
            if (i1Var != null) {
                i1Var.onResult(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        vh0.f2 f2Var = (vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class));
        java.util.List Ai = f2Var.Ai(chatbotUsername);
        if (!Ai.isEmpty()) {
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) it.next()).f67864i) {
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            kotlinx.coroutines.l.d(this.f436857d, null, null, new vh0.v2(context, Ai, chatbotUsername, i17, enterSessionId, this, i1Var, f2Var, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] privacy tos was agreed before, skip showing dialog.");
        if (i1Var != null) {
            i1Var.onResult(java.lang.Boolean.TRUE);
        }
    }

    public vh0.h1 cj(android.content.Context context, java.lang.String chatbotUsername, long j17, java.lang.String coverImgPath) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        kotlin.jvm.internal.o.g(coverImgPath, "coverImgPath");
        if (android.text.TextUtils.isEmpty(coverImgPath)) {
            return vh0.h1.IMG_MSG_LOST;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wxb8f2d39684e3fe62";
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.z.f193124t.a("FEATURE_ID");
        if (r26.i0.p("FLAVOR_CHATBOT", a17, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] featureId:" + a17 + ", open cover wxa preview version.");
            b1Var.f317016c = 2;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] featureId:" + a17 + ", open cover wxa release version.");
            b1Var.f317016c = 0;
        }
        if (com.tencent.mm.sdk.platformtools.y1.g(coverImgPath)) {
            coverImgPath = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(coverImgPath, 10);
        }
        b1Var.f317022f = "pages/customEdit/index.html?channel=202598&filePath=" + fp.s0.b(coverImgPath, com.tencent.mapsdk.internal.rv.f51270c) + "&msgid=" + ((java.lang.Object) jz5.x.a(j17));
        b1Var.f317032k = 1343;
        b1Var.f317043u = chatbotUsername;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        return vh0.h1.OK;
    }

    public final void fj(java.lang.String str, r45.ab5 ab5Var) {
        if (com.tencent.mm.app.c6.MATCH_MM.matches(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            hj(str, str, ab5Var.f369896d);
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, j3.f.a(new jz5.l("chatbotUsername", str), new jz5.l("cmd", java.lang.Integer.valueOf(ab5Var.f369896d))), vh0.w2.class, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:12:0x002b->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean ij() {
        /*
            r5 = this;
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            com.tencent.mm.repairer.config.chatbot.RepairerConfigShowWeClawBotEntrance r1 = new com.tencent.mm.repairer.config.chatbot.RepairerConfigShowWeClawBotEntrance
            r1.<init>()
            h62.d r0 = (h62.d) r0
            int r0 = r0.nj(r1)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L83
            java.util.Set r0 = r5.Ui()     // Catch: java.lang.Exception -> L6b
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L27
            goto L83
        L27:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L6b
        L2b:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L83
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> L6b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L6b
            java.lang.String r4 = "@weclaw"
            boolean r4 = kotlin.jvm.internal.o.b(r3, r4)     // Catch: java.lang.Exception -> L6b
            if (r4 != 0) goto L66
            boolean r4 = com.tencent.mm.storage.z3.L4(r3)     // Catch: java.lang.Exception -> L6b
            if (r4 == 0) goto L66
            java.lang.Class<vg3.x3> r4 = vg3.x3.class
            lm0.a r4 = gm0.j1.s(r4)     // Catch: java.lang.Exception -> L6b
            vg3.x3 r4 = (vg3.x3) r4     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.plugin.messenger.foundation.h2 r4 = (com.tencent.mm.plugin.messenger.foundation.h2) r4     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.storage.k4 r4 = r4.Bi()     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.storage.z3 r3 = r4.n(r3, r2)     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L61
            boolean r3 = r3.r2()     // Catch: java.lang.Exception -> L6b
            if (r3 != r2) goto L61
            r3 = r2
            goto L62
        L61:
            r3 = r1
        L62:
            if (r3 == 0) goto L66
            r3 = r2
            goto L67
        L66:
            r3 = r1
        L67:
            if (r3 == 0) goto L2b
            r1 = r2
            goto L83
        L6b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "shouldShowWeClawBot error: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.ChatBotRoutineService"
            com.tencent.mars.xlog.Log.e(r2, r0)
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.f3.ij():boolean");
    }

    public void nj(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f436860g.put(username, java.lang.Boolean.valueOf(z17));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "updateClawStatus, username: " + username + ", isConnected: " + z17);
        java.util.Iterator it = this.f436861h.iterator();
        while (it.hasNext()) {
            try {
                com.tencent.mm.ui.chatting.component.m0 m0Var = (com.tencent.mm.ui.chatting.component.m0) ((vh0.m1) it.next());
                yb5.d dVar = m0Var.f199471a.f198580d;
                if (dVar != null) {
                    dVar.q().post(new com.tencent.mm.ui.chatting.component.l0(m0Var, z17, username));
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotRoutineService", th6, "[-] notify WeClawStatusListener failed.", new java.lang.Object[0]);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "on ChatBot Routine service init");
        ((ku5.t0) ku5.t0.f312615d).k(new vh0.s2(this), 15000L);
    }
}
