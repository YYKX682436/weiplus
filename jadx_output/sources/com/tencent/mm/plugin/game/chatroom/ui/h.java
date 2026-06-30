package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes4.dex */
public class h implements android.view.View.OnLongClickListener {
    public h(com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
