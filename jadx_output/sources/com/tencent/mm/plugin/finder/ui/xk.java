package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class xk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI f130030d;

    public xk(com.tencent.mm.plugin.finder.ui.FinderWxProfileJumpDetailUI finderWxProfileJumpDetailUI) {
        this.f130030d = finderWxProfileJumpDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f130030d.finish();
        return true;
    }
}
