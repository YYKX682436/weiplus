package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.a4 f207245d;

    public x3(com.tencent.mm.ui.contact.a4 a4Var) {
        this.f207245d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1;
        com.tencent.mm.ui.contact.a4 a4Var = this.f207245d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageContactView", "initNoNew, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            j45.l.j(a4Var.f206580d, "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FMessageContactView", "initNoNew, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
            j45.l.j(a4Var.f206580d, "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/FMessageContactView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
