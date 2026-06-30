package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class f6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI f129121d;

    public f6(com.tencent.mm.plugin.finder.ui.FinderFinderSysMsgUI finderFinderSysMsgUI) {
        this.f129121d = finderFinderSysMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129121d.finish();
        return true;
    }
}
