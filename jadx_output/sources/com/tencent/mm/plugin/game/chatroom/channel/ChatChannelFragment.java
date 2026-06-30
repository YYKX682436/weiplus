package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class ChatChannelFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements u33.l {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f138708d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.GameChatListView f138709e;

    /* renamed from: f, reason: collision with root package name */
    public final int f138710f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Channel f138711g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f138712h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f138713i;

    /* renamed from: m, reason: collision with root package name */
    public int f138714m;

    /* renamed from: p, reason: collision with root package name */
    public u33.h f138717p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo f138718q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f138719r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f138720s;

    /* renamed from: t, reason: collision with root package name */
    public long f138721t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.autogen.events.NewUserNoticeEvent f138722u;

    /* renamed from: n, reason: collision with root package name */
    public boolean f138715n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f138716o = -1;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138723v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NewUserNoticeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment.1
        {
            this.__eventId = 86036039;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent) {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView;
            com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent2 = newUserNoticeEvent;
            int i17 = newUserNoticeEvent2.f54535g.f6778a;
            com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment.this;
            if (i17 == 1) {
                if (!chatChannelFragment.f138715n || (gameChatListView = chatChannelFragment.f138709e) == null) {
                    chatChannelFragment.f138722u = newUserNoticeEvent2;
                } else {
                    gameChatListView.u1(newUserNoticeEvent2);
                    chatChannelFragment.f138722u = null;
                }
            } else if (i17 == 2) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = chatChannelFragment.f138709e;
                if (gameChatListView2 != null && gameChatListView2.f138976v2.getTag() != null) {
                    gameChatListView2.f138976v2.setTag(null);
                    android.view.View view = gameChatListView2.f138976v2;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                chatChannelFragment.f138722u = null;
            }
            return false;
        }
    };

    public ChatChannelFragment(java.lang.String str, int i17) {
        this.f138713i = str;
        this.f138710f = i17;
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f138709e;
        if (gameChatListView != null) {
            gameChatListView.I(map);
        }
    }

    @Override // u33.l
    public void c0(int i17) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f138709e;
        if (gameChatListView != null) {
            gameChatListView.getClass();
        }
    }

    public final void j0() {
        if (this.f138715n) {
            l0(false);
        }
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f138709e;
        if (gameChatListView != null) {
            if (this.f138715n) {
                com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent = this.f138722u;
                gameChatListView.K2 = gameChatListView.f138974t2;
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "onResume, channelId:%d", java.lang.Integer.valueOf(gameChatListView.f138967m2));
                gameChatListView.L2 = true;
                gameChatListView.u1(newUserNoticeEvent);
                this.f138722u = null;
                return;
            }
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "onPause, channelId:%d", java.lang.Integer.valueOf(gameChatListView.f138967m2));
            gameChatListView.L2 = false;
            if (gameChatListView.f138967m2 == 0) {
                gameChatListView.f138960f2.z(2, true, false);
            }
            if (gameChatListView.f138976v2.getTag() != null) {
                com.tencent.mm.autogen.events.NewUserNoticeEvent newUserNoticeEvent2 = new com.tencent.mm.autogen.events.NewUserNoticeEvent();
                newUserNoticeEvent2.f54535g.f6778a = 2;
                newUserNoticeEvent2.e();
            }
        }
    }

    public final void l0(boolean z17) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView;
        com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg localCacheChatMsg;
        if (this.f138708d == null || this.f138709e != null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatChannelFragment", "ChatChannelFragment initChatList, channelId:%d", java.lang.Integer.valueOf(this.f138714m));
        ((android.view.ViewStub) this.f138708d.findViewById(com.tencent.mm.R.id.f487581p24)).inflate();
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = (com.tencent.mm.plugin.game.chatroom.view.GameChatListView) this.f138708d.findViewById(com.tencent.mm.R.id.f485102gj5);
        this.f138709e = gameChatListView2;
        java.lang.String str = this.f138713i;
        gameChatListView2.setChatRoomInfo(str);
        this.f138709e.t1(this.f138714m, this.f138712h);
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView3 = this.f138709e;
        android.view.View view = this.f138708d;
        boolean z18 = true;
        if (gameChatListView3.f138976v2 == null) {
            gameChatListView3.f138976v2 = view.findViewById(com.tencent.mm.R.id.osu);
            gameChatListView3.f138977w2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.osv);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ost);
            gameChatListView3.f138978x2 = imageView;
            if (!(gameChatListView3.f138967m2 == 0)) {
                imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_previous);
            }
            android.view.View view2 = gameChatListView3.f138976v2;
            if (view2 != null) {
                view2.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.u2(gameChatListView3));
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.a5u);
            gameChatListView3.f138979y2 = findViewById;
            findViewById.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.v2(gameChatListView3));
            gameChatListView3.f138980z2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a5v);
        }
        this.f138709e.getFirstPageData();
        u33.h hVar = this.f138717p;
        if (hVar != null) {
            this.f138717p = hVar;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView4 = this.f138709e;
            if (gameChatListView4 != null) {
                gameChatListView4.setHostContact(hVar);
            }
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo = this.f138718q;
        if (chatroomJumpInfo != null) {
            this.f138718q = chatroomJumpInfo;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView5 = this.f138709e;
            if (gameChatListView5 != null) {
                gameChatListView5.setChatRoomJumpInfo(chatroomJumpInfo);
            }
        }
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.f138719r;
        if (jumpInfo != null) {
            this.f138719r = jumpInfo;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView6 = this.f138709e;
            if (gameChatListView6 != null) {
                gameChatListView6.setPreloadInfo(jumpInfo);
            }
        }
        java.lang.String str2 = this.f138720s;
        if (str2 != null) {
            this.f138720s = str2;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView7 = this.f138709e;
            if (gameChatListView7 != null) {
                gameChatListView7.setPremadeCardInfo(str2);
            }
        }
        long j17 = this.f138721t;
        if (j17 != 0) {
            this.f138721t = j17;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView8 = this.f138709e;
            if (gameChatListView8 != null) {
                gameChatListView8.setJumpFirstSeq(j17);
            }
        }
        j0();
        if (!z17 || this.f138716o != -1 || (gameChatListView = this.f138709e) == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
        am.we weVar = gamePBCacheEvent.f54369g;
        weVar.f8278a = 1;
        weVar.f8279b = "cache_game_chat_msg#" + str + gameChatListView.I2;
        gamePBCacheEvent.e();
        byte[] bArr = weVar.f8280c;
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            return;
        }
        try {
            localCacheChatMsg = new com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg();
        } catch (java.io.IOException unused) {
            localCacheChatMsg = null;
        }
        try {
            localCacheChatMsg.parseFrom(bArr);
        } catch (java.io.IOException unused2) {
            z18 = false;
            if (localCacheChatMsg == null) {
            } else {
                return;
            }
        }
        if (localCacheChatMsg == null && z18) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "addLastCacheData, user cache, channelId:%d", java.lang.Integer.valueOf(gameChatListView.f138967m2));
            u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(localCacheChatMsg.host_user_name);
            gameChatListView.f138972r2 = Bi;
            if (Bi != null) {
                gameChatListView.o1(localCacheChatMsg.chatroom_msg_list, 8, null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.f138723v.alive();
        if (this.f138708d == null) {
            this.f138708d = layoutInflater.inflate(com.tencent.mm.R.layout.f488381rs, viewGroup, false);
            this.f138716o = ((android.app.Activity) viewGroup.getContext()).getIntent().getIntExtra("target_channel_id", -1);
            int i17 = this.f138714m;
            boolean z17 = (i17 == 0) || i17 == this.f138710f;
            if (z17) {
                try {
                    l0(z17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("GameChatRoom.ChatChannelFragment", "err:" + e17.getMessage());
                }
            }
        }
        return this.f138708d;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f138723v.dead();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        this.f138715n = z17;
        j0();
    }
}
