package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class iq implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI f161172d;

    public iq(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactUI unfamiliarContactUI) {
        this.f161172d = unfamiliarContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161172d.finish();
        return true;
    }
}
