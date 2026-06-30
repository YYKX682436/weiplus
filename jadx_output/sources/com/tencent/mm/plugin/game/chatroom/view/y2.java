package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class y2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f139359d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f139360e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatListView f139361f;

    public y2(com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView) {
        this.f139361f = gameChatListView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139361f;
            if (gameChatListView.B2 != null) {
                if (gameChatListView.D2 && this.f139360e == gameChatListView.f138960f2.getItemCount() - 1) {
                    com.tencent.mm.plugin.game.chatroom.view.j3 j3Var = gameChatListView.B2;
                    com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = gameChatListView.f138960f2;
                    com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView2 = ((com.tencent.mm.plugin.game.chatroom.view.r2) j3Var).f139277a;
                    gameChatListView2.D2 = false;
                    if (i3Var.f139166e.size() > 0) {
                        j17 = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139166e.get(r4.size() - 1)).seq;
                    } else {
                        j17 = 0;
                    }
                    long j18 = j17;
                    com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatListView", "onBottomLoadMore, bottomSeq:%d", java.lang.Long.valueOf(j18));
                    gm0.j1.d().g(new v33.e(gameChatListView2.f138966l2, j18, 0L, 2, 0L, gameChatListView2.f138967m2));
                }
                boolean z17 = gameChatListView.f138967m2 == 1;
                if (gameChatListView.C2) {
                    if (this.f139359d < (z17 ? 1 : 50)) {
                        ((com.tencent.mm.plugin.game.chatroom.view.r2) gameChatListView.B2).a(gameChatListView.f138960f2);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
        this.f139359d = linearLayoutManager.w();
        this.f139360e = linearLayoutManager.y();
        int childCount = linearLayoutManager.getChildCount();
        int itemCount = linearLayoutManager.getItemCount();
        int i19 = childCount + this.f139359d;
        com.tencent.mm.plugin.game.chatroom.view.GameChatListView gameChatListView = this.f139361f;
        if (i19 >= itemCount) {
            gameChatListView.f138973s2 = true;
            gameChatListView.f138960f2.z(1, false, true);
        } else {
            gameChatListView.f138973s2 = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$9", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
