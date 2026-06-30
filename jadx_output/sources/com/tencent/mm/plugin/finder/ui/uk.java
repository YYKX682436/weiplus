package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class uk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxMsgUI f129928d;

    public uk(com.tencent.mm.plugin.finder.ui.FinderWxMsgUI finderWxMsgUI) {
        this.f129928d = finderWxMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f129928d.finish();
        return true;
    }
}
