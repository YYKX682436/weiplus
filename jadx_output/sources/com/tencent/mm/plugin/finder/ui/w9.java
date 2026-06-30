package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class w9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderManagementUI f129981d;

    public w9(com.tencent.mm.plugin.finder.ui.FinderManagementUI finderManagementUI) {
        this.f129981d = finderManagementUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129981d.onBackPressed();
        return true;
    }
}
