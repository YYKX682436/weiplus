package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ab implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210276d;

    public ab(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210276d = showImageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210276d;
        if (itemId == 2) {
            int i18 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
            showImageUI.W6();
            return;
        }
        if (itemId != 4) {
            return;
        }
        int i19 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
        long longExtra = showImageUI.getIntent().getLongExtra("key_message_id", -1L);
        java.lang.String stringExtra = showImageUI.getIntent().getStringExtra("key_message_talker");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(showImageUI, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        intent.putExtra("Retr_Msg_Id", longExtra);
        intent.putExtra("Retr_MsgTalker", stringExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(showImageUI, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        showImageUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(showImageUI, "com/tencent/mm/ui/tools/ShowImageUI", "doSendMsgToDevice", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
