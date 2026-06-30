package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class na implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210606d;

    public na(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210606d = showImageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210606d;
        showImageUI.f210203s = 2;
        showImageUI.Z6();
        return false;
    }
}
