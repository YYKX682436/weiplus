package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI f141584d;

    public m(com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI gameMsgCenterUI) {
        this.f141584d = gameMsgCenterUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI gameMsgCenterUI = this.f141584d;
        gameMsgCenterUI.T6(0);
        com.tencent.mm.game.report.l.c(gameMsgCenterUI.getContext(), 13, 1303, 1, 2, gameMsgCenterUI.f141480d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
