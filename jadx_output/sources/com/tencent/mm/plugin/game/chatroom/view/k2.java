package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139201d;

    public k2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139201d = gameChatCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139201d;
        if (gameChatCommentFooter.D != null) {
            java.lang.String obj = gameChatCommentFooter.f138944n.getText().toString();
            if (gameChatCommentFooter.f138941h.getVisibility() == 0 && (gameChatCommentFooter.f138941h.getTag() instanceof com.tencent.mm.plugin.game.autogen.chatroom.Channel)) {
                i17 = ((com.tencent.mm.plugin.game.autogen.chatroom.Channel) gameChatCommentFooter.f138941h.getTag()).channel_id;
            } else {
                com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = gameChatCommentFooter.f138939J;
                i17 = channel != null ? channel.channel_id : 0;
            }
            com.tencent.mm.plugin.game.chatroom.view.q2 q2Var = gameChatCommentFooter.D;
            gameChatCommentFooter.getClass();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : obj.split("@")) {
                int indexOf = str.indexOf(8197);
                if (indexOf > 0) {
                    java.lang.String substring = str.substring(0, indexOf);
                    java.util.Iterator it = ((java.util.HashMap) gameChatCommentFooter.E).entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            java.lang.String str2 = (java.lang.String) entry.getKey();
                            if (((java.util.List) entry.getValue()).contains(substring)) {
                                hashSet.add(str2);
                                break;
                            }
                        }
                    }
                }
            }
            q2Var.a(obj, new java.util.LinkedList(hashSet), i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
