package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ab implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI f207449d;

    public ab(com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI settingCheckUnProcessWalletConvUI) {
        this.f207449d = settingCheckUnProcessWalletConvUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207449d.finish();
        return false;
    }
}
