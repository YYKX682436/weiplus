package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f200066d;

    public ue(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f200066d = peVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f200066d.s0(6);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
