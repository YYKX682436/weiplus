package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAndBizProfileUI f129999d;

    public x0(com.tencent.mm.plugin.finder.ui.FinderAndBizProfileUI finderAndBizProfileUI) {
        this.f129999d = finderAndBizProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129999d.finish();
        return false;
    }
}
