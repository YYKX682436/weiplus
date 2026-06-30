package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class bp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gp f198854d;

    public bp(com.tencent.mm.ui.chatting.component.gp gpVar) {
        this.f198854d = gpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/VoiceTipsBubble$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.gp gpVar = this.f198854d;
        gpVar.f199125h = false;
        gpVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/VoiceTipsBubble$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
