package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class o implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI f188053d;

    public o(com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI) {
        this.f188053d = loginDeviceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f188053d.finish();
        return true;
    }
}
