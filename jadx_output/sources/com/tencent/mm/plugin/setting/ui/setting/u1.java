package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class u1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg f161593d;

    public u1(com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg previewLastHdHeadImg) {
        this.f161593d = previewLastHdHeadImg;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f161593d, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.s1(this);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.t1(this);
        k0Var.v();
        return true;
    }
}
