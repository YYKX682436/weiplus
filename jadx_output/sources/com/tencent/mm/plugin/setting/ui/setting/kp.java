package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class kp implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161248d;

    public kp(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161248d = unfamiliarContactDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161248d;
        unfamiliarContactDetailUI.f160785z = !unfamiliarContactDetailUI.f160785z;
        unfamiliarContactDetailUI.f160780u.clear();
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.T6(unfamiliarContactDetailUI, unfamiliarContactDetailUI.f160785z);
        if (unfamiliarContactDetailUI.f160785z) {
            unfamiliarContactDetailUI.f160772m.setEnabled(false);
            unfamiliarContactDetailUI.f160773n.setEnabled(false);
            unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2k));
        } else {
            unfamiliarContactDetailUI.updateOptionMenuText(1, unfamiliarContactDetailUI.getString(com.tencent.mm.R.string.k2q));
        }
        com.tencent.mm.plugin.setting.ui.setting.xp xpVar = unfamiliarContactDetailUI.f160776q;
        if (xpVar != null) {
            xpVar.notifyDataSetChanged();
        }
        return true;
    }
}
