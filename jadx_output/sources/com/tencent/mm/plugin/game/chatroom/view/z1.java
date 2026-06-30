package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class z1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139368d;

    public z1(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139368d = gameChatCommentFooter;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.P;
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139368d;
        gameChatCommentFooter.l(false);
        gameChatCommentFooter.f138956z = true;
        android.widget.ImageView imageView = gameChatCommentFooter.f138946p;
        android.graphics.drawable.Drawable drawable = gameChatCommentFooter.getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_sticker);
        com.tencent.mm.ui.uk.f(drawable, -1);
        imageView.setImageDrawable(drawable);
        gameChatCommentFooter.f138951u = 0;
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$16", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
