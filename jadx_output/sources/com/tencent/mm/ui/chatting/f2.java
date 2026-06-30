package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChatFooterCustom f200484d;

    public f2(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f200484d = chatFooterCustom;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.chatting.ChatFooterCustom.G;
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f200484d;
        chatFooterCustom.getClass();
        com.tencent.mars.xlog.Log.i("ChatCustomFooter", "switch footer");
        if (chatFooterCustom.f198172i != null) {
            chatFooterCustom.f198171h.a();
            chatFooterCustom.f198172i.a(true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
