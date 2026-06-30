package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI f173199d;

    public z(com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI authorizationRequestUI) {
        this.f173199d = authorizationRequestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f173199d.finish();
        return true;
    }
}
