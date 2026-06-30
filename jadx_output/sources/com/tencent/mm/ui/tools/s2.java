package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public class s2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210689d;

    public s2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210689d = cropImageNewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f210689d, 1, false);
        k0Var.f211872n = new com.tencent.mm.ui.tools.q2(this);
        k0Var.f211881s = new com.tencent.mm.ui.tools.r2(this);
        k0Var.v();
        return true;
    }
}
