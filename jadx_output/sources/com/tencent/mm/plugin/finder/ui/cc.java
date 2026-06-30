package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class cc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f128986d;

    public cc(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        this.f128986d = finderPostAtUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f128986d.finish();
        return true;
    }
}
