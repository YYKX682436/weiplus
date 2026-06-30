package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class p2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210635d;

    public p2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210635d = cropImageNewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f210635d.finish();
        return true;
    }
}
