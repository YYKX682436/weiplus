package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class GameChatListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView implements com.tencent.mm.modelbase.u0, u33.l {
    public androidx.recyclerview.widget.LinearLayoutManager A2;
    public com.tencent.mm.plugin.game.chatroom.view.j3 B2;
    public boolean C2;
    public boolean D2;
    public final java.util.Map E2;
    public java.util.List F2;
    public boolean G2;
    public final java.util.List H2;
    public java.lang.String I2;
    public long J2;
    public long K2;
    public boolean L2;
    public long M2;
    public final com.tencent.mm.sdk.event.IListener N2;
    public final com.tencent.mm.sdk.event.IListener O2;
    public final com.tencent.mm.sdk.event.IListener P2;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.i3 f138960f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f138961g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f138962h2;

    /* renamed from: i2, reason: collision with root package name */
    public long f138963i2;

    /* renamed from: j2, reason: collision with root package name */
    public int f138964j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Map f138965k2;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f138966l2;

    /* renamed from: m2, reason: collision with root package name */
    public int f138967m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.util.List f138968n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo f138969o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo f138970p2;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f138971q2;

    /* renamed from: r2, reason: collision with root package name */
    public u33.h f138972r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f138973s2;

    /* renamed from: t2, reason: collision with root package name */
    public long f138974t2;

    /* renamed from: u2, reason: collision with root package name */
    public long f138975u2;

    /* renamed from: v2, reason: collision with root package name */
    public android.view.View f138976v2;

    /* renamed from: w2, reason: collision with root package name */
    public android.widget.TextView f138977w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.widget.ImageView f138978x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f138979y2;

    /* renamed from: z2, reason: collision with root package name */
    public android.widget.TextView f138980z2;

    public GameChatListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138964j2 = 1;
        this.f138965k2 = new java.util.HashMap();
        this.f138973s2 = true;
        this.f138974t2 = 0L;
        this.f138975u2 = 0L;
        this.C2 = true;
        this.D2 = true;
        this.E2 = new java.util.concurrent.ConcurrentHashMap();
        this.F2 = new java.util.concurrent.CopyOnWriteArrayList();
        this.G2 = true;
        this.H2 = new java.util.LinkedList();
        this.J2 = -1L;
        this.K2 = 0L;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.N2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyNewMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.1
            {
                this.__eventId = -175316448;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyNewMsgEvent notifyNewMsgEvent) {
                com.tencent.mm.autogen.events.NotifyNewMsgEvent notifyNewMsgEvent2 = notifyNewMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this;
                if (!(gameChatListView.f138967m2 == 0)) {
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView.n1(gameChatListView, notifyNewMsgEvent2.f54550g.f8201a);
                }
                return false;
            }
        };
        this.O2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CancelTickleMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.2
            {
                this.__eventId = 2055016665;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CancelTickleMsgEvent cancelTickleMsgEvent) {
                com.tencent.mm.autogen.events.CancelTickleMsgEvent cancelTickleMsgEvent2 = cancelTickleMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this.f138960f2;
                if (i3Var == null) {
                    return false;
                }
                long j17 = cancelTickleMsgEvent2.f54028g.f7860a;
                java.util.Iterator it = i3Var.f139166e.iterator();
                int i17 = -1;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it.next();
                    if (chatroomMsgPack.seq == j17) {
                        i17 = i3Var.f139166e.indexOf(chatroomMsgPack);
                        it.remove();
                    }
                }
                if (i17 == -1) {
                    return false;
                }
                i3Var.notifyItemRemoved(i17);
                return false;
            }
        };
        this.P2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TickleSomeoneMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.3
            {
                this.__eventId = -688779323;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TickleSomeoneMsgEvent tickleSomeoneMsgEvent) {
                java.lang.Object obj;
                com.tencent.mm.autogen.events.TickleSomeoneMsgEvent tickleSomeoneMsgEvent2 = tickleSomeoneMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this;
                if (gameChatListView.f138960f2 == null || com.tencent.mm.sdk.platformtools.t8.K0(tickleSomeoneMsgEvent2.f54890g.f8227a)) {
                    return false;
                }
                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = gameChatListView.f138960f2;
                java.lang.String userName = tickleSomeoneMsgEvent2.f54890g.f8227a;
                java.util.Set boundViewHolders = i3Var.f139170i;
                java.util.HashMap hashMap = c43.e1.f38420a;
                kotlin.jvm.internal.o.g(boundViewHolders, "boundViewHolders");
                kotlin.jvm.internal.o.g(userName, "userName");
                java.util.Iterator it = ((java.util.HashSet) boundViewHolders).iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        c43.x xVar = (c43.x) next;
                        long j17 = kotlin.jvm.internal.o.b(xVar.f38495m.from_username, userName) ? xVar.f38495m.seq : 0L;
                        do {
                            java.lang.Object next2 = it.next();
                            c43.x xVar2 = (c43.x) next2;
                            long j18 = kotlin.jvm.internal.o.b(xVar2.f38495m.from_username, userName) ? xVar2.f38495m.seq : 0L;
                            if (j17 < j18) {
                                next = next2;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                c43.x xVar3 = (c43.x) obj;
                if (xVar3 == null) {
                    return false;
                }
                xVar3.o(c43.e1.b(xVar3.S, xVar3.f38495m.from_username));
                return false;
            }
        };
        q1(context);
    }

    public static void m1(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        gameChatListView.getClass();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.game.chatroom.view.x2 x2Var = new com.tencent.mm.plugin.game.chatroom.view.x2(gameChatListView);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(x2Var, 1000L, false);
    }

    public static void n1(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView, int i17) {
        synchronized (gameChatListView) {
            android.view.View view = gameChatListView.f138976v2;
            if (view != null && view.getTag() == null) {
                if (i17 > 0) {
                    if (gameChatListView.f138976v2.getVisibility() == 8) {
                        com.tencent.mm.game.report.g.f68195a.g(14L, 1L, gameChatListView.f138963i2, gameChatListView.f138962h2, 0L, "", 0L, gameChatListView.f138967m2);
                    }
                    android.view.View view2 = gameChatListView.f138976v2;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (gameChatListView.f138967m2 == 0) {
                        gameChatListView.f138978x2.setImageResource(com.tencent.mm.R.raw.game_chat_tips_icon_down);
                    } else {
                        gameChatListView.f138978x2.setImageResource(com.tencent.mm.R.raw.icons_filled_previous);
                    }
                    if (i17 >= 1000) {
                        gameChatListView.f138977w2.setText(gameChatListView.f138961g2.getString(com.tencent.mm.R.string.fnw));
                    } else {
                        gameChatListView.f138977w2.setText(gameChatListView.f138961g2.getString(com.tencent.mm.R.string.foh, java.lang.Integer.valueOf(i17)));
                    }
                } else {
                    android.view.View view3 = gameChatListView.f138976v2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoticeTag(com.tencent.mm.plugin.game.chatroom.view.k3 k3Var) {
        if (k3Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "setNoticeTag, Seq:%d, text:%s", java.lang.Long.valueOf(k3Var.f139202a.seq), k3Var.f139202a.notice_text);
        android.view.View view = this.f138979y2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            boolean z17 = false;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f138980z2.setText(k3Var.f139202a.notice_text);
            com.tencent.mm.game.report.g.f68195a.g(2L, 1L, this.f138963i2, this.f138962h2, k3Var.f139202a.seq, "", 0L, this.f138967m2);
            this.f138979y2.setTag(java.lang.Long.valueOf(k3Var.f139202a.seq));
            ((java.util.concurrent.ConcurrentHashMap) this.E2).clear();
            com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f138960f2;
            long j17 = k3Var.f139202a.seq;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) i3Var.f139176r.getLayoutManager();
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "notifyAtEvent, atSeq:%d, firstVisibleItem:%d, lastVisibleItem:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
            while (true) {
                if (w17 <= y17) {
                    if (w17 >= 0 && w17 < i3Var.f139166e.size() && ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139166e.get(w17)).seq == j17) {
                        i3Var.notifyItemChanged(w17);
                        z17 = true;
                        break;
                    }
                    w17++;
                } else {
                    break;
                }
            }
            if (z17) {
                return;
            }
            long j18 = k3Var.f139202a.seq - 2;
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "pre fetch at page, seq:%d", java.lang.Long.valueOf(j18));
            gm0.j1.d().g(new v33.e(this.f138966l2, j18, 0L, 6, k3Var.f139202a.seq, this.f138967m2));
        }
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        if (map != null) {
            java.util.Map map2 = this.f138965k2;
            ((java.util.HashMap) map2).clear();
            ((java.util.HashMap) map2).putAll(map);
            this.f138960f2.N();
        }
    }

    @Override // u33.l
    public void c0(int i17) {
    }

    public void getFirstPageData() {
        int i17 = this.f138967m2;
        if (i17 == 0) {
            return;
        }
        gm0.j1.d().g(new v33.e(this.f138966l2, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 3, 0L, i17));
    }

    public final void o1(java.util.List list, int i17, java.util.List list2) {
        if (list == null) {
            return;
        }
        com.tencent.mm.plugin.game.chatroom.view.i3.y(this.f138960f2, list, i17, 0L, list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm0.j1.d().a(4562, this);
        gm0.j1.d().a(4565, this);
        this.N2.alive();
        this.O2.alive();
        this.P2.alive();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        java.util.Collection<? extends com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList;
        super.onDetachedFromWindow();
        gm0.j1.d().q(4562, this);
        gm0.j1.d().q(4565, this);
        this.N2.dead();
        this.O2.dead();
        this.P2.dead();
        java.util.List list = this.f138960f2.f139166e;
        if (this.f138972r2 == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f138966l2)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            linkedList = new java.util.LinkedList<>();
        } else {
            linkedList = list.subList(list.size() > 20 ? list.size() - 20 : 0, list.size());
        }
        com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg localCacheChatMsg = new com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg();
        localCacheChatMsg.chatroom_msg_list.addAll(linkedList);
        localCacheChatMsg.host_user_name = ((y33.e) this.f138972r2).field_userName;
        com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
        am.we weVar = gamePBCacheEvent.f54369g;
        weVar.f8278a = 2;
        weVar.f8279b = "cache_game_chat_msg#" + this.f138966l2 + this.I2;
        try {
            weVar.f8280c = localCacheChatMsg.toByteArray();
        } catch (java.io.IOException unused) {
        }
        gamePBCacheEvent.e();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int type = m1Var.getType();
        if (type != 4562) {
            if (type == 4565 && i17 == 0 && i18 == 0) {
                v33.r rVar = (v33.r) m1Var;
                java.lang.Object value = rVar.f433144g.getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) value).f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f138960f2;
                long j17 = rVar.f433142e;
                com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo = ((com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse) fVar).topic_info;
                i3Var.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.chatroom.view.g3(i3Var, j17, topicInfo));
                java.util.Iterator it = ((java.util.HashSet) i3Var.f139170i).iterator();
                while (it.hasNext()) {
                    c43.x xVar = (c43.x) it.next();
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
                    if (chatroomMsgPack != null && chatroomMsgPack.seq == j17) {
                        xVar.l(topicInfo, j17, true);
                    }
                }
                return;
            }
            return;
        }
        v33.e eVar = (v33.e) m1Var;
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "GetGameChatRoomMsg callback, localChannelId:%d, requestChannelId:%d", java.lang.Integer.valueOf(this.f138967m2), java.lang.Integer.valueOf(((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest) eVar.f433106e.f70710a.f70684a).channel_id));
        int i19 = this.f138967m2;
        com.tencent.mm.modelbase.o oVar = eVar.f433106e;
        if (i19 != ((com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest) oVar.f70710a.f70684a).channel_id) {
            return;
        }
        int i27 = eVar.f433107f;
        if (i27 == 1) {
            this.C2 = true;
        } else if (i27 == 2) {
            this.D2 = true;
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse getChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse) oVar.f70711b.f70700a;
            if (i27 == 6) {
                if (com.tencent.mm.sdk.platformtools.t8.L0(getChatroomMsgResponse.msg_pack_list)) {
                    return;
                }
                ((java.util.concurrent.ConcurrentHashMap) this.E2).put(java.lang.Long.valueOf(eVar.f433108g), getChatroomMsgResponse.msg_pack_list);
                return;
            }
            if (i27 != 4) {
                o1(getChatroomMsgResponse.msg_pack_list, i27, null);
                return;
            }
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList = getChatroomMsgResponse.msg_pack_list;
            long j18 = eVar.f433108g;
            if (linkedList == null) {
                return;
            }
            com.tencent.mm.plugin.game.chatroom.view.i3.y(this.f138960f2, linkedList, i27, j18, null);
        }
    }

    public synchronized void p1(java.util.List list, java.util.List list2, long j17, java.util.List list3) {
        if (this.G2) {
            this.C2 = true;
            this.D2 = true;
            this.f138973s2 = true;
            this.f138974t2 = 0L;
            this.K2 = 0L;
            this.f138975u2 = j17;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("noticeMsgList:[");
            if (!com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg noticeMsg = (com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg) it.next();
                    com.tencent.mm.plugin.game.chatroom.view.k3 k3Var = new com.tencent.mm.plugin.game.chatroom.view.k3(null);
                    k3Var.f139202a = noticeMsg;
                    ((java.util.LinkedList) this.H2).add(k3Var);
                    stringBuffer.append("(seq:" + noticeMsg.seq + ", text:" + noticeMsg.notice_text + ", highlight:" + noticeMsg.highlight + ") ");
                }
            }
            stringBuffer.append("]");
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "lastReceiveSeq:%d, %s", java.lang.Long.valueOf(this.f138975u2), stringBuffer.toString());
            com.tencent.mm.autogen.events.JumpTargetEvent jumpTargetEvent = new com.tencent.mm.autogen.events.JumpTargetEvent();
            jumpTargetEvent.f54450g.f8565a = true;
            jumpTargetEvent.e();
        }
        this.f138960f2.L(list3, this.F2);
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) this.E2).entrySet()) {
            long longValue = ((java.lang.Long) entry.getKey()).longValue();
            java.util.List list4 = (java.util.List) entry.getValue();
            this.f138960f2.L(list3, list4);
            ((java.util.concurrent.ConcurrentHashMap) this.E2).put(java.lang.Long.valueOf(longValue), list4);
        }
        o1(list, 3, list3);
    }

    public final void q1(android.content.Context context) {
        this.f138961g2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f138962h2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f138963i2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        this.A2 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setItemAnimator(null);
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = new com.tencent.mm.plugin.game.chatroom.view.i3(this);
        this.f138960f2 = i3Var;
        i3Var.setHasStableIds(true);
        setAdapter(this.f138960f2);
        i(new com.tencent.mm.plugin.game.chatroom.view.y2(this));
        this.B2 = new com.tencent.mm.plugin.game.chatroom.view.r2(this);
    }

    public void r1(long j17, boolean z17) {
        if (j17 < 0) {
            this.f138976v2.setTag(null);
            this.f138976v2.performClick();
            return;
        }
        if (z17) {
            this.J2 = j17;
        }
        java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) this.E2).get(java.lang.Long.valueOf(j17));
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "locatePosition, request msg, seq:%d", java.lang.Long.valueOf(j17));
            gm0.j1.d().g(new v33.e(this.f138966l2, j17 - 2, 0L, 4, j17, this.f138967m2));
        } else {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "locatePosition, use prefetch msg, seq:%d", java.lang.Long.valueOf(j17));
            if (list == null) {
                return;
            }
            com.tencent.mm.plugin.game.chatroom.view.i3.y(this.f138960f2, list, 4, j17, null);
        }
    }

    public void s1() {
        int w17 = this.A2.w();
        int y17 = this.A2.y();
        int itemCount = this.f138960f2.getItemCount() - 1;
        if (itemCount < w17 || itemCount > y17) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.A2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(itemCount));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        post(new com.tencent.mm.plugin.game.chatroom.view.w2(this, itemCount));
    }

    public void setChatRoomInfo(java.lang.String str) {
        this.f138966l2 = str;
        com.tencent.mm.game.report.g.f68195a.d(1304L, this.f138963i2, this.f138962h2);
    }

    public void setChatRoomJumpInfo(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo) {
        this.f138970p2 = chatroomJumpInfo;
    }

    public void setHostContact(u33.h hVar) {
        this.f138972r2 = hVar;
    }

    public void setJumpFirstSeq(long j17) {
        this.M2 = j17;
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f138960f2;
        if (i3Var != null) {
            java.util.Iterator it = ((java.util.HashSet) i3Var.f139170i).iterator();
            while (it.hasNext()) {
                ((c43.x) it.next()).Y = i3Var.f139176r.M2;
            }
        }
    }

    public void setPreloadInfo(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.f138969o2 = jumpInfo;
    }

    public void setPremadeCardInfo(java.lang.String str) {
        this.f138971q2 = str;
        this.f138960f2.N();
    }

    public void t1(int i17, java.util.List list) {
        java.lang.String str;
        this.f138967m2 = i17;
        if (i17 == 0) {
            str = "";
        } else {
            str = "#" + this.f138967m2;
        }
        this.I2 = str;
        this.f138968n2 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r2 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void u1(com.tencent.mm.autogen.events.NewUserNoticeEvent r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.u1(com.tencent.mm.autogen.events.NewUserNoticeEvent):void");
    }

    public GameChatListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138964j2 = 1;
        this.f138965k2 = new java.util.HashMap();
        this.f138973s2 = true;
        this.f138974t2 = 0L;
        this.f138975u2 = 0L;
        this.C2 = true;
        this.D2 = true;
        this.E2 = new java.util.concurrent.ConcurrentHashMap();
        this.F2 = new java.util.concurrent.CopyOnWriteArrayList();
        this.G2 = true;
        this.H2 = new java.util.LinkedList();
        this.J2 = -1L;
        this.K2 = 0L;
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.N2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyNewMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.1
            {
                this.__eventId = -175316448;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyNewMsgEvent notifyNewMsgEvent) {
                com.tencent.mm.autogen.events.NotifyNewMsgEvent notifyNewMsgEvent2 = notifyNewMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this;
                if (!(gameChatListView.f138967m2 == 0)) {
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView.n1(gameChatListView, notifyNewMsgEvent2.f54550g.f8201a);
                }
                return false;
            }
        };
        this.O2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CancelTickleMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.2
            {
                this.__eventId = 2055016665;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CancelTickleMsgEvent cancelTickleMsgEvent) {
                com.tencent.mm.autogen.events.CancelTickleMsgEvent cancelTickleMsgEvent2 = cancelTickleMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this.f138960f2;
                if (i3Var == null) {
                    return false;
                }
                long j17 = cancelTickleMsgEvent2.f54028g.f7860a;
                java.util.Iterator it = i3Var.f139166e.iterator();
                int i172 = -1;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it.next();
                    if (chatroomMsgPack.seq == j17) {
                        i172 = i3Var.f139166e.indexOf(chatroomMsgPack);
                        it.remove();
                    }
                }
                if (i172 == -1) {
                    return false;
                }
                i3Var.notifyItemRemoved(i172);
                return false;
            }
        };
        this.P2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TickleSomeoneMsgEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.3
            {
                this.__eventId = -688779323;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TickleSomeoneMsgEvent tickleSomeoneMsgEvent) {
                java.lang.Object obj;
                com.tencent.mm.autogen.events.TickleSomeoneMsgEvent tickleSomeoneMsgEvent2 = tickleSomeoneMsgEvent;
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = com.tencent.mm.plugin.game.chatroom.view.GameChatListView.this;
                if (gameChatListView.f138960f2 == null || com.tencent.mm.sdk.platformtools.t8.K0(tickleSomeoneMsgEvent2.f54890g.f8227a)) {
                    return false;
                }
                com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = gameChatListView.f138960f2;
                java.lang.String userName = tickleSomeoneMsgEvent2.f54890g.f8227a;
                java.util.Set boundViewHolders = i3Var.f139170i;
                java.util.HashMap hashMap = c43.e1.f38420a;
                kotlin.jvm.internal.o.g(boundViewHolders, "boundViewHolders");
                kotlin.jvm.internal.o.g(userName, "userName");
                java.util.Iterator it = ((java.util.HashSet) boundViewHolders).iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        c43.x xVar = (c43.x) next;
                        long j17 = kotlin.jvm.internal.o.b(xVar.f38495m.from_username, userName) ? xVar.f38495m.seq : 0L;
                        do {
                            java.lang.Object next2 = it.next();
                            c43.x xVar2 = (c43.x) next2;
                            long j18 = kotlin.jvm.internal.o.b(xVar2.f38495m.from_username, userName) ? xVar2.f38495m.seq : 0L;
                            if (j17 < j18) {
                                next = next2;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                c43.x xVar3 = (c43.x) obj;
                if (xVar3 == null) {
                    return false;
                }
                xVar3.o(c43.e1.b(xVar3.S, xVar3.f38495m.from_username));
                return false;
            }
        };
        q1(context);
    }
}
