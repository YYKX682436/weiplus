package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb5.z f200485d;

    public f4(com.tencent.mm.ui.chatting.g4 g4Var, sb5.z zVar) {
        this.f200485d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingExposeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.ui.chatting.adapter.k) this.f200485d).W0((com.tencent.mm.plugin.msg.MsgIdTalker) view.getTag());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingExposeMode$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
