package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152316d;

    public c(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152316d = baseLifeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152316d;
        baseLifeUI.Z6(-1, false, "", baseLifeUI.f152230J);
        baseLifeUI.finish();
        return true;
    }
}
