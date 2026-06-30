package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class y1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter f139358d;

    public y1(com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter) {
        this.f139358d = gameChatCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139358d;
        ck5.f b17 = ck5.f.b(gameChatCommentFooter.f138944n);
        b17.f42561f = 1;
        b17.f42560e = 1000;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.game.chatroom.view.a2(gameChatCommentFooter));
        java.lang.String obj = gameChatCommentFooter.f138944n.getText().toString();
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.g(gameChatCommentFooter, obj);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(obj);
        if (z17 == gameChatCommentFooter.B) {
            return;
        }
        gameChatCommentFooter.B = z17;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) gameChatCommentFooter.f138946p.getLayoutParams();
        if (z17) {
            layoutParams.setMarginStart(i65.a.h(gameChatCommentFooter.getContext(), com.tencent.mm.R.dimen.f479672c9));
            gameChatCommentFooter.f138946p.setLayoutParams(layoutParams);
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            valueAnimator.setIntValues(0, gameChatCommentFooter.A);
            valueAnimator.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.u1(this));
            valueAnimator.setDuration(150L);
            valueAnimator.addListener(new com.tencent.mm.plugin.game.chatroom.view.v1(this));
            valueAnimator.start();
            return;
        }
        layoutParams.setMarginStart(i65.a.h(gameChatCommentFooter.getContext(), com.tencent.mm.R.dimen.f479688cn));
        gameChatCommentFooter.f138946p.setLayoutParams(layoutParams);
        android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
        valueAnimator2.setIntValues(gameChatCommentFooter.A, 0);
        valueAnimator2.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.w1(this));
        valueAnimator2.setDuration(150L);
        valueAnimator2.addListener(new com.tencent.mm.plugin.game.chatroom.view.x1(this));
        valueAnimator2.start();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter = this.f139358d;
        com.tencent.mm.pluginsdk.ui.chat.g8 g8Var = gameChatCommentFooter.f138950t;
        if (g8Var != null) {
            com.tencent.mm.pluginsdk.ui.chat.ra raVar = (com.tencent.mm.pluginsdk.ui.chat.ra) g8Var;
            raVar.f190619j = true;
            raVar.a(valueOf, gameChatCommentFooter.G);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f138949s;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(gameChatCommentFooter.f138944n.getText().toString());
        }
    }
}
