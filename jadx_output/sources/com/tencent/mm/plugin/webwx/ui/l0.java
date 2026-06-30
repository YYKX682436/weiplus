package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes5.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI f188043d;

    public l0(com.tencent.mm.plugin.webwx.ui.WebWXUnlockUI webWXUnlockUI) {
        this.f188043d = webWXUnlockUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f188043d.finish();
        return true;
    }
}
