package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea f141303d;

    public p(com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea chatTabTopArea) {
        this.f141303d = chatTabTopArea;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea chatTabTopArea = this.f141303d;
        android.content.Intent intent = new android.content.Intent(chatTabTopArea.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI.class);
        android.content.Context context = chatTabTopArea.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
