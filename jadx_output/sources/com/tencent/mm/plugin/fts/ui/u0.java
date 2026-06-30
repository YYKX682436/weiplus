package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes10.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseUI f138190d;

    public u0(com.tencent.mm.plugin.fts.ui.FTSBaseUI fTSBaseUI) {
        this.f138190d = fTSBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f138190d.finish();
        return true;
    }
}
