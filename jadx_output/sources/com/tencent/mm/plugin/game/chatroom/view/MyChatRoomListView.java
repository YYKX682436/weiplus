package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class MyChatRoomListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: q2, reason: collision with root package name */
    public static final /* synthetic */ int f138999q2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f139000f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.x3 f139001g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f139002h2;

    /* renamed from: i2, reason: collision with root package name */
    public long f139003i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.List f139004j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom f139005k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f139006l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f139007m2;

    /* renamed from: n2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f139008n2;

    /* renamed from: o2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f139009o2;

    /* renamed from: p2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f139010p2;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$2, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent> {
        public AnonymousClass2(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 841969243;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent) {
            com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent2 = chatRoomJoinOrQuitEvent;
            int i17 = chatRoomJoinOrQuitEvent2.f54038g.f6302a;
            if (i17 == 1) {
                com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.this.getClass();
                return false;
            }
            if (i17 != 2) {
                return false;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.chatroom.view.t3(this, chatRoomJoinOrQuitEvent2));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView$3, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShowMultiTaskEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -722797207;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ShowMultiTaskEvent showMultiTaskEvent) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.u3 u3Var = new com.tencent.mm.plugin.game.chatroom.view.u3(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u3Var, 1000L, false);
            return false;
        }
    }

    public MyChatRoomListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139004j2 = new java.util.LinkedList();
        this.f139006l2 = false;
        this.f139007m2 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f139008n2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.1
            {
                this.__eventId = -2093822894;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent) {
                com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent2 = getChatRoomMsgEvent;
                synchronized (this) {
                    byte[] bArr = getChatRoomMsgEvent2.f54384g.f7246a;
                    com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom();
                    try {
                        localMyChatRoom.parseFrom(bArr);
                    } catch (java.io.IOException unused) {
                    }
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.this;
                    myChatRoomListView.f139005k2 = localMyChatRoom;
                    myChatRoomListView.f139001g2.z(localMyChatRoom.my_chatroom_info_list);
                }
                return false;
            }
        };
        this.f139009o2 = new com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.AnonymousClass2(a0Var);
        this.f139010p2 = new com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.AnonymousClass3(a0Var);
        l1(context);
    }

    public final void l1(android.content.Context context) {
        this.f139000f2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f139002h2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f139003i2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        this.f139006l2 = activity.getIntent().getBooleanExtra("game_from_chatroom_detail", false);
        this.f139007m2 = !kotlin.jvm.internal.o.b(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_exp_group_list_fold_android, "0"), "0");
        if (this.f139006l2) {
            m1();
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator(new com.tencent.mm.plugin.game.chatroom.view.o1());
        com.tencent.mm.plugin.game.chatroom.view.x3 x3Var = new com.tencent.mm.plugin.game.chatroom.view.x3(this, this.f139007m2);
        this.f139001g2 = x3Var;
        setAdapter(x3Var);
        i(new com.tencent.mm.plugin.game.chatroom.view.v3(this));
    }

    public final void m1() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_MULTI_TASK_EDU_INT;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c17.m(u3Var, 0));
        android.app.Activity activity = (android.app.Activity) this.f139000f2;
        if (q17 > 0 || activity.isFinishing() || activity.isDestroyed() || com.tencent.mm.plugin.game.commlib.i.b() == null || com.tencent.mm.plugin.game.commlib.i.b().f324064e == null || com.tencent.mm.plugin.game.commlib.i.b().f324064e.f323680e == null) {
            return;
        }
        m53.p3 p3Var = com.tencent.mm.plugin.game.commlib.i.b().f324064e.f323680e;
        m53.c6 c6Var = p3Var.f323964f;
        m53.f3 f3Var = p3Var.f323965g;
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
        jumpInfo.jump_url = p3Var.f323963e;
        jumpInfo.jump_type = p3Var.f323962d;
        if (c6Var != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = new com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo();
            weappJumpInfo.appid = c6Var.f323607d;
            weappJumpInfo.path = c6Var.f323608e;
            jumpInfo.weapp_jump_info = weappJumpInfo;
        }
        if (f3Var != null) {
            com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = new com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen();
            halfScreen.screen_height_dp = f3Var.f323677e;
            halfScreen.screen_height_percent = f3Var.f323678f;
            halfScreen.type = f3Var.f323676d;
            jumpInfo.half_screen = halfScreen;
        }
        s33.y.h(this.f139000f2, jumpInfo);
        gm0.j1.u().c().x(u3Var, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f139009o2.alive();
        this.f139008n2.alive();
        this.f139010p2.alive();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f139009o2.dead();
        this.f139008n2.dead();
        this.f139010p2.dead();
        com.tencent.mm.plugin.game.chatroom.view.j1.a();
        if (this.f139005k2 != null) {
            com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
            am.we weVar = gamePBCacheEvent.f54369g;
            weVar.f8278a = 2;
            weVar.f8279b = "cache_my_chatroom";
            try {
                weVar.f8280c = this.f139005k2.toByteArray();
            } catch (java.io.IOException unused) {
            }
            gamePBCacheEvent.e();
        }
    }

    public void setMyChatroomListener(com.tencent.mm.plugin.game.chatroom.view.y3 y3Var) {
    }

    public MyChatRoomListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f139004j2 = new java.util.LinkedList();
        this.f139006l2 = false;
        this.f139007m2 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f139008n2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.1
            {
                this.__eventId = -2093822894;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent) {
                com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent2 = getChatRoomMsgEvent;
                synchronized (this) {
                    byte[] bArr = getChatRoomMsgEvent2.f54384g.f7246a;
                    com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom();
                    try {
                        localMyChatRoom.parseFrom(bArr);
                    } catch (java.io.IOException unused) {
                    }
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.this;
                    myChatRoomListView.f139005k2 = localMyChatRoom;
                    myChatRoomListView.f139001g2.z(localMyChatRoom.my_chatroom_info_list);
                }
                return false;
            }
        };
        this.f139009o2 = new com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.AnonymousClass2(a0Var);
        this.f139010p2 = new com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.AnonymousClass3(a0Var);
        l1(context);
    }
}
