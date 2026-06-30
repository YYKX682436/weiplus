package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class l7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI f173067d;

    public l7(com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI) {
        this.f173067d = teenModeVerifyPwdUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f173067d.onBackPressed();
        return true;
    }
}
