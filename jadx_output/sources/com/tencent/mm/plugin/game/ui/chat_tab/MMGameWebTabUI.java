package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class MMGameWebTabUI extends com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI implements nf.i {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.r f141215r = new com.tencent.mm.plugin.game.ui.chat_tab.u1();

    /* renamed from: h, reason: collision with root package name */
    public p53.u f141216h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f141217i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f141218m;

    /* renamed from: n, reason: collision with root package name */
    public int f141219n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f141220o = true;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.BroadcastReceiver f141221p = new com.tencent.mm.plugin.game.ui.chat_tab.y1(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f141222q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.7
        {
            this.__eventId = 98332773;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent) {
            am.ug ugVar = getUnreadGameMsgCountEvent.f54419g;
            int i17 = ugVar.f8080a;
            boolean z17 = ugVar.f8084e;
            p53.u uVar = com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.this.f141216h;
            if (uVar == null) {
                return false;
            }
            uVar.getGameTabWidget().f(i17, z17);
            return false;
        }
    };

    /* loaded from: classes8.dex */
    public static class IPCInvoke_readGameLifeConversation implements com.tencent.mm.ipcinvoker.j {

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.mm.ipcinvoker.r f141224d;

        /* renamed from: e, reason: collision with root package name */
        public final l75.q0 f141225e = new com.tencent.mm.plugin.game.ui.chat_tab.a2(this);

        /* renamed from: f, reason: collision with root package name */
        public final com.tencent.mm.pluginsdk.event.IListenerMStorage f141226f = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.2
            @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
            public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
                com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation;
                com.tencent.mm.ipcinvoker.r rVar;
                if (!(iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) || (rVar = (iPCInvoke_readGameLifeConversation = com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.this).f141224d) == null) {
                    return;
                }
                rVar.a(iPCInvoke_readGameLifeConversation.a());
            }
        };

        /* renamed from: g, reason: collision with root package name */
        public final com.tencent.mm.sdk.event.IListener f141227g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.3
            {
                this.__eventId = -2093822894;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent) {
                synchronized (this) {
                    com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.this;
                    com.tencent.mm.ipcinvoker.r rVar = iPCInvoke_readGameLifeConversation.f141224d;
                    if (rVar != null) {
                        rVar.a(iPCInvoke_readGameLifeConversation.a());
                    }
                }
                return false;
            }
        };

        private IPCInvoke_readGameLifeConversation() {
        }

        public final android.os.Bundle a() {
            int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
            int Bi = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(1);
            int Bi2 = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("msg_unread_count", Ri + Bi);
            bundle.putInt("notify_unread_count", Bi2);
            d43.b bVar = d43.b.f226411d;
            bundle.putBoolean("has_chat_room_unread_msg", d43.b.f226414g);
            return bundle;
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
            android.os.Bundle bundle = null;
            if (iPCInteger != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", java.lang.Integer.valueOf(iPCInteger.f68404d));
                int i17 = iPCInteger.f68404d;
                com.tencent.mm.sdk.event.IListener iListener = this.f141227g;
                com.tencent.mm.pluginsdk.event.IListenerMStorage iListenerMStorage = this.f141226f;
                l75.q0 q0Var = this.f141225e;
                if (i17 == 1) {
                    this.f141224d = rVar;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(q0Var);
                    com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), iListenerMStorage);
                    iListener.alive();
                    bundle = a();
                } else if (i17 == 2) {
                    this.f141224d = null;
                    ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(q0Var);
                    com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), iListenerMStorage);
                    iListener.dead();
                } else if (i17 == 3) {
                    bundle = a();
                }
            }
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI
    public void V6() {
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI
    public void W6() {
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139507g;
        if (lVar != null) {
            lVar.f139912l2 = new com.tencent.mm.plugin.game.ui.chat_tab.v1(this);
        }
    }

    public final void Y6(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem, boolean z17) {
        com.tencent.mm.plugin.game.luggage.page.l lVar;
        if (tabItem == null || (lVar = this.f139507g) == null) {
            return;
        }
        lVar.a0(tabItem.f141156d, tabItem.f141167r, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f141156d, tabItem.f141167r, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = this.f141219n;
        int i18 = configuration.orientation;
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "orientation:%d", java.lang.Integer.valueOf(i18));
            p53.u uVar = this.f141216h;
            if (uVar != null) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget = uVar.getGameTabWidget();
                gameTabWidget.getClass();
                gameTabWidget.post(new com.tencent.mm.plugin.game.ui.chat_tab.s0(gameTabWidget));
            }
            this.f141219n = configuration.orientation;
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "onCreate");
        com.tencent.mm.plugin.game.luggage.page.f fVar = this.f139504d;
        if (fVar == null) {
            finish();
            return;
        }
        this.f141216h = com.tencent.mm.plugin.game.ui.chat_tab.r0.a(this, fVar.f406662c);
        this.f141218m = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        this.f141217i = getIntent().getStringExtra("game_tab_key");
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141218m;
        if (gameTabData2 != null) {
            java.util.Iterator it = ((java.util.ArrayList) gameTabData2.a()).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) it.next();
                if (tabItem.f141166q == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f141167r) && !tabItem.f141156d.equalsIgnoreCase(this.f141217i) && !tabItem.f141170u) {
                    this.f139504d.f406662c.postDelayed(new com.tencent.mm.plugin.game.ui.chat_tab.t1(this, tabItem), tabItem.f141171v * 1000);
                }
            }
        }
        com.tencent.mm.plugin.game.luggage.page.f fVar2 = this.f139504d;
        ((sd.u) fVar2.f406669j).f406653a.f406665f.f336585d = this;
        android.widget.FrameLayout frameLayout = fVar2.f406662c;
        if (frameLayout instanceof android.view.ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new com.tencent.mm.plugin.game.ui.chat_tab.z1(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "float page index1:%d", java.lang.Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f141216h);
                frameLayout.addView(this.f141216h, indexOfChild);
            }
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f141221p;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 4);
        }
        this.f141222q.alive();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(1), com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.class, f141215r);
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "onDestroy");
        unregisterReceiver(this.f141221p);
        this.f141222q.dead();
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(2), com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.class, null);
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f141217i;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f141217i = stringExtra;
            android.content.Intent intent2 = getIntent();
            java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("game_tab_entrance_msgid") : "";
            com.tencent.mm.plugin.game.model.e1 p17 = !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra2) : ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
            if (p17 != null) {
                p17.t0();
                if (this.f141217i.equals(p17.M2.f140524b)) {
                    ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.field_gameMsgId);
                } else if (this.f141216h != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.w1(this, p17));
                }
            }
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141218m;
            if (gameTabData2 == null || this.f139507g == null) {
                return;
            }
            Y6((com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) gameTabData2.f141151d.get(stringExtra), false);
            this.f139507g.W(stringExtra);
            p53.u uVar = this.f141216h;
            if (uVar != null) {
                uVar.bringToFront();
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.f141220o) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(3), com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.class, f141215r);
        }
        this.f141220o = false;
        if (this.f141218m.f141155h != null) {
            getWindow().setNavigationBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1792);
            if (com.tencent.mm.ui.bl.f(this)) {
                this.f141216h.post(new com.tencent.mm.plugin.game.ui.chat_tab.x1(this));
            }
        }
    }

    @Override // nf.i
    public boolean r6() {
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(this);
        return true;
    }
}
