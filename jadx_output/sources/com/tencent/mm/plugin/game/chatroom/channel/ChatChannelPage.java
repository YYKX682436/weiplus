package com.tencent.mm.plugin.game.chatroom.channel;

/* loaded from: classes15.dex */
public class ChatChannelPage extends android.widget.LinearLayout implements u33.l, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f138725d;

    /* renamed from: e, reason: collision with root package name */
    public long f138726e;

    /* renamed from: f, reason: collision with root package name */
    public long f138727f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f138728g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f138729h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f138730i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.channel.a f138731m;
    private com.tencent.mm.ui.base.CustomViewPager mViewPager;

    /* renamed from: n, reason: collision with root package name */
    public u33.k f138732n;

    /* renamed from: o, reason: collision with root package name */
    public int f138733o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f138734p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f138735q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo f138736r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f138737s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138738t;

    /* renamed from: u, reason: collision with root package name */
    public int f138739u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138740v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f138741w;

    public ChatChannelPage(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138738t = false;
        this.f138739u = -1;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f138740v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.5
            {
                this.__eventId = -409260457;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChatRoomLocateInfoEvent chatRoomLocateInfoEvent) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage = com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.this;
                am.d2 d2Var = chatRoomLocateInfoEvent.f54039g;
                chatChannelPage.e(d2Var.f6428a, d2Var.f6429b, d2Var.f6430c, d2Var.f6431d);
                return false;
            }
        };
        this.f138741w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetCurrentChannelEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.6
            {
                this.__eventId = 891116138;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetCurrentChannelEvent getCurrentChannelEvent) {
                getCurrentChannelEvent.f54389g.f7710a = com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.this.f138733o;
                return false;
            }
        };
        android.content.Context context2 = getContext();
        this.f138725d = context2;
        this.f138726e = ((android.app.Activity) context2).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f138727f = ((android.app.Activity) this.f138725d).getIntent().getLongExtra("game_report_ssid", 0L);
        this.f138739u = ((android.app.Activity) this.f138725d).getIntent().getIntExtra("target_channel_id", -1);
        ((android.app.Activity) this.f138725d).getIntent().getLongExtra("target_seq", -1L);
        ((android.app.Activity) this.f138725d).getIntent().getBooleanExtra("is_real_time_room", false);
        android.view.LayoutInflater.from(this.f138725d).inflate(com.tencent.mm.R.layout.f488383ru, this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.nts);
        this.f138730i = viewGroup;
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.channel.b(this));
        this.mViewPager = (com.tencent.mm.ui.base.CustomViewPager) findViewById(com.tencent.mm.R.id.p1t);
        this.f138731m = new com.tencent.mm.plugin.game.chatroom.channel.a(((com.tencent.mm.ui.MMFragmentActivity) this.f138725d).getSupportFragmentManager());
    }

    public static void b(com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage chatChannelPage, oa.i iVar, boolean z17) {
        chatChannelPage.getClass();
        android.view.View view = iVar.f343783f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487198nv2);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nvc);
        if (z17) {
            textView2.setVisibility(8);
        }
        textView.setTextColor(chatChannelPage.f138725d.getResources().getColor(z17 ? com.tencent.mm.R.color.BW_100_Alpha_0_8 : com.tencent.mm.R.color.BW_100_Alpha_0_5));
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            aVar.I(map);
        }
    }

    public final void c() {
        this.f138733o = 0;
        this.f138729h.setVisibility(8);
        int count = this.f138731m.getCount();
        ((java.util.ArrayList) this.f138731m.f138745m).clear();
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = new com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment(this.f138735q, this.f138739u);
        com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = new com.tencent.mm.plugin.game.autogen.chatroom.Channel();
        channel.channel_id = 0;
        chatChannelFragment.f138711g = channel;
        chatChannelFragment.f138714m = 0;
        chatChannelFragment.f138712h = null;
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
        if (gameChatListView != null) {
            gameChatListView.t1(0, null);
        }
        ((java.util.ArrayList) this.f138731m.f138745m).add(chatChannelFragment);
        if (this.mViewPager.getAdapter() == null) {
            this.mViewPager.setAdapter(this.f138731m);
        }
        if (count != 0) {
            this.f138731m.notifyDataSetChanged();
        }
        this.mViewPager.setCurrentItem(0);
    }

    @Override // u33.l
    public void c0(int i17) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            aVar.c0(i17);
        }
    }

    public final android.view.View d(com.tencent.mm.plugin.game.autogen.chatroom.Channel channel) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f138725d).inflate(com.tencent.mm.R.layout.f488382rt, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487198nv2);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nvc);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = channel.channel_id;
        if (!(i17 == 0)) {
            if (!(i17 == 1)) {
                stringBuffer.append("# ");
            }
        }
        stringBuffer.append(channel.name);
        textView.setText(stringBuffer);
        if (channel.unread_msg_count != 0) {
            textView2.setVisibility(0);
            textView2.setText("+" + channel.unread_msg_count);
        } else {
            textView2.setVisibility(8);
        }
        return inflate;
    }

    public void e(int i17, long j17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment b17;
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView;
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar == null || this.mViewPager == null) {
            return;
        }
        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment b18 = aVar.b(i17);
        int indexOf = b18 != null ? ((java.util.ArrayList) aVar.f138745m).indexOf(b18) : -1;
        if (indexOf < 0) {
            return;
        }
        this.mViewPager.setCurrentItem(indexOf);
        if (z18 || (b17 = this.f138731m.b(i17)) == null || (gameChatListView = b17.f138709e) == null) {
            return;
        }
        gameChatListView.r1(j17, z17);
    }

    public void f() {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next()).f138709e;
                if (gameChatListView != null) {
                    gameChatListView.s1();
                }
            }
        }
    }

    public synchronized void g(java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo, boolean z17) {
        u33.k kVar;
        if (channelInfo != null) {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(channelInfo.channel_list)) {
                    com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo2 = this.f138736r;
                    if (channelInfo2 != null && e43.f.a(channelInfo2, channelInfo)) {
                        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatChannelPage", "setData channelInfo is same");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("GameChatRoom.ChatChannelPage", "channel tab init");
                    this.f138736r = channelInfo;
                    this.f138734p = true;
                    boolean z18 = false;
                    this.f138729h.setVisibility(0);
                    this.f138729h.n();
                    this.f138729h.K.clear();
                    this.f138729h.a(new com.tencent.mm.plugin.game.chatroom.channel.d(this));
                    this.mViewPager.addOnPageChangeListener(new oa.j(this.f138729h));
                    if (this.f138731m.getCount() != 0 && (kVar = this.f138732n) != null) {
                        kVar.a(true, "");
                        this.f138732n.b(false, null, false);
                    }
                    int count = this.f138731m.getCount();
                    ((java.util.ArrayList) this.f138731m.f138745m).clear();
                    for (int i17 = 0; i17 < channelInfo.channel_list.size(); i17++) {
                        com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = channelInfo.channel_list.get(i17);
                        int i18 = this.f138739u;
                        if (i18 == channel.channel_id) {
                            channelInfo.default_channel_id = i18;
                        }
                    }
                    int i19 = 0;
                    int i27 = 0;
                    while (i19 < channelInfo.channel_list.size()) {
                        com.tencent.mm.plugin.game.autogen.chatroom.Channel channel2 = channelInfo.channel_list.get(i19);
                        oa.i l17 = this.f138729h.l();
                        l17.f343783f = d(channel2);
                        l17.f();
                        this.f138729h.d(l17, z18);
                        com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = new com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment(str, channelInfo.default_channel_id);
                        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> linkedList = channelInfo.channel_list;
                        chatChannelFragment.f138711g = channel2;
                        int i28 = channel2.channel_id;
                        chatChannelFragment.f138714m = i28;
                        chatChannelFragment.f138712h = linkedList;
                        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                        if (gameChatListView != null) {
                            gameChatListView.t1(i28, linkedList);
                        }
                        ((java.util.ArrayList) this.f138731m.f138745m).add(chatChannelFragment);
                        int i29 = channelInfo.default_channel_id;
                        int i37 = channel2.channel_id;
                        if (i29 == i37) {
                            i27 = i19;
                        }
                        i19++;
                        com.tencent.mm.game.report.g.f68195a.o(i19, 1L, this.f138727f, this.f138726e, i37);
                        l17.f343778a = java.lang.Integer.valueOf(i19);
                        i27 = i27;
                        z18 = false;
                    }
                    if (count != 0) {
                        this.f138731m.notifyDataSetChanged();
                    }
                    this.mViewPager.setOffscreenPageLimit(20);
                    if (this.mViewPager.getAdapter() == null) {
                        this.mViewPager.setAdapter(this.f138731m);
                    }
                    this.f138729h.k(i27).b();
                    return;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        if (!z17) {
            c();
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel getRookieChannel() {
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> linkedList;
        com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo = this.f138736r;
        if (channelInfo == null || (linkedList = channelInfo.channel_list) == null) {
            return null;
        }
        java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.Channel> it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.game.autogen.chatroom.Channel next = it.next();
            if (next.channel_id == 2) {
                return next;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm0.j1.d().a(4383, this);
        gm0.j1.d().a(4569, this);
        gm0.j1.d().a(4989, this);
        gm0.j1.d().a(4565, this);
        this.f138740v.alive();
        this.f138741w.alive();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm0.j1.d().q(4383, this);
        gm0.j1.d().q(4569, this);
        gm0.j1.d().q(4989, this);
        gm0.j1.d().q(4565, this);
        this.f138740v.dead();
        this.f138741w.dead();
        if (this.f138736r != null && this.f138735q != null) {
            com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
            am.we weVar = gamePBCacheEvent.f54369g;
            weVar.f8278a = 2;
            weVar.f8279b = "cache_game_chat_msg#" + this.f138735q + "#channel";
            try {
                weVar.f8280c = this.f138736r.toByteArray();
            } catch (java.io.IOException unused) {
            }
            gamePBCacheEvent.e();
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f138737s;
        if (z2Var != null) {
            z2Var.B();
            this.f138737s = null;
        }
        this.f138738t = false;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse getMyChatroomResponse;
        com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo;
        com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest voteMsgRequest;
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var;
        int type = m1Var.getType();
        if (type == 4383) {
            boolean z17 = ((com.tencent.mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenRequest) ((v33.u) m1Var).f433151e.f70710a.f70684a).is_chosen;
            if (i17 == 0 && i18 == 0) {
                db5.t7.h(this.f138725d, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(z17 ? com.tencent.mm.R.string.axu : com.tencent.mm.R.string.axw));
                return;
            } else {
                db5.t7.g(this.f138725d, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(z17 ? com.tencent.mm.R.string.axt : com.tencent.mm.R.string.axv));
                return;
            }
        }
        com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
        if (type == 4569) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 1);
            v33.y yVar = (v33.y) m1Var;
            com.tencent.mm.protobuf.f fVar2 = yVar.f433160e.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
            com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest voteMsgRequest2 = (com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest) fVar2;
            com.tencent.mm.protobuf.f fVar3 = yVar.f433160e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse");
            com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse voteMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse) fVar3;
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = voteMsgResponse.education_jump_info;
            if (jumpInfo != null) {
                s33.y.h(this.f138725d, jumpInfo);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo2 = voteMsgResponse.vote_info;
            if (voteInfo2 != null) {
                if (voteInfo2.voted_by_me) {
                    android.content.Context context = this.f138725d;
                    db5.t7.f(context, context.getString(com.tencent.mm.R.string.fw8), new com.tencent.mm.plugin.game.chatroom.channel.f(this));
                    voteInfo = voteInfo2;
                    voteMsgRequest = voteMsgRequest2;
                    fVar.h(yVar.f433163h.intValue(), 37L, this.f138727f, this.f138726e, yVar.f433161f.longValue(), yVar.f433162g, 0L, this.f138733o, voteMsgResponse.report_ext_info);
                } else {
                    voteInfo = voteInfo2;
                    voteMsgRequest = voteMsgRequest2;
                    fVar.h(yVar.f433163h.intValue(), 2L, this.f138727f, this.f138726e, yVar.f433161f.longValue(), yVar.f433162g, 0L, this.f138733o, voteMsgResponse.report_ext_info);
                }
                long j17 = voteMsgRequest.seq;
                com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
                if (aVar != null) {
                    java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = ((com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next()).f138709e;
                        if (gameChatListView != null && (i3Var = gameChatListView.f138960f2) != null) {
                            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.chatroom.view.f3(i3Var, j17, voteInfo));
                            java.util.Iterator it6 = ((java.util.HashSet) i3Var.f139170i).iterator();
                            while (it6.hasNext()) {
                                c43.x xVar = (c43.x) it6.next();
                                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                                if (chatroomMsgPack != null && chatroomMsgPack.seq == j17) {
                                    xVar.j(voteInfo);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (type == 4989) {
            v33.h hVar = (v33.h) m1Var;
            if (hVar.f433116f != 19527) {
                return;
            }
            this.f138738t = false;
            if (i17 != 0 || i18 != 0 || (getMyChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse) hVar.f433115e.f70711b.f70700a) == null || this.f138731m == null) {
                return;
            }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> linkedList = getMyChatroomResponse.my_chatroom_info_list;
            if (this.f138737s == null || com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                return;
            }
            this.f138737s.B();
            com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView gameChatRoomSelectView = new com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView(this.f138725d);
            gameChatRoomSelectView.setOnCloseListener(new com.tencent.mm.plugin.game.chatroom.channel.c(this));
            gameChatRoomSelectView.setData(linkedList);
            this.f138737s.k(gameChatRoomSelectView, 0, 0);
            this.f138737s.C();
            return;
        }
        if (type == 4565 && i17 == 0 && i18 == 0) {
            android.content.Context context2 = this.f138725d;
            db5.t7.h(context2, context2.getString(com.tencent.mm.R.string.fl9));
            v33.r rVar = (v33.r) m1Var;
            java.lang.Object value = rVar.f433144g.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.protobuf.f fVar4 = ((com.tencent.mm.modelbase.o) value).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
            com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse publishChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse) fVar4;
            com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo = publishChatroomMsgResponse.topic_info;
            if (topicInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(topicInfo.content_url)) {
                return;
            }
            com.tencent.mm.plugin.game.commlib.util.n.b(this.f138725d, publishChatroomMsgResponse.topic_info.content_url, -1, false, "");
            long j18 = this.f138727f;
            long j19 = this.f138726e;
            java.lang.Object value2 = rVar.f433144g.getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            com.tencent.mm.protobuf.f fVar5 = ((com.tencent.mm.modelbase.o) value2).f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
            fVar.g(22L, 7L, j18, j19, ((com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest) fVar5).seq, "", 0L, 1);
            long j27 = this.f138727f;
            long j28 = this.f138726e;
            java.lang.Object value3 = rVar.f433144g.getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            com.tencent.mm.protobuf.f fVar6 = ((com.tencent.mm.modelbase.o) value3).f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
            fVar.g(22L, 14L, j27, j28, ((com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest) fVar6).seq, "", 0L, 1);
        }
    }

    public void setChatRoomJumpInfo(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                chatChannelFragment.f138718q = chatroomJumpInfo;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null) {
                    gameChatListView.setChatRoomJumpInfo(chatroomJumpInfo);
                }
            }
        }
    }

    public void setHostContact(u33.h hVar) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                chatChannelFragment.f138717p = hVar;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null) {
                    gameChatListView.setHostContact(hVar);
                }
            }
        }
    }

    public void setJumpFirstSeq(long j17) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                chatChannelFragment.f138721t = j17;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null) {
                    gameChatListView.setJumpFirstSeq(j17);
                }
            }
        }
    }

    public void setPreloadInfo(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                chatChannelFragment.f138719r = jumpInfo;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null) {
                    gameChatListView.setPreloadInfo(jumpInfo);
                }
            }
        }
    }

    public void setPremadeCardInfo(java.lang.String str) {
        com.tencent.mm.plugin.game.chatroom.channel.a aVar = this.f138731m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f138745m).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment chatChannelFragment = (com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment) it.next();
                chatChannelFragment.f138720s = str;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = chatChannelFragment.f138709e;
                if (gameChatListView != null) {
                    gameChatListView.setPremadeCardInfo(str);
                }
            }
        }
    }

    public void setUICallback(u33.k kVar) {
        this.f138732n = kVar;
    }
}
