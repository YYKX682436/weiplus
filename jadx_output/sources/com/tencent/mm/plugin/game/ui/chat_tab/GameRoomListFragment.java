package com.tencent.mm.plugin.game.ui.chat_tab;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameRoomListFragment extends com.tencent.mm.plugin.game.ui.chat_tab.AbsGameRoomFragment {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f141143d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141144e;

    /* renamed from: f, reason: collision with root package name */
    public o43.c f141145f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f141146g = jz5.h.b(new com.tencent.mm.plugin.game.ui.chat_tab.f0(this));

    public GameRoomListFragment(java.lang.String str, boolean z17) {
        this.f141143d = str;
        this.f141144e = z17;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.bhi, viewGroup, false);
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = (com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView) x4.b.a(inflate, com.tencent.mm.R.id.f485138gp1);
        if (chatRoomListView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.tencent.mm.R.id.f485138gp1)));
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        this.f141145f = new o43.c(frameLayout, chatRoomListView);
        kotlin.jvm.internal.o.f(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f141145f = null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea) ((jz5.n) this.f141146g).getValue()).f141111d.l1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0097  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r7, r0)
            super.onViewCreated(r7, r8)
            o43.c r7 = r6.f141145f
            kotlin.jvm.internal.o.d(r7)
            jz5.g r8 = r6.f141146g
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea r8 = (com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea) r8
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f342849b
            r7.addHeaderView(r8)
            o43.c r7 = r6.f141145f
            kotlin.jvm.internal.o.d(r7)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f342849b
            r7.getClass()
            com.tencent.mm.autogen.events.GamePBCacheEvent r8 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r8.<init>()
            am.we r0 = r8.f54369g
            r1 = 1
            r0.f8278a = r1
            java.lang.String r2 = "cache_chatroom_recommend"
            r0.f8279b = r2
            r8.e()
            byte[] r8 = r0.f8280c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.M0(r8)
            r2 = 0
            r3 = 0
            java.lang.String r4 = "MicroMsg.ChatRoomListView"
            if (r0 != 0) goto L5c
            com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse r0 = new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse     // Catch: java.io.IOException -> L4e
            r0.<init>()     // Catch: java.io.IOException -> L4e
            r0.parseFrom(r8)     // Catch: java.io.IOException -> L4f
            r8 = r1
            goto L50
        L4e:
            r0 = r2
        L4f:
            r8 = r3
        L50:
            if (r0 == 0) goto L5c
            if (r8 == 0) goto L5c
            java.lang.String r8 = "recommend chatroom, user cache"
            com.tencent.mars.xlog.Log.i(r4, r8)
            r7.l1(r0, r1)
        L5c:
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r8 = d43.b.f226413f
            if (r8 == 0) goto L68
            java.lang.String r0 = "use prefetch my chatroom data"
            com.tencent.mars.xlog.Log.i(r4, r0)
            r3 = r1
            goto L95
        L68:
            com.tencent.mm.autogen.events.GamePBCacheEvent r8 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r8.<init>()
            am.we r0 = r8.f54369g
            r0.f8278a = r1
            java.lang.String r5 = "cache_my_chatroom"
            r0.f8279b = r5
            r8.e()
            byte[] r8 = r0.f8280c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.M0(r8)
            if (r0 != 0) goto L8e
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r0 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom     // Catch: java.io.IOException -> L8b
            r0.<init>()     // Catch: java.io.IOException -> L8b
            r0.parseFrom(r8)     // Catch: java.io.IOException -> L8c
            r8 = r0
            r3 = r1
            goto L90
        L8b:
            r0 = r2
        L8c:
            r8 = r0
            goto L90
        L8e:
            r3 = r1
            r8 = r2
        L90:
            java.lang.String r0 = "local my chatroom, user cache"
            com.tencent.mars.xlog.Log.i(r4, r0)
        L95:
            if (r8 == 0) goto La8
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r8.my_chatroom_info_list
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.L0(r0)
            if (r0 != 0) goto La8
            if (r3 == 0) goto La8
            com.tencent.mm.plugin.game.chatroom.view.j0 r7 = r7.f138902g2
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r8 = r8.my_chatroom_info_list
            r7.z(r8)
        La8:
            d43.b r7 = d43.b.f226411d
            b43.d r8 = d43.b.f226412e
            r8.f17810o = r1
            java.lang.String r8 = r6.f141143d
            r7.a(r8)
            v33.i r7 = new v33.i
            r7.<init>(r2)
            com.tencent.mm.modelbase.r1 r8 = gm0.j1.d()
            r8.g(r7)
            boolean r7 = r6.f141144e
            if (r7 == 0) goto Lcd
            o43.c r7 = r6.f141145f
            kotlin.jvm.internal.o.d(r7)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r7 = r7.f342849b
            r7.m1()
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
