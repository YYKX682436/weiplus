package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI f161217d;

    public k1(com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI) {
        this.f161217d = editSignatureUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.EditSignatureUI editSignatureUI = this.f161217d;
        editSignatureUI.hideVKB();
        editSignatureUI.finish();
        return true;
    }
}
