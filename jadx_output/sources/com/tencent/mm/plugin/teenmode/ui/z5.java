package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class z5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173205d;

    public z5(com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
        this.f173205d = teenModeGuardianInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f173205d.finish();
        return true;
    }
}
