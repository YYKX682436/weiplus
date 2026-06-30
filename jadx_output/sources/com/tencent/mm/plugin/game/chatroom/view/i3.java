package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class i3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f139165d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f139166e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f139167f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f139168g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f139169h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f139170i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final s33.h f139171m = new s33.h();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f139172n = new java.util.HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f139173o = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f139174p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f139175q = -1;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139176r;

    public i3(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139176r = gameChatListView;
    }

    public static boolean x(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        if (chatroomMsgPack != null) {
            u33.h hVar = i3Var.f139176r.f138972r2;
            if (hVar != null) {
                java.lang.String str = chatroomMsgPack.from_username;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ((y33.e) hVar).field_userName;
                if (str.equals(str2 != null ? str2 : "")) {
                    return true;
                }
            }
        } else {
            i3Var.getClass();
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00af. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021d A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0251 A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x029e A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a4 A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b2 A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b6 A[Catch: all -> 0x02db, TryCatch #0 {, blocks: (B:102:0x0006, B:107:0x0028, B:108:0x000d, B:109:0x0011, B:111:0x0017, B:4:0x002b, B:6:0x0032, B:9:0x003a, B:13:0x0044, B:19:0x0049, B:23:0x0053, B:24:0x0055, B:27:0x0064, B:29:0x006e, B:31:0x0075, B:32:0x007a, B:37:0x00b5, B:39:0x01fe, B:41:0x021d, B:43:0x0223, B:45:0x022d, B:47:0x0251, B:48:0x025f, B:53:0x027f, B:55:0x0287, B:57:0x029e, B:58:0x02a0, B:60:0x02a4, B:61:0x02aa, B:63:0x02b2, B:64:0x02cb, B:67:0x02b6, B:69:0x00c4, B:70:0x00f7, B:72:0x00ff, B:74:0x0115, B:76:0x011b, B:78:0x0132, B:80:0x013b, B:82:0x015f, B:83:0x0168, B:85:0x0186, B:86:0x018d, B:87:0x019f, B:89:0x01a5, B:90:0x01aa, B:92:0x01b4, B:94:0x01bf, B:95:0x01e1, B:97:0x01e7, B:98:0x01c2, B:99:0x01f2, B:100:0x01f8), top: B:101:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(com.tencent.mm.plugin.game.chatroom.view.i3 r10, java.util.List r11, int r12, long r13, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.i3.y(com.tencent.mm.plugin.game.chatroom.view.i3, java.util.List, int, long, java.util.List):void");
    }

    public final void B(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139176r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gameChatListView, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            gameChatListView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(gameChatListView, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = this.f139176r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gameChatListView2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            gameChatListView2.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(gameChatListView2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView3 = this.f139176r;
        if (i17 == 3) {
            if (gameChatListView3.f138960f2.getItemCount() > 0) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView4 = this.f139176r;
                int itemCount = gameChatListView4.f138960f2.getItemCount() - 1;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(itemCount));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(gameChatListView4, arrayList3.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                gameChatListView4.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(gameChatListView4, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                return;
            }
            return;
        }
        if (i17 == 4 && gameChatListView3.f138960f2.getItemCount() > 0) {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView5 = this.f139176r;
            int itemCount2 = gameChatListView5.f138960f2.getItemCount() - 1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(itemCount2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(gameChatListView5, arrayList4.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            gameChatListView5.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(gameChatListView5, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$GameChatRoomAdapter", "doScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    public final long E() {
        long j17 = this.f139175q;
        if (j17 != -1) {
            return j17;
        }
        for (int size = this.f139166e.size() - 1; size >= 1; size--) {
            long j18 = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139166e.get(size)).seq;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139176r;
            if (j18 > gameChatListView.f138975u2 && ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139166e.get(size - 1)).seq <= gameChatListView.f138975u2) {
                return ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139166e.get(size)).seq;
            }
        }
        return this.f139175q;
    }

    public final java.lang.String I(java.util.List list) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it.next()).seq);
            stringBuffer.append(",");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public final void J(java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139176r;
        if (gameChatListView.f138967m2 == 1) {
            long j17 = 0;
            long j18 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            for (int i17 = 0; i17 < list.size(); i17++) {
                long j19 = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) list.get(i17)).seq;
                if (j19 > j17) {
                    j17 = j19;
                }
                if (j19 < j18) {
                    j18 = j19;
                }
            }
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it.next();
                if (chatroomMsgPack.channel_id == gameChatListView.f138967m2) {
                    if (!gameChatListView.f138973s2 && list.size() != 0) {
                        long j27 = chatroomMsgPack.seq;
                        if (j27 >= j18 && j27 <= j17) {
                        }
                    }
                    list.add(chatroomMsgPack);
                } else {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (chatroomMsgPack.seq == ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it6.next()).seq) {
                                it6.remove();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void K(long j17) {
        for (com.tencent.mm.plugin.game.chatroom.view.k3 k3Var : this.f139176r.H2) {
            if (k3Var.f139202a.seq == j17) {
                k3Var.f139203b = true;
                return;
            }
        }
    }

    public final java.util.List L(java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list) && !com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it.next();
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) it6.next();
                    if (chatroomMsgPack.seq == chatroomMsgPack2.seq && ((msgOptions = chatroomMsgPack2.msg_options) == null || msgOptions.cli_local_data == null)) {
                        list2.set(list2.indexOf(chatroomMsgPack2), chatroomMsgPack);
                        arrayList.add(java.lang.Long.valueOf(chatroomMsgPack.seq));
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void M(java.lang.String str, int i17) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions;
        com.tencent.mm.protobuf.g gVar;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((java.util.concurrent.ConcurrentHashMap) this.f139168g).containsKey(str)) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) ((java.util.concurrent.ConcurrentHashMap) this.f139168g).get(str);
            int indexOf = this.f139166e.indexOf(chatroomMsgPack);
            if (indexOf >= 0 && (msgOptions = chatroomMsgPack.msg_options) != null && (gVar = msgOptions.cli_local_data) != null) {
                long b17 = kk.u.b(gVar.g());
                lt0.l lVar = s33.y.f402541a;
                com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions2 = chatroomMsgPack.msg_options;
                long j17 = i17 | (((int) ((b17 >> 4) & (-1))) << 4);
                byte[] bArr = new byte[8];
                for (int i18 = 0; i18 < 8; i18++) {
                    bArr[i18] = (byte) (j17 >> (i18 * 8));
                }
                byte[] bArr2 = new byte[8];
                for (int i19 = 0; i19 < 8; i19++) {
                    bArr2[i19] = bArr[7 - i19];
                }
                msgOptions2.cli_local_data = new com.tencent.mm.protobuf.g(bArr2, 0, 8);
                this.f139166e.set(indexOf, chatroomMsgPack);
                notifyItemChanged(indexOf);
            }
        }
    }

    public void N() {
        java.util.HashSet hashSet = (java.util.HashSet) this.f139170i;
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "updateUserStateInViewScope size:%d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c43.x xVar = (c43.x) it.next();
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = xVar.f38495m;
            if (chatroomMsgPack != null) {
                com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = chatroomMsgPack.msg_content;
            }
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139176r;
            java.util.Map map = gameChatListView.f138965k2;
            if (map != null) {
                java.util.HashMap hashMap = (java.util.HashMap) xVar.T;
                hashMap.clear();
                hashMap.putAll(map);
            }
            xVar.V = gameChatListView.f138971q2;
            xVar.B();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f139166e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) this.f139166e.get(i17);
        return s33.x.a(chatroomMsgPack.msg_type, chatroomMsgPack.msg_sub_type);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0254  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r38, int r39) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.i3.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup r8, int r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = r7.f139176r
            android.content.Context r0 = r0.f138961g2
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131497199(0x7f0c10ef, float:1.8617984E38)
            r2 = 0
            android.view.View r8 = r0.inflate(r1, r8, r2)
            java.lang.String r0 = "GameChatRoom.GameChatItemVH"
            java.util.Map r1 = s33.x.f402540a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L28
            c43.x r0 = new c43.x
            r0.<init>(r8, r9)
            goto L89
        L28:
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r2] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            r1.setAccessible(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            r3[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            r3[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            c43.x r1 = (c43.x) r1     // Catch: java.lang.reflect.InvocationTargetException -> L4d java.lang.InstantiationException -> L5c java.lang.IllegalAccessException -> L6b java.lang.NoSuchMethodException -> L7a
            r0 = r1
            goto L89
        L4d:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "err_4:%s"
            com.tencent.mars.xlog.Log.e(r0, r2, r1)
            goto L88
        L5c:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "err_3:%s"
            com.tencent.mars.xlog.Log.e(r0, r2, r1)
            goto L88
        L6b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "err_2:%s"
            com.tencent.mars.xlog.Log.e(r0, r2, r1)
            goto L88
        L7a:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "err_1:%s"
            com.tencent.mars.xlog.Log.e(r0, r2, r1)
        L88:
            r0 = 0
        L89:
            if (r0 != 0) goto L90
            c43.x r0 = new c43.x
            r0.<init>(r8, r9)
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.i3.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.k3");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        c43.x xVar = (c43.x) k3Var;
        ((java.util.HashSet) this.f139170i).remove(xVar);
        super.onViewRecycled(xVar);
    }

    public final void z(int i17, boolean z17, boolean z18) {
        if (this.f139176r.f138967m2 == 0) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.e3 e3Var = new com.tencent.mm.plugin.game.chatroom.view.e3(this, i17, z17, z18);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(e3Var, 200L, false);
        }
    }
}
