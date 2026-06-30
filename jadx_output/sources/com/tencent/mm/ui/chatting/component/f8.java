package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199034d;

    public f8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        this.f199034d = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$guideTextView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.ui.chatting.component.y8.N;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = this.f199034d.v0();
        if (v07 != null) {
            v07.z1();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$guideTextView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
