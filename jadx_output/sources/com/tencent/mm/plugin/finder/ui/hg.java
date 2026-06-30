package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class hg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f129328d;

    public hg(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI) {
        this.f129328d = finderSelfQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129328d.finish();
        return true;
    }
}
