package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class cb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI f207618d;

    public cb(com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI) {
        this.f207618d = settingCheckUnProcessWalletConvUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI = this.f207618d;
        com.tencent.mm.storage.l4 item = settingCheckUnProcessWalletConvUI.f207425f.getItem(i17);
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", item.h1());
        intent.putExtra("chat_from_scene", 4);
        j45.l.u(settingCheckUnProcessWalletConvUI, ".ui.chatting.ChattingUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/SettingCheckUnProcessWalletConvUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
