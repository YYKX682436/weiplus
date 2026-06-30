package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208028d;

    public r(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI) {
        this.f208028d = baseConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208028d;
        z17 = baseConversationUI.isAnimating;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.l(baseConversationUI.startChattingRunnable);
        baseConversationUI.finish();
        yj0.a.h(this, "com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
