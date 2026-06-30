package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class dh implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SearchBarUI f208341d;

    public dh(com.tencent.mm.ui.SearchBarUI searchBarUI) {
        this.f208341d = searchBarUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f208341d.finish();
        return true;
    }
}
