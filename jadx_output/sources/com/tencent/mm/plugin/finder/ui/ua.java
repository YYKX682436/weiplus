package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class ua implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129910d;

    public ua(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI) {
        this.f129910d = finderModifyNameUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129910d.finish();
        return true;
    }
}
