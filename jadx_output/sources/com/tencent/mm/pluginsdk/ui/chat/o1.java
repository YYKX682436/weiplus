package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class o1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190528d;

    public o1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190528d = chatFooter;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        fl5.i iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190528d;
        chatFooter.getClass();
        if (!chatFooter.f190034o2 || chatFooter.f190010k2 || chatFooter.f189970d2 != 0 || (iVar = chatFooter.f190021m) == null || (iVar.getText() != null && chatFooter.f190021m.getText().length() != 0)) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        chatFooter.f190016l2 = true;
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
