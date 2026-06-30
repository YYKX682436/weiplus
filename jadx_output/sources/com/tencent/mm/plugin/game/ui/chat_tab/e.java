package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.plugin.game.ui.chat_tab.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI f141262a;

    public e(com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI chatRoomTabUI) {
        this.f141262a = chatRoomTabUI;
    }

    @Override // com.tencent.mm.plugin.game.ui.chat_tab.s1
    public void a(int i17) {
        com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment;
        com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI chatRoomTabUI = this.f141262a;
        if (chatRoomTabUI.f141099o == null || (gameMsgNoticeFragment = chatRoomTabUI.f141100p) == null || !gameMsgNoticeFragment.isAdded() || !chatRoomTabUI.f141099o.isAdded()) {
            return;
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment gameRoomListFragment = chatRoomTabUI.f141099o;
        o43.c cVar = gameRoomListFragment.f141145f;
        kotlin.jvm.internal.o.d(cVar);
        android.view.ViewGroup.LayoutParams layoutParams = cVar.f342849b.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).bottomMargin = i17;
        }
        o43.c cVar2 = gameRoomListFragment.f141145f;
        kotlin.jvm.internal.o.d(cVar2);
        cVar2.f342849b.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment2 = chatRoomTabUI.f141100p;
        o43.a aVar = gameMsgNoticeFragment2.f141132e;
        kotlin.jvm.internal.o.d(aVar);
        android.view.ViewGroup.LayoutParams layoutParams2 = aVar.f342840c.getLayoutParams();
        if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin = i17;
        }
        o43.a aVar2 = gameMsgNoticeFragment2.f141132e;
        kotlin.jvm.internal.o.d(aVar2);
        aVar2.f342840c.setLayoutParams(layoutParams2);
    }

    @Override // com.tencent.mm.plugin.game.ui.chat_tab.s1
    public void b(java.lang.String str) {
    }
}
