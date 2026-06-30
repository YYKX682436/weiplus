package d43;

/* loaded from: classes4.dex */
public final class b implements u33.e {

    /* renamed from: d, reason: collision with root package name */
    public static final d43.b f226411d;

    /* renamed from: e, reason: collision with root package name */
    public static final b43.d f226412e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom f226413f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f226414g;

    /* renamed from: h, reason: collision with root package name */
    public static long f226415h;

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice f226416i;

    static {
        d43.b bVar = new d43.b();
        f226411d = bVar;
        f226412e = new b43.d(s33.i.KEEP_ALIVE_TYPE_GET_MY_CHAT_ROOM, bVar);
    }

    public final void a(java.lang.String str) {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) m17);
        if ((com.tencent.mm.plugin.game.commlib.i.b() != null && com.tencent.mm.plugin.game.commlib.i.b().f324063d) || ((r17 > 0L ? 1 : (r17 == 0L ? 0 : -1)) != 0 && (java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.H1(r17)) > 172800L ? 1 : (java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.H1(r17)) == 172800L ? 0 : -1)) < 0)) {
            b43.d dVar = f226412e;
            dVar.f17802d = this;
            synchronized (dVar) {
                try {
                    dVar.f17808m = str == null ? "" : str;
                    com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive, topChatRoomName:%s", str);
                    if (dVar.f17805g) {
                        com.tencent.mm.sdk.platformtools.Log.c("GameChatRoom.GetMyChatRoomKeepAliveService", "service exist", new java.lang.Object[0]);
                    } else {
                        dVar.f17805g = true;
                        com.tencent.mm.sdk.platformtools.Log.c("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive success", new java.lang.Object[0]);
                        gm0.j1.d().a(4989, dVar);
                        dVar.a(null, dVar.f17808m, "");
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
        }
    }

    public final void b() {
        b43.d dVar = f226412e;
        synchronized (dVar) {
            com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "stopKeepAlive");
            dVar.f17802d = null;
            dVar.f17805g = false;
            dVar.f17806h = false;
            dVar.f17807i = false;
            dVar.f17808m = "";
            dVar.f17809n = "";
            dVar.f17810o = 2;
            ((java.util.LinkedList) dVar.f17811p).clear();
            gm0.j1.d().q(4989, dVar);
            if (dVar.f17804f != null) {
                gm0.j1.d().d(dVar.f17804f);
            }
        }
        f226413f = null;
        f226416i = null;
        f226414g = false;
    }

    @Override // u33.e
    public void w3(s33.i iVar, com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = (com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom) fVar;
        if ((iVar == null ? -1 : d43.a.f226410a[iVar.ordinal()]) != 1 || localMyChatRoom == null) {
            return;
        }
        f226413f = localMyChatRoom;
        if (f226416i == null) {
            f226416i = localMyChatRoom.my_chatroom_notice;
        }
        f226414g = false;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(localMyChatRoom.my_chatroom_info_list)) {
            java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> it = localMyChatRoom.my_chatroom_info_list.iterator();
            while (it.hasNext()) {
                if (it.next().unread_msg_count > 0) {
                    f226414g = true;
                    f226415h = java.lang.System.currentTimeMillis();
                }
            }
        }
        com.tencent.mm.autogen.events.GetChatRoomMsgEvent getChatRoomMsgEvent = new com.tencent.mm.autogen.events.GetChatRoomMsgEvent();
        getChatRoomMsgEvent.f54384g.f7246a = localMyChatRoom.toByteArray();
        getChatRoomMsgEvent.e();
    }
}
