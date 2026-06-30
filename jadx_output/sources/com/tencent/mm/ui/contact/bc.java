package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class bc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationUI f206634d;

    public bc(com.tencent.mm.ui.contact.SnsSelectConversationUI snsSelectConversationUI) {
        this.f206634d = snsSelectConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsSelectConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.SnsSelectConversationUI.N;
        this.f206634d.x7();
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
