package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class d6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI f129057d;

    public d6(com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI finderFinderMsgUI) {
        this.f129057d = finderFinderMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129057d.finish();
        return true;
    }
}
