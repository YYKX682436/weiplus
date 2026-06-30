package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class ChatRoomListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView implements com.tencent.mm.modelbase.u0 {

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f138900t2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f138901f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.j0 f138902g2;

    /* renamed from: h2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView f138903h2;

    /* renamed from: i2, reason: collision with root package name */
    public int f138904i2;

    /* renamed from: j2, reason: collision with root package name */
    public long f138905j2;

    /* renamed from: k2, reason: collision with root package name */
    public long f138906k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.List f138907l2;

    /* renamed from: m2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f138908m2;

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse f138909n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom f138910o2;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f138911p2;

    /* renamed from: q2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138912q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138913r2;

    /* renamed from: s2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138914s2;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$2, reason: invalid class name */
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
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.chatroom.view.c0(this, chatRoomJoinOrQuitEvent2));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$3, reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShowMultiTaskEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -722797207;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ShowMultiTaskEvent showMultiTaskEvent) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.d0 d0Var = new com.tencent.mm.plugin.game.chatroom.view.d0(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(d0Var, 1000L, false);
            return false;
        }
    }

    public ChatRoomListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138907l2 = new java.util.LinkedList();
        this.f138911p2 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f138912q2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.1
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
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.this;
                    chatRoomListView.f138910o2 = localMyChatRoom;
                    chatRoomListView.f138902g2.z(localMyChatRoom.my_chatroom_info_list);
                }
                return false;
            }
        };
        this.f138913r2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass2(a0Var);
        this.f138914s2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass3(a0Var);
        n1(context);
    }

    public final synchronized void l1(com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse, boolean z17) {
        if (getCanJoinChatroomResponse == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = 0;
        objArr[0] = java.lang.Boolean.valueOf(z17);
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> linkedList = getCanJoinChatroomResponse.chatroom_info_list;
        if (linkedList != null) {
            i17 = linkedList.size();
        }
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "attachRecommendData, useCache:%b  rec chatroom_info_list.size = %d", objArr);
        if (!getCanJoinChatroomResponse.show_entrance) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "show_entrance: false");
            d43.b.f226411d.b();
            com.tencent.mm.plugin.game.chatroom.view.j0 j0Var = this.f138902g2;
            ((java.util.concurrent.CopyOnWriteArrayList) j0Var.f139179d).clear();
            j0Var.notifyDataSetChanged();
            i1(this.f138903h2);
            return;
        }
        this.f138908m2 = getCanJoinChatroomResponse.create_jump_info;
        com.tencent.mm.game.report.g.f68195a.k(1003L, 2L, 1L, 0L, this.f138906k2, this.f138905j2, "", "", "");
        this.f138902g2.B(getCanJoinChatroomResponse.chatroom_info_list);
        if (getCanJoinChatroomResponse.ban_action_list != null) {
            ((java.util.LinkedList) this.f138907l2).clear();
            ((java.util.LinkedList) this.f138907l2).addAll(getCanJoinChatroomResponse.ban_action_list);
            this.f138903h2.c(getCanJoinChatroomResponse.find_more_chatroom_jump_info, getCanJoinChatroomResponse.chatroom_rank_jump_info);
        }
    }

    public void m1() {
        if (this.f138911p2) {
            return;
        }
        this.f138911p2 = true;
        if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 0)) > 0) {
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getfirstenterinfo";
        lVar.f70667d = 5139;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70664a = new com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoRequest();
        lVar.f70665b = new com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.game.chatroom.view.f0(this), false);
    }

    public final void n1(android.content.Context context) {
        this.f138901f2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f138905j2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f138906k2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        if (activity.getIntent().getBooleanExtra("game_from_chatroom_detail", false)) {
            p1();
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator(null);
        com.tencent.mm.plugin.game.chatroom.view.j0 j0Var = new com.tencent.mm.plugin.game.chatroom.view.j0(this);
        this.f138902g2 = j0Var;
        setAdapter(j0Var);
        this.f138903h2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomFooterView(this.f138901f2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "one min footer height:%d", java.lang.Integer.valueOf(this.f138904i2));
        this.f138903h2.post(new com.tencent.mm.plugin.game.chatroom.view.e0(this));
    }

    public final void o1(int i17) {
        com.tencent.mm.game.report.g.f68195a.k(1004L, 0L, 1L, i17, this.f138906k2, this.f138905j2, "", "", "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_FIRST_ENTER_INT, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm0.j1.d().a(4631, this);
        this.f138913r2.alive();
        this.f138912q2.alive();
        this.f138914s2.alive();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm0.j1.d().q(4631, this);
        this.f138913r2.dead();
        this.f138912q2.dead();
        this.f138914s2.dead();
        com.tencent.mm.plugin.game.chatroom.view.j1.a();
        if (this.f138909n2 != null) {
            com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
            am.we weVar = gamePBCacheEvent.f54369g;
            weVar.f8278a = 2;
            weVar.f8279b = "cache_chatroom_recommend";
            try {
                weVar.f8280c = this.f138909n2.toByteArray();
            } catch (java.io.IOException unused) {
            }
            gamePBCacheEvent.e();
        }
        if (this.f138910o2 != null) {
            com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent2 = new com.tencent.mm.autogen.events.GamePBCacheEvent();
            am.we weVar2 = gamePBCacheEvent2.f54369g;
            weVar2.f8278a = 2;
            weVar2.f8279b = "cache_my_chatroom";
            try {
                weVar2.f8280c = this.f138910o2.toByteArray();
            } catch (java.io.IOException unused2) {
            }
            gamePBCacheEvent2.e();
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 4631 && i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse) ((v33.i) m1Var).f433118e.f70711b.f70700a;
            this.f138909n2 = getCanJoinChatroomResponse;
            l1(getCanJoinChatroomResponse, false);
        }
    }

    public final void p1() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_MULTI_TASK_EDU_INT;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c17.m(u3Var, 0));
        android.app.Activity activity = (android.app.Activity) this.f138901f2;
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
        s33.y.h(this.f138901f2, jumpInfo);
        gm0.j1.u().c().x(u3Var, 1);
    }

    public ChatRoomListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138907l2 = new java.util.LinkedList();
        this.f138911p2 = false;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f138912q2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetChatRoomMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.1
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
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.this;
                    chatRoomListView.f138910o2 = localMyChatRoom;
                    chatRoomListView.f138902g2.z(localMyChatRoom.my_chatroom_info_list);
                }
                return false;
            }
        };
        this.f138913r2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass2(a0Var);
        this.f138914s2 = new com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass3(a0Var);
        n1(context);
    }
}
