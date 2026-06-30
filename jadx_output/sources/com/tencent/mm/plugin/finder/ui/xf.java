package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class xf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI f130024d;

    public xf(com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI finderSelectDistrictUI) {
        this.f130024d = finderSelectDistrictUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f130024d.finish();
        return true;
    }
}
