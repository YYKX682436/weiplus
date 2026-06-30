package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI f141309d;

    public s(com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI) {
        this.f141309d = gameChatTabUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI gameChatTabUI = this.f141309d;
        long intExtra = gameChatTabUI.getIntent().getIntExtra("game_report_from_scene", 0);
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
        gameLifeSessionStruct.f58340d = 2L;
        gameLifeSessionStruct.f58341e = 201L;
        gameLifeSessionStruct.f58342f = 0L;
        gameLifeSessionStruct.f58343g = 7L;
        gameLifeSessionStruct.f58344h = intExtra;
        gameLifeSessionStruct.k();
        r53.f.u(gameChatTabUI, gameChatTabUI.f141119q);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
