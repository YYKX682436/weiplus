package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.a4 f207258d;

    public y3(com.tencent.mm.ui.contact.a4 a4Var) {
        this.f207258d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/FMessageContactView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.d9.b().p().w(143618, 0);
        boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1;
        com.tencent.mm.ui.contact.a4 a4Var = this.f207258d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageContactView", "initSingleNew, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            j45.l.j(a4Var.f206580d, "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            j45.l.j(a4Var.f206580d, "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageContactView", "initSingleNew, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/FMessageContactView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
