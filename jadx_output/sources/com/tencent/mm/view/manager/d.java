package com.tencent.mm.view.manager;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: b0, reason: collision with root package name */
    public static boolean f213621b0 = true;

    /* renamed from: c0, reason: collision with root package name */
    public static boolean f213622c0;
    public com.tencent.mm.pluginsdk.ui.chat.v9 C;
    public com.tencent.mm.pluginsdk.ui.k0 D;
    public androidx.appcompat.app.i0 F;
    public int G;
    public int H;

    /* renamed from: J, reason: collision with root package name */
    public int f213623J;
    public java.lang.String K;
    public com.tencent.mm.pluginsdk.ui.j0 L;
    public final com.tencent.mm.sdk.event.IListener V;
    public final com.tencent.mm.sdk.event.IListener W;
    public final lr.c1 X;
    public final androidx.recyclerview.widget.w2 Y;
    public final com.tencent.mm.sdk.event.IListener Z;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f213624a;

    /* renamed from: a0, reason: collision with root package name */
    public final pr.e0 f213625a0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f213627c;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f213630f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.x f213631g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f213632h;

    /* renamed from: j, reason: collision with root package name */
    public lr.p f213634j;

    /* renamed from: k, reason: collision with root package name */
    public final ym5.f0 f213635k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f213636l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f213637m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f213638n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f213639o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.pulldown.NestedBounceView f213640p;

    /* renamed from: q, reason: collision with root package name */
    public final lr.f1 f213641q;

    /* renamed from: r, reason: collision with root package name */
    public final ir.h f213642r;

    /* renamed from: s, reason: collision with root package name */
    public final ir.o f213643s;

    /* renamed from: t, reason: collision with root package name */
    public ir.j0 f213644t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f213645u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f213646v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f213647w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f213648x;

    /* renamed from: z, reason: collision with root package name */
    public ir.c1 f213650z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f213626b = false;

    /* renamed from: d, reason: collision with root package name */
    public int f213628d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f213629e = false;

    /* renamed from: i, reason: collision with root package name */
    public final mr.i f213633i = new mr.i();

    /* renamed from: y, reason: collision with root package name */
    public boolean f213649y = false;
    public final lr.b0 A = new lr.b0();
    public final lr.a1 B = new lr.a1();
    public final ir.x0 E = new ir.x0();
    public boolean I = true;
    public java.lang.Runnable M = null;
    public final nr.e N = new nr.e();
    public final nr.c O = new nr.c();
    public final nr.i P = new nr.i();
    public final nr.j Q = new nr.j();
    public final nr.h R = new nr.h();
    public final ur.l S = new com.tencent.mm.view.manager.e(this);
    public final l75.q0 T = new com.tencent.mm.view.manager.m(this);
    public final l75.q0 U = new com.tencent.mm.view.manager.n(this);

    public d(android.content.Context context) {
        this.f213627c = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.V = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RefreshSmileyPanelEvent>(a0Var) { // from class: com.tencent.mm.view.manager.SmileyPanelManager$8
            {
                this.__eventId = -1418663662;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RefreshSmileyPanelEvent refreshSmileyPanelEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "REFRESH_PANEL_EVENT");
                com.tencent.mm.view.manager.d.this.f213643s.b();
                return false;
            }
        };
        this.W = new com.tencent.mm.view.manager.SmileyPanelManager$9(this, a0Var);
        this.X = new com.tencent.mm.view.manager.f(this);
        this.Y = new com.tencent.mm.view.manager.g(this);
        this.Z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SucceedUploadEmotionEvent>(a0Var) { // from class: com.tencent.mm.view.manager.SmileyPanelManager$12
            {
                this.__eventId = -75046574;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SucceedUploadEmotionEvent succeedUploadEmotionEvent) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11076, "1," + succeedUploadEmotionEvent.f54873g.f6616a);
                com.tencent.mm.view.manager.d.this.Z.dead();
                return true;
            }
        };
        this.f213625a0 = new com.tencent.mm.view.manager.h(this);
        this.f213624a = context;
        if (f213621b0) {
            f213621b0 = false;
            for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : gr.t.g().b(true)) {
                if (qk.x6.STATUS_MIXING == emojiInfo.m1()) {
                    emojiInfo.field_captureStatus = 2;
                    emojiInfo.field_captureUploadErrCode = 13;
                    ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(emojiInfo);
                    com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.d(emojiInfo.field_captureEnterTime, 5, emojiInfo.field_captureScene);
                } else if (emojiInfo.m1() == qk.x6.STATUS_UPLOADING) {
                    emojiInfo.field_captureStatus = 4;
                    ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m(emojiInfo);
                    com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(emojiInfo.field_captureEnterTime, 3, emojiInfo.field_captureScene);
                }
            }
        }
        ir.h hVar = new ir.h();
        this.f213642r = hVar;
        ym5.f0 f0Var = new ym5.f0(context, hVar);
        this.f213635k = f0Var;
        hVar.f293849h = true;
        hVar.f293847f = true;
        hVar.f293852k = gr.v.f274696a.c();
        lr.f1 f1Var = new lr.f1(hVar);
        this.f213641q = f1Var;
        lr.x xVar = new lr.x(hVar, this.E, this.B, this.A, f0Var);
        this.f213631g = xVar;
        this.f213632h = new com.tencent.mm.emoji.panel.layout.EmojiPanelLayoutManager(context, 0, false);
        java.lang.String str = gr.t.g().f274694m;
        this.f213627c = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager: select %s", str);
        this.f213643s = new ir.o(hVar, new com.tencent.mm.view.manager.i(this, xVar, f1Var));
    }

    public void a() {
        ir.j0 j0Var;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onResume: ");
        this.f213626b = true;
        ir.h hVar = this.f213642r;
        hVar.getClass();
        if (this.f213650z != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "smiley_log smiley post update");
            this.f213650z.e();
        }
        com.tencent.mm.pluginsdk.ui.k0 k0Var = this.D;
        if (k0Var != null) {
            k0Var.c(this.f213649y);
        }
        if (this.f213626b) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(this.f213627c, "capture") && hVar.f293849h) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 0);
            }
            if (!hVar.f293852k && (j0Var = this.f213644t) != null && (i17 = this.f213628d) >= 0 && i17 < ((ir.q) j0Var).f293891b.size() && (((ir.r) ((ir.q) this.f213644t).f293891b.get(this.f213628d)) instanceof ir.v)) {
                gr.v.f274696a.d();
            }
            nr.d.f339041a.a(1);
            b(this.f213624a);
        }
        com.tencent.mm.smiley.c0 c0Var = com.tencent.mm.smiley.c0.f193225a;
        if (com.tencent.mm.smiley.c0.f193226b == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiOcrService", "resume but the recognize job has been stopped");
        } else if (com.tencent.mm.smiley.c0.f193232h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "resume");
            com.tencent.mm.smiley.c0.f193232h = false;
            kotlinx.coroutines.l.d(com.tencent.mm.smiley.c0.f193227c, null, null, new com.tencent.mm.smiley.w(null), 3, null);
        }
    }

    public final void b(android.content.Context context) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int t17;
        ir.y0 x17;
        if (j62.e.g().i("clicfg_android_emoticon_search_liteapp", 0, false, true) == 0) {
            return;
        }
        int i17 = this.H;
        int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        if (i17 != 1 || !this.f213626b || (layoutManager = this.f213639o.getLayoutManager()) == null || !(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) || (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) this.f213639o.getLayoutManager()) == null || (t17 = linearLayoutManager.t()) > 0) {
            return;
        }
        if (t17 != 0 || ((x17 = this.f213641q.x(t17)) != null && x17.f293919a.f293895a == 3)) {
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "unable to get emoticon liteapp feature service");
                return;
            }
            qk.y yVar = new qk.y();
            if (j62.e.g().i("clicfg_android_emoticon_search_preloadliteapp", 0, false, true) != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "preDownloadSearchLiteAppIfNeed");
                com.tencent.mm.feature.emoji.f4 f4Var = (com.tencent.mm.feature.emoji.f4) p6Var;
                d22.v Ai = f4Var.Ai(yVar);
                if (Ai == null) {
                    com.tencent.mars.xlog.Log.e(f4Var.f66264d, "cast external context to page context failed");
                    return;
                }
                if (context == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "view context is null");
                    return;
                }
                if (!Ai.isValid()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp context not valid");
                    return;
                }
                q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                if (g0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "liteAppService is null");
                    return;
                }
                d22.p b17 = Ai.b();
                com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
                if (iVar.Cj(b17.j()) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "already exist appId:%s", b17.j());
                    return;
                } else {
                    iVar.cj(b17.j(), new d22.r(b17));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "preloadSearchLiteAppIfNeed");
            com.tencent.mm.feature.emoji.f4 f4Var2 = (com.tencent.mm.feature.emoji.f4) p6Var;
            d22.v Ai2 = f4Var2.Ai(yVar);
            if (Ai2 == null) {
                com.tencent.mars.xlog.Log.e(f4Var2.f66264d, "cast external context to page context failed");
                return;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
            if (!((((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(str, null, d22.c.class)).f68400d && Ai2.a()) || ((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(str, null, d22.b.class)).f68400d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "exit in teen mode");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                return;
            }
            if (context == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "view context is null");
                return;
            }
            if (!Ai2.isValid()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "liteapp context not valid");
                return;
            }
            q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "liteAppService is null");
                return;
            }
            d22.p b18 = Ai2.b();
            if (!(((com.tencent.mm.feature.lite.i) g0Var2).Cj(b18.j()) != null)) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(b18.j(), new d22.t(b18, context));
                return;
            }
            java.lang.String appId = b18.j();
            java.lang.String page = b18.e();
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(page, "page");
            ku5.u0 u0Var = ku5.t0.f312615d;
            d22.s sVar = new d22.s(appId, page, context);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(sVar, 500L, false);
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager remove listener. %s", this);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().t(this.T);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().q(this.U);
        this.V.dead();
        this.W.dead();
        pr.z zVar = pr.k0.f357723q;
        pr.b1 b17 = zVar.b(false);
        pr.e0 e0Var = this.f213625a0;
        b17.d(e0Var);
        zVar.a(false).d(e0Var);
        this.f213629e = false;
    }

    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setCurrentTab: %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f213627c = str;
        if (this.f213644t == null) {
            return;
        }
        for (int i17 = 0; i17 < ((ir.q) this.f213644t).f293891b.size(); i17++) {
            if (((ir.r) ((ir.q) this.f213644t).f293891b.get(i17)).a(str)) {
                e(i17);
                return;
            }
        }
    }

    public void e(int i17) {
        k(i17, true);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f213630f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "setGroupSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/view/manager/SmileyPanelManager", "setGroupSelected", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void f(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowCapture: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        ir.h hVar = this.f213642r;
        boolean z19 = (z17 == hVar.f293848g && z18 == hVar.f293849h) ? false : true;
        hVar.f293848g = z17;
        hVar.f293849h = z18;
        if (z19) {
            this.f213643s.b();
        }
    }

    public void g(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowCustom: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        ir.h hVar = this.f213642r;
        boolean z19 = (z17 == hVar.f293845d && z18 == hVar.f293847f) ? false : true;
        hVar.f293845d = z17;
        hVar.f293847f = z18;
        if (z19) {
            this.f213643s.b();
        }
    }

    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowSearch: %s", java.lang.Boolean.valueOf(z17));
        ir.h hVar = this.f213642r;
        boolean z18 = z17 != hVar.f293843b;
        hVar.f293843b = z17;
        if (z18) {
            this.f213643s.b();
        }
    }

    public void i(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "showSend: %s", java.lang.Boolean.valueOf(z17));
        ir.h hVar = this.f213642r;
        hVar.f293858q = z17;
        java.util.Iterator it = hVar.f293861t.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
    }

    public void j(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowStore: %s", java.lang.Boolean.valueOf(z17));
        ir.h hVar = this.f213642r;
        boolean z18 = z17 != hVar.f293850i;
        hVar.f293850i = z17;
        if (z18) {
            this.f213643s.b();
        }
    }

    public void k(int i17, boolean z17) {
        lr.f1 f1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setTabSelected: %s, last:%s", java.lang.Integer.valueOf(i17), this.f213627c);
        ir.j0 j0Var = this.f213644t;
        if (j0Var != null && i17 >= 0 && i17 < ((ir.q) j0Var).f293891b.size()) {
            int i18 = ((ir.q) this.f213644t).f293893d + i17;
            if (this.f213639o != null && (f1Var = this.f213641q) != null) {
                f1Var.y(i18);
                this.f213639o.post(new com.tencent.mm.view.manager.k(this, i18));
            }
            java.lang.String c17 = ((ir.r) ((ir.q) this.f213644t).f293891b.get(i17)).c();
            ir.k0 b17 = ((ir.t0) ((ir.q) this.f213644t).f293890a.get(i17)).b();
            if (z17) {
                this.P.a(i18, c17);
            }
            boolean z18 = false;
            if (b17 instanceof ir.d1) {
                ir.d1 d1Var = (ir.d1) b17;
                if (!d1Var.c()) {
                    ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
                    com.tencent.mm.plugin.emoji.sync.b Ai = ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai();
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(c17, java.lang.String.valueOf(17))) {
                        linkedList.add(new b22.b("com.tencent.xin.emoticon.tusiji"));
                    } else {
                        linkedList.add(new b22.a(c17));
                    }
                    Ai.f97616a.a(linkedList);
                    com.tencent.mm.plugin.emoji.sync.k kVar = Ai.f97616a;
                    if (!kVar.f97632c) {
                        kVar.f();
                    }
                }
                nr.d dVar = nr.d.f339041a;
                com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = nr.d.f339042b;
                emoticonBoardReddotNotificationStruct.f56010f = emoticonBoardReddotNotificationStruct.b("EnterPid", c17, true);
                emoticonBoardReddotNotificationStruct.f56009e = d1Var.f293829f ? 2 : 1;
                emoticonBoardReddotNotificationStruct.f56011g = i17 - 2;
                dVar.a(1);
            } else {
                com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct2 = nr.d.f339042b;
                emoticonBoardReddotNotificationStruct2.f56010f = emoticonBoardReddotNotificationStruct2.b("EnterPid", "", true);
                emoticonBoardReddotNotificationStruct2.f56011g = 0;
            }
            m(i17);
            if (f213622c0 || !"custom".equals(c17)) {
                return;
            }
            java.util.ArrayList arrayList = n22.m.f334295a;
            java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> a17 = gr.t.g().a();
            if (a17.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmojiUtils", "no local emojis");
            } else {
                final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : a17) {
                    if (emojiInfo != null && !android.text.TextUtils.isEmpty(emojiInfo.getMd5())) {
                        arrayList2.add(emojiInfo.getMd5());
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: n22.m$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.List list = arrayList2;
                        if (list.size() < 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "emojiList size error " + list.size());
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "emojiList size local  " + list.size());
                        boolean z19 = false;
                        boolean z27 = false;
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            java.lang.String str = (java.lang.String) list.get(i19);
                            if ("9bd1281af3a31710a45b84d736363691".equals(str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "EMOJI_JSB position local " + i19);
                                z27 = true;
                            }
                            if ("08f223fa83f1ca34e143d1e580252c7c".equals(str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "EMOJI_DICE position local " + i19);
                                z19 = true;
                            }
                            if (z19 && z27) {
                                break;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "local custom info " + z27 + ", " + z19);
                    }
                });
                z18 = true;
            }
            if (z18) {
                f213622c0 = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.Context r25, int r26, java.lang.Runnable r27) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.manager.d.l(android.content.Context, int, java.lang.Runnable):void");
    }

    public final void m(int i17) {
        ir.c1 c1Var;
        ir.r rVar = (ir.r) ((ir.q) this.f213644t).f293891b.get(i17);
        java.lang.String c17 = rVar.c();
        this.f213627c = c17;
        this.f213628d = i17;
        boolean z17 = rVar instanceof ir.u;
        nr.j jVar = this.Q;
        if (z17) {
            jVar.f339061i = rVar.c();
        } else {
            jVar.f339061i = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "updateSelectTab current %s, %s, %s", java.lang.Integer.valueOf(i17), this.f213627c, jVar.f339061i);
        int size = ((ir.q) this.f213644t).f293892c.size();
        ir.h hVar = this.f213642r;
        if (size == 1 && this.f213650z != null) {
            int i18 = hVar.f293842a;
            int i19 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            if (i18 == 108) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "set panel tab GONE");
                android.view.View view = this.f213636l;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager", "updateSelectTab", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/view/manager/SmileyPanelManager", "updateSelectTab", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.f213626b && !hVar.f293852k && (rVar instanceof ir.v)) {
            gr.v.f274696a.d();
        }
        this.N.f339043a = i17;
        jVar.f339057e = i17;
        jVar.f339056d = com.tencent.mm.sdk.platformtools.t8.D0(c17, "custom") ? 1 : com.tencent.mm.sdk.platformtools.t8.D0(c17, "capture") ? 2 : 3;
        jVar.f339058f = ((ir.t0) ((ir.q) this.f213644t).f293890a.get(i17)).b().a();
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(c17, "smiley");
        this.f213649y = D0;
        com.tencent.mm.pluginsdk.ui.k0 k0Var = this.D;
        if (k0Var != null) {
            k0Var.c(D0);
        }
        if (!this.f213649y && (c1Var = this.f213650z) != null) {
            c1Var.e();
        }
        if (this.f213626b && com.tencent.mm.sdk.platformtools.t8.D0(c17, "capture") && hVar.f293849h) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 0);
        }
    }
}
