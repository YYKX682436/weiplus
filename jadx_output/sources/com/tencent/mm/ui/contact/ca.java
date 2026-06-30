package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ca implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206645d;

    public ca(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206645d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206645d;
        java.lang.String str = selectContactUI.B1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "click selectRecordMsgBt %s", objArr);
        selectContactUI.hideVKB();
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", selectContactUI.B1).putExtra("finish_direct", true).putExtra("key_record_msg_select", true).putExtra("key_record_select_min_msg_id", selectContactUI.F1).putExtra("key_record_select_msg_num", selectContactUI.C1);
        java.util.ArrayList<java.lang.String> arrayList2 = selectContactUI.E1;
        if (arrayList2 != null) {
            putExtra.putStringArrayListExtra("key_record_selected_msg_list", arrayList2);
        }
        j45.l.v(selectContactUI, ".ui.chatting.ChattingUI", putExtra, 6);
        a14.a.a().f582a.f60359f = 1;
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
