package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class GameWebTabUI extends com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI implements nf.i {

    /* renamed from: v, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.r f141196v = new com.tencent.mm.plugin.game.ui.chat_tab.h1();

    /* renamed from: m, reason: collision with root package name */
    public p53.u f141197m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f141198n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f141199o;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f141203s;

    /* renamed from: p, reason: collision with root package name */
    public int f141200p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f141201q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f141202r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.BroadcastReceiver f141204t = new com.tencent.mm.plugin.game.ui.chat_tab.n1(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f141205u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.9
        {
            this.__eventId = 98332773;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent) {
            am.ug ugVar = getUnreadGameMsgCountEvent.f54419g;
            int i17 = ugVar.f8080a;
            boolean z17 = ugVar.f8084e;
            p53.u uVar = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.this.f141197m;
            if (uVar == null) {
                return false;
            }
            uVar.getGameTabWidget().f(i17, z17);
            return false;
        }
    };

    @mk0.a
    /* loaded from: classes8.dex */
    public static class IPCInvoke_readGameLifeConversation implements com.tencent.mm.ipcinvoker.j {

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.mm.ipcinvoker.r f141207d;

        /* renamed from: e, reason: collision with root package name */
        public long f141208e;

        /* renamed from: f, reason: collision with root package name */
        public android.os.Bundle f141209f;

        /* renamed from: g, reason: collision with root package name */
        public final l75.q0 f141210g = new com.tencent.mm.plugin.game.ui.chat_tab.p1(this);

        /* renamed from: h, reason: collision with root package name */
        public final com.tencent.mm.pluginsdk.event.IListenerMStorage f141211h = new com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.AnonymousClass2();

        /* renamed from: i, reason: collision with root package name */
        public final com.tencent.mm.sdk.event.IListener f141212i = new com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.AnonymousClass3(com.tencent.mm.app.a0.f53288d);

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation$2, reason: invalid class name */
        /* loaded from: classes8.dex */
        public class AnonymousClass2 extends com.tencent.mm.pluginsdk.event.IListenerMStorage {
            public AnonymousClass2() {
            }

            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                if (!(iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) || com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this.f141207d == null) {
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this;
                if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f141208e < 1000) {
                    return;
                }
                iPCInvoke_readGameLifeConversation.f141208e = currentTimeMillis;
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.chat_tab.q1(this), "MicroMsg.GameWebTabUI");
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation$3, reason: invalid class name */
        /* loaded from: classes8.dex */
        public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent> {
            public AnonymousClass3(androidx.lifecycle.y yVar) {
                super(yVar);
                this.__eventId = -2093822894;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent) {
                synchronized (this) {
                    if (com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this.f141207d != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this;
                        if (currentTimeMillis - iPCInvoke_readGameLifeConversation.f141208e < 1000) {
                            return false;
                        }
                        iPCInvoke_readGameLifeConversation.f141208e = currentTimeMillis;
                        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.ui.chat_tab.r1(this), "MicroMsg.GameWebTabUI");
                    }
                    return false;
                }
            }
        }

        public final void a() {
            int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
            int Bi = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(1);
            int Bi2 = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("msg_unread_count", Bi);
            bundle.putInt("notify_unread_count", Bi2);
            bundle.putInt("game_life_unread_count", Ri);
            d43.b bVar = d43.b.f226411d;
            bundle.putBoolean("has_chat_room_unread_msg", d43.b.f226414g);
            bundle.putBoolean("bottom_red_dot", o17);
            this.f141209f = bundle;
        }

        @Override // com.tencent.mm.ipcinvoker.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void invoke(com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle;
            if (iPCInteger != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", java.lang.Integer.valueOf(iPCInteger.f68404d));
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i17 = iPCInteger.f68404d;
                com.tencent.mm.sdk.event.IListener iListener = this.f141212i;
                com.tencent.mm.pluginsdk.event.IListenerMStorage iListenerMStorage = this.f141211h;
                l75.q0 q0Var = this.f141210g;
                if (i17 == 1) {
                    this.f141207d = rVar;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(q0Var);
                    com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), iListenerMStorage);
                    iListener.alive();
                    if (currentTimeMillis - this.f141208e >= 1000) {
                        this.f141208e = currentTimeMillis;
                        a();
                    }
                } else if (i17 == 2) {
                    this.f141207d = null;
                    if (gm0.j1.a()) {
                        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(q0Var);
                    }
                    com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), iListenerMStorage);
                    iListener.dead();
                } else if (i17 == 3 && currentTimeMillis - this.f141208e >= 1000) {
                    this.f141208e = currentTimeMillis;
                    a();
                }
            }
            if (rVar == null || (bundle = this.f141209f) == null) {
                return;
            }
            rVar.a(bundle);
        }
    }

    @mk0.a
    /* loaded from: classes8.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            int i17 = bundle.getInt("type");
            java.lang.String string = bundle.getString("msgId", "");
            android.os.Bundle bundle2 = new android.os.Bundle();
            if (i17 == 1) {
                com.tencent.mm.plugin.game.model.e1 p17 = !com.tencent.mm.sdk.platformtools.t8.K0(string) ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(string) : ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
                if (p17 != null) {
                    p17.t0();
                    bundle2.putString("game_red_dot_tab_key", p17.M2.f140524b);
                    bundle2.putString("game_tab_red_dot_msgid", p17.field_gameMsgId);
                    rVar.a(bundle2);
                    return;
                }
            } else if (i17 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(string);
            }
            rVar.a(null);
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
    public com.tencent.mm.plugin.game.luggage.page.l V6(sd.x xVar, android.os.Bundle bundle) {
        return new q53.a(xVar, null, bundle, null);
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
    public void X6() {
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
    public void Y6() {
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139497g;
        if (lVar != null) {
            if (this.f141202r) {
                lVar.f139919s2 = new com.tencent.mm.plugin.game.ui.chat_tab.k1(this);
            }
            lVar.f139912l2 = new com.tencent.mm.plugin.game.ui.chat_tab.l1(this);
        }
    }

    public final void b7(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem, boolean z17) {
        com.tencent.mm.plugin.game.luggage.page.l lVar;
        if (tabItem == null || (lVar = this.f139497g) == null) {
            return;
        }
        lVar.a0(tabItem.f141156d, tabItem.f141167r, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f141156d, tabItem.f141167r, java.lang.Boolean.valueOf(z17));
    }

    public void c7(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_tab_entrance_msgid") : "";
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", 1);
        bundle.putString("msgId", stringExtra);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.a.class, new com.tencent.mm.plugin.game.ui.chat_tab.j1(this, bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = this.f141200p;
        int i18 = configuration.orientation;
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "orientation:%d", java.lang.Integer.valueOf(i18));
            p53.u uVar = this.f141197m;
            if (uVar != null) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget = uVar.getGameTabWidget();
                gameTabWidget.getClass();
                gameTabWidget.post(new com.tencent.mm.plugin.game.ui.chat_tab.s0(gameTabWidget));
            }
            this.f141200p = configuration.orientation;
        }
        if (this.f141199o == null || this.f139497g == null) {
            return;
        }
        boolean C = com.tencent.mm.ui.bk.C();
        if (this.f141201q != C && this.f141197m != null) {
            this.f141201q = C;
            int z17 = r53.f.z(this.f141199o.f141153f);
            int z18 = r53.f.z(this.f141199o.f141154g);
            if (C) {
                if (z18 != 0) {
                    this.f141197m.getGameTabWidget().setBackgroundColor(z18);
                } else {
                    this.f141197m.getGameTabWidget().setBackgroundResource(com.tencent.mm.R.color.f478515x);
                }
            } else if (z17 != 0) {
                this.f141197m.getGameTabWidget().setBackgroundColor(z17);
            } else {
                this.f141197m.getGameTabWidget().setBackgroundResource(com.tencent.mm.R.color.UN_BW_97);
            }
            this.f141197m.getGameTabWidget().e(this.f141198n, "");
        }
        b7((com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) this.f141199o.f141151d.get(this.f141198n), false);
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f141199o = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        java.lang.String stringExtra = getIntent().getStringExtra("game_tab_key");
        this.f141198n = stringExtra;
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141199o;
        if (gameTabData2 != null && gameTabData2.f141152e.equalsIgnoreCase(stringExtra) && g53.e.b()) {
            this.f141202r = true;
        }
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "onCreate");
        com.tencent.mm.plugin.game.luggage.page.f fVar = this.f139494d;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebTabUI", "mContainer is null");
            finish();
            return;
        }
        this.f141197m = com.tencent.mm.plugin.game.ui.chat_tab.r0.a(this, fVar.f406662c);
        this.f141201q = com.tencent.mm.ui.bk.C();
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData22 = this.f141199o;
        if (gameTabData22 != null) {
            java.util.Iterator it = ((java.util.ArrayList) gameTabData22.a()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) it.next();
                if (tabItem.f141166q == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f141167r) && !tabItem.f141156d.equalsIgnoreCase(this.f141198n) && !tabItem.f141170u) {
                    com.tencent.mm.plugin.game.ui.chat_tab.f1 f1Var = new com.tencent.mm.plugin.game.ui.chat_tab.f1(this, tabItem);
                    long j17 = tabItem.f141171v * 1000;
                    com.tencent.mm.plugin.game.luggage.page.f fVar2 = this.f139494d;
                    if (fVar2 != null) {
                        fVar2.f406662c.postDelayed(f1Var, j17);
                    }
                }
            }
        }
        com.tencent.mm.plugin.game.luggage.page.f fVar3 = this.f139494d;
        ((sd.u) fVar3.f406669j).f406653a.f406665f.f336585d = this;
        android.widget.FrameLayout frameLayout = fVar3.f406662c;
        if (frameLayout instanceof android.view.ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new com.tencent.mm.plugin.game.ui.chat_tab.e1(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "float page index1:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f141197m);
                frameLayout.addView(this.f141197m, indexOfChild);
            }
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f141204t;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 4);
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.GameWebViewUI)).Rj(this, iy1.a.Game);
        this.f141203s = new com.tencent.mm.plugin.game.ui.chat_tab.g1(this);
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        c7(getIntent());
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ipcinvoker.d0.h(this.f141203s);
        this.f141203s = null;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "onDestroy");
        unregisterReceiver(this.f141204t);
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f141198n;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f141198n = stringExtra;
            c7(intent);
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141199o;
            if (gameTabData2 == null || this.f139497g == null) {
                return;
            }
            b7((com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) gameTabData2.f141151d.get(stringExtra), false);
            this.f139497g.W(stringExtra);
            p53.u uVar = this.f141197m;
            if (uVar != null) {
                uVar.bringToFront();
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f141205u.dead();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(2), com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.class, null);
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        int i17;
        super.onResume();
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141199o;
        if (gameTabData2 != null && gameTabData2.f141155h != null) {
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                getWindow().setNavigationBarContrastEnforced(false);
                i17 = 16;
            } else {
                i17 = 0;
            }
            getWindow().getDecorView().setSystemUiVisibility(i17 | 512 | 1024 | 256);
            android.view.Window window = getWindow();
            android.graphics.Rect rect = com.tencent.mm.ui.bk.f197978a;
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(0);
                if (i18 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            }
            if (com.tencent.mm.ui.bl.f(this)) {
                this.f141197m.post(new com.tencent.mm.plugin.game.ui.chat_tab.m1(this));
            }
        }
        this.f141205u.alive();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(1), com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.class, f141196v);
    }

    @Override // nf.i
    public boolean r6() {
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
        return true;
    }
}
