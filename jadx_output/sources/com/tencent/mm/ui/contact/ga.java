package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class ga implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206733d;

    public ga(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206733d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "goto select group");
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206733d;
        android.content.Intent intent = new android.content.Intent(selectContactUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.class);
        intent.putExtra("titile", selectContactUI.getString(com.tencent.mm.R.string.jbv));
        intent.putExtra("CONTACT_INFO_UI_SOURCE", selectContactUI.Z1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("key_filter_associate_chat_room", true);
        selectContactUI.startActivityForResult(intent, 4);
        selectContactUI.f206541d2 = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
