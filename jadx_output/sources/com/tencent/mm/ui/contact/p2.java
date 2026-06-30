package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class p2 implements com.tencent.mm.pluginsdk.ui.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207075a;

    public p2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f207075a = contactRemarkInfoModUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void a(android.view.View view) {
        this.f207075a.hideVKB(view);
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void b() {
        c01.e2.e0(this.f207075a.f206384s);
        w11.w1.wi().h(7);
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void c() {
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f207075a;
        if (contactRemarkInfoModUI.C1.f()) {
            android.view.View view = contactRemarkInfoModUI.E1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = contactRemarkInfoModUI.E1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$3", "onChangePhoneCount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contactRemarkInfoModUI.I1.setVisibility(8);
        }
        contactRemarkInfoModUI.Y6();
    }

    @Override // com.tencent.mm.pluginsdk.ui.h2
    public void onChange() {
        int i17 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
        this.f207075a.Y6();
    }
}
