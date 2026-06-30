package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class gb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI f207709d;

    public gb(com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI) {
        this.f207709d = settingCheckUnProcessWalletConvUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI = this.f207709d;
        com.tencent.mm.storage.l4 item = settingCheckUnProcessWalletConvUI.f207425f.getItem(i17 - settingCheckUnProcessWalletConvUI.f207423d.getHeaderViewsCount());
        if (item == null) {
            return true;
        }
        java.lang.String h17 = item.h1();
        rl5.r rVar = new rl5.r(settingCheckUnProcessWalletConvUI);
        rVar.f397351u = new com.tencent.mm.ui.conversation.db(this);
        com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI2 = this.f207709d;
        com.tencent.mm.ui.conversation.fb fbVar = new com.tencent.mm.ui.conversation.fb(this, h17, item);
        int[] iArr = settingCheckUnProcessWalletConvUI2.f207426g;
        rVar.g(view, i17, j17, settingCheckUnProcessWalletConvUI2, fbVar, iArr[0], iArr[1]);
        return true;
    }
}
