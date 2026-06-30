package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f141295a;

    /* renamed from: b, reason: collision with root package name */
    public p53.u f141296b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f141297c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.BroadcastReceiver f141298d = new com.tencent.mm.plugin.game.ui.chat_tab.m(this);

    /* renamed from: e, reason: collision with root package name */
    public final l75.q0 f141299e = new com.tencent.mm.plugin.game.ui.chat_tab.n(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.event.IListenerMStorage f141300f = new com.tencent.mm.pluginsdk.event.IListenerMStorage() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$7
        @Override // com.tencent.mm.pluginsdk.event.IListenerMStorage
        public void c(com.tencent.mm.sdk.event.IEvent iEvent) {
            if (iEvent instanceof com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent) {
                com.tencent.mm.plugin.game.ui.chat_tab.o.this.getClass();
            }
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f141301g;

    public o(com.tencent.mm.ui.MMActivity mMActivity) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f141301g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$8
            {
                this.__eventId = -2093822894;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent) {
                synchronized (this) {
                    com.tencent.mm.plugin.game.ui.chat_tab.o.this.getClass();
                }
                return false;
            }
        };
        this.f141295a = mMActivity;
    }

    public void a(android.view.View view, com.tencent.mm.plugin.game.ui.chat_tab.s1 s1Var) {
        m53.n4 n4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "gamelog.activity, ChatTabPresenter, onCreate");
        com.tencent.mm.ui.MMActivity mMActivity = this.f141295a;
        p53.u a17 = com.tencent.mm.plugin.game.ui.chat_tab.r0.a(mMActivity, view);
        this.f141296b = a17;
        if (a17 != null) {
            a17.post(new com.tencent.mm.plugin.game.ui.chat_tab.i(this, s1Var));
        }
        java.lang.String str = (com.tencent.mm.plugin.game.commlib.i.i() == null || (n4Var = com.tencent.mm.plugin.game.commlib.i.i().f323861f) == null) ? null : n4Var.f323929d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/gamelife/homepage.html";
        }
        this.f141297c = str;
        if (s1Var != null) {
            s1Var.b(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "profile entrance: %s", this.f141297c);
        mMActivity.setMMTitle(com.tencent.mm.R.string.fq7);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a18 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f141298d;
        if (a18) {
            mMActivity.registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            this.f141295a.registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 2);
        }
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).wi(this.f141299e);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.d(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141300f);
        this.f141301g.alive();
        mMActivity.setRequestedOrientation(1);
        p53.u uVar = this.f141296b;
        if (uVar != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget = uVar.getGameTabWidget();
            gameTabWidget.getClass();
            gameTabWidget.post(new com.tencent.mm.plugin.game.ui.chat_tab.s0(gameTabWidget));
        }
        vj5.a.a(view, mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw), true ^ com.tencent.mm.ui.uk.g(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw)));
        mMActivity.getSupportActionBar().j().setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
        mMActivity.setBackBtn(new com.tencent.mm.plugin.game.ui.chat_tab.j(this));
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onDestroy");
        android.content.BroadcastReceiver broadcastReceiver = this.f141298d;
        com.tencent.mm.ui.MMActivity mMActivity = this.f141295a;
        mMActivity.unregisterReceiver(broadcastReceiver);
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Vi(this.f141299e);
        com.tencent.mm.pluginsdk.event.IListenerMStorage.e(com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent.class.getName(), this.f141300f);
        this.f141301g.dead();
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(mMActivity);
    }

    public void c(android.content.Intent intent) {
        this.f141295a.overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onNewIntent");
        if (intent == null) {
            return;
        }
        this.f141295a.setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_entrance_msgid");
        java.lang.String stringExtra2 = intent.getStringExtra("game_tab_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        com.tencent.mm.plugin.game.model.e1 p17 = !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra) : ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
        if (p17 != null) {
            p17.t0();
            if (stringExtra2.equals(p17.M2.f140524b)) {
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.field_gameMsgId);
            } else if (this.f141296b != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.l(this, stringExtra2, p17));
            }
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onPause");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, java.lang.Long.valueOf(((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni().f470252b));
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onResume");
        if (((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_life_preload_profile_url, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "preload profile");
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.ui.chat_tab.k kVar = new com.tencent.mm.plugin.game.ui.chat_tab.k(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(kVar, 500L, false);
        }
    }
}
