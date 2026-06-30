package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class da implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206669d;

    public da(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206669d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "click warn to retry");
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206669d;
        selectContactUI.J1 = null;
        selectContactUI.N1 = null;
        selectContactUI.H1 = false;
        selectContactUI.L1 = false;
        selectContactUI.G1 = true;
        selectContactUI.K1 = true;
        selectContactUI.K7();
        selectContactUI.M1 = new java.util.ArrayList(com.tencent.mm.ui.chatting.x3.f206228a.f206201a);
        android.util.Pair i17 = com.tencent.mm.ui.chatting.x3.i(selectContactUI, "msginfo@fakeuser", true, "msginfo@fakeuser");
        selectContactUI.I1 = i17;
        if (((java.lang.Boolean) i17.second).booleanValue()) {
            selectContactUI.O7();
        } else {
            selectContactUI.f206539b2.alive();
        }
        a14.a.a().f589h++;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "click warn to retry, msgId:%s direct:%s", java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) selectContactUI.I1.first).f149480d), selectContactUI.I1.second);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
