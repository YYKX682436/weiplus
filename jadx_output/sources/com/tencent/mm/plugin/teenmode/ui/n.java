package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI f173077d;

    public n(com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI) {
        this.f173077d = authorizationDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f173077d.finish();
        return true;
    }
}
