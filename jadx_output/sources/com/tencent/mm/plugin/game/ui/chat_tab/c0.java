package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f141245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment f141246e;

    public c0(android.view.View view, com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f141245d = view;
        this.f141246e = gameMsgNoticeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("game_msg_center_tab_type", 2);
        java.lang.Integer num = null;
        j45.l.j(this.f141245d.getContext(), "game", ".ui.message.GameMsgCenterUI", intent, null);
        java.lang.Object tag = view.getTag();
        if (tag != null) {
            num = java.lang.Integer.valueOf(tag instanceof java.lang.Integer ? ((java.lang.Number) tag).intValue() : 0);
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 21, 2101, 2, 6, (int) e63.a.f249817a, this.f141246e.j0(num));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
