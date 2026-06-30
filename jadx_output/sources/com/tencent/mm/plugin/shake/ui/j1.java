package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes8.dex */
public class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162285d;

    public j1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI) {
        this.f162285d = tVInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f162285d.finish();
        return true;
    }
}
