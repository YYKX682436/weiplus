package com.tencent.mm.plugin.game.ui;

@db5.a(128)
/* loaded from: classes8.dex */
public class LiteAppGameTabUI extends com.tencent.mm.ui.MMActivity {
    public static final com.tencent.mm.ipcinvoker.r L = new com.tencent.mm.plugin.game.ui.s6();
    public final com.tencent.mm.sdk.event.IListener E;
    public float F;
    public final com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation G;
    public com.tencent.mm.ipcinvoker.r H;
    public com.tencent.mm.plugin.game.ui.b7 I;

    /* renamed from: J, reason: collision with root package name */
    public int f140984J;
    public final com.tencent.mm.sdk.event.IListener K;

    /* renamed from: d, reason: collision with root package name */
    public p53.u f140985d;

    /* renamed from: e, reason: collision with root package name */
    public o53.e f140986e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f140987f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.o6 f140988g;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f140993o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.s f140994p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f140995q;

    /* renamed from: r, reason: collision with root package name */
    public long f140996r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f140997s;

    /* renamed from: u, reason: collision with root package name */
    public org.json.JSONObject f140999u;

    /* renamed from: v, reason: collision with root package name */
    public long f141000v;

    /* renamed from: w, reason: collision with root package name */
    public sx4.v f141001w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f140989h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f140990i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f140991m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f140992n = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f140998t = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public long f141002x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f141003y = false;

    /* renamed from: z, reason: collision with root package name */
    public final int f141004z = 32;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public java.lang.String D = "";

