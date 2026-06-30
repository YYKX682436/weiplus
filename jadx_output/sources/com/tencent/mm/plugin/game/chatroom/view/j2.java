package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139188d;

    public j2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139188d = gameChatCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139188d;
        gameChatCommentFooter.f138941h.setVisibility(8);
        com.tencent.mm.plugin.game.chatroom.view.p2 p2Var = gameChatCommentFooter.H;
        p2Var.f139256a = false;
        p2Var.f139258c = null;
        p2Var.f139257b = false;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
