package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139217d;

    public l2(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139217d = gameChatCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state onClick:");
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139217d;
        sb6.append(gameChatCommentFooter.f138951u);
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatCommentFooter", sb6.toString());
        int i17 = gameChatCommentFooter.f138951u;
        com.tencent.mm.ui.MMActivity mMActivity = gameChatCommentFooter.f138940g;
        if (i17 == 0) {
            gameChatCommentFooter.f138944n.requestFocus();
            gameChatCommentFooter.f138956z = false;
            mMActivity.hideVKB();
            gameChatCommentFooter.f138951u = 1;
            boolean z17 = gameChatCommentFooter.f138948r;
            gameChatCommentFooter.f138949s.i();
            if (com.tencent.mm.sdk.platformtools.d2.j(gameChatCommentFooter.getContext())) {
                int j17 = com.tencent.mm.ui.bk.j(gameChatCommentFooter.getContext());
                com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatCommentFooter", "is show key board %d, %d, %d", java.lang.Integer.valueOf(gameChatCommentFooter.f138953w), java.lang.Integer.valueOf(gameChatCommentFooter.f138952v), java.lang.Integer.valueOf(j17));
                int i18 = gameChatCommentFooter.f138953w;
                if (i18 > 0 && i18 < gameChatCommentFooter.f138952v - j17) {
                    gameChatCommentFooter.getInputPanelHelper().e(new com.tencent.mm.plugin.game.chatroom.view.h2(gameChatCommentFooter, z17));
                    android.widget.ImageView imageView = gameChatCommentFooter.f138946p;
                    android.graphics.drawable.Drawable drawable = gameChatCommentFooter.getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_keyboard);
                    com.tencent.mm.ui.uk.f(drawable, -1);
                    imageView.setImageDrawable(drawable);
                }
            }
            if (z17) {
                gameChatCommentFooter.o();
            } else {
                gameChatCommentFooter.f138949s.setVisibility(0);
            }
            android.widget.ImageView imageView2 = gameChatCommentFooter.f138946p;
            android.graphics.drawable.Drawable drawable2 = gameChatCommentFooter.getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_keyboard);
            com.tencent.mm.ui.uk.f(drawable2, -1);
            imageView2.setImageDrawable(drawable2);
        } else {
            gameChatCommentFooter.l(false);
            gameChatCommentFooter.f138944n.requestFocus();
            gameChatCommentFooter.f138956z = true;
            mMActivity.showVKB();
            gameChatCommentFooter.f138951u = 0;
            android.widget.ImageView imageView3 = gameChatCommentFooter.f138946p;
            android.graphics.drawable.Drawable drawable3 = gameChatCommentFooter.getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_sticker);
            com.tencent.mm.ui.uk.f(drawable3, -1);
            imageView3.setImageDrawable(drawable3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