    public LiteAppGameTabUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GameLifecycleNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.1
            {
                this.__eventId = 2013420617;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GameLifecycleNotifyEvent gameLifecycleNotifyEvent) {
                com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI;
                com.tencent.mm.autogen.events.GameLifecycleNotifyEvent gameLifecycleNotifyEvent2 = gameLifecycleNotifyEvent;
                if (!"com.tencent.mm.game.ACTION_EXIT".equals(gameLifecycleNotifyEvent2.f54365g.f7894a) || (liteAppGameTabUI = com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.this) == null || liteAppGameTabUI.isFinishing() || java.lang.System.identityHashCode(liteAppGameTabUI) != gameLifecycleNotifyEvent2.f54365g.f7895b) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppGameTabUI", "%s exit!", liteAppGameTabUI.getClass().getSimpleName());
                liteAppGameTabUI.finish();
                return false;
            }
        };
        this.F = 1.0f;
        this.G = new com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation();
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.handleGameTabNavigationEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.9
            {
                this.__eventId = -1425682821;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.handleGameTabNavigationEvent handlegametabnavigationevent) {
                com.tencent.mm.autogen.events.handleGameTabNavigationEvent handlegametabnavigationevent2 = handlegametabnavigationevent;
                com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI = com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.this;
                if (liteAppGameTabUI.isPaused()) {
                    return true;
                }
                com.tencent.mm.plugin.game.model.r2 r2Var = new com.tencent.mm.plugin.game.model.r2();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(handlegametabnavigationevent2.f55004g.f6634b);
                    java.util.HashMap hashMap = liteAppGameTabUI.f140991m;
                    am.f30 f30Var = handlegametabnavigationevent2.f55004g;
                    com.tencent.mm.plugin.game.ui.a7 a7Var = (com.tencent.mm.plugin.game.ui.a7) hashMap.get(f30Var.f6635c);
                    if ("setGameTab".equals(f30Var.f6633a)) {
                        r2Var.a(liteAppGameTabUI.getContext(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.tencent.mm.plugin.game.ui.a7(null);
                        }
                        a7Var.f141033a = jSONObject;
                    } else if (nd1.d1.NAME.equals(f30Var.f6633a)) {
                        r2Var.c(liteAppGameTabUI.getContext(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.tencent.mm.plugin.game.ui.a7(null);
                        }
                        a7Var.f141034b = jSONObject;
                    } else if ("setPageTitle".equals(f30Var.f6633a)) {
                        r2Var.d(liteAppGameTabUI.getContext(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.tencent.mm.plugin.game.ui.a7(null);
                        }
                        a7Var.f141035c = jSONObject;
                    } else if ("setNavigationBarButtons".equals(f30Var.f6633a)) {
                        r2Var.b(liteAppGameTabUI.getContext(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.tencent.mm.plugin.game.ui.a7(null);
                        }
                        a7Var.f141036d = jSONObject;
                    } else if ("setNavigationBarHidden".equals(f30Var.f6633a) && jSONObject.has("navigationBarHidden") && liteAppGameTabUI.f140986e != null) {
                        if (jSONObject.optBoolean("navigationBarHidden", false)) {
                            liteAppGameTabUI.f140986e.setVisibility(8);
                        } else {
                            liteAppGameTabUI.f140986e.setVisibility(0);
                        }
                    }
                    hashMap.put(f30Var.f6635c, a7Var);
                    return true;
                } catch (org.json.JSONException unused) {
                    return false;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T6(android.view.ViewGroup viewGroup, java.lang.String str) {
        java.lang.String str2;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.plugin.game.ui.v6 v6Var = new com.tencent.mm.plugin.game.ui.v6(this);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = new com.tencent.mm.plugin.lite.ui.WxaLiteAppView(this);
        wxaLiteAppView.f46059z = false;
        wxaLiteAppView.A = false;
        com.tencent.mm.ipcinvoker.r rVar = null;
        wxaLiteAppView.f144377y0 = null;
        wxaLiteAppView.f144376x0 = v6Var;
        wxaLiteAppView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wxaLiteAppView, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "addLiteAppView", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wxaLiteAppView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(wxaLiteAppView, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "addLiteAppView", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f140990i.put(str, wxaLiteAppView);
        final o53.e eVar = new o53.e(this, this.f140993o);
        eVar.Q = str;
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) eVar.F.getParcelable("game_tab_data");
        boolean z17 = eVar.F.getBoolean("game_index_setting_jump_lite", false);
        java.lang.String str3 = eVar.Q;
        if (str3 == null || str3.length() == 0) {
            eVar.N = true;
            str2 = eVar.F.getString("game_tab_key");
        } else {
            str2 = eVar.Q;
        }
        if (gameTabData2 != null) {
            if (!(str2 == null || str2.length() == 0)) {
                android.widget.ImageView imageView = eVar.f139826n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) gameTabData2.f141151d.get(str2);
                if (eVar.F.getBoolean("from_find_more_friend", false) && com.tencent.mm.plugin.game.commlib.i.k() != null && !z17 && !com.tencent.mm.plugin.game.commlib.i.k().f323978g && tabItem != null && !tabItem.G) {
                    synchronized (eVar) {
                        if (eVar.f139817y == null) {
                            android.view.View inflate = com.tencent.mm.ui.id.b(eVar.getContext()).inflate(com.tencent.mm.R.layout.bdo, (android.view.ViewGroup) eVar.f139825m, false);
                            eVar.f139817y = inflate;
                            eVar.f139818z = (com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView) inflate.findViewById(com.tencent.mm.R.id.d3w);
                            eVar.A = (com.tencent.mm.plugin.webview.luggage.RedDotView) eVar.f139817y.findViewById(com.tencent.mm.R.id.d3y);
                            eVar.f139825m.addView(eVar.f139817y, 0);
                            if (eVar.A != null) {
                                if (((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ni()) {
                                    eVar.A.setVisibility(0);
                                } else {
                                    eVar.A.setVisibility(8);
                                }
                            }
                            eVar.B = new com.tencent.mm.plugin.game.luggage.liteapp.ui.b(eVar);
                            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
                            m02.u uVar = eVar.B;
                            ((l02.q) sVar).getClass();
                            java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
                            com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
                            com.tencent.mm.plugin.downloader_app.model.l0.D.add(uVar);
                        }
                    }
                }
                if (tabItem != null) {
                    java.util.List list = tabItem.F;
                    if (!(list == null || ((java.util.ArrayList) list).isEmpty())) {
                        java.util.List topCornerSettings = tabItem.F;
                        kotlin.jvm.internal.o.f(topCornerSettings, "topCornerSettings");
                        java.util.Iterator it = ((java.util.ArrayList) topCornerSettings).iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting = (com.tencent.mm.plugin.game.model.LocalTabCornerSetting) it.next();
                            android.view.View inflate2 = com.tencent.mm.ui.id.b(eVar.getContext()).inflate(com.tencent.mm.R.layout.bdp, (android.view.ViewGroup) eVar.f139825m, false);
                            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f485402hk5);
                            eVar.I.add(imageView2);
                            if (kotlin.jvm.internal.o.b(localTabCornerSetting.f140176d, "chat")) {
                                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(""), com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.b.class, rVar);
                                eVar.G = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.gii);
                                eVar.H = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.avs);
                                android.content.Context context = eVar.E;
                                if (context instanceof androidx.fragment.app.FragmentActivity) {
                                    ((androidx.fragment.app.FragmentActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.game.ui.liteapp.GameLiteSettingActionBar$initChatTab$1
                                        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                                        public final void onResume() {
                                            o53.e.this.getGetUnreadGameMsgListener().alive();
                                        }
                                    });
                                }
                                com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = localTabCornerSetting.f140179g;
                                if (localJumpInfo != null && localJumpInfo.f140172d == 4) {
                                    android.net.Uri parse = android.net.Uri.parse(localJumpInfo.f140173e);
                                    if (kotlin.jvm.internal.o.b(parse.getPath(), "chat")) {
                                        try {
                                            eVar.K = java.lang.Integer.parseInt(parse.getQueryParameter("sourceSence"));
                                        } catch (java.lang.NumberFormatException unused) {
                                            com.tencent.mars.xlog.Log.e("GameLiteSettingActionBar", "gamelog parse reportSourceScene error");
                                        }
                                    }
                                }
                                if (com.tencent.mm.ui.bk.C()) {
                                    java.lang.String str4 = localTabCornerSetting.f140178f;
                                    if (str4 == null || str4.length() == 0) {
                                        kotlin.jvm.internal.o.d(imageView2);
                                        eVar.d(imageView2, com.tencent.mm.R.raw.game_msg_top_tip);
                                    }
                                }
                                if (!com.tencent.mm.ui.bk.C()) {
                                    java.lang.String str5 = localTabCornerSetting.f140177e;
                                    if (str5 == null || str5.length() == 0) {
                                        kotlin.jvm.internal.o.d(imageView2);
                                        eVar.d(imageView2, com.tencent.mm.R.raw.game_msg_top_tip);
                                    }
                                }
                                vo0.a aVar = vo0.e.f438468b;
                                java.lang.String str6 = com.tencent.mm.ui.bk.C() ? localTabCornerSetting.f140178f : localTabCornerSetting.f140177e;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                kotlin.jvm.internal.o.d(imageView2);
                                yo0.f fVar = new yo0.f();
                                fVar.f464078b = true;
                                fVar.f464077a = true;
                                aVar.h(str6, imageView2, fVar.a(), new o53.b(localTabCornerSetting, imageView2, eVar));
                            } else {
                                vo0.a aVar2 = vo0.e.f438468b;
                                java.lang.String str7 = com.tencent.mm.ui.bk.C() ? localTabCornerSetting.f140178f : localTabCornerSetting.f140177e;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                kotlin.jvm.internal.o.d(imageView2);
                                yo0.f fVar2 = new yo0.f();
                                fVar2.f464078b = true;
                                fVar2.f464077a = true;
                                aVar2.h(str7, imageView2, fVar2.a(), new o53.c(localTabCornerSetting, imageView2));
                            }
                            inflate2.setOnClickListener(new o53.d(eVar, localTabCornerSetting));
                            eVar.f139825m.addView(inflate2, 0);
                            rVar = null;
                        }
                    }
                }
            }
        }
        eVar.setImmersiveStyle(eVar.f139832t);
        com.tencent.mm.plugin.game.ui.w6 w6Var = new com.tencent.mm.plugin.game.ui.w6(this);
        android.widget.ImageView imageView3 = eVar.f139823h;
        imageView3.setOnClickListener(w6Var);
        imageView3.setImageResource(com.tencent.mm.R.raw.actionbar_icon_light_back);
        eVar.setTitleText(getString(com.tencent.mm.R.string.fq7));
        new android.widget.FrameLayout.LayoutParams(-1, -2).gravity = 48;
        eVar.setVisibility(8);
        this.f140989h.put(str, eVar);
        this.f140991m.put(str, new com.tencent.mm.plugin.game.ui.a7(null));
        viewGroup.addView(wxaLiteAppView);
        viewGroup.addView(eVar);
    }

    public final void U6(android.net.Uri uri) {
        java.lang.String query = uri.getQuery();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (query == null) {
            query = "";
        }
        java.lang.String[] split = query.split("&");
        if (split == null || split.length == 0) {
            return;
        }
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split("=");
            if (split2 != null && split2.length == 2) {
                try {
                    if (this.f140999u == null) {
                        this.f140999u = new org.json.JSONObject();
                    }
                    this.f140999u.put(split2[0], split2[1]);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppGameTabUI", e17, "JSONException", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.V6():void");
    }

    public final void W6() {
        m53.i5 p17;
        java.lang.String string = this.f140993o.getString("rawUrl");
        this.I = new com.tencent.mm.plugin.game.ui.b7(null);
        android.net.Uri parse = android.net.Uri.parse(string);
        java.lang.String queryParameter = parse.getQueryParameter("immersiveUIStyle");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.equals("1")) {
            this.I.f141065a = true;
        }
        this.H = new com.tencent.mm.plugin.game.ui.y6(this);
        java.lang.String queryParameter2 = parse.getQueryParameter("immersivePageBgIsDark");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        if (queryParameter2.equals("1")) {
            this.I.f141066b = true;
        } else {
            java.lang.String queryParameter3 = parse.getQueryParameter("immersivePageBgIsDark");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            if (!queryParameter3.equals("2")) {
                this.I.f141066b = false;
            } else if (com.tencent.mm.ui.bk.C()) {
                this.I.f141066b = true;
            } else {
                this.I.f141066b = false;
            }
        }
        java.lang.String queryParameter4 = parse.getQueryParameter("hide_share_option");
        if ((queryParameter4 != null ? queryParameter4 : "").equals("1")) {
            this.I.getClass();
        }
        java.lang.String string2 = this.f140993o.getString("rawUrl");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            android.net.Uri parse2 = android.net.Uri.parse(string2);
            java.lang.String queryParameter5 = parse2.getQueryParameter("nav_color");
            if (com.tencent.mm.ui.bk.C()) {
                queryParameter5 = parse2.getQueryParameter("darkmode_nav_color");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter5)) {
                try {
                    this.f140993o.putInt("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter5));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        int i17 = this.f140993o.getInt("customize_status_bar_color");
        this.f140984J = i17;
        if (i17 == 0 && (p17 = com.tencent.mm.plugin.game.commlib.i.p()) != null && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323795d) && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323797f)) {
            try {
                if (com.tencent.mm.ui.bk.C()) {
                    this.f140984J = android.graphics.Color.parseColor(p17.f323797f);
                } else {
                    this.f140984J = android.graphics.Color.parseColor(p17.f323795d);
                }
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppGameTabUI", "parse color: " + e17.getMessage());
            }
            if (this.f140984J == 0) {
                this.f140984J = b3.l.getColor(getContext(), com.tencent.mm.R.color.f478586bk);
            }
        }
        o53.e eVar = this.f140986e;
        if (eVar != null) {
            int i18 = this.f140984J;
            com.tencent.mm.plugin.game.ui.b7 b7Var = this.I;
            eVar.b(i18, b7Var.f141065a, b7Var.f141066b);
        }
    }

    public void X6(android.content.Intent intent) {
        java.lang.String str = "";
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_tab_entrance_msgid") : "";
        com.tencent.mm.plugin.game.model.e1 p17 = !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra) : ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
        if (p17 != null) {
            p17.t0();
            java.lang.String str2 = this.f140997s;
            if (str2 != null && str2.equals(p17.M2.f140524b)) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.field_gameMsgId);
                return;
            }
            str = p17.M2.f140524b;
        }
        if (this.f140985d != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.x6(this, str));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f140993o.getBoolean("back_to_find_page")) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bek;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.f141003y) {
            super.onBackPressed();
        }
        android.view.View view = this.f140987f;
        if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
            com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) view;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "backpress");
            } catch (org.json.JSONException unused) {
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(wxaLiteAppBaseView.getAppUuid(), java.lang.Integer.parseInt(wxaLiteAppBaseView.getFlutterViewName()), "app.rightGesture", jSONObject);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean C = com.tencent.mm.ui.bk.C();
        if (com.tencent.mm.ui.bk.C() != this.A) {
            W6();
            this.A = C;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(C);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.z6(this));
            if (this.f140985d != null) {
                int z17 = r53.f.z(this.f140995q.f141153f);
                int z18 = r53.f.z(this.f140995q.f141154g);
                if (com.tencent.mm.ui.bk.C()) {
                    if (z18 != 0) {
                        this.f140985d.getGameTabWidget().setBackgroundColor(z18);
                    } else {
                        this.f140985d.getGameTabWidget().setBackgroundResource(com.tencent.mm.R.color.f478515x);
                    }
                } else if (z17 != 0) {
                    this.f140985d.getGameTabWidget().setBackgroundColor(z17);
                } else {
                    this.f140985d.getGameTabWidget().setBackgroundResource(com.tencent.mm.R.color.UN_BW_97);
                }
            }
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.B) {
            this.B = true;
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            android.util.DisplayMetrics displayMetrics2 = com.tencent.mm.plugin.lite.LiteAppCenter.mDisplayMetrics;
            if (displayMetrics2 != null) {
                displayMetrics.setTo(displayMetrics2);
            }
            p53.u uVar = this.f140985d;
            if (uVar != null) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget = uVar.getGameTabWidget();
                gameTabWidget.getClass();
                gameTabWidget.post(new com.tencent.mm.plugin.game.ui.chat_tab.s0(gameTabWidget));
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 != 1 || !this.B) {
            float f17 = configuration.fontScale;
            if (f17 == this.F || !com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
                return;
            }
            this.F = f17;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f17);
            return;
        }
        this.B = false;
        android.util.DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics4 = com.tencent.mm.plugin.lite.LiteAppCenter.mDisplayMetrics;
        if (displayMetrics4 != null) {
            displayMetrics3.setTo(displayMetrics4);
        }
        p53.u uVar2 = this.f140985d;
        if (uVar2 != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = uVar2.getGameTabWidget();
            gameTabWidget2.getClass();
            gameTabWidget2.post(new com.tencent.mm.plugin.game.ui.chat_tab.s0(gameTabWidget2));
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
        supportRequestWindowFeature(9);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e53.b.a(hashCode());
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        for (o53.e eVar : this.f140989h.values()) {
            eVar.getClass();
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            m02.u uVar = eVar.B;
            ((l02.q) sVar).getClass();
            java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
            com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
            com.tencent.mm.plugin.downloader_app.model.l0.D.remove(uVar);
            eVar.R.dead();
        }
        this.f141001w.f413666f.a();
        this.K.dead();
        com.tencent.mm.ipcinvoker.d0.h(this.H);
        this.H = null;
        this.E.dead();
        com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent = new com.tencent.mm.autogen.events.LiteAppLifeCycleEvent();
        liteAppLifeCycleEvent.f54468g.f7817a = 3;
        liteAppLifeCycleEvent.e();
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
        com.tencent.mm.plugin.game.l1 l1Var = (com.tencent.mm.plugin.game.l1) ((m33.q1) i95.n0.c(m33.q1.class));
        l1Var.getClass();
        try {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.k1(l1Var, "game.gameCenterExit", new cl0.g()), "GameLiteAppStoreService.SerialQueue");
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.GameLiteAppStoreService", "notifyGameCenterExit exp:" + e17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppGameTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f140997s;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f140997s = stringExtra;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.q6(this));
            o53.e eVar = this.f140986e;
            if (eVar != null) {
                eVar.setVisibility(8);
            }
            android.view.View view = this.f140987f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f140986e = (o53.e) this.f140989h.get(stringExtra);
            android.view.View view2 = (android.view.View) this.f140990i.get(stringExtra);
            this.f140987f = view2;
            if (!((java.util.HashSet) this.f140992n).contains(view2)) {
                this.f140993o = intent.getExtras();
                W6();
                try {
                    this.f140999u = new org.json.JSONObject(this.f140993o.getString("query"));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppGameTabUI", e17, "JSONException", new java.lang.Object[0]);
                }
                U6(android.net.Uri.parse(this.f140993o.getString("rawUrl")));
                this.f140993o.putString("query", this.f140999u.toString());
                V6();
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk((android.view.View) this.f140990i.get(stringExtra), this.f140993o, false, false, this.f140994p, null);
                ((java.util.HashSet) this.f140992n).add((android.view.View) this.f140990i.get(stringExtra));
            }
            o53.e eVar2 = this.f140986e;
            if (eVar2 == null || this.f140987f == null) {
                return;
            }
            eVar2.setVisibility(0);
            android.view.View view3 = this.f140987f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.game.ui.a7 a7Var = (com.tencent.mm.plugin.game.ui.a7) this.f140991m.get(this.f140997s);
            com.tencent.mm.plugin.game.model.r2 r2Var = new com.tencent.mm.plugin.game.model.r2();
            if (a7Var != null) {
                if (a7Var.f141033a != null) {
                    r2Var.a(getContext(), a7Var.f141033a);
                }
                if (a7Var.f141034b != null) {
                    r2Var.c(getContext(), a7Var.f141034b);
                }
                if (a7Var.f141035c != null) {
                    r2Var.d(getContext(), a7Var.f141035c);
                }
                if (a7Var.f141036d != null) {
                    r2Var.b(getContext(), a7Var.f141036d);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        e53.b.c(hashCode());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f141002x > 1000) {
            e53.e.b((int) ((currentTimeMillis - this.f141000v) / 1000), this.f140993o.getString("rawUrl") + "&date_source=1", this.f141004z);
            this.f141002x = currentTimeMillis;
        }
        this.G.invoke(new com.tencent.mm.ipcinvoker.type.IPCInteger(2), L);
        this.f141001w.f413666f.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        int i17;
        super.onResume();
        if (this.f140995q.f141155h != null) {
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                getWindow().setNavigationBarContrastEnforced(false);
                i17 = 16;
            } else {
                i17 = 0;
            }
            getWindow().getDecorView().setSystemUiVisibility(i17 | 512 | 1024 | 256);
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(0);
                if (i18 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            }
            if (com.tencent.mm.ui.bl.f(this)) {
                this.f140985d.post(new com.tencent.mm.plugin.game.ui.r6(this));
            }
        }
        java.util.HashSet hashSet = (java.util.HashSet) this.f140998t;
        if (!hashSet.contains(this.f140997s)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("__gameTabFirstShow__", 1);
            this.f140994p.d(hashMap);
            hashSet.add(this.f140997s);
        }
        e53.b.b(hashCode());
        this.G.invoke(new com.tencent.mm.ipcinvoker.type.IPCInteger(1), L);
        this.f141000v = java.lang.System.currentTimeMillis();
        this.f141001w.f413666f.d();
        android.view.View view = this.f140987f;
        if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
            if (this.f140988g == null) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                this.f140988g = new com.tencent.mm.plugin.game.ui.o6(new yz5.a() { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI$$a
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.ipcinvoker.r rVar = com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.L;
                        com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI = (com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) weakReference.get();
                        if (liteAppGameTabUI != null) {
                            android.view.View view2 = liteAppGameTabUI.f140987f;
                            if (view2 instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
                                return java.lang.Long.valueOf(((com.tencent.liteapp.ui.WxaLiteAppBaseView) view2).getPageId());
                            }
                        }
                        return -1L;
                    }
                });
            }
            ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(this.f140988g);
        }
    }
}
