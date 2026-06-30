package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes5.dex */
public class j0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI f162284d;

    public j0(com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI shakePersonalInfoUI) {
        this.f162284d = shakePersonalInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f162284d.finish();
        return true;
    }
}
