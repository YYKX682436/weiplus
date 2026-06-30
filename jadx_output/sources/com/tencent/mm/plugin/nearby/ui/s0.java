package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes8.dex */
public class s0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI f152217d;

    public s0(com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI nearbyPersonalInfoUI) {
        this.f152217d = nearbyPersonalInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f152217d.finish();
        return true;
    }
}
